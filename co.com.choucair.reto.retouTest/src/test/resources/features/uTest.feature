@stories
  Feature: Utest
    As a User, I want to learn automate
  @Scenario1
  Scenario Outline: register a user
    Given that mateo wants to register on the page Utest
    |  strFirstname       |   strLastname     | strEmail             |  strMonth                 |    srtDay              |   strYear             | strLanguages     |   strCity    |  strZipPostal      | strCountry        | strComputer    |  strVersion       | strLanguage       |  strMobile       |   strModel         | strOperating       |  strPassword    | strConfirmPassword    |  strStayInformed      | strTermsUse     |  strPrivacySegurity    |
    |   <strFirstname>    |   <strLastname>   | <strEmail>           |  <strMonth>               |    <srtDay>            |   <strYear>           | <strLanguages>   |   <strCity>  |  <strZipPostal>    | <strCountry>      | <strComputer>  |  <strVersion>     | <strLanguage>     |  <strMobile>     |   <strModel>       | <strOperating>     |  <strPassword>  | <strConfirmPassword>  |  <strStayInformed>    | <strTermsUse>   |  <strPrivacySegurity>  |
    When  we register with the data shown on the page
    Then the registration is successful
Examples:
    |  strFirstname       |   strLastname      | strEmail             |  strMonth                |    srtDay              |   strYear             | strLanguages     |   strCity    |  strZipPostal      | strCountry        | strComputer    |  strVersion       | strLanguage       |  strMobile       |   strModel         | strOperating       |  strPassword    | strConfirmPassword    |  strStayInformed      | strTermsUse     |  strPrivacySegurity    |
    |   mateo             |   molina           | ma@hotmail.com       |  January                 |    hhh                 |   kkk                 | English          |   Bogota     |  1234              | Colombia          | Windows        |  10               | Spanish           |  Apple           |   iPhone           | iOS 2.0            |  123456789M#    | 123456789M#           |  <strStayInformed>    | <strTermsUse>   |  <strPrivacySegurity>  |
