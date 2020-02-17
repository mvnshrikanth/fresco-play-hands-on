package com.example.demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

public class TestApplication extends ApplicationProperTests{
	@Value("${fresco-course}")
	String courseName;

	@Override
	@Before
	public void setUp() {
		super.setUp();
	}

	@Test
	public void testCourseName() throws Exception {
		assertEquals("Spring Boot", courseName);
	}

	@Test
	public void testInCorrectCourseName() throws Exception {
		assertNotEquals("Springq Boot", courseName);
	}

	@Test
	public void checkCourseNameTest() throws Exception{
		String uri = "/";
		MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri).accept(MediaType.APPLICATION_JSON_VALUE))
				.andReturn();
		int status = mvcResult.getResponse().getStatus();
		assertEquals(200, status);

		String content = mvcResult.getResponse().getContentAsString();
		assertTrue(content.equals("Spring Boot"));
		
	}
	

}
