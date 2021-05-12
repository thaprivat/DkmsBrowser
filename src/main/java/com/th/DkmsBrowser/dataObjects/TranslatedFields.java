package com.th.DkmsBrowser.dataObjects;

public class TranslatedFields {

	private String groupYearlyKeyExchange;
	private String translatedApplName;
	private String translatedKeyType;
	private String bigKeyExtensionText;

	public TranslatedFields(String groupYearlyKeyExchange, String translatedApplName, String translatedKeyType,
			String bigKeyExtensionText) {
		this.groupYearlyKeyExchange = groupYearlyKeyExchange;
		this.translatedApplName = translatedApplName;
		this.translatedKeyType = translatedKeyType;
		this.bigKeyExtensionText = bigKeyExtensionText;
	}

	public String getGroupYearlyKeyExchange() {
		return groupYearlyKeyExchange;
	}

	public void setGroupYearlyKeyExchange(String translatedApplName) {
		this.translatedApplName = translatedApplName;
	}

	public String getTranslatedApplName() {
		return translatedApplName;
	}

	public void setTranslatedApplName(String translatedApplName) {
		this.translatedApplName = translatedApplName;
	}

	public String getTranslatedKeyType() {
		return translatedKeyType;
	}

	public void setTranslatedKeyType(String translatedKeyType) {
		this.translatedKeyType = translatedKeyType;
	}

	public String getBigKeyExtensionText() {
		return bigKeyExtensionText;
	}

	public void setBigKeyExtensionText(String bigKeyExtensionText) {
		this.bigKeyExtensionText = bigKeyExtensionText;
	}
};
