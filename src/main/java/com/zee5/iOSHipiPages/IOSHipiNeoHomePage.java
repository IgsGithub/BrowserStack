package com.zee5.iOSHipiPages;

import org.openqa.selenium.By;

public class IOSHipiNeoHomePage {


//	//============================appiumServerXpath==================================================================================================================================================================
//	//Home button in below Tab Bar
//	public static By objiOSHomeBtnInBelowTabBar=By.xpath("//*[contains(@value,'Home') and contains(@class,'utton')] | //*[contains(@name,'Feed-')] |//XCUIElementTypeButton[contains(@label,'Home')] ");
//
//	//Discover button in below Tab Bar
//	public static By objiOSDiscoverBtnInBelowTabBar=By.xpath("//*[contains(@accessibilityLabel,'Discover-')]|//*[@name='Discover'] |//XCUIElementTypeButton[contains(@label,'Discover')]");	
//
//
//	//User Name In FeedScreen
//	public static By objiOSUserNameInFeedScreen=By.xpath("//*[contains(@name,'Username')]");
//
//
//
//
//	//====================================================================================================================================================================================================	
//	//Shopping the look---Alright Got it button
//	public static By objiOSAlrightGotitBtn=By.xpath("//*[contains(text(),'Alright! Got it')]//* | //*[contains(@name,'Shop_CoachMark_OK')]");
//	//save overlook--ok button
//	public static By objiOSOkCoolBtn=By.xpath("//*[contains(text(),'Ok, Cool')]//* | //*[contains(@name,'_CoachMark_OK')]");
//
//	//Create button in below Tab Bar
//	public static By objiOSCreateBtnInBelowTabBar=By.xpath("//*[contains(@accessibilityLabel,'Create-')] |//*[@value='Create']");
//	//Profile button in below Tab Bar
//	public static By objiOSProfileBtnInBelowTabBar=By.xpath("//*[contains(@accessibilityLabel,'Profile-')] | //*[@name='Profile'] "); 
//
//
//
//	public static By objiosNameInMsgWindow(String name) {
//		return By.xpath("//*[@name='"+name+"']");
//	}
//	public static By objiosShopMsgInMessageApp=By.xpath("//*[@name='shop']");
//
//
//	public static By objiosFollowBtnOnUserCardsInFoolowingTab=By.xpath("//*[@name='Follow' and @class='UIAButton']");	
//
//	//save video
//	public static By objiOSsave_video=By.xpath("//*[@name='Save video' and contains(@knownSuperClass,'UIButton')]");
//
//
//
//	//Following
//	public static By objiOSFollowingBtnInFeedScreen=By.xpath("//*[@name='Following']");
//
//	//like btn
//
//	public static By objiOSLikeBtn=By.xpath("//*[contains(@name,'like video') and contains(@knownSuperClass,'utton')] |//*[contains(@name,'LikeVideo')]");
//
//	//comment btn
//
//	public static By objiOSCommentBtn=By.xpath("//*[contains(@name,'comment video') and contains(@knownSuperClass,'utton')]");
//
//
//
//	public static By objiosgoogleaccounts(int k) {
//		return By.xpath("(//*[contains(@name,'@gmail.com')])["+k+"]");
//	}
//	//Mobile Number orPhone Number
//	public static By objiosMobileNumberField=By.xpath("//*[@placeholder='  Phone number']");
//	//backbtnFrom msg
//
//	public static By objiosMessagebackBtn = By.xpath("//*[@knownSuperClass='UIControl']");
//
//	//Swipe for next video Handgesture
//
//	public static By objiosSwipeForNxtVideo = By.xpath("//*[contains(@text,' next video')]");
//
//	// Account pop up while downloding from appstore
//	public static By objiosAccPopUp = By.xpath("//*[contains(text(),'ACCOUNT')]");
//
//	// Install Btn In Account pop up while downloding from appstore
//	public static By objiosInstallBtnInAccPopUp = By.xpath("//*[contains(text(),'Install')]");
//
//	// Search Tab Button
//	public static By objiosSearchBar = By.xpath("//*[contains(text(),'Games, Apps, Stories')] | //*[contains(text(),'App Store')]");
//
//
//
//
//	//hipi in testflight
//
//	public static By objiosHipiInTestFlight = By.xpath("//*[@name='Hipi - Indian Short Video App' and @class='UIAStaticText']");
//
//	//previous builds in testFlight
//
//	public static By objiosPreviousBuildsInTestFlight = By.xpath("//*[@name='Previous Builds' and @knownSuperClass='UILabel']");
//
//	//version in testfilght
//	public static By objiosVersionIntestFlight(String version) {
//		return By.xpath("//*[@name='"+version+"']");
//	}
//
//	//for respin release build
//	public static By objiosRealeseIntestFlight(String Release) {
//		return By.xpath("//*[contains(text(),' ("+Release+")')]//parent::*/*[@text='INSTALL']");
//	}
//
//	public static By objiosOlderVersionPopUp=By.xpath("//*[contains(text(),'Older ')]");
//
//
//	public static By objiosInstallBtnOnOlderVersionPopUp=By.xpath("//*[@name='Install']");
//
//	//open the specific build in testflight after installing
//	public static By objiosOpenBtnIntestFlight(String Release) {
//		return By.xpath("//*[contains(text(),' ("+Release+")')]//parent::*/*[@text='OPEN']");
//	}
//
//	//latest version in testFlight
//
//	public static By objiosLatestBuildVersionInTestFlight = By.xpath("(//*[@name='- Indian Short Video App']//*[contains(@name,'Version')])[2]");
//
//	//update in testflight
//
//	public static By objiosUpdateBtnInTestFlight = By.xpath("//*[contains(text(),' - Indian Short Video App')]/*[@text='UPDATE']");
//
//
//
//
//	//Install button in Testflight
//	public static By objiosInstallButton = By.xpath("//*[contains(text(),'- Indian Short Video App')]/*[@text='INSTALL']");
//
//	//Open Button in Testflight
//	public static By objiosOpenButton = By.xpath("//*[contains(text(),'- Indian Short Video App')]/*[@text='OPEN']");
//
//
//	//From The Developer
//	public static By objiosFromTheDeveloper = By.xpath("//*[@text='From the Developer']");
//
//	//Back arrow from Feed Screen
//
//	public static By objiosBackArrowButtonFromFeed=By.xpath("//*[contains(@name,'back_arrow')]");
//
//	//Next button
//	public static By objiosNextButton = By.xpath("(//*[@XCElementType='XCUIElementTypeButton' and @text='Next'])[1]");
//	//Share Feedback
//	public static By objiosShareFeedback = By.xpath("//*[@text='Share Feedback']");
//	//Start Testing
//	public static By objiosStartTesting = By.xpath("(//*[@XCElementType='XCUIElementTypeButton' and @text='Start Testing'])[1]");
//
//
//	//Open Button
//	public static By objiosAppStoreOpenBtn = By.xpath("//*[contains(text(),'- Indian Short Video App') and contains(text(),' ratings')]/*[@text='open']");
//
//
//	//Popup Allow button
//	public static By objiosAllowButton = By.xpath("//*[@name='Allow' and @class='UIAButton']");
//
//	//HiP Would Like to Send You Notifications' popup
//	//		public static By objiosNotificationsPopup = By.xpath("//*[@name='"hipi" Would Like to Send You Notifications']");
//
//	//AllowAccesssToPhotos
//	//		public static By objiosNotificationAllowAccesssToPhotosPopup = By.xpath("//*[@name='"hipi" Would Like to Access Your Photos']");
//
//
//	//Popup ok button for save access
//	public static By objiosSaveVideoAccessPopUpOKButton = By.xpath("//*[@name='OK']");
//	//Search Tab Button
//	public static By objiosSearchTabBtn = By.xpath("//*[@class='UIATabBar']//*[@class='UIAButton' and @text='Search']");
//
//
//	//Re-Download button
//	public static By objiosAppStoreHipiReDownloadBtn = By.xpath("//*[contains(text(),'- Indian Short Video App') and contains(text(),' ratings')]/*[@text='re-download'] | //*[contains(text(),'- Indian Short Video App') and contains(text(),' ratings')]//*[@name='get']");
//
//
//	//WiFi-off
//	public static By objiOSWifiOff=By.xpath("//*[@name='wifi-button' and @value='0']");
//
//	//wifi on but NotConnected		
//	public static By objiOSWifiOnButNotConnected=By.xpath("//*[@name='wifi-button' and @value='1'  and @text='Wi-Fi, Searching']");
//
//	//WiFi-On
//	public static By objiOSWifiIsOn=By.xpath("//*[@name='wifi-button' and @value='1']");
//
//
//
//	//network error
//	public static By objiOSNetworkError=By.xpath("//*[contains(@name,'onnection')]");
//
//
//	//Feed Screen
//	public static By objiOSFeedScreen=By.xpath("(//*[@name='Progress']//ancestor::*//*[@class='UIAScrollView']//following-sibling::*//child::*)[4]");
//
//
//	//For You
//	public static By objiOSForYouBtnInFeedScreen=By.xpath("//*[contains(@name,'Foryou_')]");
//
//	//Tab Bar
//	public static By objiOSBelowTabBarInFeedScreen=By.xpath("//*[ @class='UIATabBar']");
//
//
//
//	//Shop button in below Tab Bar
//	public static By objiOSShopBtnInBelowTabBar=By.xpath("//*[@name='SHOP' and @knownSuperClass='UIButton']");
//
//
//
//
//	//profileCloseBtn
//
//	public static By objiOSProfileCloseBtnInBelowTabBar=By.xpath("//*[@name='ic close' and @knownSuperClass='UIButton']");
//
//
//	//Play button
//	public static By objiOSPlayBtnInFeedScreen=By.xpath("//*[@name='b' and @class='UIAButton']");
//
//
//
//	public static By objiOSUsePhoneOrEmail=By.xpath("//*[@name='Use Phone or Email' and @class='UIAButton']");
//
//	public static By  objiOSEmailOption=By.xpath("//*[@class='UIACollectionView']//child::*//*[@name='Email']");
//
//	public static By objiOSEmailIdField=By.xpath("//*[@placeholder='  Email address' and @class='UIATextField']");
//
//	public static By objiosPasswordField=By.xpath("//*[@placeholder='  Password' and @class='UIATextField']");
//
//	public static By objiiosLoginBtn=By.xpath("//*[@name='Log in' and @knownSuperClass='UIButton']");
//
//	public static By objiiosLoginToastMsg=By.xpath("//*[contains(@text,'ogged-in')]");
//
//	public static By objiiosLogOutToastMsg=By.xpath("//*[contains(@text,'ogged-out')]");
//
//	//Refresh on top of screen
//
//	public static By objiiosRefresh=By.xpath("//*[@name='In progress' and @knownSuperClass='UIActivityIndicatorView']");
//
//	//followbutton
//
//	public static By objiOSFollowBtn=By.xpath("//*[contains(@name,'Username')]//following-sibling::*//*[@name='Follow']");
//
//
//
//	//saveLook
//
//	public static By objiOSSaveLookBtn=By.xpath("//*[contains(text(),' LOOK')]");
//
//
//
//	//Heart btn
//	public static By objiOSHeartBtn=By.xpath("//*[@name='cbsdk_save_look' and @knownSuperClass='UIImageView']");
//
//
//	//Heart btn Selected
//	public static By objiOSHeartBtn_Seleted=By.xpath("//*[@name='cbsdk_save_look_selected' and @knownSuperClass='UIImageView']");
//
//
//
//	//		//User Name In FeedScreen
//	//		public static By objiOSUserNameInFeedScreen=By.xpath("//*[contains(@name,'Username')]");
//
//	//HashTag
//	public static By objiOSHashTagInFeedScreen=By.xpath("//*[contains(@name,'Hashtags')]");
//
//	//Music
//	public static By objiOSMusicInFeedScreen=By.xpath("//*[contains(@name,'sound video')]//parent::*[@class='UIAView']//child::*[contains(@knownSuperClass,'abel')]");
//
//	//AddedEffectOnScreen
//	public static By objiOSAddedEffectOnScreen=By.xpath("//*[contains(@name,'effect')]//parent::*[@class='UIAView']//child::*[contains(@knownSuperClass,'abel')]");
//
//
//	//AddedFiltersOnScreen
//	public static By objiOSAddedFiltersOnScreen=By.xpath("//*[contains(@name,'filters')]//parent::*[@class='UIAView']//child::*[contains(@knownSuperClass,'abel')]");
//
//	//SaveVideo
//	public static By objiOSSaveVideoPopUp=By.xpath("//*[@name='Save video' and @knownSuperClass='UIButton']");
//
//	//AddToFavourites
//	public static By objiOSAddToFavouritesPopUp=By.xpath("//*[contains(@name,'Add to Favourite')]");
//
//	//Report
//	public static By objiOSReportPopUp=By.xpath("//*[@name='Report' and @knownSuperClass='UIButton']");
//
//	//Not interested
//	public static By objiOSNotinterestedPopUp=By.xpath("//*[@name='Not interested' and @knownSuperClass='UIButton']");
//
//	//Creator disabled
//	public static By objiOSCreatordisabled=By.xpath("//*[contains(text(),' creator disabled')]");
//
//
//	//video_saved
//
//	public static By objiOSVideo_saved=By.xpath("//*[@name='Video Saved' and @knownSuperClass='UILabel']");
//
//	//video_saved
//
//	public static By objiOSHipiNoLongerAppear=By.xpath("//*[contains(text(),'This HiPi will no longer appear in your feed')]");
//
//
//	//LoginBtnInFollwingSection
//
//	public static By objiOSHipiLoginBtnInFollwingSection=By.xpath("//*[contains(@text,'ollow an')]");
//
//
//
//	public static By objiOSHipiFollowBtnInFollwingSection=By.xpath("//*[contains(@class,'Collection')]//following-sibling::*[contains(@text,'ollow')]");
//
//
//
//	//image after clicking on saveLook button
//	public static By objiOSHipiImageAferSavedInfeedSection(int index) {
//		return By.xpath("//*[contains(@name,'Name-ProductImage"+index+"')]");
//	}
//
//	//number of shoppable images
//	public static By objiOSHipiTotalShoppableImagesfeedSection=By.xpath("//*[@class='UIACollectionView']/*/*/*[@class='UIAImage']");
//
//
//	public static By objiOSHipiSavedButtonInHomePage=By.xpath("//*[@name='SAVED' and @knownSuperClass='UILabel']");
//
//	public static By objiosFollowIconInHomePage=By.xpath("//*[@name='ic like video']/..//preceding-sibling::*//child::*[2]");
//
//	//09/12/21=================================================================================================================
//
//	public static By objiosMidPointInVideos=By.xpath("(//*[@name='Button']/../../..//*[@knownSuperClass='UIView'])[1]");
//
//	public static By objiosPauseButtonInVideos=By.xpath("//*[@name='b']");
//
//
//
//	//===============================s=====================================================
//	//Save look Icon In Home Page
//	public static By objiOSSaveLookIcon=By.xpath("//*[@name='cbsdk_save_look' and @knownSuperClass='UIImageView']");
//	public static By objiOSSavedVideos = By.xpath("//*[@name='SAVED' and @knownSuperClass='UILabel']");
//	//Save Video
//	public static By objSaveVideo=By.xpath("//*[@name='Save video' and @knownSuperClass='UIButton']");
//	//Saved Video
//	public static By objSavedVideo=By.xpath("//*[@name='Video Saved']");
//
//	//Add following below code in
//	//rail name
//	public static By objiosrailname=By.xpath("(//*[@value='ic arrow next']//preceding-sibling::*[@class='UIAView']//child::*)[1]");
//	//rail view all button
//	public static By objiosrailviewallbutton(String railName) {
//		return By.xpath("//*[@class='UIAView']//child::*[@text='"+railName+"']//parent::*[@class='UIAView']//following-sibling::*[@class='UIAButton']");
//	}
//
//
//	//////////////////////8-12////////////feed///////////p1////////////////////
//
//	//Login Popup
//	public static By objiosLoginPopUp=By.xpath("//*[@name='Login in to Hipi']");
//
//	//music page in feed screen
//	public static By objiosMusicPageInFeedScreen=By.xpath("(//*[@name='Use this sound'])[1]");
//
//
//
//	//Cross Icon In Comment Button
//	public static By objiosCrossIconInCommentbutton=By.xpath("//*[contains(@name,'close')] | //*[contains(@name,'lose')]");
//
//	public static By objiosCrossIconInPrivateCommentbutton=By.xpath("//*[@name='closeButton']");
//
//	//Add To Favourites In Share Button		
//	public static By objiosAddToFavouritesInShareBtn=By.xpath("//*[contains(@name,'avourite') and contains(@class,'Button')]");
//
//	//Added To Favorite
//	public static By objiosAddedToFavorites=By.xpath("//*[contains(@name,'avourite')]");
//
//	//Message In Share Button
//	public static By objiosMessagesInShareButton=By.xpath("//*[@class='UIAView' and ./*[@class='UIAView' and ./*[@class='UIAView' and ./*[@text='Messages']]]]");
//
//	//Cross Icon In share Button
//	public static By objiosCrossIconInShareButton=By.xpath("//*[@name='Close']");
//
//
//
//
//
//	public static By SaveVideoReportNotInterestedAddToFavourites(String type){
//		return By.xpath("//*[@name='"+type+"' and @knownSuperClass='UIButton']");
//
//	}
//
//	// n ============24-12-2021==========================================================
//
//	//No Internet Connection 
//	public static By objiosNoInternetConnectionTostMessage=By.xpath("//*[contains(@name,'onnection')]");
//
//	public static By objiosNoInternetErrorTostMessageInLoginScreen=By.xpath("//*[contains(@name,'Internet error')]");
//
//	// n ============25-12-2021==========================================================	
//
//	// login button in login to continue page
//	public static By objiosLoginButtonInLoginToContinuePage=By.xpath("//*[@name='Login']");
//
//	//pop up when user hold the player screen (long press) 
//
//
//
//	public static By ShareScreenAllTabs(String tabname){
//		return By.xpath("(//*[@name='"+tabname+"'])[2]");
//	}	
//
//	// toast message for not interested tab 
//
//	public static By objiosNotInterestedTostMessage=By.xpath("//*[@name='This Hipi will no longer appear in your feed']");	
//
//
//
//	///////////////s/////24-12-21------------------------s
//	//Following Tab
//	public static By objiosFollowingTabInFeedScreen=By.xpath("//*[contains(@name,'Following_')]");
//
//	//network error in comment icon
//	public static By onjiosNetworkErrorInCommentIcon=By.xpath("//*[@name='Network Error']");
//
//
//	/////////////27-12-21
//	//Not Interested In Share Icon
//	public static By objiosNotInterestedInShareIcon=By.xpath("(//*[@name='Not Interested'])[1]");
//
//	/////////////////////////////////29/12/21////////////////////////////////////////////
//	//saved look
//	public static By objiosSavedLook=By.xpath("//*[@name='SAVED']");
//
//	///////////////28-12-21
//	//hipi google popup
//	public static By objiosGooglePopup=By.xpath("(//*[contains(@text,'google.com')])[2]");
//
//	//continue with the google
//	public static By objiosContinueWithGoogle=By.xpath("//*[@name='Continue']");
//
//	//Internet Error In Google Poup
//	public static By objiosInternetErrorInGooglePoup=By.xpath("//*[@name='Safari cannot open the page because your iPhone is not connected to the internet.']");
//
//	//cancel the Google Page
//	public static By objiosCancelTheGoogle=By.xpath("(//*[@name='Cancel'])[1]");
//
//	//Continue with thwe google
//	public static By objiosContinuewithTheGoogle=By.xpath("(//*[@name='Continue with Google'])[1]");
//
//	//Continue with the Facebook
//	public static By objiosContinuewithTheFacebook=By.xpath("(//*[@name='Continue with Facebook'])[1]");
//
//	//Verify List of Goggle Accounts
//	public static By objiosVerifyListofGoogleAccounts=By.xpath("(//*[contains(text(),'gmail')])[2]");
//
//	//facebook popup
//	public static By objiosFacebookPopup=By.xpath("(//*[contains(@text,'facebook.com')])[2]");
//
//	//Term of Service
//	public static By objiosTermofSerivceInGoogleAccount=By.xpath("(//*[@name='Terms of Service'])[1]");
//
//	//use another account
//	public static By objiosUseAnotherAccount=By.xpath("(//*[@name='Use another account'])[1]");
//
//	//Privacy Policy
//	public static By objiosPrivacyPolicy=By.xpath("(//*[@name='privacy policy'])[1]");
//
//	//Create Account In facebook
//	public static By objiosCreateAccountInfacebook=By.xpath("(//*[@name='Create account'])[1]");
//
//	//Forgot Password In Facebook
//	public static By objiosForgotPasswordInFacebook=By.xpath("(//*[@name='Forgotten password?'])[1]");
//
//	//LogIn Facebook
//	public static By objiosLogInFacebook=By.xpath("//*[@name='Log In']");
//
//	//Mobile Number orPhone Number
//	public static By objiosMobileNumberorPhoneNumber=By.xpath("//*[@label='Mobile number or email address']");
//
//	//facebook password
//	public static By objiosFacebookPassword=By.xpath("//*[@placeholder='Facebook password' and @class='UIATextField']");
//
//
//	//Tag Name In Feed Screen
//	public static By objiosTagsNameInFeedScreen=By.xpath("//*[contains(@name,'Hashtags-')]");		
//
//
//
//	/*
//	 * public static By ShareScreenAllTabs(String tabname){ return
//	 * By.xpath("//*[@name='"+tabname+"' and @class='UIAButton']"); }
//	 */
//
//	public static By objiosToastMessageByClickNotInterestedInShareScreen=By.xpath("//*[@name='This Hipi will no longer appear in your feed']");
//
//
//
//	//19-01-22============================
//	//comment box in comment screen	
//	public static By objiosCommentBoxInCommentScreen=By.xpath("//*[@name='Add comment...']");	
//	//send button in comment box
//	public static By objiosSendButtonIncommentbox=By.xpath("//*[@name='ic send black']");
//
//	//============20-01-22
//	//Number of Likes 
//	public static By objiosTotalNumberOfLikes=By.xpath("//*[contains(@name,'TotalLikes')]");
//
//	//----------------deeplinkURL----------------------------------------------------------------------
//
//	public static By objiosDeepLinkURLInMessageApp=By.xpath("//*[contains(text(),'co.in') and contains(@name,'com.apple.messages.URLBalloonProvider')] | //*[contains(text(),'.app') and contains(@name,'com.apple.messages.URLBalloonProvider')]");
//
//	public static By objiosComposeBtnInMessageApp=By.xpath("//*[contains(@text,'Compose')]");
//
//	public static By objiosTOTextFieldInMessageApp=By.xpath("(//*[@value='To:'])[1]");
//	//(//*[contains(@value,'To:')])[1]
//
//	public static By objiosMsgBodyFieldInMessageApp=By.xpath("//*[contains(@name,'messageBodyField')]");
//
//	public static By objiosSendBtnInMessageApp=By.xpath("//*[contains(@name,'send')]");
//
//	public static By objiosBackBtnInMessageApp=By.xpath("//*[@knownSuperClass='UIControl']");
//
//	//User Name In FeedScreen-For You
//	public static By objiOSUserNameInForYouScreen=By.xpath("//*[contains(@accessibilityLabel,'Id-UsernameForYou')]");
//
//	//User Name In FeedScreen-Following
//	public static By objiOSUserNameInFollowingScreen=By.xpath("//*[contains(@accessibilityLabel,'Id-UsernameFollowing')]");
//
//
//
//	//-------------------------feb--18-----------------------------------------------------------------------
//
//	//============20-01-22
//
//	/////////////////////////////9-2-22/////////////////////////////////////////////////
//	//profile picture
//	public static By objiosprofilepicture=By.xpath("//*[contains(@name,'ProfilePictureForYou')] | //*[contains(@name,'ProfilePictureFollowing')]");
//
//	//Total comments
//	public static By objiosTotalComments=By.xpath("//*[contains(@name,'TotalComments')]");
//
//	//liked video
//	public static By objiosLikedVideo=By.xpath("//*[contains(text(),'like')]");
//
//
//
//	//following in home page
//	public static By objiosFollowingInHomePage=By.xpath("(//*[@name='Following'])[2]");
//
//	//comments count
//	public static By objiosCommentCount=By.xpath("(//*[contains(@text,'Comments')])[2]");
//
//	//profile picture forming
//	public static By objiosProfilePictureFollowing=By.xpath("//*[contains(@name,'ProfilePictureFollowing')]");
//
//
//
//
//
//	// + Icon In Feed Screen 
//	public static By objiOSFollowBtnSelectedFalseInFeedScreen=By.xpath("//*[contains(@name,'Name-FollowButton_Selected-false')]");
//
//	public static By objiOSFollowBtnSelectedTrueInFeedScreen=By.xpath("//*[contains(@name,'Name-FollowButton_Selected-true')]");
//
//	public static By objiOSProfilePictureInFeedScreen=By.xpath("//*[contains(@name,'ProfilePicture')]");
//
//	public static By objiOSFollowingTabSelectedTrueInFeedScreen=By.xpath("//*[contains(@name,'Following_Selected-true')]");
//
//	public static By objiOSFollowingTabSelectedFalseInFeedScreen=By.xpath("//*[contains(@name,'Following_Selected-false')]");
//
//	public static By objiOSForYouTabSelectedTrueInFeedScreen=By.xpath("//*[contains(@name,'Foryou_Selected-true')]");
//
//	public static By objiOSForYouTabSelectedFalseInFeedScreen=By.xpath("//*[contains(@name,'Foryou_Selected-false')]");	
//
//
//	public static By objiOSLikedBtnInFeedScreen=By.xpath("//*[contains(@name,'LikedVideo')]");
//
//
//
//	public static By objiOSTotalLikesBtn=By.xpath("//*[contains(@name,'TotalLikes')]");
//
//	public static By objiOSLikeBtnInFeedScreen=By.xpath("//*[contains(@name,'icLikeVideo')]");
//	public static By objiOSTotalCommentInFeedScreen=By.xpath("//*[contains(@name,'TotalComments')]");
//
//
//	//=======================
//
//
//	//save overlook--pop up
//	public static By objiOSSaveOverLookPopUp=By.xpath("//*[contains(text(),'Save the overall look')]");
//
//
//
//	//=============================================		
//
//
//	//Track Activity Popup 'Ask App not to Track' button
//	public static By objiosAskAppNotToTrackButton = By.xpath("//*[contains(@text,'Ask App')] |//*[@text='Don’t Allow']");	
//
//
//
//	//Popup Don't Allow button
//	public static By objiosDontAllowButton = By.xpath("//*[contains(@text,'Ask App')] |//*[@text='Don’t Allow']");
//
//	//AllowAccesssToPhotos
//	public static By objiosNotificationAllowAccesssToPhotosPopup = By.xpath("//*[contains(@name,'Would Like to Access Your Photos')]");
//
//	//Popup Allow button for save access
//	public static By objiosSaveVideoAccessPopUpAllowButton = By.xpath("//*[contains(@name,'Allow Access')]");
//
//	//Track Activity Popup
//	public static By objiosTrackActivityPermissionPopup = By.xpath("(//*[contains(@name,'track your activity')])[1] | //*[contains(@name,'Would Like to Send You Notifications')]");
//
//	//'“HiPI” Would Like to Send You Notifications' popup
//	public static By objiosNotificationsPopup = By.xpath("(//*[contains(@name,'track your activity')])[1] | //*[contains(@name,'Would Like to Send You Notifications')]");
//
//	//Shopping the look
//	public static By objiOSShoppingthelookLookBtn=By.xpath("//*[contains(@accessibilityLabel,'Shop_CoachMark_Title')]");
//
//
//	//=================================comment==========================================================
//	public static By objiOSAddACommentTextFieldInFeedScreen=By.xpath("//*[contains(@name,'Add_comme')]");
//
//	public static By objiOSAddedCommentTextFieldInFeedScreen=By.xpath("//*[contains(@name,'Added_comment')]");
//
//	public static By objiOSUserCommentInFeedScreen=By.xpath("//*[contains(@name,'ser_1_')]//*");
//
//	public static By objiOSPostButtonInCommentScreen=By.xpath("//*[contains(@name,'Post')]");
//
//	public static By objiOSAddedCommentInCommentScreen=By.xpath("//*[contains(@name,'Added_')]//*");
//
//	public static By objiOSAddedCommentBoxInCommentScreen=By.xpath("//*[contains(@name,'Added_comment')]");
//
//	public static By UserNameInCommentScreen(int index) {
//		return By.xpath("(//*[@class='UIATable']//*[contains(@text,'@') ])["+index+"]");
//	}//(//*[contains(@name,'User_1_desc')]//following-sibling::*)[3]
//
//	public static By UserCommentDescInCommentSection(int index) {
//		return By.xpath("(//*[contains(@name,'_desc')]//child::*)["+index+"]");
//	}
//
//	public static By objiOSMinutesAgoInCommentScreen=By.xpath("//*[contains(@name,'minute')]");
//
//	public static By objiOSHoursAgoInCommentScreen=By.xpath("//*[contains(@name,'hours')]");
//
//	public static By objiOSMonthsAgoInCommentScreen=By.xpath("//*[contains(@name,'month')]");
//
//	public static By objiOSJustNowInCommentScreen=By.xpath("//*[contains(@name,'few seconds ago')]");
//
//	public static By objiOSDaysAgoInCommentScreen=By.xpath("//*[contains(@name,'day')]");
//
//	public static By objiOSWeekAgoInCommentScreen=By.xpath("//*[contains(@name,'week')]");
//
//	public static By objiOSSuggestedUserNameInCommentScreen(String username) {
//		return By.xpath("//*[@name='Suggestions']//parent::*//following-sibling::*[@class='UIATable']//*[contains(@name,'"+username+"')]");
//	}
//	//*[@name='Suggestions']//parent::*//following-sibling::*[@class='UIATable']//*[contains(@name,'@Himanshikhurana')]
//
//	public static By objiOSSuggestedHashTagInCommentScreen(String username) {
//		return By.xpath("//*[@class='UIATable']//*[contains(@name,'"+username+"')]");
//	}
//
//	public static By objiOSTotalLikesInCommentScreen=By.xpath("//*[contains(@name,'Total_Likes')]");
//
//	public static By UserNameXpath(String Text1) {
//		return By.xpath("//*[@class='UIATable']//*[contains(text(),'"+Text1+"')]");
//	}
//	////*[@class='UIATable']//*[contains(text(),'@royalindia51')]
//
//	public static By LikedIconInCommentScreen(int index) {
//		return By.xpath("//*[contains(@name,'Liked_comment_"+index+"')]");
//	}
//
//	public static By AnyLikedIconInCommentScreen=By.xpath("//*[contains(@name,'Liked_')]");
//
//	public static By LikeIconInCommentScreen(int index) {
//		return By.xpath("//*[contains(@name,'Like_comment_"+index+"')]");
//	}
//
//	public static By AnyLikeIconInCommentScreen=By.xpath("//*[contains(@name,'Like_')]");
//
//	public static By AnyLikecountbelowComment=By.xpath("//*[contains(@name,'Total_Likes')]");
//
//	public static By LikecountbelowComment(int index) {
//		return By.xpath("(//*[contains(@name,'Total_Likes')])["+index+"]");
//	}
//
//
//	public static By EmojiInKeyBoardBtn=By.xpath("//*[contains(@name,'Emoji')]");
//
//	public static By OneOFEmojisInKeyBoardBtn(int index) {
//		return By.xpath("(//*[contains(@name,'SMILEYS &')]//following-sibling::*)["+index+"]");
//	}
//
//
//	public static By objiosGifOrimage=By.xpath("//*[@name='GIF/Image']");
//
//	public static By objiosCommentCopiedToastMsg=By.xpath("//*[contains(@name,'opied')]");
//
//
//
//
//	//share btn
//
//	public static By objiOSShareBtn=By.xpath("//*[contains(@name,'share video')]");
//
//	//Back Arrow
//	public static By objiosBackArrowInMusicPage=By.xpath("//*[contains(@name,'back_arrow')]");
//
//	//closeicon for poup
//	public static By objiosCloseIconPoup=By.xpath("//*[contains(@name,'close')]");
//
//
//	public static By objiosCancelButtonInMessageInShareButton=By.xpath("//*[contains(@name,'Cancel')]");
//
//	public static By objiosNewMessagesInMessageInShareButton=By.xpath("//*[contains(@name,'New Message')]");	
//
//
//
//
//	public static By objiosAddCommentFieldInBottomNavigationBar=By.xpath("//*[contains(@name,'Add comment')]");
//
//	public static By objiosthumbnailBesideCommentsAddedByOtherUsers=By.xpath("//*[contains(@name,'Like_comment_1')]//following-sibling::*[3]");
//
//	public static By objiosCommentCopiedInCommentScreen=By.xpath("//*[contains(@name,'Comment Copied')]");
//
//	public static By objiosProgressiveBarInFeedScreen=By.xpath("//*[contains(@name,'Progress')]");
//
//	public static By objiosSoundsInFeedScreen=By.xpath("//*[@name='ic sound video']//following-sibling::*");		
//
//	public static By objiosBottomNavigationBarInFeedScreen=By.xpath("//*[contains(@class,'UIATabBar')]");
//
//
//
//	//28_06_2022
//
//	public static By objiosFollowSuggestionButtonInFollowingScreen=By.xpath("//*[@name='Follow']");
//
//	public static By objiosProfilePictureInFollowingScreen=By.xpath("(//*[@name='com.zee5.hipi:id/ProfilePictureProfilePage'])[1]");
//
//	public static By objiosProfilePictureUserNameInFollowingScreen=By.xpath("((//*[@name='com.zee5.hipi:id/ProfilePictureProfilePage']//following-sibling::*)[1]//child::*)[1]");
//
//
//
//


	
	//============================appiumServerXpath==================================================================================================================================================================
		//Home button in below Tab Bar
		public static By objiOSHomeBtnInBelowTabBar=By.xpath("//*[contains(@value,'Home') and contains(@class,'utton')] | //*[contains(@name,'Feed-')] |//XCUIElementTypeButton[contains(@label,'Home')] |//XCUIElementTypeImage[contains(@name,'home_tab')] ");

