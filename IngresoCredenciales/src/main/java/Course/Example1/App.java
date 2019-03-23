package Course.Example1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Inicio Automatizacion" );
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://developsupport.com/qIntranet/login/index.php");
        
        //---------------------------------------------------------------
        WebElement txtName;
        WebElement txtPasswd;
        WebElement btnEntrar;
        
        txtName = driver.findElement(By.id("username"));
        txtName.sendKeys("jphernandez");
        txtPasswd = driver.findElement(By.id("password"));
        txtPasswd.sendKeys("sYpk66?");
        btnEntrar = driver.findElement(By.xpath("//*[@id=\"loginbtn\"]"));
        btnEntrar.click();
        
        WebElement validacion;
        validacion = driver.findElement(By.xpath("//*[@id=\"loginerrormessage\"]"));
        if(validacion.isDisplayed()) {
        	System.out.println("Error inicio");
        }else{
        	System.out.println("Inicio Exitoso");
        }
    }
}
