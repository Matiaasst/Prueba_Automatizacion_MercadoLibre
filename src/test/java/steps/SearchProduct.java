package steps;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Search_Page;

public class SearchProduct {
 
    Search_Page sp = new Search_Page();

    @Given("El usuario ingresa al sitio web")
    public void el_usuario_ingresa_al_sitio_web() {
        sp.abrirAplicacionDemoWeb();
    }

    @When("Selecciona Mexico como pais")
    public void selecciona_mexico_como_pais() {
        sp.seleccionarPais();
    }

    @And("Busca el termino PlayStation 5")
    public void busca_el_termino_playstation_cinco() {
        sp.buscarPlaystation();
    }

    @And("Filtra los resultados por condicion Nuevos")
    public void filtra_los_resultados_por_condicion_nuevos() {
        sp.filtraCondicion();
    }

    @And("Filtra los resultados por ubicacion CDMX")
    public void filtra_los_resultados_por_ubicacion_cdmx() {
        sp.filtraUbicacion();
    }

    @And("Ordena los productos de mayor a menor precio")
    public void ordena_los_productos_de_mayor_a_menor_precio() {
        sp.ordenarPor();
    }

    @Then("Obtiene el nombre y el precio de los primeros 5 productos")
    public void obtiene_el_nombre_y_precio_de_los_primeros_cinco_productos() {
        sp.obtenLosPrimerosCinco();
    }
 
}