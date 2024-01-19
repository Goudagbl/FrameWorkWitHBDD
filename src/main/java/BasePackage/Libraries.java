package BasePackage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Libraries {
   public WebDriver driver;
    public WebDriverWait wait;

    JavascriptExecutor js;
    public Libraries(WebDriver driver){
        this.driver=driver;
    }
    public void clickOnElement(WebElement element){

        element.click();
    }
   /* WebDriverWait wait = new WebDriverWait(driver,30);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE')]")));

    */
    public void enterIntoElement(WebElement element, String value){

        element.sendKeys(value);
    }

    public void wait_elementToBeClickable(WebElement element, int waitSeconds){
       wait = new WebDriverWait(driver,Duration.ofSeconds(waitSeconds));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void wait_Elements_To_Be_Visual(List<WebElement> elements, int waitSeconds){
        wait = new WebDriverWait(driver,Duration.ofSeconds(waitSeconds));
        wait.until(ExpectedConditions.visibilityOfAllElements(elements));

    }

    public void wait_Element_To_Be_Visual(WebElement element, int waitSeconds){
        wait = new WebDriverWait(driver,Duration.ofSeconds(waitSeconds));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void wait_InVisualityOfElement(WebElement element,int waitSeconds){
        wait = new WebDriverWait(driver,Duration.ofSeconds(waitSeconds));
        wait.until(ExpectedConditions.invisibilityOf(element));
    }


    public Actions mouse_Hover_Action(WebElement element){
        Actions action = new Actions(driver);
        return action.moveToElement(element);
    }

    public void doubleClickOnElement(WebElement element){
        mouse_Hover_Action(element).doubleClick();
    }

    public void Handel_Accept_Alert(){

        driver.switchTo().alert().accept();
    }


    public void javaScriptClick(WebElement ele){
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", ele);

    }

   /* public void avoidStalenessOfWebElement(WebElement element, int waitSecond){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(waitSecond));
        wait.until(ExpectedConditions.stalenessOf(element));
          }
    */

    public WebElement avoidStalenessOfWebElement(WebElement element){
        WebElement element1 = null;
        boolean outcome = false;
        int count = 1;
    while(count <=5){
        try{
      element1 = element;
            wait_elementToBeClickable(element,5);
            outcome= true;
            break;
        }
        catch(StaleElementReferenceException exe){
            count++;
        exe.printStackTrace();
        }

    }
    return element1;
    }

    public void wait_textToBePresentInElement(WebElement element, int waitSeconds, String textTobePresent){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(waitSeconds));
        wait.until(ExpectedConditions.textToBePresentInElement(element,textTobePresent));
    }

    public void wait_attributeContains(WebElement element, int waitSeconds, String attributeName, String attributeValue){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(waitSeconds));
        wait.until(ExpectedConditions.attributeContains(element,attributeName,attributeValue));
    }



    public  void waitForPageLoad() {
         String pageLoadStatus = null;
        do {
            js = (JavascriptExecutor) driver;
            pageLoadStatus = (String)js.executeScript("return document.readyState");
            System.out.println(pageLoadStatus);
        } while (!pageLoadStatus.equals("complete") );
        System.out.println("Page Loaded.");
    }

}
