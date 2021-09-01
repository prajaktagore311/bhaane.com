package stepDefination;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BhaaneWebsite {
	
	WebDriver browser;
	
	@Given("User is at Home page")
	public void user_is_at_Home_page() {
		System.setProperty("webdriver.chrome.driver","E:\\jarFiles\\chromedriverupdate.exe");
		browser=new ChromeDriver();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		browser.manage().window().maximize();
		browser.get("https://www.bhaane.com/"); 
		//Alert code
		//Alert alert= browser.switchTo().alert();
		//alert.dismiss();
	    
	   	}

	@Then("Home page is successfully open")
	public void home_page_is_successfully_open() {
		Assert.assertEquals("Bhaane is a contemporary clothing company for conscious urban millennial.",browser.getTitle());
		browser.close();
	}
	@When("User enter Name")
	public void enter_name() {
		browser.findElement(By.name("name")).sendKeys("abcd");
	    }
	@And("User Enter Email")
	public void enter_email() {
		browser.findElement(By.xpath("/html/body/div[7]/div[2]/div[1]/div/div/div[1]/form/div[2]/input")).sendKeys("xyz@gmail.com");
	    }
	@And("User click on SignUp button")
	public void user_click_on_Signup() {
	    browser.findElement(By.xpath("/html/body/div[7]/div[2]/div[1]/div/div/div[1]/form/div[3]/button")).click();
	}
	@When("User click on Close Symbol")
	public void click_close_symbol() {
		browser.findElement(By.xpath("//*[@id=\"mdiv\"]")).click();;
	    }
	@When("User click on Account Text")
	public void user_click_on_Account_Text() {
		browser.findElement(By.xpath("//*[@id=\"top-header\"]/div[1]/div/div[4]/ul/li[2]")).click();
	    }

	@Then("Account TextLink open successfully")
	public void account_TextLink_open_successfully() {
		Assert.assertEquals("Bhaane is a contemporary clothing company for conscious urban millennial.",browser.getTitle());
		browser.close();
	   	}

	@Given("user click on SignUp LinkText")
	public void user_click_on_Signup_button() {
	    browser.findElement(By.xpath("//*[@id=\"modal-login\"]/div/form/div[4]/div")).click();
	}

	@When("user enters valid FirstName")
	public void user_enters_valid_FirstName() {
		browser.findElement(By.name("first_name")).sendKeys("Ananya");
	    	}

	@When("user enters valid LastName")
	public void user_enters_valid_LastName() {
		browser.findElement(By.name("last_name")).sendKeys("More");
	}

	@When("user enters valid EmailId")
	public void user_enters_valid_EmailId() {
		browser.findElement(By.xpath("//*[@id=\"modal-register\"]/div/form/div[1]/div[3]/div/input")).sendKeys("ananya06@gmail.com");
	   }

	@When("user enters valid Mobile Number")
	public void user_enters_valid_Mobile_Number() {
		browser.findElement(By.cssSelector("input.mobile-picker")).sendKeys("9876545676");

	    }

	@When("user enters valid Password")
	public void user_enters_valid_Password() {
		browser.findElement(By.xpath("//*[@id=\"modal-register\"]/div/form/div[1]/div[5]/div/input")).sendKeys("123456");

	    	}

	@When("user click on submit button")
	public void user_click_on_submit_button() {
		browser.findElement(By.xpath("//*[@id=\"modal-register\"]/div/form/div[2]/button")).click();
	}

	@Then("SignUp should be successfully")
	public void signup_should_be_successfully() {
		Assert.assertEquals("Bhaane is a contemporary clothing company for conscious urban millennial.",browser.getTitle());
		browser.close();

	}

	@When("user click on Login button")
	public void user_click_on_Login_Button() {
		
		browser.findElement(By.xpath("//*[@id=\"modal-login\"]/div/form/div[4]/button")).click();
	}

		

	@Then("Login should be successfully")
	public void login_should_be_successfully() {
		Assert.assertEquals("Bhaane is a contemporary clothing company for conscious urban millennial.",browser.getTitle());
		browser.close();

	    }
	
	
	@When("User click on Dresses")
	public void user_click_on_Dresses() {
		
		browser.findElement(By.xpath("//*[@id=\"top-header\"]/div[1]/div/div[1]/ul/li[3]/a/span")).click();
	}
	
	
	@Then("Click on dreeses should be successfully")
	public void clicl_dresses_should_be_successfully() {
		Assert.assertEquals("Shop Dresses's Online | bhaane",browser.getTitle());
		browser.close();

	    }
	@When("User click on Jumpsuits")
	public void user_click_on_Jumpsuits() {
		
		browser.findElement(By.xpath("//*[@id=\"top-header\"]/div[3]/div/div[1]/ul/li[4]/a")).click();
	}
	@Then("Click on Jumpsuits should be successfully")
	public void clicl_Jumpsuits_should_be_successfully() {
		Assert.assertEquals("Shop Dresses's Jumpsuits Online | bhaane",browser.getTitle());
		browser.close();

	    }
	@When("User click on Price")
	public void user_click_on_Price() {
		browser.findElement(By.xpath("//*[@id=\"modal-filters\"]/div/form/ul/li[1]/span")).click();
	}
	@Then("Click on Price should be successfully")
	public void clicl_Price_should_be_successfully() {
		Assert.assertEquals("Shop Dresses's Jumpsuits Online | bhaane",browser.getTitle());
		browser.close();
	}
	@When("Click on Low-High should be successfully")
	public void user_click_Price_lowhigh() {
		browser.findElement(By.xpath("//*[@id=\"modal-filters\"]/div/form/ul/li[1]/span")).click();
	}
	@Then("Click on Jumpsuits Price Low-High")
	public void click_LowtoHigh_should_be_successfully() {
		Assert.assertEquals("Shop Dresses's Jumpsuits Online | bhaane",browser.getTitle());
		browser.close();
	}
	@When("User click on Selected dress Picture")
	public void user_click_Selected_Dress() {
		browser.findElement(By.xpath("//*[@id=\"products\"]/div[1]/a/div/img[2]")).click();
	}
	@Then(" Picture should be successfully Selected")
	public void Picture_should_be_successfully_Selected() {
		Assert.assertEquals("Picnic Suit - Sherlockcheckbrown | Shop Online | bhaane",browser.getTitle());
		browser.close();
	}
	
	@When("User Click on AddToBag button")
	public void user_click_AddToBag_button() {
		browser.findElement(By.xpath("/html/body/div[7]/div[2]/div[1]/div/div[2]/div/form/button[1]/span")).click();
	}
	@Then("Dress AddtoBag should be sucessfully")
	public void Dress_AddToBag_Sucessfully() {
		Assert.assertEquals("Picnic Suit - Sherlockcheckbrown | Shop Online | bhaane",browser.getTitle());
		browser.close();
	}
	@When("User click on Gotocart button")
	public void user_click_Gotocart_button() {
		browser.findElement(By.xpath("//*[@id=\"modal-bag\"]/div/div[1]/div[3]/a[1]")).click();
	}
	@Then("Dress Gotocart should be sucessfully")
	public void Dress_Gotocart_Sucessfully() {
		Assert.assertEquals("Bhaane is a contemporary clothing company for conscious urban millennial.",browser.getTitle());
		browser.close();
	}
	@When("User click on tops")
	public void user_click_tops() {
		browser.findElement(By.xpath("//*[@id=\"top-header\"]/div[1]/div/div[1]/ul/li[1]/a/span")).click();
	}
	@Then("Click on tops should be successfully")
	public void Click_tops_successfully() {
		Assert.assertEquals("Shop Tops's  Online | bhaane",browser.getTitle());
		browser.close();
		}
	@When("User click on Shirts")
	public void user_click_Shirts() {
		browser.findElement(By.xpath("//*[@id=\"top-header\"]/div[3]/div/div[1]/ul/li[3]/a")).click();
	}
	@Then("Click on Shirts should be successfully")
	public void Click_Shirts_successfully() {
		Assert.assertEquals("Shop Tops's Shirts Online | bhaane",browser.getTitle());
		browser.close();
		}
	
	@When("User click on Gender")
	public void user_click_Gender() {
		browser.findElement(By.xpath("//*[@id=\"modal-filters\"]/div/form/ul/li[3]/span")).click();
	}
	
	@When("user click on Female")
	public void user_click_Female() {
		browser.findElement(By.xpath("//*[@id=\"modal-filters\"]/div/form/ul/li[3]/div/label[1]/span")).click();
	}
	
	@When("User click on Selecte Shirt Picture")
	public void user_click_shirt_picture() {
		browser.findElement(By.xpath("//*[@id=\"products\"]/div[5]/a/div/img[2]")).click();
	}
	
	@When("User click on Add to bag button")
	public void user_click_Add_bag_button() {
		browser.findElement(By.xpath("/html/body/div[7]/div[2]/div[1]/div/div[2]/div/form/button[1]/span")).click();
	}
	
	@When("User Select a Size")
	public void user_select_size() {
		browser.findElement(By.xpath("/html/body/div[7]/div[2]/div[1]/div/div[2]/div/form/div/div/label[3]/span")).click();
	}
	
	@Then("Alert message show This Product Out of Stock")
	public void message_Show_OutOfStock() {
		browser.findElement(By.xpath("//*[@id=\"app-toast\"]/div/div[1]")).click();
	}
	
	@When("User click on stores option")
	public void user_click_on_stores()
	{
		browser.findElement(By.xpath("/html/body/div[7]/footer/div[1]/div/div/div[1]/ul/li[1]/a")).click();
	}
	
	@When("user Click on Mumbai option in stores")
	public void user_click_on_mumbai_option()
	{
		browser.findElement(By.xpath("/html/body/div[7]/footer/div[2]/div/span[2]")).click();
	}
	@When("User click on contact option")
	public void user_click_on_contact()
	{
		browser.findElement(By.xpath("/html/body/div[7]/footer/div[1]/div/div/div[1]/ul/li[2]/a")).click();
	}
	@When("User click on terms option")
	public void user_click_on_terms()
	{
		browser.findElement(By.xpath("/html/body/div[7]/footer/div[1]/div/div/div[1]/ul/li[6]/a")).click();
	}
	@When("User click on other option")
	public void user_click_on_Other_option()
	{
		browser.findElement(By.xpath("//*[@id=\"top-header\"]/div[1]/div/div[1]/ul/li[4]/a/span")).click();
	}
	@Then("click on other should be successfully")
	public void Click_Others_option_successfully() {
		Assert.assertEquals("Shop Others's  Online | bhaane",browser.getTitle());
		browser.close();
		}
	@When("User click on book option")
	public void user_click_on_book_option()
	{
		browser.findElement(By.xpath("//*[@id=\"top-header\"]/div[3]/div/div[1]/ul/li[3]/a")).click();
	}
	@Then("click on book option should be successfully")
	public void Click_book_option_successfully() {
		Assert.assertEquals("Shop Others's Books Online | bhaane",browser.getTitle());
		browser.close();
		}
	@When("user select one book and click on the book")
	public void user_select_one_book_bookoption()
	{
		browser.findElement(By.xpath("//*[@id=\"products\"]/div[4]/a/div/img[2]")).click();
	}
	@Then("click on book should be successfully")
	public void Click_book_successfully() {
		Assert.assertEquals("Witness – Kashmir 1986-2016 - NA | Shop Online | bhaane",browser.getTitle());
		browser.close();
		}
	@When("User click on facebook symbole")
	public void user_click_on_facebook()
	{
		browser.findElement(By.xpath("/html/body/div[7]/footer/div[1]/div/div/div[2]/ul/li[2]/a")).click();
	}
	@Then("click on facebook should be successfully")
	public void Click_facebook_successfully() {
		Assert.assertEquals("Bhaane - मुखपृष्ठ | Facebook",browser.getTitle());
		browser.close();
		}
	@Then("click on terms should be successfully")
	public void click_terms_successfully() {
		Assert.assertEquals("Bhaane is a contemporary clothing company for conscious urban millennial.",browser.getTitle());
		browser.close();

	}
	@Then("click on contact  should be successfully")
	public void click_contact_successfully() {
		Assert.assertEquals("Bhaane is a contemporary clothing company for conscious urban millennial.",browser.getTitle());
		browser.close();

	}



}
	
	
	
	
	
	
	
	
	
	





	

	
	

	
	
	
	




