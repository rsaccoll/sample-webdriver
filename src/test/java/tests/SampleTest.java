package tests;

import factory.SetupTest;
import listener.ExecutionExtension;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import steps.HomeStep;
import steps.ProdutoStep;

@ExtendWith(ExecutionExtension.class)
public class SampleTest extends SetupTest {

    private ProdutoStep produtoStep;
    private HomeStep homeStep;

    @Test
    @Tags({@Tag("Sample"), @Tag("Venda")})
    public void testSampleWebdriver(){

        produtoStep = new ProdutoStep(this.caps.getDriver());
        homeStep = new HomeStep(this.caps.getDriver());

        produtoStep.clickCartButtonAndContinueProcess();
        produtoStep.clickContinuarComprando();

        Assertions.assertAll(
                () -> Assertions.assertTrue(homeStep.barraDeBusca.isDisplayed()),
                () -> Assertions.assertTrue(homeStep.itensCarrinho.isDisplayed()),
                () -> Assertions.assertTrue(homeStep.logoTipo.isDisplayed())
        );
    }
}
