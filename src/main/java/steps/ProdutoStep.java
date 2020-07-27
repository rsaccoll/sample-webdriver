package steps;

import org.openqa.selenium.WebDriver;
import page.ProdutoPage;

public class ProdutoStep extends ProdutoPage {

    public ProdutoStep(WebDriver driver) {
        super(driver);
    }


    public void clickCartButtonAndContinueProcess() {
        clickOnElement(btnAdicionarCarrinho);
        clickOnElement(declineButton);
    }

    public void clickContinuarComprando(){
        clickOnElement(btnContinuarComprando);
    }

}
