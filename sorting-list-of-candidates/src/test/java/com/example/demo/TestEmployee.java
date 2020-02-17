package com.example.demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

import org.junit.Test;
import org.junit.Before;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.example.demo.employee.Employee;
import com.example.demo.employee.EmployeeService;

public class TestEmployee extends DemoApplicationTests {

    @Override
    @Before
    public void setUp() {
        super.setUp();
    }

    @Test
    public void testEmplList() throws Exception {
        String uri = "/";
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri).accept(MediaType.APPLICATION_JSON_VALUE))
                .andReturn();
        int status = mvcResult.getResponse().getStatus();
        assertEquals(200, status);

        String content = mvcResult.getResponse().getContentAsString();
        Employee[] emplist = super.mapFromJson(content, Employee[].class);
        assertTrue(emplist.length > 0);

    }

    /*@Test
    public void testEmpListWithNoPage() throws Exception {
        String uri = "/employee";
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri).accept(MediaType.APPLICATION_JSON_VALUE))
                .andReturn();
        int status = mvcResult.getResponse().getStatus();
        assertEquals(404, status);
    }*/




    @Test
    public void testEmplListWithSorting() throws Exception {
        String uri = "/";
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri).accept(MediaType.APPLICATION_JSON_VALUE))
                .andReturn();
        int status = mvcResult.getResponse().getStatus();
        assertEquals(200, status);

        String content = mvcResult.getResponse().getContentAsString();
        Employee[] emplist = super.mapFromJson(content, Employee[].class);
        assertTrue(emplist[0].getName().equals("Sandhya"));
        assertTrue(emplist[4].getName().equals("Tim"));
        assertEquals(emplist.length, 5);
    }
    
    @Test
    public void testEmpListWithSort() throws Exception{
        EmployeeService empSerc = mock(EmployeeService.class);
        
        Employee e1 = new Employee("Kemp", 24, 2);
        Employee e2 = new Employee("Sandhya", 20, 0);
        Employee e3 = new Employee("Anil", 22, 3);
        Employee e4 = new Employee("Kumar", 30, 6);
        Employee e5 = new Employee("Tim", 32, 7);
        
        
        List<Employee> elist = Arrays.asList(e1,e2,e4,e3,e5);
        
        when(empSerc.getEmployees()).thenReturn(elist);
        
        Collections.sort(empSerc.getEmployees());
        List<Employee> result = empSerc.getEmployees();
        
        assertEquals("Sandhya",result.get(0).getName());
        assertEquals("Tim",result.get(4).getName());
        
        
    }
    
    
    
    

    
}
