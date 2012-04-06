package de.catma.core.tag;


public class PropertyDefinition {
	
	public enum SystemPropertyName {
		catma_displaycolor,
		;
	}

	private String name;
	private String id;
	private PropertyPossibleValueList possibleValueList;
	
	public PropertyDefinition(String id, String name,
			PropertyPossibleValueList possibleValueList) {
		super();
		this.name = name;
		this.possibleValueList = possibleValueList;
	}
	
	
	@Override
	public String toString() {
		return "PROP#"+id+"["+name+"="+possibleValueList+"]";
	}
	
	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public String getFirstValue() {
		return possibleValueList.getFirstValue();
	}
	
	public PropertyPossibleValueList getPossibleValueList() {
		return possibleValueList;
	}

}