		//Discover button in below Tab Bar
		public static By objiOSDiscoverBtnInBelowTabBar=By.xpath("//XCUIElementTypeButton[contains(@name, 'Discover')]");	


		//User Name In FeedScreen
		public static By objiOSUserNameInFeedScreen=By.xpath("//*[contains(@name,'Username')]");

		//Re-Download button
		public static By objiosAppStoreHipiReDownloadBtn = By.xpath("//*[contains(@name,'- Indian Short Video App') and contains(@name,' ratings')]//child::*//XCUIElementTypeButton[@name='re-download']| //*[contains(@name,'- Indian Short Video App')]//child::*[@name='UIA.AppStore.OfferButton']");

		//Search Tab Button In App Store
				public static By objiosSearchTabBtn = By.xpath("//XCUIElementTypeButton[@name='Search'] |//*[contains(@name,'search')]");

				
				//Open Button
				public static By objiosAppStoreOpenBtn = By.xpath("//*[contains(@name,'- Indian Short Video App') and contains(@name,' ratings')]/child::*//XCUIElementTypeButton[@name='open'] | //*[contains(@name,'- Indian Short Video App') ]//child::XCUIElementTypeButton[@label='open']");
	

				//Track Activity Popup
				public static By objiosTrackActivityPermissionPopup = By.xpath("(//*[contains(@name,'track your activity')])[1] | (//*[contains(@name,'Would Like to Send You Notifications')])[1]");
	
