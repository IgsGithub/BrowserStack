package com.zee5.iOS_HiPi_NeoScripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.business.zee.Zee5ApplicasteriOSHipiNeoSanityBusinessLogic;
import com.excel.Time_ExcelUpdate;
import com.fasterxml.jackson.annotation.JsonIgnore;


public class IOS_HiPi_Neo_Priority_P0_Test_cases {

	private Zee5ApplicasteriOSHipiNeoSanityBusinessLogic Zee5ApplicasterHipiNeoBusinessLogic;



	// jenkins test cases


	@BeforeTest
	public void init() throws InterruptedException {

		Zee5ApplicasterHipiNeoBusinessLogic = new Zee5ApplicasteriOSHipiNeoSanityBusinessLogic("zee");  
	}


	@AfterClass
	public void tearDownApp() {
		System.out.println("Quit the App");
		Zee5ApplicasterHipiNeoBusinessLogic.tearDown();
		Time_ExcelUpdate.AutoFitColumn();
	}


	@Test(priority =1)
	@Parameters({ "userType", "InstallBuild" })
	public void FeedScreenArrivalTime_1(String userType, String InstallBuild) throws Exception{
	//	Zee5ApplicasterHipiNeoBusinessLogic.TimeStamprelaunch(InstallBuild,"No");
	//	Zee5ApplicasterHipiNeoBusinessLogic.TimeStampLoginAndNivigateToHipi(userType);
		Zee5ApplicasterHipiNeoBusinessLogic.TimeStampNewLoginAndNivigateToHipi(userType);
		
	//	Zee5ApplicasterHipiNeoBusinessLogic.LoginWithGoogle(userType, "TC000");
		
	//	Zee5ApplicasterHipiNeoBusinessLogic.FeedScreenArrivalTimeFromSplashScreen(userType);
		
		

	}

	
	//@Test(priority =2)
	@Parameters({ "userType", "InstallBuild" })
	public void TimeTakenToLikeAvideo_2(String userType,String InstallBuild) throws Exception{

		Zee5ApplicasterHipiNeoBusinessLogic.LikeVideo(userType);
	}


	//@Test(priority =3)
	@Parameters({ "userType", "InstallBuild" })
	public void TimeTakenToPostAcomment_3(String userType,String InstallBuild) throws Exception{

		Zee5ApplicasterHipiNeoBusinessLogic.commentOnvideo(userType);

	}

	
	@Test(priority =4)
	@Parameters({ "userType", "InstallBuild" })
	public void TimeTakenToPostAcreatedVideo15s_4(String userType,String InstallBuild) throws Exception{

		Zee5ApplicasterHipiNeoBusinessLogic.create_Video_And_Post(15,userType,"TC004","4");
	}

	@Test(priority =5)
	@Parameters({ "userType", "InstallBuild" })
	public void TimeTakenToPostAcreatedVideo30_5(String userType,String InstallBuild) throws Exception{

		Zee5ApplicasterHipiNeoBusinessLogic.create_Video_And_Post(30,userType,"TC005","5");
	}

	
	@Test(priority =6)
	@Parameters({ "userType", "InstallBuild" })
	public void TimeTakenToPostAcreatedVideo45_6(String userType,String InstallBuild) throws Exception{

		Zee5ApplicasterHipiNeoBusinessLogic.create_Video_And_Post(45,userType,"TC006","6");
	}
	

	@Test(priority =7)
	@Parameters({ "userType", "InstallBuild" })
	public void TimeTakenToPostAcreatedVideo60_7(String userType,String InstallBuild) throws Exception{

		Zee5ApplicasterHipiNeoBusinessLogic.create_Video_And_Post(60,userType,"TC007","7");
	}

	@Test(priority =8)
	@Parameters({ "userType", "InstallBuild" })
	public void TimeTakenToPostAcreatedVideo90_8(String userType,String InstallBuild) throws Exception{

		Zee5ApplicasterHipiNeoBusinessLogic.create_Video_And_Post(90,userType,"TC008","8");
	}

