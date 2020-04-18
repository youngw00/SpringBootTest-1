package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.rule.OutputCapture;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest(TestController.class)
public class SampleSpringBootTest2 {

	@Rule
	public OutputCapture outputCapture = new OutputCapture();
	
	@Autowired
	MockMvc mockMvc;
	
	@MockBean
	SampleService sampleService;
	
	@Test
	public void hello() throws Exception {
		when(sampleService.getName()).thenReturn("saelobi");
		
		mockMvc.perform(get("/hello"))
			.andExpect(content().string("hello saelobi"));
			
		assertThat(outputCapture.toString())
			.contains("logging output test")
			.contains("standard output test");
		
	}
	
}