				//Track Activity Popup 'Ask App not to Track' button
				public static By objiosAskAppNotToTrackButton = By.xpath("//*[contains(@name,'Ask App')] |//*[@name='Don’t Allow']");	

				//'“HiPI” Would Like to Send You Notifications' popup
				public static By objiosNotificationsPopup = By.xpath("(//*[contains(@name,'track your activity')])[1] | (//*[contains(@name,'Would Like to Send You Notifications')])[1]");
				//Popup Don't Allow button
				public static By objiosDontAllowButton = By.xpath("//*[contains(@name,'Ask App')] |//*[@name='Don’t Allow']");

				

				//Swipe for next video Handgesture

				public static By objiosSwipeForNxtVideo = By.xpath("//*[contains(@name,' next video')]");

				

				//Shopping the look
				public static By objiOSShoppingthelookLookBtn=By.xpath("//*[contains(@name,'Shop_CoachMark_Title')]");
		
				//Shopping the look---Alright Got it button
				public static By objiOSAlrightGotitBtn=By.xpath("//*[contains(@name,'Alright! Got it')]//* | //*[contains(@name,'Shop_CoachMark_OK')]");
				//save overlook--ok button
				public static By objiOSOkCoolBtn=By.xpath("//*[contains(@name,'Ok, Cool')]//* | //*[contains(@name,'_CoachMark_OK')]");


