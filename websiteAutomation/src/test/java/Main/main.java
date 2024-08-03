package Main;
import org.testng.annotations.AfterClass;
import pages.HOMEPAGE;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class main {
       private WebDriver driver;
     protected HOMEPAGE homepage;
    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver= new ChromeDriver();
        driver.get("https://l.facebook.com/l.php?u=https%3A%2F%2Fdemo.nopcommerce.com%2F%3Ffbclid%3DIwZXh0bgNhZW0CMTAAAR3h2G2Sb-MGV09UP77PZeG83QYVcIllZX1jgVieIc4V5gle440v4HUQ5Zk_aem_-0eCS1jNubEKTzYzTJO6_Q&h=AT3V6Du_xx7qM_oLjGA5PeQsg_u02zD6tvR-6icr7EjSWIMO75Wzpz1otFX52tk950ix3DHzjoBXp1gzSw3X_6MPzrN-97B61aIOJAbPGCsMwjssFcFiGjEmaI3i7QFzqSmy1g");
        System.out.println(driver.getTitle());
        homepage=new HOMEPAGE(driver);

    }
    @AfterClass
    public void tearDown (){
        driver.quit();
    }
    public static void main(String args[]){
        main test =new main();
        test.setUp();

    }
}
