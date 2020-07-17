import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login1 {
	
	private WebElement Buynow;
	private WebElement Checkout;
	private WebElement Continue;
	private WebElement Creditcard;
	
	WebDriver driver;
	public Login1(WebDriver driver) {
		this.driver=driver;
		
		Buynow=driver.findElement(By.xpath("//a[contains(@class,'btn buy')]"));
		Checkout=driver.findElement(By.xpath("//a[contains(@class,'btn buy')]"));
		Continue=driver.findElement(By.xpath("//*[@id=\"application\"]/div[1]/a/div[1]/span"));
		Creditcard=driver.findElement(By.xpath("//div[contains(@class,'list-title text-actionable-bold')]"));
	}
    public void display1() {
    Buynow.click();
    }
    public void display2() {
        Checkout.click();
        }
    public void display3() {
        Continue.click();
        }
    public void display4() {
        Creditcard.click();
        }
}



