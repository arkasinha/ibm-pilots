package com.finance.loan;

import java.net.URI;
import java.net.URISyntaxException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class LoanApplicationTests {

	@Test
	public void contextLoads() throws URISyntaxException {
		
		URI uri = new URI("https://ustrial03.bpm.ibmcloud.com:9443/bpm/dev");
		System.out.println(uri);
	}

}