	@Test(priority =9)
	@Parameters({ "userType", "InstallBuild" })
	public void TimeTakenToStartVideoAfterSwipe_9(String userType,String InstallBuild) throws Exception{

		Zee5ApplicasterHipiNeoBusinessLogic.video_Start_Time_After_Swipe(userType,"TC009");
	}

	@Test(priority =10)
	@Parameters({ "userType", "InstallBuild" })
	public void TimeTakenToloadDiscoverPage_10(String userType,String InstallBuild) throws Exception{

		Zee5ApplicasterHipiNeoBusinessLogic.discover_Screen_LoadTime(userType,"TC010");
	}

	
	@Test(priority =11)
	@Parameters({ "userType", "InstallBuild" })
	public void TimeTakenToloadSearshResultInDiscoverPage_11(String userType,String InstallBuild) throws Exception{

		Zee5ApplicasterHipiNeoBusinessLogic.searchResultScreen(userType,"TC011");

	}

	@Test(priority =12)
	@Parameters({ "userType", "InstallBuild" })
	public void TimeTakenToloadAutoSuSearshResultInDiscoverPage_12(String userType,String InstallBuild) throws Exception{

		Zee5ApplicasterHipiNeoBusinessLogic.searchAutoSuggestionsResultScreen(userType,"TC012");

	}
	@Test(priority =13)
	@Parameters({ "userType", "InstallBuild" })
	public void TimeTakenToloadCarousalBannersInDiscoverPage_13(String userType,String InstallBuild) throws Exception{

		Zee5ApplicasterHipiNeoBusinessLogic.Carousel_or_Banner_LoadTime(userType,"TC013");

	}
	
	
	@Test(priority =14)
	@Parameters({ "userType", "InstallBuild" })
	public void TimeTakenToloadBannerClickedLandingScreenInDiscoverPage_14(String userType,String InstallBuild) throws Exception{

		Zee5ApplicasterHipiNeoBusinessLogic.Banner_clicked_landing_Screen(userType,"TC014");

	}

	@Test(priority =15)
	@Parameters({ "userType", "InstallBuild" })
	public void TimeTakenToloadRailsPage_15(String userType,String InstallBuild) throws Exception{

		Zee5ApplicasterHipiNeoBusinessLogic.Rails_Page_Loading(userType,"TC015");

	}



	@Test(priority =16)
	@Parameters({ "userType", "InstallBuild" })
	public void TimeTakenToloadHashtagRailsPage_16(String userType,String InstallBuild) throws Exception{

		Zee5ApplicasterHipiNeoBusinessLogic.Hashtag_details_page(userType,"TC016");

	}
	
	
	@Test(priority =17)
	@Parameters({ "userType", "InstallBuild" })
	public void TimeTakenToloadSoundscreen_17(String userType,String InstallBuild) throws Exception{

		Zee5ApplicasterHipiNeoBusinessLogic.CreatorSoundScreenLoadTime(userType,"TC017");

	}


	@Test(priority =18)
	@Parameters({ "userType", "InstallBuild" })
	public void TimeTakenToloadEffects_screen_18(String userType,String InstallBuild) throws Exception{

		//Zee5ApplicasterHipiNeoBusinessLogic.Effects_LoadTime(userType,"TC020");
		Zee5ApplicasterHipiNeoBusinessLogic.Effects_LoadTime(userType,"TC018");

	}

	@Test(priority =19)
	@Parameters({ "userType", "InstallBuild" })
	public void TimeTakenToloadFilter_screen_19(String userType,String InstallBuild) throws Exception{

		//Zee5ApplicasterHipiNeoBusinessLogic.Filters_LoadTime(userType,"TC021");
		Zee5ApplicasterHipiNeoBusinessLogic.Filters_LoadTime(userType,"TC019");

	}

	
	@Test(priority =20)
	@Parameters({ "userType", "InstallBuild" })
	public void TimeTakenToloadPostScreenFromNextCTA_screen_20(String userType,String InstallBuild) throws Exception{

		Zee5ApplicasterHipiNeoBusinessLogic.Next_CTA_from_video_detail_page(userType,"TC020");

	}

