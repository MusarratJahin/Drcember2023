package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObject {
	
	WebDriver driver;
	public PageObject(WebDriver driver){
        this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//WebElement searchBox = driver.findElement(By.id("APjFqb"));
	//Page factory
	
	@FindBy(id="APjFqb")
    WebElement searchBox;
	
	public void enterSearch(String string) {
		searchBox.sendKeys(string);
	
	}
	
	//WebElement searchBtn = driver.findElement(By.name("btnK"));

   @FindBy(name="btnK")
	WebElement searchBtn;
	
   public void clicksearch(){
	   
	   searchBtn.submit();
   }
   
   
}
