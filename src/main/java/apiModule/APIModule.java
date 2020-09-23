package apiModule;

import framework.BaseTest;
import org.apache.http.HttpResponse;
import stepDefination.Hooks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class APIModule {

	protected BaseTest baseTest = Hooks.getBasetest();
	public List<String> list = new ArrayList<String>();

	public void readFile(String file) throws IOException {
		String filePath = System.getProperty("user.dir")
				+ "/src/test/resources/files/" + file ;
		list.add(baseTest.browerIntraction.readFile(filePath));
	}

	public void compareResponse() throws IOException {
		String[] str1 = list.get(0).split("\n");
		String[] str2 = list.get(1).split("\n");
		HttpResponse r1 = null ;
		HttpResponse r2 = null ;
		for(int i = 0; i < str1.length ; i++){
			//System.out.println("Req1 : " + str1[i]);
			r1 = baseTest.browerIntraction.onGET(str1[i].replace("\r",""));
			if (r1.getStatusLine().getStatusCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ r1.getStatusLine().getStatusCode());
			}
			BufferedReader br = new BufferedReader(
					new InputStreamReader((r1.getEntity().getContent())));
			String output = br.readLine();
			//System.out.println("Req2 : " + str2[i]);
			r2 = baseTest.browerIntraction.onGET(str1[i].replace("\r",""));
			if (r2.getStatusLine().getStatusCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ r2.getStatusLine().getStatusCode());
			}
			 br = new BufferedReader(
					new InputStreamReader((r2.getEntity().getContent())));
			String output1 = br.readLine();
			boolean msg = baseTest.browerIntraction.compareTwoJSON(output,output1);
			if(msg){
				System.out.println(str1[i]+ " is equals " + str2[i]);
			}else{
				System.out.println(str1[i]+ " not equals " + str2[i]);
			}
		}
	}

}

