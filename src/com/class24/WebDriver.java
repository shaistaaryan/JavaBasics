package com.class24;

public class WebDriver {

	public void open() {
		System.out.println("Openoing browser");
	}
}

class FirefoxDriver extends WebDriver {
	public void open() {
		System.out.println("Opening firefox browser");
	}
}

class ChromeDriver extends WebDriver {
	public void open() {
		System.out.println("opening ChromeDriver");
	}
}

class InternetExplorerrDriver extends WebDriver {
	public void open() {
		System.out.println("Opening ie browser");
	}
}