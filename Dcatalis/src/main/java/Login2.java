import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login2 {
	private WebElement Cardno;
	private WebElement ExpDate;
	private WebElement CVV;
	private WebElement Paynow;
	private WebElement Ok;
	private WebElement Password;
	
	WebDriver driver;
	public Login2(WebDriver driver) {
		this.driver=driver;
		
		
		Cardno=driver.findElement(By.xpath("//input[@name='cardnumber']"));
		ExpDate=driver.findElement(By.xpath("//input[@placeholder='MM / YY'][1]"));
		CVV=driver.findElement(By.xpath("//input[@placeholder='123'][1]"));
		Paynow=driver.findElement(By.xpath("//a[@class='button-main-content']"));
        Password=driver.findElement(By.xpath("//*[@id=\"PaRes\"]"));
        Ok=driver.findElement(By.xpath("//*[@id=\"acsForm\"]/div[6]/div/button[1]"));
}
	public void show1() {
		Cardno.sendKeys("4811 1111 1111 1114");;
	}
	public void show2() {
		ExpDate.sendKeys("07/20");
	}
	public void show3() {
		CVV.sendKeys("123");;
	}
	public void show4() {
		Paynow.click();
	}
	public void show5() {
		Ok.click();
	}
	
	public void show6() {
		Password.sendKeys("112233");
		}
	
	}