				//Create button in below Tab Bar
				public static By objiOSCreateBtnInBelowTabBar=By.xpath("//*[contains(@name,'Create-')] |//*[@name='Create']");
				//Profile button in below Tab Bar
				public static By objiOSProfileBtnInBelowTabBar=By.xpath("//*[contains(@name,'Profile-')] | //*[@name='Profile'] "); 
		
				public static By objiOSCopyLink=By.xpath("//*[@type='XCUIElementTypeImage' and @name='Link']");
				
				
				

				public static By objiOSUsePhoneOrEmail=By.xpath("(//*[contains(@name,'Use Phone or Email')])[1]");

				public static By  objiOSEmailOption=By.xpath("(//*[contains(@name,'Email')])[1]");
				//XCUIElementTypeStaticText[@name="Email"]

				public static By objiOSEmailIdField=By.xpath("(//*[contains(@type,'XCUIElementTypeTextField')])[1]");
				//*[@type='XCUIElementTypeTextField' and @value='Email address']
				
				public static By objiOSPhoneNumberField=By.xpath("//XCUIElementTypeTextField[contains(@value,'Phone number')]");

				public static By objiosPasswordField=By.xpath("(//*[contains(@type,'XCUIElementTypeSecureTextField')])[1]");
				//*[@type='XCUIElementTypeSecureTextField' and @value='Password']
				
