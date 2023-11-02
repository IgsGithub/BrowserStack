package com.zee5.iOSmWebHipiPages;

import org.openqa.selenium.By;

public class IOSHipiMwebDiscoverPage {
	
	//Search Button In Keyboard
			public static By objiosmwebSearchButtonInKeyboard=By.xpath("//*[@class='UIAKeyboard']//child::*[contains(@id,'go')]|//XCUIElementTypeButton[contains(@label,'go')] | //XCUIElementTypeButton[@name='Return'] | //XCUIElementTypeButton[@name='Go'] ");//| //XCUIElementTypeButton[@name='Done']

	
	//Search Field In Discover Page
			public static By objiosmwebSearchFieldInDiscoverPage=By.xpath("(//*[@type='XCUIElementTypeSearchField' and @value='Search']//child::*)[2] | //XCUIElementTypeButton[@name='ic search'] | //*[@type='XCUIElementTypeSearchField' ]");
				
	

//	//Search Button In Keyboard
//		public static By objiosmwebSearchButtonInKeyboard=By.xpath("//*[@class='UIAKeyboard']//child::*[contains(@id,'go')]|//XCUIElementTypeButton[contains(@label,'go')] | //XCUIElementTypeButton[@name='Done']");

		
		//Search Button In Keyboard
		public static By objiosmwebreturnButtonInKeyboard=By.xpath("//*[@class='UIAKeyboard']//child::*[contains(@id,'go')]|//XCUIElementTypeButton[contains(@label,'return')] | //XCUIElementTypeButton[@name='return']");
	
		
//	//Search Field In Discover Page
//		public static By objiosmwebSearchFieldInDiscoverPage=By.xpath("(//*[@type='XCUIElementTypeSearchField' and @value='Search']//child::*)[2] | //*[@type='XCUIElementTypeSearchField']");
				
	//AutoSuggestions	
		public static By objiosmwebAutoSuggestionsInSearchParentPage(int k) {
			return By.xpath("(//*[@type='XCUIElementTypeSearchField']//following-sibling::*//*[@type='XCUIElementTypeStaticText' and @visible='true'])["+k+"]");
		}	
		
		//Tabnames are Top, Users,  Videos,  Sounds,  HashTags
		public static By objiosmwebTabnameInDiscoverSearchResultsPage(String tabname) {
			return By.xpath("//XCUIElementTypeStaticText[@name='"+tabname+"']");
		}
		
		
		public static By objiosmwebProfileInDiscoverpage(int k) {
			return By.xpath("(//XCUIElementTypeStaticText[@name='USERS']//following::*//XCUIElementTypeStaticText)["+k+"]");
			
			//(//XCUIElementTypeStaticText[contains(@name,'rofile_1')])[1]
		}
		
		
		 public static By objiosmwebPlayIconInVideosTab(int k) {
			 return By.xpath("(//XCUIElementTypeStaticText[@name='VIDEOS']//parent::*//following::*[contains(@type,'Image')])["+k+"]");
		 }
		//(//XCUIElementTypeStaticText[@name='VIDEOS']//parent::*//following::*[contains(@type,'Image')])[1]
		 
		//Back Button In Discover Page
			public static By objmwebBackButtonInDiscoverPage=By.xpath("//*[contains(@name,'back')]");
			
			public static By objmwebBackButtonInBrowserPage=By.xpath("//*[@name='BottomBrowserToolbar']//child::*[@name='BackButton']");
			public static By objiOSmwebHashTagitemUnderTopSection(int k) {
				return By.xpath("(//*[contains(@name,'#')])["+k+"]");
			}
			
			
			//Hastags
			public static By objmwebHashtagInSearchedResultsInDiscover = By.xpath("//XCUIElementTypeStaticText[@name='Hashtags']");
			
			public static By objiOSmwebSearchResultsUnderUsersSection(int k) {
				return By.xpath("((//*[contains(@type,'Image')])["+k+"]//following::*//XCUIElementTypeStaticText)[1]");
			}
			//((//*[contains(@type,'Image')])[2]//following::*//XCUIElementTypeStaticText)[1]	

			
			
			
			public static By objiosmwebSearchResultVideosInTopSection(int l) {
				return By.xpath("(//XCUIElementTypeImage[contains(@name,'Post')])["+l+"]");
			}

			//Back Button In Safari browser  Page
			public static By objmwebBackButtonInSafariBrowserPage=By.xpath("(//*[contains(@label,'ack')])[2]");
			
			//CloseButtonInFeedScreen
			public static By objmwebMailCloseButtonInFeedScreen=By.xpath("//XCUIElementTypeButton[@name='Close']");
			
			
			//Done button in keyboard
			public static By objiosDoneInKeyboard = By.xpath("//XCUIElementTypeButton[@name='Done']");

}
