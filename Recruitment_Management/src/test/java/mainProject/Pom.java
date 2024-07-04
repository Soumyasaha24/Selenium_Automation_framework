package mainProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom 
{
	@FindBy(xpath = "//input[@name='username']")
	private WebElement username;
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement submit;
	
	@FindBy(xpath = "//a[@href='/web/index.php/pim/viewPimModule']")
	private WebElement PimModule;
	
	@FindBy(xpath = "//a[text()='Add Employee']")
	private WebElement AddEmployee;
	
	@FindBy(xpath = "//input[@name='firstName']")
	private WebElement firstName;
	
	@FindBy(xpath = "//input[@name='lastName']")
	private WebElement lastName;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement addemp;
	
	@FindBy(xpath = "//p[text()='Success']")
	private WebElement alart;
	
	@FindBy(xpath = "//span[@class='oxd-userdropdown-tab']")
	private WebElement dropDown;
	
	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement logout;
	
	public Pom(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement submit()
	{
		return submit;
	}
	public WebElement username()
	{
		return username;
	}
	public WebElement password()
	{
		return password;
	}
	public WebElement PimModule()
	{
		return PimModule;
	}
	public WebElement AddEmployee()
	{
		return AddEmployee;
	}
	public WebElement firstName()
	{
		return firstName;
	}
	public WebElement lastName()
	{
		return lastName;
	}
	public WebElement addemp()
	{
		return addemp;
	}
	public WebElement alart()
	{
		return alart;
	}
	public WebElement dropDown()
	{
		return dropDown;
	}
	public WebElement logout()
	{
		return logout;
	}
	
}
