package com.cybertek.testController;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


//@SpringBootTest
@WebMvcTest
class WelcomeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void getWelcome() throws Exception {

        //call /welcome end point]
        //and verify "welcome"

        RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/welcome").accept(MediaType.APPLICATION_JSON);
        MvcResult result = mockMvc.perform(requestBuilder).andReturn();

        assertEquals("welcome", result.getResponse().getContentAsString());

    }
    @Test
    void welcomeException() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("/welcome").accept(MediaType.APPLICATION_JSON);

        mockMvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(content().string("welcome1")) // it will fail
                .andReturn();
    }
}

