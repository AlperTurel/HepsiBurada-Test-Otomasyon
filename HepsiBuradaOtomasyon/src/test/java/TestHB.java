
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.apache.log4j.Logger;


public class TestHB extends Browser {

    public void setbrowser(String browser) {
        super.setbrowser(browser);
    }


    public static final Logger logger = Logger.getLogger(TestHB.class);

    @Before
    public void browser() {
        String browsername = "Chrome";
        setbrowser(browsername);
    }

    @Test
    public void Start() throws InterruptedException {

        HomePage homePage = new HomePage(driver);

        homePage.homepage();//Anasayfaya girilir.
        Assert.assertEquals(driver.getCurrentUrl(), Constants.url);
        logger.info("Anasayfaya giriş yapılır.");
        Thread.sleep(2000);
        homePage.hoverElement();
        Thread.sleep(2000);
        homePage.clickLogin();
        logger.info("Login sayfasına giriş yapılır.");
        Thread.sleep(2000);

        LoginPage loginPage = new LoginPage(driver);
        Thread.sleep(2000);
        loginPage.setEmailandclickButton(Constants.email);
        Thread.sleep(2000);
        loginPage.setPasswordandclickButton(Constants.pass);
        Thread.sleep(2000);
        Assert.assertTrue(loginPage.controlAccountPage());

        SolutionCentrePage solutionCentre = new SolutionCentrePage(driver);
        solutionCentre.clickSolutionCentre();//Çözüm merkezi sayfası tıklanır.
        Assert.assertEquals(driver.getCurrentUrl(), Constants.solutionCentreUrl);
        Thread.sleep(2000);

        solutionCentre.clickQuestionAboutmyOrder();//Siparişim ile ilgili sorum var'a tıklanır.
        Thread.sleep(2000);
        solutionCentre.clickSelectOrder();//Ürün kalemi seçilir.
        Thread.sleep(2000);
        solutionCentre.clickDifferentQuestion();//Farklı bir konu seçilir
        Thread.sleep(2000);
        solutionCentre.clickProductInformation();//Ürün bilgisi tıklanır.
        Thread.sleep(2000);
        solutionCentre.clickAreTheProductsOriginal();//Ürün orijinal mıdır? tıklanır.
        Thread.sleep(2000);
        //solutionCentre.clickCallMe();


    }


}
