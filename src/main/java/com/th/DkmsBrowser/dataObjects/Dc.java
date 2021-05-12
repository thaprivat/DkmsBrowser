package com.th.DkmsBrowser.dataObjects;

import java.util.HashMap;

public enum Dc {
	DDB("03"),Nordea("07"),BD("09"),BEC("10"),SDC("12"),Nets("20")
;
	private static final HashMap<String, Dc> MAP = new HashMap<String, Dc>();

	private String value;

	private Dc(String value) {
		this.value = value;
	}

	public String getValue() {
		return this.value;
	}

	public static Dc getByName(String name) {
		return MAP.get(name);
	}

	static {
		for (Dc field : Dc.values()) {
			MAP.put(field.getValue(), field);
		}
	}
}