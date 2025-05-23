package demo.guru99.pageObjects;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

@DefaultUrl("https://demo.guru99.com/V4/index.php")
public class NewCustomerPage extends PageObject {
    private By TxtCustomer = By.name("name");
    private By RadGenderMale = By.xpath("//input[@value='m']");
    private By RadGenderFemale = By.xpath("//input[@value='f']");
    // esperar private By txtDob = By.name("addr");
    private By TxtAddress = By.name("addr");
    private By TxtCity = By.name("city");
    private By TxtState  = By.name("state");
    private By TxtPin = By.name("pinno");
    private By TxtMobile = By.name("telephoneno");
    private By TxtEmail  = By.name("emailid");
    private By TxtPassword = By.name("password");
    private By BtnSubmit = By.name("sub");
    //private By TxtMessage = By.name();

    //Metodos para escribir user y pass
    public void setTxtCustomer(String customer) {

        getDriver().findElement(TxtCustomer).sendKeys(customer);
    }
    public void selectGender(String gender){
        if ("Male".equalsIgnoreCase(gender)){
            getDriver().findElement(RadGenderMale).click();
        }else {
            getDriver().findElement(RadGenderFemale).click();
        }
    }
    public void setTxtAddress(String address) {
        getDriver().findElement(TxtAddress).sendKeys(address);
    }
    public void setTxtCity(String city) {
        getDriver().findElement(TxtCity).sendKeys(city);}

    public void setTxtState(String state) {
        getDriver().findElement(TxtState).sendKeys(state);}

    public void setTxtPin(String pin) {
        getDriver().findElement(TxtPin).sendKeys(pin);
    }
    public void setTxtMobile(String mobile) {
        getDriver().findElement(TxtMobile).sendKeys(mobile);
    }
    public void setTxtEmail(String email) {
        getDriver().findElement(TxtEmail).sendKeys(email);
    }
    public void setTxtPassword(String password) {
        getDriver().findElement(TxtPassword).sendKeys(password);
    }

    // Método para hacer clic
    public void clicBtnSubmit() {
        getDriver().findElement(BtnSubmit).sendKeys(Keys.ENTER);
    }

    // Método para obtener el mensaje
   // public String getMessage(){
       // return getDriver().findElement(TxtMessage).getText();
    //}
}