	//@Test(priority=21)
	@Parameters({"userType","InstallBuild"})
	public void VideoInProfilePage45_21(String userType,String InstallBuild) throws Exception {
		Zee5ApplicasterHipiNeoBusinessLogic.create_Video_And_Post_VerifyVideoInProfile(45,userType,"TC021","");
	}

/*	login is unavailable
	@Test(priority =22)
	@Parameters({ "userType", "InstallBuild" })
	public void TimeTakenToloadLoginScenario_22(String userType,String InstallBuild) throws Exception{

		Zee5ApplicasterHipiNeoBusinessLogic.Newlogin_scenario(userType,"TC022");

	}
*/
	
//	@Test(priority =23)
	@Parameters({ "userType", "InstallBuild" })
	public void TimeTakenToloadLogoutscenario_23(String userType,String InstallBuild) throws Exception{

		Zee5ApplicasterHipiNeoBusinessLogic.logout_scenario(userType,"TC023");

	}


	

 //Ask for OTP Not Feasible
	//@Test(priority =24)
	@Parameters({ "userType", "InstallBuild" })
	public void Sign_Up_Scenario_24(String userType,String InstallBuild) throws Exception{

		Zee5ApplicasterHipiNeoBusinessLogic.Complete_Sign_Up(userType,"TC024");

	}

	
/*
	//@Test(priority =25)
	@Parameters({ "userType", "InstallBuild" })
	public void GallaryVideoUpload_Scenario_25(String userType,String InstallBuild) throws Exception{

		Zee5ApplicasterHipiNeoBusinessLogic.TimeStampswipeVideoUploadFromGallary(userType,"TC025");

	}
	
*/	

/*	Login not available 
//	@Test(priority =26)
	@Parameters({ "userType", "InstallBuild" })
	public void LoginWithEmail_26(String userType,String InstallBuild) throws Exception{

		Zee5ApplicasterHipiNeoBusinessLogic.LoginWithEmail(userType, "TC26");
	}
	*/
/*	
	@Test(priority =27)
	@Parameters({ "userType", "InstallBuild" })
	public void LoginWithGoogle_27(String userType,String InstallBuild) throws Exception{

		Zee5ApplicasterHipiNeoBusinessLogic.LoginWithGoogle(userType, "TC27");
	}
*/	
	
//	@Test(priority =28)
	@Parameters({ "userType", "InstallBuild" })
	public void LoginWithFacebook_28(String userType,String InstallBuild) throws Exception{

		Zee5ApplicasterHipiNeoBusinessLogic.LoginWithFacebook(userType, "TC27");
	}
	


	@Test(priority=29)
	@Parameters({"userType","InstallBuild"})
	public void searchSuggestions_29(String userType,String InstallBuild) throws Exception {
	//	Zee5ApplicasterHipiNeoBusinessLogic.TimeStamprelaunch(InstallBuild,"Yes");
//		Zee5ApplicasterHipiNeoBusinessLogic.TimeStampNewLoginAndNivigateToHipi(userType);
		Zee5ApplicasterHipiNeoBusinessLogic.searchResults("love", "STC001");
		Zee5ApplicasterHipiNeoBusinessLogic.searchResults("shraddha kapoor", "STC002");
		Zee5ApplicasterHipiNeoBusinessLogic.searchResults("punjabi singers", "STC003");
		Zee5ApplicasterHipiNeoBusinessLogic.searchResults("bollywood actress", "STC004");
		Zee5ApplicasterHipiNeoBusinessLogic.searchResults("rap", "STC005");
		Zee5ApplicasterHipiNeoBusinessLogic.searchResults("punjabi", "STC006");
		Zee5ApplicasterHipiNeoBusinessLogic.searchResults("memories", "STC007");
	}
	
	@Test(priority=31)
	@Parameters({"userType","InstallBuild"})
	public void getUrl(String userType,String InstallBuild) throws Exception {
		
		Zee5ApplicasterHipiNeoBusinessLogic.getUrl();
		Zee5ApplicasterHipiNeoBusinessLogic.SwipeUpAnimation();





		
	}
	
