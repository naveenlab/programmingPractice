package ListnerConcept;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomeListner extends BaseTest implements ITestListener {


	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Failed Test Case");
		failed(result.getMethod().getMethodName());
	}
}
