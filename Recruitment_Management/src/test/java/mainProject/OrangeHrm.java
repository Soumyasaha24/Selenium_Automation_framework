package mainProject;

import org.testng.Assert;
import org.testng.annotations.Test;


public class OrangeHrm extends BaseClass
{
	@Test void test() throws InterruptedException
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Pom p = new Pom(driver);
		p.username().sendKeys("Admin");
		p.password().sendKeys("admin123");
		p.submit().click();
		String actual = driver.getTitle();
		System.out.println(actual);
		String title1 = "OrangeHRM";
        Assert.assertEquals(actual, title1,"My testcase1 is pass");
        Thread.sleep(2000);
        p.PimModule().click();
        Thread.sleep(2000);
        p.AddEmployee().click();
        Thread.sleep(2000);
        p.firstName().sendKeys(DataFromxl.ddt("OrangeHRM", 0, 1));
        p.lastName().sendKeys(DataFromxl.ddt("OrangeHRM", 0, 2));
        p.addemp().click();
        boolean dis = p.alart().isDisplayed();
        Assert.assertTrue(dis);
        System.out.println("Employe is Succesfully added");
        p.dropDown().click();
        p.logout().click();
		}
		
	}


