package HW43;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCasesInJavaApplictionLOGIN
	{

		public static void main(String[] args)
		{

			WebDriver d = new FirefoxDriver();
			// d.setJavascriptEnabled(true);
			String baseUrl = "http://learn2test.net/qa/apps/sign_up/v1/";

			String TC_01_01 = "TC-01.01";
			String TC_01_02 = "TC-01.02";
			String TC_01_03 = "TC-01.03";
			String TC_01_04 = "TC-01.04";
			String TC_01_05 = "TC-01.05";
			String TC_01_06 = "TC-01.06";
			String TC_01_07 = "TC-01.07";
			String TC_01_08 = "TC-01.08";
			String TC_01_09 = "TC-01.09";
			String TC_01_10 = "TC-01.10";
			String TC_01_11 = "TC-01.11";
			String TC_01_12 = "TC-01.12";
			String TC_01_13 = "TC-01.13";
			String TC_01_14 = "TC-01.14";
			String TC_01_15 = "TC-01.15";
			String TC_01_16 = "TC-01.16";
			String TC_01_17 = "TC-01.17";
			String TC_01_18 = "TC-01.18";
			String TC_01_19 = "TC-01.19";
			String TC_01_20 = "TC-01.20";
			String TC_01_21 = "TC-01.21";
			String TC_01_22 = "TC-01.22";
			String TC_01_23 = "TC-01.23";
			String TC_01_24 = "TC-01.24";
			String TC_01_25 = "TC-01.25";
			String TC_01_26 = "TC-01.26";
			String TC_01_27 = "TC-01.27";
			String TC_01_28 = "TC-01.28";
			String TC_01_29 = "TC-01.29";
			String TC_01_30 = "TC-01.30";
			String TC_01_31 = "TC-01.31";
			String TC_01_32 = "TC-01.32";
			String TC_01_33 = "TC-01.33";
			String TC_01_34 = "TC-01.34";
			//String TC_01_35 = "TC-01.35";
		//	String TC_01_36 = "TC-01.36";
//lll the change for the GItHub :)
			String htmlTitle = "Welcome to Sign Up";
			String signUpTitle = "Sign Up";
			// String dynamicTextQuote = "SOME QUOTE";
			String fnField = "First Name";
			String lnField = "Last Name";
			String eaField = "Email Address";
			String pFiled = "Phone Number";
			String imageLinkFB = "Facebook";
			String imageLinkTW = "Twitter";
			String imageLinkFL = "Flickr";
			String imageLinkYT = "YouTube";
			String staticTextCopyright = "© 2014 learn2test.net";
			String myFN = "Maxim";
			String myLN = "Sitnikov";
			String myEmail = "sit@nikov.net";
			String myPhone = "2129206381";
			String confermationPageTitle = "Confermation";

			String nullFName = "Please enter First Name";
			String nullLName = "Please enter Last Name";
			String nullEmail = "Please enter Email Address Name";
			String nullPhone = "Please enter Phone";
			String invalidFName = "Invalid First Name: [a-zA-Z,.'-]{3,30}";
			String invalidLName = "Invalid Last Name: [a-zA-Z,.'-]{3,30}";
			String invalidEmail = "Invalid Email Address: xx[min2]@x[min1].xx[2-6]";
			String invalidPhone = "Invalid Phone Number: should be 10 digits";

			String title_facebook_expected = "Welcome to Facebook - Log In, Sign Up or Learn More";
			String title_twitter_expected = "Twitter";
			String title_flickr_expected = "Welcome to Flickr - Photo Sharing";
			String title_youtube_expected = "YouTube";

			String RBM = "Male";
			String RBF = "Female";
			String staTe = "State";
			String checkTerms = "I agree to the Terms";
			
			
					
			// TC-01.01 (positive) TC-01.01 Sign Up page html title is:
			// "Welcome to Sign Up"
			d.navigate().to(baseUrl);
			d.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

			String actualHtmlTitle = d.getTitle();

			// By actualHtmlTitle =
			// d.getTitle().startsWith("Welcome to Sign Up");

			// d.findElement(By.tagName("title")).getText();
			// String actualHtmlTitle =
			// d.findElement(By.tagName("<title>")).getText();
			// d.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

			if (htmlTitle.equals(actualHtmlTitle))
			{
				System.out.println("Test Case ID: \t\t" + TC_01_01
						+ " - PASSED");
				System.out.println("Title Expected/Actual: \t" + htmlTitle
						+ "/" + actualHtmlTitle);
				System.out.println("=======================================");
			}
			else
			{
				System.out.println("Test Case ID: \t\t" + TC_01_01
						+ " - FAILED");
				System.out.println("Title Expected/Actual: \t" + htmlTitle
						+ "/" + actualHtmlTitle);
				System.out.println("=======================================");
			}
			
			// TC-01.02 (positive) TC-01.02 Sign Up page application title is:
			// "Sign Up"

			d.findElement(By.id("id_f_title")).getText();
			d.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

			// String title = d.findElement(By.id("id_f_title"));
			String actualApplicationTitle = d.findElement(By.id("id_f_title"))
					.getText();

			// WebElement actualApplicationTitle =
			// d.findElement(By.id("id_f_title"));
			if (signUpTitle.equals(actualApplicationTitle))
			{
				System.out.println("Test Case ID: \t\t" + TC_01_02
						+ " - PASSED");
				System.out.println("Title Expected/Actual: \t" + signUpTitle
						+ "/" + actualApplicationTitle);
				System.out.println("=======================================");
			}
			else
			{
				System.out.println("Test Case ID: \t\t" + TC_01_02
						+ " - FAILED");
				System.out.println("Title Expected/Actual: \t" + signUpTitle
						+ "/" + actualApplicationTitle);
				System.out.println("=======================================");
			}

			// TC-01.03(positive) TC-01.03 Page contains 4 text fields
			// ("First Name", "Last Name", "Email Address", "Phone")

			// d.findElement(By.id("id_fname")).getText();
			// d.findElement(By.id("id_lname")).getText();
			// d.findElement(By.id("id_email")).getText();
			// d.findElement(By.id("id_phone")).getText();

			String actualfnField = d.findElement(By.id("id_f_label_fn"))
					.getText();
			String actuallnField = d.findElement(By.id("id_f_label_ln"))
					.getText();
			String actualeaField = d.findElement(By.id("id_f_label_ea"))
					.getText();
			String actualpFiled = d.findElement(By.id("id_f_label_pn"))
					.getText();

			d.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

			// First Name
			if (fnField.equals(actualfnField))
			{
				System.out.println("Test Case ID: \t\t" + TC_01_03
						+ "First Name" + " - PASSED");
				System.out.println("Title Expected/Actual: \t" + fnField + "/"
						+ actualfnField);
				System.out.println("=======================================");
			}
			else
			{
				System.out.println("Test Case ID: \t\t" + TC_01_03
						+ "First Name" + " - FAILED");
				System.out.println("Title Expected/Actual: \t" + fnField + "/"
						+ actualfnField);
				System.out.println("=======================================");
			}
			// "Last Name";

			if (lnField.equals(actuallnField))
			{
				System.out.println("Test Case ID: \t\t" + TC_01_03
						+ "Last Name" + " - PASSED");
				System.out.println("Title Expected/Actual: \t" + lnField + "/"
						+ actuallnField);
				System.out.println("=======================================");
			}
			else
			{
				System.out.println("Test Case ID: \t\t" + TC_01_03
						+ "Last Name" + " - FAILED");
				System.out.println("Title Expected/Actual: \t" + lnField + "/"
						+ actuallnField);
				System.out.println("=======================================");
			}
			// "Email Address";
			if (eaField.equals(actualeaField))
			{
				System.out.println("Test Case ID: \t\t" + TC_01_03 + "Email"
						+ " - PASSED");
				System.out.println("Title Expected/Actual: \t" + eaField + "/"
						+ actualeaField);
				System.out.println("=======================================");
			}
			else
			{
				System.out.println("Test Case ID: \t\t" + TC_01_03 + "Email"
						+ " - FAILED");
				System.out.println("Title Expected/Actual: \t" + eaField + "/"
						+ actualeaField);
				System.out.println("=======================================");
			}
			// "Phone";

			if (pFiled.equals(actualpFiled))
			{
				System.out.println("Test Case ID: \t\t" + TC_01_03 + "Phone"
						+ " - PASSED");
				System.out.println("Title Expected/Actual: \t" + pFiled + "/"
						+ actualpFiled);
				System.out.println("=======================================");
			}
			else
			{
				System.out.println("Test Case ID: \t\t" + TC_01_03 + "Phone"
						+ " - FAILED");
				System.out.println("Title Expected/Actual: \t" + pFiled + "/"
						+ actualpFiled);
				System.out.println("=======================================");
			}

			// TC-01.04(positive) TC-01.04 Page contains 2 radio buttons
			// (Gender: "Male", "Female")

			d.findElement(By.id("id_g_radio_01")).click();
			d.findElement(By.id("id_g_radio_02")).click();

			d.findElement(By.id("id_r_label_m")).getText();
			d.findElement(By.id("id_r_label_f")).getText();
			d.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

			String actualRBM = d.findElement(By.id("id_r_label_m")).getText();
			String actualRBF = d.findElement(By.id("id_r_label_f")).getText();

			if (RBM.equals(actualRBM))
			{
				System.out.println("Test Case ID: \t\t" + TC_01_04
						+ "Radio Batton Male" + " - PASSED");
				System.out.println("Title Expected/Actual: \t" + RBM + "/"
						+ actualRBM);
				System.out.println("=======================================");
			}
			else
			{
				System.out.println("Test Case ID: \t\t" + TC_01_04
						+ "Radio Batton Male" + " - FAILED");
				System.out.println("Title Expected/Actual: \t" + RBM + "/"
						+ actualRBM);
				System.out.println("=======================================");
			}

			if (RBF.equals(actualRBF))
			{
				System.out.println("Test Case ID: \t\t" + TC_01_04
						+ "Radio Batton Female" + " - PASSED");
				System.out.println("Title Expected/Actual: \t" + RBF + "/"
						+ actualRBF);
				System.out.println("=======================================");
			}
			else
			{
				System.out.println("Test Case ID: \t\t" + TC_01_04
						+ "Radio Batton Female" + " - FAILED");
				System.out.println("Title Expected/Actual: \t" + RBF + "/"
						+ actualRBF);
				System.out.println("=======================================");
			}

			// TC-01.05(positive) TC-01.05 Page contains drop-down list
			// ("State")

			d.findElement(By.xpath("//*[@id='id_state']")).click();
			// d.findElement(By.cssSelector("#id_state")).click();

			d.findElement(By.xpath("//*[@id='id_f_label_s']")).getText();
			d.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

			String actualState = d.findElement(
					By.xpath("//*[@id='id_f_label_s']")).getText();

			if (staTe.equals(actualState))
			{
				System.out.println("Test Case ID: \t\t" + TC_01_05
						+ " - PASSED");
				System.out.println("Title Expected/Actual: \t" + staTe + "/"
						+ actualState);
				System.out.println("=======================================");
			}
			else
			{
				System.out.println("Test Case ID: \t\t" + TC_01_05
						+ " - FAILED");
				System.out.println("Title Expected/Actual: \t" + staTe + "/"
						+ actualState);
				System.out.println("=======================================");
			}

			// TC-01.06(positive) TC-01.06 Page contains checkbox (Agreement on
			// Terms)

			d.findElement(By.cssSelector("#id_checkbox")).click();

			d.findElement(By.xpath("html/body/form/table/tbody/tr[3]/td/table/tbody/tr/td/table/tbody/tr[5]/td[2]/span")).getText();
			d.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

			String actualCheckTerms = d.findElement(
							By.xpath("html/body/form/table/tbody/tr[3]/td/table/tbody/tr/td/table/tbody/tr[5]/td[2]/span"))
					.getText();

			if (checkTerms.equals(actualCheckTerms))
			{
				System.out.println("Test Case ID: \t\t" + TC_01_06
						+ " - PASSED");
				System.out.println("Title Expected/Actual: \t" + checkTerms
						+ "/" + actualCheckTerms);
				System.out.println("=======================================");
			}
			else
			{
				System.out.println("Test Case ID: \t\t" + TC_01_06
						+ " - FAILED");
				System.out.println("Title Expected/Actual: \t" + checkTerms
						+ "/" + actualCheckTerms);
				System.out.println("=======================================");
			}
			
			
			// TC-01.07(positive) TC-01.07 Page contains 4 image links
			// (Facebook, Twitter, Flickr, YouTube)
			d.findElement(By.xpath("//*[@id='id_img_facebook']")).click();
			d.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			ArrayList<String> allTabs = new ArrayList<String>(d.getWindowHandles());
			d.switchTo().window(allTabs.get(1));// switches to another window when we need to click and relocate to another window
			String actualTitleFB = d.getTitle();
			d.close();
			d.switchTo().window(allTabs.get(0));
			if (title_facebook_expected.equals(actualTitleFB))
			{
				System.out.println("Test Case ID: \t\t" + TC_01_07
						+ " - PASSED");
				System.out.println("Title Expected/Actual: \t" + title_facebook_expected
						+ "/" + actualTitleFB);
				System.out.println("=======================================");
			}
			else
			{
				System.out.println("Test Case ID: \t\t" + TC_01_07
						+ " - FAILED");
				System.out.println("Title Expected/Actual: \t" + title_facebook_expected
						+ "/" + actualTitleFB);
				System.out.println("=======================================");
			}
//d.quit();
			// TW
			
			d.findElement(By.cssSelector("#id_img_twitter")).click();
			d.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			ArrayList<String> allTabs1 = new ArrayList<String>(d.getWindowHandles());
			d.switchTo().window(allTabs1.get(1));// switches to another window when we need to click and relocate to another window
			String actualTitleTW = d.getTitle();
			d.close();
			d.switchTo().window(allTabs1.get(0));
			
			
			if (title_twitter_expected.equals(actualTitleTW))
			{
				System.out.println("Test Case ID: \t\t" + TC_01_07
						+ " - PASSED");
				System.out.println("Title Expected/Actual: \t" + title_twitter_expected
						+ "/" + actualTitleTW);
				System.out.println("=======================================");
			}
			else
			{
				System.out.println("Test Case ID: \t\t" + TC_01_07
						+ " - FAILED");
				System.out.println("Title Expected/Actual: \t" + title_twitter_expected
						+ "/" + actualTitleTW);
				System.out.println("=======================================");
			}
			
			
		//	d.quit();

			 // FL
		
			
			d.findElement(By.xpath("//*[@id='id_img_flickr']")).click();
			d.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			ArrayList<String> allTabs2 = new ArrayList<String>(d.getWindowHandles());
			d.switchTo().window(allTabs2.get(1));// switches to another window when we need to click and relocate to another window
			String actualTitleFL = d.getTitle();
			d.close();
			d.switchTo().window(allTabs2.get(0));
		

		
			if (title_flickr_expected.equals(actualTitleFL))
			{
				System.out.println("Test Case ID: \t\t" + TC_01_07
						+ " - PASSED");
				System.out.println("Title Expected/Actual: \t" + title_flickr_expected
						+ "/" + actualTitleFL);
				System.out.println("=======================================");
			}
			else
			{
				System.out.println("Test Case ID: \t\t" + TC_01_07
						+ " - FAILED");
				System.out.println("Title Expected/Actual: \t" + title_flickr_expected
						+ "/" + actualTitleFL);
				System.out.println("=======================================");
			}
			
			 
			// YOUT
 
						d.findElement(By.xpath("//*[@id='id_img_youtube']")).click();
						d.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
						ArrayList<String> allTabs3 = new ArrayList<String>(d.getWindowHandles());
						d.switchTo().window(allTabs3.get(1));// switches to another window when we need to click and relocate to another window
						String actualTitleYT = d.getTitle();
						d.close();
						d.switchTo().window(allTabs3.get(0));

	

			if (title_youtube_expected.equals(actualTitleYT))
			{
				System.out.println("Test Case ID: \t\t" + TC_01_07
						+ " - PASSED");
				System.out.println("Title Expected/Actual: \t" + title_youtube_expected
						+ "/" + actualTitleYT);
				System.out.println("=======================================");
			}
			else
			{
				System.out.println("Test Case ID: \t\t" + TC_01_07
						+ " - FAILED");
				System.out.println("Title Expected/Actual: \t" + title_youtube_expected
						+ "/" + actualTitleYT);
				System.out.println("=======================================");
			}

		

			

			 //TC-01.08(positive) TC-01.08 Page contains 2 buttons ("Reset","Submit") 
			
			String submitText = "Please enter First Name";
			d.findElement(By.cssSelector("#id_submit_button")).click();
			String actualTextS = d.findElement(By.cssSelector("#ErrorLine")).getText();
			d.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			
			if (submitText.equals(actualTextS))
			{
				System.out.println("Test Case ID: \t\t" + TC_01_08
						+ " - PASSED");
				System.out.println("Title Expected/Actual: \t" + submitText
						+ "/" + actualTextS);
				System.out.println("=======================================");
			}
			else
			{
				System.out.println("Test Case ID: \t\t" + TC_01_08
						+ " - FAILED");
				System.out.println("Title Expected/Actual: \t" + submitText
						+ "/" + actualTextS);
				System.out.println("=======================================");
			}
			
			
		
			
			d.findElement(By.xpath("//*[@id='id_reset_button']")).click();
 			String actualTextR = d.findElement(By.xpath("//*[@id='id_reset_button']")).getText();
			d.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
 			
			if (submitText.equals(actualTextR))
			{
				System.out.println("Test Case ID: \t\t" + TC_01_08
						+ " - FAILED");
				System.out.println("Title Expected/Actual: \t" + submitText
						+ "/" + actualTextR);
				System.out.println("=======================================");
			}
			else
			{
				System.out.println("Test Case ID: \t\t" + TC_01_08
						+ " - PASSED");
				System.out.println("Title Expected/Actual: \t" + submitText
						+ "/" + actualTextR);
				System.out.println("=======================================");
			}
 			
			
			
			
				 
			//TC-01.09(positive) TC-01.09 Page contains static text (copyright) ("© 2014 learn2test.net")
			 String copyRight = "© 2014 learn2test.net";
  			String actualTextCOPIRIGHT = d.findElement(By.xpath("//*[@id='copyright']")).getText();
			d.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
 			
			if (copyRight.equals(actualTextCOPIRIGHT))
			{
				System.out.println("Test Case ID: \t\t" + TC_01_09
						+ " - FAILED");
				System.out.println("Title Expected/Actual: \t" + copyRight
						+ "/" + actualTextCOPIRIGHT);
				System.out.println("=======================================");
			}
			else
			{
				System.out.println("Test Case ID: \t\t" + TC_01_09
						+ " - PASSED");
				System.out.println("Title Expected/Actual: \t" + copyRight
						+ "/" + actualTextCOPIRIGHT);
				System.out.println("=======================================");
			}
 			
			
			
			
			 		 
			 //TC-01.10(positive) TC-01.10 New quote appears every new load of
		
			d.findElement(By.id("id_quotes")).getText();
			String quote = d.findElement(By.id("id_quotes")).getText();
			if (quote != null && quote.length() < 103 && quote.length() > 36) {
				System.out.println("Test Case ID: \t\t" + TC_01_10
						+ " - PASSED");
				System.out.println("Quote length: " + quote.length());
				System.out.println("=======================================");
			} else {
				System.out.println("Test Case ID: \t\t" + TC_01_10
						+ " - FAILED");
				System.out.println("Quote length: " + quote.length());
				System.out.println("=======================================");
			}
			
			
			
		
			
			
			  //TC-01.24 (positive) TC-01.24 "Back" button redirect to main page (Sign Up)
			 
		//	String confermationPageTitle = "Confermation";
			
			d.findElement(By.id("id_fname")).sendKeys(myFN);
			d.findElement(By.id("id_lname")).sendKeys(myLN);
			d.findElement(By.id("id_email")).sendKeys(myEmail);
			d.findElement(By.id("id_phone")).sendKeys(myPhone);
			d.findElement(By.id("id_submit_button")).click();

			
			
			
			String actualFN = d.findElement(By.id("id_fname_conf"))
					.getText();
			String actualLN = d.findElement(By.id("id_lname_conf"))
					.getText();
			String actualEmail = d.findElement(By.id("id_email_conf"))
					.getText();
			String actualPhone  = d.findElement(By.id("id_phone_conf"))
					.getText();

			if (myFN.equals(actualFN) && myLN.equals(actualLN)
					&& myEmail.equals(actualEmail)
					&& myPhone.equals(actualPhone)) {
				System.out.println("Test Case ID: \t\t" + TC_01_24
						+ " - PASSED");
				System.out.println("First Expected/Actual: \t" + myFN + "/"
						+ actualFN);
				System.out.println("Last Expected/Actual: \t" + myLN + "/"
						+ actualLN);
				System.out.println("Email Expected/Actual: \t" + myEmail + "/"
						+ actualEmail);
				System.out.println("Phone Expected/Actual: \t" + myPhone + "/"
						+ actualPhone);
				System.out.println("=======================================");
			} else {
				System.out.println("Test Case ID: \t\t" + TC_01_24
						+ " - FAILED");
				System.out.println("First Expected/Actual: \t" + myFN + "/"
						+ actualFN);
				System.out.println("Last Expected/Actual: \t" + myLN + "/"
						+ actualLN);
				System.out.println("Email Expected/Actual: \t" + myEmail + "/"
						+ actualEmail);
				System.out.println("Phone Expected/Actual: \t" + myPhone + "/"
						+ actualPhone);
				System.out.println("=======================================");
			}

			d.quit();
			
			
			
			
			 /*
			 	/*
			 * //TC-01.11(positive) TC-01.11 Enter valid information and click
			 * on sign in button.  
			 * 
			 * //TC-01.12 (error handling) TC-01.12 "First Name" - required
			 * fields and accepts: alphabetic (upper/lower), comma, hyphen,
			 * single quote,  [min:3, max30]  
			 * 
			 * 
			 * //TC-01.13 (error handling) TC-01.13 "Last Name" - required
			 * fields and accepts: alphabetic (upper/lower), comma, hyphen,
			 * single quote,  [min:3, max30]
			 * 
			  
			 * 
			 * //TC-01.14 (error handling) TC-01.14 "Email Address" - required
			 * fields and accepts following format: xx[min2]@x[min1].xx[2-6]
			 * 
			 * 
			 * 
			 * //TC-01.15(error handling) TC-01.15 "Phone" - required fields and
			 * accepts numeric (10 digits)including: spaces, open/close
			 * parenthesis, hyphens  
			 * 
			 * 
			 * 
			 * //TC-01.16(error handling) TC-01.16 "State" - option drop-down
			 * list  
			 * 
			 * 
			 * //TC-01.17(error handling) TC-01.17 "Gender" - option radio
			 * buttons  
			 * 
			 * 
			 * //TC-01.18(error handling) TC-01.18 "Terms" - option checkbox
			 *  
			 * 
			 * 
			 * //TC-01.19 (positive) TC-01.19 Reloading button resets all fields
			 * and buttons  
			 * 
			 * 
			 * 
			 * //TC-01.20 (positive) TC-01.20 "Reset" button resets all fields
			 * and buttons (reloading the page resets as well)  
			 * 
			 * 
			 * //TC-01.21 (positive) TC-01.21 "Submit" button redirects to
			 * Conformation page (both titles [html/application]:
			 * "Conformation")  
			 * 
			 * 
			 * 
			 * 
			 * //TC-01.22 (positive) TC-01.22 "Conformation" page doesn’t
			 * contain: quotes, City/State, Temperature, Icons, Today’s day,
			 * OS/Browser  
			 * 
			 * 
			 * 
			 * //TC-01.23 (positive) TC-01.23 "Conformation" page contains:
			 * First Name, Last Name, Email Address, Phone values, as well as
			 * optional if filled  
			  
			 * //TC-01.25 (positive) TC-01.25 Dynamic text (QUOTE HAS CHANGED)
			
			 * //TC-01.26 (positive) TC-01.26 Page contains dynamic text
			 * (today’s day) (Format - Month Day, Year:
			
			 * //TC-01.27 (positive) TC-01.27 Page contains dynamic text
			 * (Client’s OS & Browser) (example: "Windows 7 & Firefox 30")
			
			 * //TC-01.28 (positive) TC-01.28 Page contains dynamic text
			 * (Client’s City and State) (example: "San Francisco, CA")
			
			 * //TC-01.29 (positive) TC-01.29 Page contains dynamic icon
			 * (Client’s current weather)
			
			 * //TC-01.30 (positive) TC-01.30 Page contains dynamic text
			 * (Client’s current temperature, in Fahrenheit) (example: "71.5 ℉")
			
			 * //TC-01.31 (positive) TC-01.31 City and State dynamic text
			 * displays Client’s current City and State  
			
			 * //TC-01.32 (positive) TC-01.32 Temperature dynamic text displays
			 * Client’s current temperature (refreshing every 2 minutes)
			
			 * //TC-01.33
			
			 * //TC-01.34  (positive) TC-01.34 OS & Browser dynamic text
			 * displays Client’s current OS & Browser + version  
			
			 * //TC-01.35 (error handling) TC-01.35 "Email Address" - required
			 * fields and accepts following format: xx[min2]@x[min1].xx[2-6]
		
			 * //TC-01.36(error handling) TC-01.36 "Last Name" - required fields
			 * and accepts: alphabetic (upper/lower), comma, hyphen, single
			 * quote,  [min:3, max30]
			
			 * //TC-01.37 (error handling) TC-01.37 "First Name" - required
			 * fields and accepts: alphabetic (upper/lower), comma, hyphen,
			 * single quote,  [min:3, max30]  
		*/
		}

	}
