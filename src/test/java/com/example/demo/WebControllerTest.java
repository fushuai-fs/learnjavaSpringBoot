package com.example.demo;

import com.example.demo.web.HelloWorldController;
import com.example.demo.web.WebController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;


import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WebControllerTest {
    private MockMvc mockMvc;

    @Before
    public void setUp () throws  Exception{
        mockMvc = MockMvcBuilders.standaloneSetup(new WebController()).build();
    }

    @Test
    public void getUser() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/getUser"));
        //  mockMvc.perform(MockMvcRequestBuilders.get("/getUser").accept(MediaType.APPLICATION_JSON_UTF8)).andDo(print());
    }

}
