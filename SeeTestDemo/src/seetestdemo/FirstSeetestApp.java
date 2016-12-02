package seetestdemo;

import com.experitest.client.Client;

public class FirstSeetestApp {

	public static void main(String[] args) {
		Client seetestDriver;
		try {
		
		seetestDriver = new Client("localhost",8889,true);
		               // Connect to the device
		               seetestDriver.setDevice("adb:Hol-U19");
		               //seetestDriver.setDevice("ios_app:Manesh's THD iPad - iOS 10 A");
		               // Launch the SalesForceOne app
		               seetestDriver.launch("in.amazon.mShop.android.shopping/com.amazon.mShop.home.HomeActivity", true, true);
		               seetestDriver.elementSendText("NATIVE", "xpath=//*[@hint='Amazon.com']", 0, "books");
		        } 
        
        catch (Exception ex) {
        	ex.printStackTrace();
        	/*
               
               int k=seetestDriver.getAvailableAgentPort();
               System.out.println("port is "+k);
               seetestDriver = new Client("localhost",8889,true);
               System.out.println("port is "+k);
               seetestDriver.setDevice("ios_app:Manesh's THD iPad - iOS 10 A");
               k=seetestDriver.getAvailableAgentPort();
               // Launch the SalesForceOne app
               seetestDriver.launch("com.salesforce.chatter", true, true);
               e.printStackTrace();
               //report.addReportStep("Launch S1 App", "Failed "+e, StepResult.FAIL);
        */}

	}

}
