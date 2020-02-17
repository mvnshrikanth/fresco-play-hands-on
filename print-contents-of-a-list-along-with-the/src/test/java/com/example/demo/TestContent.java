package com.example.demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.example.demo.content.Category;
public class TestContent extends ContentApplicationTests {

	@Override
	@Before
	public void setUp() {
		super.setUp();
	}

	@Test
	public void testCateList() throws Exception {
		String uri = "/";
		MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri).accept(MediaType.APPLICATION_JSON_VALUE))
				.andReturn();
		int status = mvcResult.getResponse().getStatus();
		assertEquals(200, status);

		String content = mvcResult.getResponse().getContentAsString();
		Category[] catlist = super.mapFromJson(content, Category[].class);
		assertTrue(catlist.length>0);
		assertTrue(catlist.length ==3);

	}
	
	@Test
	public void testCourseList() throws Exception {
		String uri = "/";
		MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri).accept(MediaType.APPLICATION_JSON_VALUE))
				.andReturn();
		int status = mvcResult.getResponse().getStatus();
		assertEquals(200, status);

		String content = mvcResult.getResponse().getContentAsString();
		Category[] emplist = super.mapFromJson(content, Category[].class);
		for (int i = 0; i < emplist.length; i++) {
			assertTrue((emplist[i].getCourseList()).size()==3);
		}
		//assertTrue(emplist[4].getName().equals("Tim"))();
		assertEquals(emplist.length, 3);
	}


}
