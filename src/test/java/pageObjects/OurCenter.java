package pageObjects;

import java.io.IOException;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import utilities.excelutiles;

public class OurCenter extends BasePage {
        
	String file=System.getProperty("user.dir")+"\\testData\\RegisterInput.xlsx";
	excelutiles ex;
	
	String file1=System.getProperty("user.dir")+"\\testData\\OutPut.xlsx";
	excelutiles exc;
	
	JavascriptExecutor js;
	int c=0;
	
	public OurCenter(WebDriver driver) {
		super(driver);
		js=(JavascriptExecutor)driver;
		ex=new excelutiles(file);
		exc=new excelutiles(file1);
	}	
	
	    @FindBy(xpath="//div[@class='logo']/a/img")
	    public WebElement Logo;
		
		@FindBy(xpath="//*[@id='header']/div/div/div[2]/div/nav/div[2]/ul/li[3]/a")
		public WebElement ourcenter;
		
		@FindBy(xpath="//select[@id='typeeeee']")
		public WebElement selectstate;
		
		@FindBy(xpath="//select[@class='form-control CityId']")
		public WebElement selectcity;
		
		@FindBy(xpath="//button[text()='Search']")
				////button[@class='btn btn-primary cstm_btn button_stt']")
		public WebElement search;
		
		@FindBy(xpath="//div[@id='search-list-container']//div[@class='store-heading']")
		public List<WebElement> state_city;
		
		
		public void Navigate() {
			js.executeScript("arguments[0].click()",Logo);
		}
		
		public void OCclick() {
			js.executeScript("arguments[0].click()",ourcenter);
		}
		
		public void Select_State1_City1() throws InterruptedException, IOException {
			
			String State=ex.getCellData("Sheet2",1,0);
			String City=ex.getCellData("Sheet2", 1, 1);
					
			Select state_name=new Select(selectstate);
			state_name.selectByVisibleText(State);
			Thread.sleep(2000);
					
			Select city_name=new Select(selectcity);
			city_name.selectByVisibleText(City);
					
			js.executeScript("arguments[0].click()",search);
					
			Thread.sleep(2000);
					
			js.executeScript("window.scrollBy(0,700)");
					
		}
		
		public void Select_State2_City2() throws InterruptedException, IOException {
			
			String State=ex.getCellData("Sheet2",2,0);
			String City=ex.getCellData("Sheet2", 2, 1);
			
			Select state_name=new Select(selectstate);
			state_name.selectByVisibleText(State);
			Thread.sleep(2000);
			
			Select city_name=new Select(selectcity);
			city_name.selectByVisibleText(City);
			
			//search.click();
			js.executeScript("arguments[0].click()",search);
			
			Thread.sleep(3000);
			
			js.executeScript("window.scrollBy(0,700)");
			
		}
		
      public void Select_State3_City3() throws InterruptedException, IOException {
			
			String State=ex.getCellData("Sheet2",3,0);
			String City=ex.getCellData("Sheet2", 3, 1);
			
			Select state_name=new Select(selectstate);
			state_name.selectByVisibleText(State);
			Thread.sleep(2000);
			
			Select city_name=new Select(selectcity);
			city_name.selectByVisibleText(City);
			
			js.executeScript("arguments[0].click()",search);
			
			Thread.sleep(3000);
			
			js.executeScript("window.scrollBy(0,700)");
			
		}

					
		public void Display() throws IOException, InterruptedException {
			List<String> lst=new ArrayList<String>();
			for(int r=0;r<state_city.size();r++) {
				String s=state_city.get(r).getText(); 
				lst.add(s);
				System.out.println(s);
			    exc.write_Data("Sheet3", s, r, c);
			    
				}
			c++;
		}
}

