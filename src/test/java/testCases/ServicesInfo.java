package testCases;

import java.io.IOException;
import org.testng.annotations.Test;

public class ServicesInfo extends Test_base {
    
	@Test(priority=0)
	void home() {
		hp.selecttype();
	}
	
	@Test(priority=1)
	void Option() {
		hp.selectcar();
		hp.Go_for_it_Button();
	}
	
	@Test(priority=2)
	void servnameprice() throws IOException {
		cs.Service();
		cs.Price();
}
}
