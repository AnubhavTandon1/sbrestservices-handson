package com.cognizant.springlearn;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(MockitoJUnitRunner.class)
public class MockitoTest {
 
    @Mock
    private RestTemplate restTemplate;
 
    @InjectMocks
    private EmployeeService empService = new EmployeeService();
 
    @Test
    public void givenMockingIsDoneByMockito_whenGetIsCalled_shouldReturnMockedObject() {
        Employee emp = new Employee(“E001”, "Eric Simmons");
        Mockito
          .when(restTemplate.getForEntity(
            “http://localhost:8080/employee/E001”, Employee.class))
          .thenReturn(new ResponseEntity(emp, HttpStatus.OK));
 
        Employee employee = empService.getEmployee(id);
        Assert.assertEquals(emp, employee);
    }
}