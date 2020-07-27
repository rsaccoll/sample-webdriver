package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Utils;

public class ProdutoPage extends Utils {

    public ProdutoPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "btnAdicionarCarrinho")
    public WebElement btnAdicionarCarrinho;

    @FindBy(xpath = "//*[@id=\"sectionContent\"]/div/div[2]/div/a")
    public WebElement declineButton;

    @FindBy(xpath = "//*[@id=\"sectionContent\"]/div[1]/div/div[4]/a")
    public WebElement btnConcluirCompra;

    @FindBy(id = "btnComprarMaisProdutos")
    public WebElement btnContinuarComprando;

}