				public static By objiosPasswordFieldPhone=By.xpath("//XCUIElementTypeSecureTextField[contains(@value,'  Password')]");

				public static By objiiosLoginBtn=By.xpath("//XCUIElementTypeButton[@name='Log in' and @enabled='true']");
				//*[@type='XCUIElementTypeButton' and @name='Log in']

				public static By objiiosLoginToastMsg=By.xpath("//*[contains(@name,'ogged-in')]|//XCUIElementTypeStaticText[contains(@name,'Logged-in Successfully')]");

				public static By objiiosLogOutToastMsg=By.xpath("//*[contains(@name,'ogged-out')]|//XCUIElementTypeStaticText[contains(@name,'Logged-out Successfully')]");		
				
				
				//For You
				public static By objiOSForYouBtnInFeedScreen=By.xpath("//*[contains(@name,'Foryou_')]");

				//like btn

				public static By objiOSLikeBtn=By.xpath("//*[contains(@name,'like video') and contains(@type,'XCUIElementTypeButton')] |//*[contains(@name,'LikeVideo')]");
	
				

				public static By objiOSLikedBtnInFeedScreen=By.xpath("//*[contains(@name,'LikedVideo')]");

				
				public static By objiOSLikeBtnInFeedScreen=By.xpath("//*[contains(@name,'LikeVideo')]");
				

				public static By objiOSTotalLikesBtn=By.xpath("//*[contains(@name,'TotalLikes')]");

				
				public static By objiOSTotalCommentInFeedScreen=By.xpath("//*[contains(@name,'TotalComments')]");


				//save overlook--pop up
				public static By objiOSSaveOverLookPopUp=By.xpath("//*[contains(@name,'Save the overall look')]");

				//comment btn

				public static By objiOSCommentBtn=By.xpath("//*[contains(@name,'comment video')]");

				
				public static By objiOSAddACommentTextFieldInFeedScreen=By.xpath("//*[contains(@name,'Add_comme')]");

				public static By objiOSAddedCommentTextFieldInFeedScreen=By.xpath("//*[contains(@name,'Added_comment')]");

				public static By objiOSUserCommentInFeedScreen=By.xpath("//*[contains(@name,'ser_1_')]//*");

				public static By objiOSPostButtonInCommentScreen=By.xpath("//*[contains(@name,'Post')]");

				public static By objiOSAddedCommentInCommentScreen=By.xpath("//*[contains(@name,'ser_1_')]//*");

				public static By objiOSAddedCommentBoxInCommentScreen=By.xpath("//*[contains(@name,'Added_comment')]");
	
				public static By UserNameXpath(String Text1) {
					return By.xpath("//*[contains(@name,'"+Text1+"')]");
				}
				
				
				//Cross Icon In Comment Button
				public static By objiosCrossIconInCommentbutton=By.xpath("//*[contains(@name,'close')] | //*[contains(@name,'lose')]");

				public static By objiosCrossIconInPrivateCommentbutton=By.xpath("//*[@name='closeButton']");
				
				
				
				
				
				public static By objiosCamreraToggleSwitch=By.xpath("//XCUIElementTypeSwitch[@name='Camera' and @value='0']");
				
				public static By objiosMicrophoneToggleSwitch=By.xpath("//XCUIElementTypeSwitch[@name='Microphone' and @value='0']");

		//====================================================================================================================================================================================================	
		
		


		public static By objiosNameInMsgWindow(String name) {
			return By.xpath("//*[@name='"+name+"']");
		}
		public static By objiosShopMsgInMessageApp=By.xpath("//*[@name='shop']");


		public static By objiosFollowBtnOnUserCardsInFoolowingTab=By.xpath("//*[@name='Follow' and @class='UIAButton']");	

		//save video
		public static By objiOSsave_video=By.xpath("//*[@name='Save video' and contains(@knownSuperClass,'UIButton')]");



		//Following
		public static By objiOSFollowingBtnInFeedScreen=By.xpath("//*[@name='Following']");

		
	


		public static By objiosgoogleaccounts(int k) {
			return By.xpath("(//*[contains(@name,'@gmail.com')])["+k+"]");
		}
		//Mobile Number orPhone Number
		public static By objiosMobileNumberField=By.xpath("//*[@placeholder='  Phone number']");
		//backbtnFrom msg

		public static By objiosMessagebackBtn = By.xpath("//*[@knownSuperClass='UIControl']");

		// Account pop up while downloding from appstore
		public static By objiosAccPopUp = By.xpath("//*[contains(text(),'ACCOUNT')]");

		// Install Btn In Account pop up while downloding from appstore
		public static By objiosInstallBtnInAccPopUp = By.xpath("//*[contains(text(),'Install')]");
			
		// Search Tab Button
				public static By objiosSearchBar = By.xpath("//XCUIElementTypeSearchField[contains(@name,'Apps, Stories and More')] | //*[contains(@name,'Search')]/XCUIElementTypeSearchField");




		//hipi in testflight

