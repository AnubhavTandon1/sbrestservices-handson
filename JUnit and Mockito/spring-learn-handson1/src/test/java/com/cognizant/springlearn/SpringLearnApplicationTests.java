package com.cognizant.springlearn;

import java.net.URI;
import java.net.URISyntaxException;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.rsocket.context.LocalRSocketServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
class SpringLearnApplicationTests {
	
	 @LocalRSocketServerPort
	    int randomServerPort;
	     
	    @Test
	    public void testGetEmployeeListSuccess() throws URISyntaxException
	    {
	    	RestTemplate restTemplate = new RestTemplate();
	        
	        final String baseUrl = "http://localhost:" + randomServerPort + "/employees";
	        URI uri = new URI(baseUrl);
	     
	        ResponseEntity<String> result = restTemplate.getForEntity(uri, String.class);
	         
	        //Verify request succeed
	        Assert.assertEquals(200, result.getStatusCodeValue());
	        //Assert.assertEquals(true, true);
	    }



}
