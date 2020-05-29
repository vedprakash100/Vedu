package com.scripts.MavenActiTime;
import java.io.IOException;
import com.generics.MavenActiTime.BaseTest;
import com.pages.MavenActiTime.POMActitimeLoginpage;
import org.testng.annotations.Test;



public class TestActitime extends BaseTest {

	@Test
	public void login() throws IOException {
	POMActitimeLoginpage login=new POMActitimeLoginpage(driver);
	login.loginMethods();
		
	}
	}
	