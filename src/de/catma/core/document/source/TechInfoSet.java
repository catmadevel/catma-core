package de.catma.core.document.source;

import java.net.URI;
import java.nio.charset.Charset;

public class TechInfoSet {

	private FileType fileType;
	private Charset charset;
	private FileOSType fileOSType;
	private Long checksum;
	private String mimeType;
	private URI uri;
	private String xsltDocumentLocalUri;
	
	public TechInfoSet(FileType fileType, Charset charset,
			FileOSType fileOSType, Long checksum, String xsltDocumentLocalUri) {
		super();
		this.fileType = fileType;
		this.charset = charset;
		this.fileOSType = fileOSType;
		this.checksum = checksum;
		this.xsltDocumentLocalUri = xsltDocumentLocalUri;
	}
	
	public TechInfoSet(String mimeType, URI uri) {
		this.mimeType = mimeType;
		this.uri = uri;
	}

	public FileType getFileType() {
		return fileType;
	}
	
	public Charset getCharset() {
		return charset;
	}
	
	public FileOSType getFileOSType() {
		return fileOSType;
	}
	
	public URI getURI() {
		return uri;
	}
	
	public Long getChecksum() {
		return checksum;
	}
	
	public String getMimeType() {
		return mimeType;
	}
	
	public void setFileOSType(FileOSType fileOSType) {
		this.fileOSType = fileOSType;
	}
	
	public void setFileType(FileType fileType) {
		this.fileType = fileType;
	}
	
	public void setCharset(Charset charset) {
		this.charset = charset;
	}
	
	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}
	
	public void setChecksum(Long checksum) {
		this.checksum = checksum;
	}
	
	public void setURI(URI uri) {
		this.uri = uri;
	}
	
	public String getXsltDocumentLocalUri() {
		return xsltDocumentLocalUri;
	}
	
	public void setXsltDocumentLocalUri(String xsltDocumentLocalUri) {
		this.xsltDocumentLocalUri = xsltDocumentLocalUri;
	}
}