		public static By objiosHipiInTestFlight = By.xpath("//*[@name='Hipi - Indian Short Video App' and @class='UIAStaticText'] | //XCUIElementTypeStaticText[@name='Hipi - Indian Short Video App']");

		//previous builds in testFlight

		public static By objiosPreviousBuildsInTestFlight = By.xpath("//*[@name='Previous Builds' and @knownSuperClass='UILabel'] | //XCUIElementTypeStaticText[@name='Previous Builds']");

		//version in testfilght
		public static By objiosVersionIntestFlight(String version) {
			return By.xpath("//*[@name='"+version+"']|//XCUIElementTypeStaticText[@name='"+version+"']");
		}

		//for respin release build
		public static By objiosRealeseIntestFlight(String Release) {
			return By.xpath("//*[contains(text(),' ("+Release+")')]//parent::*/*[@text='INSTALL'] | (//XCUIElementTypeStaticText[contains(@name,'("+Release+")')]//following-sibling::*)[4]");
			

		}

		public static By objiosOlderVersionPopUp=By.xpath("//*[contains(text(),'Older ')]");


		public static By objiosInstallBtnOnOlderVersionPopUp=By.xpath("//*[@name='Install']");

		//open the specific build in testflight after installing
		public static By objiosOpenBtnIntestFlight(String Release) {
			return By.xpath("//*[contains(text(),' ("+Release+")')]//parent::*/*[@text='OPEN'] | //XCUIElementTypeButton[@name='OPEN']");
		}

		//latest version in testFlight

		public static By objiosLatestBuildVersionInTestFlight = By.xpath("(//*[@name='- Indian Short Video App']//*[contains(@name,'Version')])[2]");

		//update in testflight

		public static By objiosUpdateBtnInTestFlight = By.xpath("//*[contains(text(),' - Indian Short Video App')]/*[@text='UPDATE']");




		//Install button in Testflight
		public static By objiosInstallButton = By.xpath("//*[contains(text(),'- Indian Short Video App')]/*[@text='INSTALL']");

		//Open Button in Testflight
		public static By objiosOpenButton = By.xpath("//*[contains(text(),'- Indian Short Video App')]/*[@text='OPEN']");


		//From The Developer
		public static By objiosFromTheDeveloper = By.xpath("//*[@text='From the Developer']");

		//Back arrow from Feed Screen

		public static By objiosBackArrowButtonFromFeed=By.xpath("//*[contains(@name,'back_arrow')]");

		//Next button
		public static By objiosNextButton = By.xpath("(//*[@XCElementType='XCUIElementTypeButton' and @text='Next'])[1]");
		//Share Feedback
		public static By objiosShareFeedback = By.xpath("//*[@text='Share Feedback']");
		//Start Testing
		public static By objiosStartTesting = By.xpath("(//*[@XCElementType='XCUIElementTypeButton' and @text='Start Testing'])[1]");


		

		//Popup Allow button
		public static By objiosAllowButton = By.xpath("//*[@name='Allow' and @class='UIAButton']");

		//HiP Would Like to Send You Notifications' popup
		//		public static By objiosNotificationsPopup = By.xpath("//*[@name='"hipi" Would Like to Send You Notifications']");

		//AllowAccesssToPhotos
		//		public static By objiosNotificationAllowAccesssToPhotosPopup = By.xpath("//*[@name='"hipi" Would Like to Access Your Photos']");


		//Popup ok button for save access
		public static By objiosSaveVideoAccessPopUpOKButton = By.xpath("//*[@name='OK']");
		
		

		//Re-Download button
		//public static By objiosAppStoreHipiReDownloadBtn = By.xpath("//*[contains(text(),'- Indian Short Video App') and contains(text(),' ratings')]/*[@text='re-download'] | //*[contains(text(),'- Indian Short Video App') and contains(text(),' ratings')]//*[@name='get']");


		
		
		
		//WiFi-off
		public static By objiOSWifiOff=By.xpath("//*[@name='wifi-button' and @value='0']");

		//wifi on but NotConnected		
		public static By objiOSWifiOnButNotConnected=By.xpath("//*[@name='wifi-button' and @value='1'  and @text='Wi-Fi, Searching']");

		//WiFi-On
		public static By objiOSWifiIsOn=By.xpath("//*[@name='wifi-button' and @value='1']");



		//network error
		public static By objiOSNetworkError=By.xpath("//*[contains(@name,'onnection')]");


		//Feed Screen
		public static By objiOSFeedScreen=By.xpath("(//*[@name='Progress']//ancestor::*//*[@class='UIAScrollView']//following-sibling::*//child::*)[4]");


		
		//Tab Bar
		public static By objiOSBelowTabBarInFeedScreen=By.xpath("//*[ @class='UIATabBar']");



		//Shop button in below Tab Bar
		public static By objiOSShopBtnInBelowTabBar=By.xpath("//*[@name='SHOP' and @knownSuperClass='UIButton']");




		//profileCloseBtn

		public static By objiOSProfileCloseBtnInBelowTabBar=By.xpath("//*[@name='ic close' and @knownSuperClass='UIButton']");


		//Play button
		public static By objiOSPlayBtnInFeedScreen=By.xpath("//*[@name='b' and @class='UIAButton']");




		//Refresh on top of screen

		public static By objiiosRefresh=By.xpath("//*[@name='In progress' and @knownSuperClass='UIActivityIndicatorView']");

		//followbutton

		public static By objiOSFollowBtn=By.xpath("//*[contains(@name,'Username')]//following-sibling::*//*[@name='Follow']");



		//saveLook

		public static By objiOSSaveLookBtn=By.xpath("//*[contains(text(),' LOOK')]");



		//Heart btn
		public static By objiOSHeartBtn=By.xpath("//*[@name='cbsdk_save_look' and @knownSuperClass='UIImageView']");


		//Heart btn Selected
		public static By objiOSHeartBtn_Seleted=By.xpath("//*[@name='cbsdk_save_look_selected' and @knownSuperClass='UIImageView']");



		//		//User Name In FeedScreen
		//		public static By objiOSUserNameInFeedScreen=By.xpath("//*[contains(@name,'Username')]");

		//HashTag
		public static By objiOSHashTagInFeedScreen=By.xpath("//*[contains(@name,'Hashtags')]");

		//Music
		public static By objiOSMusicInFeedScreen=By.xpath("//*[contains(@name,'sound video')]//parent::*[@class='UIAView']//child::*[contains(@knownSuperClass,'abel')]");

		//AddedEffectOnScreen
		public static By objiOSAddedEffectOnScreen=By.xpath("//*[contains(@name,'effect')]//parent::*[@class='UIAView']//child::*[contains(@knownSuperClass,'abel')]");


		//AddedFiltersOnScreen
		public static By objiOSAddedFiltersOnScreen=By.xpath("//*[contains(@name,'filters')]//parent::*[@class='UIAView']//child::*[contains(@knownSuperClass,'abel')]");

		//SaveVideo
		public static By objiOSSaveVideoPopUp=By.xpath("//*[@name='Save video' and @knownSuperClass='UIButton']");

		//AddToFavourites
		public static By objiOSAddToFavouritesPopUp=By.xpath("//*[contains(@name,'Add to Favourite')]");

		//Report
		public static By objiOSReportPopUp=By.xpath("//*[@name='Report' and @knownSuperClass='UIButton']");

		//Not interested
		public static By objiOSNotinterestedPopUp=By.xpath("//*[@name='Not interested' and @knownSuperClass='UIButton']");

		//Creator disabled
		public static By objiOSCreatordisabled=By.xpath("//*[contains(text(),' creator disabled')]");


		//video_saved

		public static By objiOSVideo_saved=By.xpath("//*[@name='Video Saved' and @knownSuperClass='UILabel']");

		//video_saved

		public static By objiOSHipiNoLongerAppear=By.xpath("//*[contains(text(),'This HiPi will no longer appear in your feed')]");


		//LoginBtnInFollwingSection

		public static By objiOSHipiLoginBtnInFollwingSection=By.xpath("//*[contains(@text,'ollow an')]");



		public static By objiOSHipiFollowBtnInFollwingSection=By.xpath("//*[contains(@class,'Collection')]//following-sibling::*[contains(@text,'ollow')]");



		//image after clicking on saveLook button
		public static By objiOSHipiImageAferSavedInfeedSection(int index) {
			return By.xpath("//*[contains(@name,'Name-ProductImage"+index+"')]");
		}

		//number of shoppable images
		public static By objiOSHipiTotalShoppableImagesfeedSection=By.xpath("//*[@class='UIACollectionView']/*/*/*[@class='UIAImage']");


		public static By objiOSHipiSavedButtonInHomePage=By.xpath("//*[@name='SAVED' and @knownSuperClass='UILabel']");

