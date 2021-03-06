package pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PreferenceDependencies {

	public PreferenceDependencies(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	// replace by @iOSFindBy when dealing with the iOS apps
	@AndroidFindBy(id="android:id/checkbox")
	public WebElement checkbox;
	
	@AndroidFindBy(xpath="(//android.widget.RelativeLayout)[2]")
	public WebElement wifiSettings;
	
	@AndroidFindBy(id="android:id/edit")
	public WebElement editTextField;
	
	@AndroidFindBy(className="android.widget.Button")
	public List<WebElement> buttons;
}
