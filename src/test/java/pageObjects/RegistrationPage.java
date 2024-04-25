package pageObjects;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.excelutiles;

public class RegistrationPage extends BasePage {
	String file=System.getProperty("user.dir")+"\\testData\\RegisterInput.xlsx";
	excelutiles ex;
	
	String file1=System.getProperty("user.dir")+"\\testData\\OutPut.xlsx";
	excelutiles exc;
	
	JavascriptExecutor js;
	
	public RegistrationPage(WebDriver driver) {
		super(driver);
		ex=new excelutiles(file);
		exc=new excelutiles(file1);
		js=(JavascriptExecutor)driver;
	}
		
		@FindBy(xpath="//*[@id=\"header\"]/div/div/div[2]/div/nav/div[2]/ul/li[7]/a")
		public WebElement reg;
		
		@FindBy(xpath="//input[@id='signupname']")
		public WebElement name;
		
		@FindBy(xpath="//input[@id='signupemail']")
		public WebElement email;
		
		@FindBy(xpath="//input[@id='signuppass']")
		public WebElement password;
		
		@FindBy(xpath="//input[@id='signuppassconfirm']")
		public WebElement confpassword;
		
		@FindBy(xpath="//a[@class='button primary register-button']")
		public WebElement signupbutton;
		
		@FindBy(xpath="//div[@class='alert alert-danger error-message']")
		public WebElement errormsg;
		
		
		public void register() {
			//reg.click();
			js.executeScript("arguments[0].click()",reg);
		}
		
		public void Entry(){
        	String User_name = ex.getCellData("Sheet1",0,0);
			String Email_id =ex.getCellData("Sheet1",1,0);
			String Entered_password =ex.getCellData("Sheet1",2,0);
			String Confirmed_password = ex.getCellData("Sheet1",3,0);
			
            name.sendKeys(User_name);
			email.sendKeys(Email_id);
			password.sendKeys(Entered_password);
			confpassword.sendKeys(Confirmed_password);
		}
		
		public void Signup() {
			//signupbutton.click();
			js.executeScript("arguments[0].click()",signupbutton);
		}
		
		public void ErrorMsg() throws IOException {
			String msg=errormsg.getText();
			System.out.println(msg);
			exc.write_Data("Sheet2", msg, 0, 1);
		}
}