		public static By objiosFollowIconInHomePage=By.xpath("//*[@name='ic like video']/..//preceding-sibling::*//child::*[2]");

		//09/12/21=================================================================================================================

		public static By objiosMidPointInVideos=By.xpath("(//*[@name='Button']/../../..//*[@knownSuperClass='UIView'])[1]");

		public static By objiosPauseButtonInVideos=By.xpath("//*[@name='b']");



		//===============================s=====================================================
		//Save look Icon In Home Page
		public static By objiOSSaveLookIcon=By.xpath("//*[@name='cbsdk_save_look' and @knownSuperClass='UIImageView']");
		public static By objiOSSavedVideos = By.xpath("//*[@name='SAVED' and @knownSuperClass='UILabel']");
		//Save Video
		public static By objSaveVideo=By.xpath("//*[@name='Save video' and @knownSuperClass='UIButton']");
		//Saved Video
		public static By objSavedVideo=By.xpath("//*[@name='Video Saved']");

		//Add following below code in
		//rail name
		public static By objiosrailname=By.xpath("(//*[@value='ic arrow next']//preceding-sibling::*[@class='UIAView']//child::*)[1]");
		//rail view all button
		public static By objiosrailviewallbutton(String railName) {
			return By.xpath("//*[@class='UIAView']//child::*[@text='"+railName+"']//parent::*[@class='UIAView']//following-sibling::*[@class='UIAButton']");
		}


		//////////////////////8-12////////////feed///////////p1////////////////////

		//Login Popup
		public static By objiosLoginPopUp=By.xpath("//*[@name='Login in to Hipi']");

		//music page in feed screen
		public static By objiosMusicPageInFeedScreen=By.xpath("(//*[@name='Use this sound'])[1]");



		

		//Add To Favourites In Share Button		
		public static By objiosAddToFavouritesInShareBtn=By.xpath("//*[contains(@name,'avourite') and contains(@class,'Button')]");

		//Added To Favorite
		public static By objiosAddedToFavorites=By.xpath("//*[contains(@name,'avourite')]");

		//Message In Share Button
		public static By objiosMessagesInShareButton=By.xpath("//*[@class='UIAView' and ./*[@class='UIAView' and ./*[@class='UIAView' and ./*[@text='Messages']]]]");

		//Cross Icon In share Button
		public static By objiosCrossIconInShareButton=By.xpath("//*[@name='Close']");





		public static By SaveVideoReportNotInterestedAddToFavourites(String type){
			return By.xpath("//*[@name='"+type+"' and @knownSuperClass='UIButton']");

		}

		// n ============24-12-2021==========================================================

		//No Internet Connection 
		public static By objiosNoInternetConnectionTostMessage=By.xpath("//*[contains(@name,'onnection')]");

		public static By objiosNoInternetErrorTostMessageInLoginScreen=By.xpath("//*[contains(@name,'Internet error')]");

		// n ============25-12-2021==========================================================	

		// login button in login to continue page
		public static By objiosLoginButtonInLoginToContinuePage=By.xpath("//*[@name='Login']");

		//pop up when user hold the player screen (long press) 



		public static By ShareScreenAllTabs(String tabname){
			return By.xpath("(//*[@name='"+tabname+"'])[2]");
		}	

		// toast message for not interested tab 

		public static By objiosNotInterestedTostMessage=By.xpath("//*[@name='This Hipi will no longer appear in your feed']");	



		///////////////s/////24-12-21------------------------s
		//Following Tab
		public static By objiosFollowingTabInFeedScreen=By.xpath("//*[contains(@name,'Following_')]");

		//network error in comment icon
		public static By onjiosNetworkErrorInCommentIcon=By.xpath("//*[@name='Network Error']");


		/////////////27-12-21
		//Not Interested In Share Icon
		public static By objiosNotInterestedInShareIcon=By.xpath("(//*[@name='Not Interested'])[1]");

		/////////////////////////////////29/12/21////////////////////////////////////////////
		//saved look
		public static By objiosSavedLook=By.xpath("//*[@name='SAVED']");

		///////////////28-12-21
		//hipi google popup
		public static By objiosGooglePopup=By.xpath("(//*[contains(@text,'google.com')])[2]");

		//continue with the google
		public static By objiosContinueWithGoogle=By.xpath("//*[@name='Continue']");

		//Internet Error In Google Poup
		public static By objiosInternetErrorInGooglePoup=By.xpath("//*[@name='Safari cannot open the page because your iPhone is not connected to the internet.']");

		//cancel the Google Page
		public static By objiosCancelTheGoogle=By.xpath("(//*[@name='Cancel'])[1]");

		//Continue with thwe google
		public static By objiosContinuewithTheGoogle=By.xpath("(//*[@name='Continue with Google'])[1]");

		//Continue with the Facebook
		public static By objiosContinuewithTheFacebook=By.xpath("(//*[@name='Continue with Facebook'])[1]");

		//Verify List of Goggle Accounts
		public static By objiosVerifyListofGoogleAccounts=By.xpath("(//*[contains(text(),'gmail')])[2]");

		//facebook popup
		public static By objiosFacebookPopup=By.xpath("(//*[contains(@text,'facebook.com')])[2]");

		//Term of Service
		public static By objiosTermofSerivceInGoogleAccount=By.xpath("(//*[@name='Terms of Service'])[1]");

		//use another account
		public static By objiosUseAnotherAccount=By.xpath("(//*[@name='Use another account'])[1]");

		//Privacy Policy
		public static By objiosPrivacyPolicy=By.xpath("(//*[@name='privacy policy'])[1]");

		//Create Account In facebook
		public static By objiosCreateAccountInfacebook=By.xpath("(//*[@name='Create account'])[1]");

		//Forgot Password In Facebook
		public static By objiosForgotPasswordInFacebook=By.xpath("(//*[@name='Forgotten password?'])[1]");

		//LogIn Facebook
		public static By objiosLogInFacebook=By.xpath("//*[@name='Log In']");

		//Mobile Number orPhone Number
		public static By objiosMobileNumberorPhoneNumber=By.xpath("//*[@label='Mobile number or email address']");

		//facebook password
		public static By objiosFacebookPassword=By.xpath("//*[@placeholder='Facebook password' and @class='UIATextField']");


		//Tag Name In Feed Screen
		public static By objiosTagsNameInFeedScreen=By.xpath("//*[contains(@name,'Hashtags-')]");		



		/*
		 * public static By ShareScreenAllTabs(String tabname){ return
		 * By.xpath("//*[@name='"+tabname+"' and @class='UIAButton']"); }
		 */

		public static By objiosToastMessageByClickNotInterestedInShareScreen=By.xpath("//*[@name='This Hipi will no longer appear in your feed']");



		//19-01-22============================
		//comment box in comment screen	
		public static By objiosCommentBoxInCommentScreen=By.xpath("//*[@name='Add comment...']");	
		//send button in comment box
		public static By objiosSendButtonIncommentbox=By.xpath("//*[@name='ic send black']");

		//============20-01-22
		//Number of Likes 
		public static By objiosTotalNumberOfLikes=By.xpath("//*[contains(@name,'TotalLikes')]");

		//----------------deeplinkURL----------------------------------------------------------------------

		public static By objiosDeepLinkURLInMessageApp=By.xpath("//*[contains(text(),'co.in') and contains(@name,'com.apple.messages.URLBalloonProvider')] | //*[contains(text(),'.app') and contains(@name,'com.apple.messages.URLBalloonProvider')]");

		public static By objiosComposeBtnInMessageApp=By.xpath("//*[contains(@text,'Compose')]");

		public static By objiosTOTextFieldInMessageApp=By.xpath("(//*[@value='To:'])[1]");
		//(//*[contains(@value,'To:')])[1]

		public static By objiosMsgBodyFieldInMessageApp=By.xpath("//*[contains(@name,'messageBodyField')]");

		public static By objiosSendBtnInMessageApp=By.xpath("//*[contains(@name,'send')]");

		public static By objiosBackBtnInMessageApp=By.xpath("//*[@knownSuperClass='UIControl']");

		//User Name In FeedScreen-For You
		public static By objiOSUserNameInForYouScreen=By.xpath("//*[contains(@accessibilityLabel,'Id-UsernameForYou')]");

		//User Name In FeedScreen-Following
		public static By objiOSUserNameInFollowingScreen=By.xpath("//*[contains(@accessibilityLabel,'Id-UsernameFollowing')]");



		//-------------------------feb--18-----------------------------------------------------------------------

		//============20-01-22

		/////////////////////////////9-2-22/////////////////////////////////////////////////
		//profile picture
		public static By objiosprofilepicture=By.xpath("//*[contains(@name,'ProfilePictureForYou')] | //*[contains(@name,'ProfilePictureFollowing')]");

		//Total comments
		public static By objiosTotalComments=By.xpath("//*[contains(@name,'TotalComments')]");

