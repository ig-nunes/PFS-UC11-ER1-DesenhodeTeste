import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteBuscaCursos {
	private WebDriver driver;
	
	@Before
	public void abrirNavegador() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chrome-driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://informatica.sp.senai.br/");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.id("Busca1_txtFiltro")).sendKeys("teste");
		driver.findElement(By.id("Busca1_btnBusca")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
	
	@Test
	public void testeNavegacao() {
		
		String[] listaExcel = {"excel", "EXCEL", "Excel", "EXCEL.", "Excel."};
		String[] listaJornalismo = {"jornalismo", "JORNALISMO", "Jornalismo", "JORNALISMO.", "Jornalismo."};
		
		// Tema Excel:
		for(int indice = 0; indice<5; indice++) {
			
			try {				
				WebElement inputBusca = driver.findElement(By.id("Busca1_txtFiltro"));
				WebElement botaoPesquisa = driver.findElement(By.id("Busca1_btnBusca"));
				//inputBusca.sendKeys(Keys.END);
				inputBusca.clear();
				inputBusca.sendKeys(listaExcel[indice]);
				botaoPesquisa.click();
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//Tema Jonarlismo:
		for(int indice = 0; indice<5; indice++) {
			
			try {				
				WebElement inputBusca = driver.findElement(By.id("Busca1_txtFiltro"));
				WebElement botaoPesquisa = driver.findElement(By.id("Busca1_btnBusca"));
				//inputBusca.sendKeys(Keys.END);
				inputBusca.clear();
				inputBusca.sendKeys(listaJornalismo[indice]);
				botaoPesquisa.click();
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
}