	@Test(priority=32)
	@Parameters({"userType","InstallBuild"})
	public void TimeTakenToAppNavigationToAppStoreClickingOnCreateButton(String userType,String InstallBuild) throws Exception{
		
		Zee5ApplicasterHipiNeoBusinessLogic.NavigationToAppStoreFromCreateButton(userType, "MPWA_TC004");
	}
	
	
	@Test(priority =33)
	@Parameters({ "userType", "InstallBuild" })
	public void MPWATimeTakenToloadDiscoverPage(String userType,String InstallBuild) throws Exception{
	
		Zee5ApplicasterHipiNeoBusinessLogic.discover_Screen_LoadTime_MPWA(userType,"MPWA_TC005");
	}
	
	
	@Test(priority = 34)
	@Parameters({ "userType", "InstallBuild" })
	public void TimeTakenToloadSearshResultInDiscoverPage(String userType,String InstallBuild) throws Exception{
	
		Zee5ApplicasterHipiNeoBusinessLogic.searchResultScreen_MPWA(userType, "MPWA_TC006");
	}
	
	
	@Test(priority =35)
	@Parameters({ "userType", "InstallBuild" })
	public void TimeTakenToloadAutoSuSearshResultInDiscoverPage(String userType,String InstallBuild) throws Exception{
	
		Zee5ApplicasterHipiNeoBusinessLogic.searchAutoSuggestionsResultScreen_MPWA(userType, "MPWA_TC007");
	}
	
	
	@Test(priority = 36)
	@Parameters({ "userType", "InstallBuild" })
	public void searchSuggestions(String userType, String InstallBuild) throws Exception{
		
		Zee5ApplicasterHipiNeoBusinessLogic.searchResultsMPWA("punjabi singers", "MPWA_TC008");
		Zee5ApplicasterHipiNeoBusinessLogic.searchResultsMPWA("bollywood actress", "MPWA_TC009");
		Zee5ApplicasterHipiNeoBusinessLogic.searchResultsMPWA("punjabi", "MPWA_TC010");
		Zee5ApplicasterHipiNeoBusinessLogic.searchResultsMPWA("love", "MPWA_TC011");
		Zee5ApplicasterHipiNeoBusinessLogic.searchResultsMPWA("shivangi", "MPWA_TC012");
		Zee5ApplicasterHipiNeoBusinessLogic.searchResultsMPWA("shraddha aryaa", "MPWA_TC013");
		Zee5ApplicasterHipiNeoBusinessLogic.searchResultsMPWA("rap", "MPWA_TC014");
		
		
	}
	
 
	/*
    	 @Test(priority=25)
        	@Parameters({"userType","InstallBuild"})
        	public void RepetedVideoInFeedScreen(String userType,String InstallBuild) throws Exception {
      		 Zee5ApplicasterHipiNeoBusinessLogic.videoUIRepate(userType);
      	 }
	 */

	//    	 @Test(priority=24)
	//       	@Parameters({"userType","InstallBuild"})
	//       	public void VideoInProfilePage30(String userType,String InstallBuild) throws Exception {
	//     		 
	//     		 Zee5ApplicasterHipiNeoBusinessLogic.create_Video_And_Post_VerifyVideoInProfile(30,userType,"TC024","5");
	//     	 }
	//    	 
	//    	 @Test(priority=26)
	//       	@Parameters({"userType","InstallBuild"})
	//       	public void VideoInProfilePage60(String userType,String InstallBuild) throws Exception {
	//    		 
	//     		 Zee5ApplicasterHipiNeoBusinessLogic.create_Video_And_Post_VerifyVideoInProfile(60,userType,"TC026","5");
	//     	 }
	//    	 
	//    	 
	//    	 @Test(priority=27)
	//       	@Parameters({"userType","InstallBuild"})
	//       	public void VideoInProfilePage90(String userType,String InstallBuild) throws Exception {
	//     		 
	//     		 Zee5ApplicasterHipiNeoBusinessLogic.create_Video_And_Post_VerifyVideoInProfile(90,userType,"TC027","5");
	//     	 }
	

}
