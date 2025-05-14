package test;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.TextContent;
import org.openqa.selenium.By;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;
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
                Enter.theValue("admin123").into(By.name("userName")),
                Click.on(By.name("password")),
                Enter.theValue("admin1234").into(By.name("password")),
                Hit.the(Keys.ENTER).into(By.name("password"))
        );

        usuario.attemptsTo(
                Ensure.that(TextContent.of(By.xpath("//*[contains(text(), 'Login Successfully')]")))
                        .contains("Login Successfully")
        );


        driver.quit();
    }
}
