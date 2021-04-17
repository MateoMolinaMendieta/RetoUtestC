package co_com_choucair_reto_retouTest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestRegistrPage {
    public  static final Target REGIST_BUTTON= Target.the("button to enter the registration form").located(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[2]/a"));
    public  static final Target FIRST_NAME = Target.the("where do we write the name").located(By.id("firstName"));
    public static final Target  LAST_NAME=Target.the("where do we write the last name").located(By.id("lastName"));
    public static final Target EMAIL=Target.the("where do we write the mail").located(By.xpath("//*[@id=\"email\"]"));
    public static final Target  DATE_OF_BIRTH=Target.the("where do i select the month").located(By.xpath("//*[@id=\"birthMonth\"]/option[2]"));
    public  static final Target BIRTHDAY=Target.the("where do i select the day").located(By.xpath("//*[@id=\"birthDay\"]"));
    public  static final Target  BIRTHDAY_=Target.the("where do i select the year").located(By.xpath("//*[@id=\"birthYear\"]"));
    public static final Target LANGUAGES= Target.the("where do i select the language").located(By.id("languages"));
    public  static final Target BUTTON_NEXT_LOCATION= Target.the("button to follow the location data").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));
    public  static final Target CITY=Target.the("where do i select the city").located(By.id("city"));
    public  static final Target ZIP_POSTAL=Target.the("where do i select the City Zip or Postal Code").located(By.id("zip"));
    public  static final Target COUNTRY=Target.the("where do i select the country").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span"));
    public  static final Target BUTTON_NEXT_DEVICES= Target.the("button to follow the Devices").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a"));
    public  static final Target YOUR_COMPUTER=Target.the("where do i select the your computer").located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/div[1]/span"));
    public  static final Target VERSION=Target.the("where do i select the version").located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/div[1]/span"));
    public  static final Target LANGUAGE=Target.the("where do i select the language").located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/div[1]/span"));
    public  static final Target YOUR_MOBILE_DEVICE=Target.the("where do i select the mobile device").located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/div[1]/span"));
    public  static final Target MODEL=Target.the("where I select the cell phone model").located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/div[1]/span"));
    public  static final Target OPERATING_SYSTEM=Target.the("where I select the phone's operating system").located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/div[1]/span"));
    public  static final Target BUTTON_NEXT_LAST_STEP= Target.the("button to follow the last step").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a"));
    public  static final Target PASSWORD = Target.the("where do i enter the password").located(By.id("password"));
    public  static final Target CONFIRM_PASSWORD = Target.the("where do i enter the confirm password").located(By.id("confirmPassword"));
    public  static final Target STAY_INFORMED=Target.the("where you stay informed").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[4]/label/span"));
    public  static final Target uTest_TERMS_USE=Target.the("where do i accept terms of use").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public  static final Target PRIVACY_SECURITY=Target.the("where I accept security and privacy policies").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public  static final Target BUTTON_COMPLETE_SETUP= Target.the("botton to register user").located(By.xpath("//*[@id=\"laddaBtn\"]"));















}
