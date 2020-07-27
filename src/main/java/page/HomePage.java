package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Utils;

public class HomePage extends Utils {

    public HomePage(WebDriver driver){
        super(driver);
    }

    @FindBy(id = "logotipo")
    public WebElement logoTipo;

    @FindBy(id = "strBusca")
    public WebElement barraDeBusca;

    @FindBy(id = "itensCarrinho")
    public WebElement itensCarrinho;
}
