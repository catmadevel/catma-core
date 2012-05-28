package de.catma.document.standoffmarkup.usermarkup;

import de.catma.document.ContentInfoSet;
import de.catma.document.standoffmarkup.MarkupCollectionReference;

public class UserMarkupCollectionReference implements MarkupCollectionReference {
	
	private String id;
	private ContentInfoSet contentInfoSet;
	
	public UserMarkupCollectionReference(String id,
			ContentInfoSet contentInfoSet) {
		this.id = id;
		this.contentInfoSet = contentInfoSet;
	}

	@Override
	public String toString() {
		return contentInfoSet.getTitle();
	}
	
	public String getId() {
		return id;
	}
	
	public String getName() {
		return contentInfoSet.getTitle();
	}
	
	public ContentInfoSet getContentInfoSet() {
		return contentInfoSet;
	}
}