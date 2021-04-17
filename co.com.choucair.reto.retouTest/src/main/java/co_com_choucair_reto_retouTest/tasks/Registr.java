package co_com_choucair_reto_retouTest.tasks;

import co_com_choucair_reto_retouTest.userinterface.UtestRegistrPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;



public class Registr implements Task {
    private String strFirstname;
    private String strLastname;
    private String strEmail;
    private String strMonth;
    private String srtDay;
    private String strYear;
    private String strLanguages;
    private String strCity;
    private String strZipPostal;
    private String strCountry;
    private String strComputer;
    private String strVersion;
    private String strLanguage;
    private String strMobile;
    private String strModel;
    private String strOperating;
    private String strPassword;
    private String strConfirmPassword;
    private String strStayInformed;
    private String strTermsUse;
    private String strPrivacySegurity;

    public Registr(String strFirstname, String strLastname, String strEmail, String strMonth, String srtDay, String strYear, String strLanguages, String strCity, String strZipPostal, String strCountry, String strComputer, String strVersion, String strLanguage, String strMobile, String strModel, String strOperating, String strPassword, String strConfirmPassword, String strStayInformed, String strTermsUse, String strPrivacySegurity) {
        this.strFirstname = strFirstname;
        this.strLastname = strLastname;
        this.strEmail = strEmail;
        this.strMonth = strMonth;
        this.srtDay = srtDay;
        this.strYear = strYear;
        this.strLanguages = strLanguages;
        this.strCity = strCity;
        this.strZipPostal = strZipPostal;
        this.strCountry = strCountry;
        this.strComputer = strComputer;
        this.strVersion = strVersion;
        this.strLanguage = strLanguage;
        this.strMobile = strMobile;
        this.strModel = strModel;
        this.strOperating = strOperating;
        this.strPassword = strPassword;
        this.strConfirmPassword = strConfirmPassword;
        this.strStayInformed = strStayInformed;
        this.strTermsUse = strTermsUse;
        this.strPrivacySegurity = strPrivacySegurity;
    }


    public static Registr onThePage(String strFirstname, String strLastname, String strEmail, String strMonth, String srtDay, String strYear, String strLanguages, String strCity, String strZipPostal, String strCountry, String strComputer, String strVersion, String strLanguage, String strMobile, String strModel, String strOperating, String strPassword, String strConfirmPassword, String strStayInformed, String strTermsUse, String strPrivacySegurity) {
        return Tasks.instrumented(Registr.class,strFirstname,strLastname,strEmail,strMonth,srtDay,strYear,strLanguages,strCity,strZipPostal,strCountry,strComputer,strVersion,strLanguage,strMobile,strModel,strOperating,strPassword,strConfirmPassword,strStayInformed,strTermsUse,strPrivacySegurity);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestRegistrPage.REGIST_BUTTON),
                Enter.theValue(strFirstname).into(UtestRegistrPage.FIRST_NAME),
                Enter.theValue(strLastname).into(UtestRegistrPage.LAST_NAME),
                Enter.theValue(strEmail).into(UtestRegistrPage.EMAIL),
                Enter.theValue(strMonth).into(UtestRegistrPage.DATE_OF_BIRTH),
                Enter.theValue(srtDay).into(UtestRegistrPage.BIRTHDAY),
                Enter.theValue(strYear).into(UtestRegistrPage.BIRTHDAY_),
                Enter.theValue(strLanguages).into(UtestRegistrPage.LANGUAGES),
                Click.on(UtestRegistrPage.BUTTON_NEXT_LOCATION),
                Enter.theValue(strCity).into(UtestRegistrPage.CITY),
                Enter.theValue(strZipPostal).into(UtestRegistrPage.ZIP_POSTAL),
                Enter.theValue(strCountry).into(UtestRegistrPage.COUNTRY),
                Click.on(UtestRegistrPage.BUTTON_NEXT_DEVICES),
                Enter.theValue(strComputer).into(UtestRegistrPage.YOUR_COMPUTER),
                Enter.theValue(strVersion).into(UtestRegistrPage.VERSION),
                Enter.theValue(strLanguage).into(UtestRegistrPage.LANGUAGE),
                Enter.theValue(strMobile).into(UtestRegistrPage.YOUR_MOBILE_DEVICE),
                Enter.theValue(strModel).into(UtestRegistrPage.MODEL),
                Enter.theValue(strOperating).into(UtestRegistrPage.OPERATING_SYSTEM),
                Click.on(UtestRegistrPage.BUTTON_NEXT_LAST_STEP),
                Enter.theValue(strPassword).into(UtestRegistrPage.PASSWORD),
                Enter.theValue(strConfirmPassword).into(UtestRegistrPage.CONFIRM_PASSWORD),
                Enter.theValue(strStayInformed).into(UtestRegistrPage.STAY_INFORMED),
                Enter.theValue(strTermsUse).into(UtestRegistrPage.uTest_TERMS_USE),
                Enter.theValue(strPrivacySegurity).into(UtestRegistrPage.PRIVACY_SECURITY),
                Click.on(UtestRegistrPage.BUTTON_COMPLETE_SETUP)
        );

    }
}




