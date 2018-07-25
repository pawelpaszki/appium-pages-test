package rh.appium.maven;

import static org.junit.Assert.assertTrue;

import java.net.MalformedURLException;

import org.junit.Before;
import org.junit.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageObjects.HomePage;
import pageObjects.PreferenceDependencies;
import pageObjects.Preferences;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	private HomePage homePage;
	private Preferences preferences;
	private PreferenceDependencies prefDeps;
    
	@Before
	public void initPages() throws MalformedURLException {
		AndroidDriver<AndroidElement> driver = Base.getCapabilities();
		homePage = new HomePage(driver);
		preferences = new Preferences(driver);
		prefDeps = new PreferenceDependencies(driver);
	}
	
    @Test
    public void shouldProveVisibilityOfTheElements() {
    	assertTrue(homePage.preferences.isDisplayed());
        homePage.preferences.click();
        assertTrue(preferences.preferenceDeps.isDisplayed());
        preferences.preferenceDeps.click();
        assertTrue(prefDeps.checkbox.isDisplayed());
        prefDeps.checkbox.click();
        assertTrue(prefDeps.wifiSettings.isDisplayed());
        prefDeps.wifiSettings.click();
        assertTrue(prefDeps.editTextField.isDisplayed());
        assertTrue(prefDeps.editTextField.getText().equals(""));
        prefDeps.editTextField.sendKeys("Secure Network");
        assertTrue(prefDeps.editTextField.getText().equals("Secure Network"));
        assertTrue(prefDeps.buttons.get(1).isDisplayed());
        prefDeps.buttons.get(1).click();
    }
}
