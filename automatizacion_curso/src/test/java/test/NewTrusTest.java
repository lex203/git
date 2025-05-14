package test;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import org.openqa.selenium.By;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTrusTest {
    private WebDriver driver;
    private Actor usuario;

    @BeforeEach
    public void setUp(){
        driver = new ChromeDriver();
        usuario = Actor.named("Dahiana").whoCan(BrowseTheWeb.with(driver));
    }

    @Test
    public void GuruRegister(){
        usuario.attemptsTo(
                Open.url("https://demo.guru99.com/test/newtours/"),
                Click.on(By.name("userName")),
                Enter.theValue("admin123").into(By.name("userName"))
        );
    }
}
