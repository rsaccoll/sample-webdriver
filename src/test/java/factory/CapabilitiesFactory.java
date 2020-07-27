package factory;

public class CapabilitiesFactory {
    public ICapabilities getCapabilities(String browser) {
        switch (browser) {
            case "chrome":
                return new ChromeCapabilities();
            case "firefox":
                return new FirefoxCapabilities();
            default:
                throw new RuntimeException("Ai tu me quebra..Escolhe uma plataforma!");
        }
    }
}
