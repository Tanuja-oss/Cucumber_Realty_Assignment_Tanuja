package StepDefinitions;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest {

	WebDriver wd;

	@Given("Navigate to the Application login URL")
	public void navigate_to_the_application_login_url() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\0016OY744\\chromedriver_win32\\chromedriver.exe");
		wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("http://realty-real-estatem1.upskills.in/");
		Thread.sleep(2000);
	}

	@When("User click on Login Register button")
	public void user_click_on_login_register_button() {
		wd.findElement(By.className("sign-in")).click();
	}

	@Then("Validate Register page")
	public void validate_register_page() {
		wd.findElement(By.xpath("//*[text()='Register']")).click();
		String Reg = wd.findElement(By.xpath("//div[@class='col-md-12']/h2")).getText();
		System.out.println(Reg);
		Assert.assertEquals("My Profile", Reg);
	}

	@Then("Enter valid {string} , {string} , {string}")
	public void enter_valid(String Email, String FirstName, String LastName) {
		wd.findElement(By.id("email")).sendKeys(Email);
		wd.findElement(By.id("first-name")).sendKeys(FirstName);
		wd.findElement(By.id("last-name")).sendKeys(LastName);
	}

	@Then("Click on Register button")
	public void click_on_register_button() {
		wd.findElement(By.className("register-button")).click();
	}

	@Then("Validate successfull message")
	public void validate_successfull_message() {
		//For success message 
		//String message=wd.findElement(By.xpath("//div[@class='notification success closeable']")).getText();
		
		// Already exist 
		String message = wd.findElement(By.xpath("//div[@class='notification error closeable']/p")).getText();
		System.out.println(message);
	}

	@And("Close the page")
	public void close_the_page() {
		wd.close();

	}

	@Then("Validate Login page")
	public void validate_login_page() {

		String Loginmsg = wd.findElement(By.xpath("//a[text()='Log In']")).getText();
		Assert.assertEquals(Loginmsg, "Log In");
	}

	@Then("Enter valid {string} , {string} credentials")
	public void enter_valid_credentials(String email, String pwd) {

		wd.findElement(By.id("user_login")).sendKeys(email);
		wd.findElement(By.id("user_pass")).sendKeys(pwd);

	}

	@And("Click on Signin button")
	public void click_on_login_button() {

		wd.findElement(By.xpath("//input[@value='Sign In']")).click();
	}

	@Then("Validate Signin page")
	public void validate_signin_page() {
	   
	String signmsg=wd.findElement(By.xpath("//div[@class='notification error closeable']/p")).getText();
	System.out.println(signmsg);
	Assert.assertEquals(signmsg, "The password you entered wasn't quite right. Did you forget your password?");
	}


	@Then("Click on Lost Your password")
	public void click_on_lost_your_password() {
		wd.findElement(By.xpath("//p[@class='lost_password']/a")).click();	
	}
	
	@Then("Validate Reset password page")
	public void validate_reset_password_page() {	
	    String resetMsg=wd.findElement(By.xpath("//div[@class='col-md-12']/h2")).getText();
	    System.out.println(resetMsg);
	    Assert.assertEquals(resetMsg,"Lost Password");
	}
	
	@Then("Enter {string}")
	public void enter(String email) {
		wd.findElement(By.id("user_login")).sendKeys(email);
	}
	
	@Then("Click on Reset password button")
	public void click_on_reset_password_button() {
	    wd.findElement(By.className("lostpassword-button")).click();
	}
	
}
