package de.catma.document.source.contenthandler;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

import org.apache.poi.hwpf.extractor.WordExtractor;

import de.catma.document.source.FileOSType;

public class Doc2TxtExtractor {
	
	public Doc2TxtExtractor(String path) throws IOException {
		this(path, null);
	}
	
	public Doc2TxtExtractor(String path, String outputPath) throws IOException {
		extractTo(path, outputPath);
	}
	
	private void extractTo(String path, String outputPath) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(
        		new File(path).toURI().toURL().openStream());
        try {
    		WordExtractor we = new WordExtractor(bis);
    		String buf = we.getText();
    		System.out.println("before: " + buf.length());
    		if (FileOSType.getFileOSType(buf).equals(FileOSType.UNIX)) {
    			buf = FileOSType.convertUnixToDos(buf);
    		}
    		System.out.println("after: " + buf.length());

    		StringBuilder builder = new StringBuilder();
    		addTest(buf, 10, 20, builder);
    		addTest(buf, 10, 80, builder);
    		
    		if (outputPath != null) {
    			Writer repoSourceFileWriter =  
    					new BufferedWriter(new OutputStreamWriter(
    							new FileOutputStream(outputPath),
    							"UTF-8"));
    			try {
    				repoSourceFileWriter.append(buf);
    				repoSourceFileWriter.append(builder.toString());
    			}
    			finally {
    				if (repoSourceFileWriter != null) {
    					repoSourceFileWriter.close();
    				}
    			}
    		}
    		else {
    			System.out.println(buf);
    			System.out.println(builder.toString());
    		}
        }
        finally {
        	if (bis != null) {
        		bis.close();
        	}
        }
	}

	private void addTest(String buf, int i, int j, StringBuilder builder) {
		builder.append(i+"@"+j+"->" + buf.substring(j, j+i) + "<-");
		builder.append("\n");
	}


	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		new Doc2TxtExtractor(args[0], (args.length>1)?args[1]:null);
	}

}