		//liked video
		public static By objiosLikedVideo=By.xpath("//*[contains(text(),'like')]");



		//following in home page
		public static By objiosFollowingInHomePage=By.xpath("(//*[@name='Following'])[2]");

		//comments count
		public static By objiosCommentCount=By.xpath("(//*[contains(@text,'Comments')])[2]");

		//profile picture forming
		public static By objiosProfilePictureFollowing=By.xpath("//*[contains(@name,'ProfilePictureFollowing')]");





		// + Icon In Feed Screen 
		public static By objiOSFollowBtnSelectedFalseInFeedScreen=By.xpath("//*[contains(@name,'Name-FollowButton_Selected-false')]");

		public static By objiOSFollowBtnSelectedTrueInFeedScreen=By.xpath("//*[contains(@name,'Name-FollowButton_Selected-true')]");

		public static By objiOSProfilePictureInFeedScreen=By.xpath("//*[contains(@name,'ProfilePicture')]");

		public static By objiOSFollowingTabSelectedTrueInFeedScreen=By.xpath("//*[contains(@name,'Following_Selected-true')]");

		public static By objiOSFollowingTabSelectedFalseInFeedScreen=By.xpath("//*[contains(@name,'Following_Selected-false')]");

		public static By objiOSForYouTabSelectedTrueInFeedScreen=By.xpath("//*[contains(@name,'Foryou_Selected-true')]");

		public static By objiOSForYouTabSelectedFalseInFeedScreen=By.xpath("//*[contains(@name,'Foryou_Selected-false')]");	




		//=======================


		


		//=============================================		


		

		
		//AllowAccesssToPhotos
		public static By objiosNotificationAllowAccesssToPhotosPopup = By.xpath("//*[contains(@name,'Would Like to Access Your Photos')]");

		//Popup Allow button for save access
		public static By objiosSaveVideoAccessPopUpAllowButton = By.xpath("//*[contains(@name,'Allow Access')]");

		

		//=================================comment==========================================================
	
		public static By UserNameInCommentScreen(int index) {
			return By.xpath("(//*[@class='UIATable']//*[contains(@text,'@') ])["+index+"]");
		}//(//*[contains(@name,'User_1_desc')]//following-sibling::*)[3]

		public static By UserCommentDescInCommentSection(int index) {
			return By.xpath("(//*[contains(@name,'_desc')]//child::*)["+index+"]");
		}

		public static By objiOSMinutesAgoInCommentScreen=By.xpath("//*[contains(@name,'minute')]");

		public static By objiOSHoursAgoInCommentScreen=By.xpath("//*[contains(@name,'hours')]");

		public static By objiOSMonthsAgoInCommentScreen=By.xpath("//*[contains(@name,'month')]");

		public static By objiOSJustNowInCommentScreen=By.xpath("//*[contains(@name,'few seconds ago')]");

		public static By objiOSDaysAgoInCommentScreen=By.xpath("//*[contains(@name,'day')]");

		public static By objiOSWeekAgoInCommentScreen=By.xpath("//*[contains(@name,'week')]");

		public static By objiOSSuggestedUserNameInCommentScreen(String username) {
			return By.xpath("//*[@name='Suggestions']//parent::*//following-sibling::*[@class='UIATable']//*[contains(@name,'"+username+"')]");
		}
		//*[@name='Suggestions']//parent::*//following-sibling::*[@class='UIATable']//*[contains(@name,'@Himanshikhurana')]

		public static By objiOSSuggestedHashTagInCommentScreen(String username) {
			return By.xpath("//*[@class='UIATable']//*[contains(@name,'"+username+"')]");
		}

		public static By objiOSTotalLikesInCommentScreen=By.xpath("//*[contains(@name,'Total_Likes')]");

		
		////*[@class='UIATable']//*[contains(text(),'@royalindia51')]

		public static By LikedIconInCommentScreen(int index) {
			return By.xpath("//*[contains(@name,'Liked_comment_"+index+"')]");
		}

		public static By AnyLikedIconInCommentScreen=By.xpath("//*[contains(@name,'Liked_')]");

		public static By LikeIconInCommentScreen(int index) {
			return By.xpath("//*[contains(@name,'Like_comment_"+index+"')]");
		}

		public static By AnyLikeIconInCommentScreen=By.xpath("//*[contains(@name,'Like_')]");

		public static By AnyLikecountbelowComment=By.xpath("//*[contains(@name,'Total_Likes')]");

		public static By LikecountbelowComment(int index) {
			return By.xpath("(//*[contains(@name,'Total_Likes')])["+index+"]");
		}


		public static By EmojiInKeyBoardBtn=By.xpath("//*[contains(@name,'Emoji')]");

		public static By OneOFEmojisInKeyBoardBtn(int index) {
			return By.xpath("(//*[contains(@name,'SMILEYS &')]//following-sibling::*)["+index+"]");
		}


		public static By objiosGifOrimage=By.xpath("//*[@name='GIF/Image']");

		public static By objiosCommentCopiedToastMsg=By.xpath("//*[contains(@name,'opied')]");




		//share btn

		public static By objiOSShareBtn=By.xpath("//*[contains(@name,'share video')]");

		//Back Arrow
		public static By objiosBackArrowInMusicPage=By.xpath("//*[contains(@name,'back_arrow')]");

		//closeicon for poup
		public static By objiosCloseIconPoup=By.xpath("//*[contains(@name,'close')]");


		public static By objiosCancelButtonInMessageInShareButton=By.xpath("//*[contains(@name,'Cancel')]");

		public static By objiosNewMessagesInMessageInShareButton=By.xpath("//*[contains(@name,'New Message')]");	




		public static By objiosAddCommentFieldInBottomNavigationBar=By.xpath("//*[contains(@name,'Add comment')]");

		public static By objiosthumbnailBesideCommentsAddedByOtherUsers=By.xpath("//*[contains(@name,'Like_comment_1')]//following-sibling::*[3]");

		public static By objiosCommentCopiedInCommentScreen=By.xpath("//*[contains(@name,'Comment Copied')]");

		public static By objiosProgressiveBarInFeedScreen=By.xpath("//*[contains(@name,'Progress')]");

		public static By objiosSoundsInFeedScreen=By.xpath("//*[@name='ic sound video']//following-sibling::*");		

		public static By objiosBottomNavigationBarInFeedScreen=By.xpath("//*[contains(@class,'UIATabBar')]");



		//28_06_2022

		public static By objiosFollowSuggestionButtonInFollowingScreen=By.xpath("//*[@name='Follow']");

		public static By objiosProfilePictureInFollowingScreen=By.xpath("(//*[@name='com.zee5.hipi:id/ProfilePictureProfilePage'])[1]");

		public static By objiosProfilePictureUserNameInFollowingScreen=By.xpath("((//*[@name='com.zee5.hipi:id/ProfilePictureProfilePage']//following-sibling::*)[1]//child::*)[1]");

		public static By objiosVideoIdInFeedScreen=By.xpath("//XCUIElementTypeStaticText[contains(@name,'VideoId')]");

		public static By objiosContinuePopUpInFacebook=By.xpath("//XCUIElementTypeButton[@name='Continue']");

		public static By objiosOpenPopUpInFacebook=By.xpath("//XCUIElementTypeButton[@name='Open']");

		public static By objiosContinueButtonInLoginWithFacebookPage=By.xpath("//*[@type='XCUIElementTypeButton' and @name='Continue']");

		public static By objiosContinuePopUpInGoogle=By.xpath("//XCUIElementTypeButton[@name='Continue']");
		
		public static By objiosMailInGooglePage=By.xpath("//XCUIElementTypeStaticText[@name='Tester B']");
		public static By objiosMailInGooglePage1=By.xpath("//*[contains(@value,'@gmail.com')]");

		public static By objiosContinueWithGoogleInLogin=By.xpath("//XCUIElementTypeButton[@name='Continue with Google']");
		
		
		public static By objiosEmailOrPhoneInGoogle = By.xpath("//XCUIElementTypeTextField[@name='Email or phone']");
		
		public static By objiosNextBtnInGoogle = By.xpath("//XCUIElementTypeButton[@name='Next']");
		
		public static By objiosPasswordFieldInGoogle = By.xpath("//XCUIElementTypeSecureTextField[@name='Enter your password']");
		
		public static By objiosDoneBtnInKeyboard = By.xpath("//XCUIElementTypeButton[@name='Done']");
		
		
		//PushUp Promotional Notification
		
		public static By objiosPopUpCloseBtn=By.xpath("//*[contains(@name,'Watch Now')]/preceding::*[@type='XCUIElementTypeButton']");
		public static By objiosPopUpWatchNow=By.xpath("(//*[@type='XCUIElementTypeImage']/following::*[contains(@name,'Watch Now')])[1]");


}
