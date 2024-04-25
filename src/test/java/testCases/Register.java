package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

public class Register extends Test_base {
     
	@Test
	public void Reg() throws IOException {
		rg.register();
		rg.Entry();
		rg.Signup();
		rg.ErrorMsg();
		
	}
}
