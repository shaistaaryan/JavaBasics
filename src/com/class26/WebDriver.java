package com.class26;

public interface WebDriver {

	String fileExtension = ".png";

	void takePicture();
  
	//features below were add from java 1.8 version
	static void takeSelfe() {
    	System.out.println("I can take a selfe");
    }
	
   default void takePanoramOic() {
    	System.out.println("I can take panoramic pistues");
    }
    
    
    public interface WebDriver{

	void openBrowser();

	void closeBrowser();

	void maximizeWindow();

	void findElement();
	}
	}
	

class ChromeDriver implements WebDriver, takeScreen {
	@Override
	public void openBrowser() {
		System.out.println("We can open Chrome");
	}

	@Override
	public void closeBrowser() {
		System.out.println("we can close Chrome");
	}

	@Override
	public void maximizeWindow() {
		System.out.println("We can maximize Chrome window");
	}

	@Override
	public void findElement() {
		System.out.println("We can find element in Chrome");
	}

	@Override
	public void takePicture() {
		// TODO Auto-generated method stub

	}
}

class FireFoxDriver implements WebDriver {
	@Override
	public void openBrowser() {
		System.out.println("We can open FireFox");
	}

	@Override
	public void closeBrowser() {
		System.out.println("We can close FireFox");
	}

	@Override
	public void maximizeWindow() {
		System.out.println("We can maximize FireFox window");
	}

	@Override
	public void findElement() {
		System.out.println("We can find elements in FireFox");
	}
}
