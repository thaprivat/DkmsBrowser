package com.th.DkmsBrowser.dataObjects;

public class Draw {
	String reportsTo;
	String level;
	String label;
	String kno;
	
	public Draw(String reportsTo, String level, String label, String kno) {
		super();
		this.reportsTo = reportsTo;
		this.level = level;
		this.label = label;
		this.kno = kno;
	}

	public Draw() {
		super();
	}	
	
	public String getReportsTo() {
		return reportsTo;
	}
	public void setReportsTo(String reportsTo) {
		this.reportsTo = reportsTo;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getKno() {
		return kno;
	}
	public void setKno(String kno) {
		this.kno = kno;
	}
}
