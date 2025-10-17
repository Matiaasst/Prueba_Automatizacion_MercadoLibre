package pages;

import pages.elements.ESearch;
import io.cucumber.java.es.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.List;


public class Search_Page extends BasePage {
    ESearch es = new ESearch();
    
    public Search_Page() {
        super(driver);
    }

    public void time(int s){
        try {
            Thread.sleep(s*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    public void abrirAplicacionDemoWeb(){
        navigateTo("https://www.mercadolibre.com");
        time(3);
    }

    public void seleccionarPais(){
        clickElement(es.btn_pais);
        time(2);
        clickElement(es.btn_close_cp);
        time(3);
    }

    public void buscarPlaystation(){
        clickElement(es.btn_barra_busqueda);
        write(es.btn_barra_busqueda, "Playstation 5");
        time(2);
        clickElement(es.btn_busqueda);
        time(3);
    }

    public void filtraCondicion(){
        scrollDown();
        time(2);
        clickElement(es.btn_condicion);
        time(3);
    }

    public void filtraUbicacion(){
        scrollDownLarge();
        time(2);
        clickElement(es.btn_ubicacion);
        time(3);
    }

    public void ordenarPor(){
        clickElement(es.btn_ordenar);
        time(2);
        clickElement(es.btn_mayor_a_menor);
        time(10);
    }    

    public void obtenLosPrimerosCinco() {
    System.out.println("Obteniendo nombre y precio de los primeros 5 productos...");
    try {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(12));

        By tarjetas = By.cssSelector("section ol > li");
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(tarjetas, 0));

        List<WebElement> productos = driver.findElements(tarjetas);
        int limite = Math.min(5, productos.size());

        for (int i = 0; i < limite; i++) {
            WebElement producto = productos.get(i);

            String nombre = "";
            try {
                WebElement nombreEl = producto.findElement(By.cssSelector(".poly-component__title"));
                nombre = nombreEl.getText().replaceAll("\\s+", " ").trim();
            } catch (NoSuchElementException e) {
                nombre = "(No se encontró el nombre)";
            }

            String precio = "";
            try {
                WebElement precioEl = producto.findElement(By.cssSelector(".poly-component__price span"));
                precio = precioEl.getText().replaceAll("\\s+", " ").trim();
            } catch (NoSuchElementException e) {
                precio = "(No se encontró el precio)";
            }

            System.out.println((i + 1) + ". " + nombre + " - $" + precio);
        }

        if (limite == 0) {
            System.out.println("No se encontraron productos");
        }

    } catch (Exception e) {
        System.out.println("Error al obtener productos: " + e.getMessage());
    }
}

}
