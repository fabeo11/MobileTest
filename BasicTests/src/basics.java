import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class basics extends base {
	
	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver = config();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//xpath id classname androidUiAutomator <- parametros para identificar elementos
		//xpath syntax:  tagName[@attribute='value']
		
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		
	}
	
	
}
