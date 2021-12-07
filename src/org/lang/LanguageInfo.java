package org.lang;

public class LanguageInfo extends StateDetails {
	public void tamilLanguage() {
		System.out.println("tamilLanguage : Read & Speak");
	}
	public void englishLanguage() {
		System.out.println("englishLanguage : Read, Write & Speak");

	}
	public void hindiLanguage() {
		System.out.println("hindiLanguage : Don't know");

	}
	public static void main(String[] args) {
		LanguageInfo a = new LanguageInfo();
		a.tamilLanguage();
		a.englishLanguage();
		a.hindiLanguage();
		a.southIndia();
		a.northIndia();
	}

}
