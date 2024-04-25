package pageObjects;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.excelutiles;

public class CarService extends BasePage{
	
	String file=System.getProperty("user.dir")+"\\testData\\OutPut.xlsx";
	excelutiles ex;
	
	 public CarService(WebDriver driver) {
		super(driver);
		ex=new excelutiles(file);
	}
	 
		String name;
		String p;
	    
		@FindBy(xpath="//div[@class='statics']//h2")
		public WebElement Title;
		
	    @FindBy(xpath="//div[@class='caption']/b[1]")
		public List<WebElement> servicename;
	    
	    @FindBy(xpath="//div[@class='caption']/b[2]")
	    public List<WebElement> price;
		//=driver.findElements(By.xpath("//div[@class='caption']/b[1]"));
	    
	    public boolean ServiceDetailPage() {
	    	try {
				return (Title.isDisplayed());
			} catch (Exception e) {
				return (false);
			}
	    }
	    
	    public void Service() throws IOException {
	    	for(int i=0;i<servicename.size();i++) {
	    		name=servicename.get(i).getText();
	    		System.out.println(name);
	    		ex.write_Data("Sheet1", name, i, 0);
	    	}
	    }    	
  
	    public void Price() throws IOException {
	    	for(int i=0;i<price.size();i++) {
	    		p=price.get(i).getText();
	    		System.out.println(p);
	    		ex.write_Data("Sheet1", p, i, 1);
	    	}
	    }
}

	    	
	    	
	    	
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
//	    FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"//testData//OutPut.xlsx");
//    	XSSFWorkbook workbook=new XSSFWorkbook();
//		XSSFSheet sheet=workbook.createSheet();
//		for(int r=0;r<5;r++) {
//		XSSFRow row=sheet.createRow(r);
//		String ServName=servicename.get(r).getText();
//	    for(int c=0;c<=1;c++) {
//	    	XSSFCell cell=row.createCell(c);
//	    	if(c==0) {
//	    		cell.setCellValue(ServName);
//	    	}
//	    }
//		}
//		workbook.write(file);
//		workbook.close();
//		file.close();
//    }
//	    	