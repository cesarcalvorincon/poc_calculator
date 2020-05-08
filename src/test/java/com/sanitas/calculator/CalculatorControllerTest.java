package com.sanitas.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sanitas.calculator.dto.OperationResult;

/**
 * Basic test for Calculator Rest API
 * @author cesar
 *
 */
@AutoConfigureMockMvc
@SpringBootTest
public class CalculatorControllerTest {
	
	@Autowired
	private MockMvc mockMvc;

	@Test
	public void addTest() throws Exception {
		addTest(1.1, 1.1);
		addTest(1.0, 3.1);

	}  
	
	@Test
	public void subtractTest() throws Exception {
		subtractTest(1.1, 1.1);	 //Negative	
		subtractTest(1.1, 1.1);  //0.0
		subtractTest(1.0, 3.1);  //Positive

	} 	
	
	private void addTest(Double param1, Double param2) throws Exception {
		MvcResult mvcResult;
		mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/add")
				.param("param1", param1.toString())
				.param("param2", param2.toString())
				.contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andReturn();
		
		String responseAsString = mvcResult.getResponse().getContentAsString();
		OperationResult operationResult = stringToOperationResult(responseAsString);	

		Assertions.assertEquals(param1 + param2, operationResult.getValue());	
	}
	
	private void subtractTest(Double param1, Double param2) throws Exception {
		MvcResult mvcResult;
		mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/subtract")
				.param("param1", param1.toString())
				.param("param2", param2.toString())
				.contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andReturn();
		
		String responseAsString = mvcResult.getResponse().getContentAsString();
		OperationResult operationResult = stringToOperationResult(responseAsString);	

		Assertions.assertEquals(param1 - param2, operationResult.getValue());	
	}	
	
	private static OperationResult stringToOperationResult( String stringValue ) throws JsonMappingException, JsonProcessingException {

		ObjectMapper objectMapper = new ObjectMapper(); 
		return objectMapper.readValue(stringValue, OperationResult.class);			
		
	}	

}
