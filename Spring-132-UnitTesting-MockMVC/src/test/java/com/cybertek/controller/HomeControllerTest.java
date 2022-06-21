package com.cybertek.controller;

import com.cybertek.repository.AccountRepository;
import com.cybertek.repository.UserRepository;
import com.cybertek.service.UserService;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@WebMvcTest(HomeController.class)
class HomeControllerTest {


    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UserRepository userRepository;
    @MockBean
    private UserService userService;

    @MockBean
    AccountRepository accountRepository;

    static final String JSON_VALUE = "{" +
            "\"id\":1," +
            "\"email\":\"josie_story@email.com\"," +
            "\"username\":\"josieStory\"," +
            "\"account\":" +
                "{\"id\":1," +
                "\"name\":\"Josie D Story\"," +
              "\"address\":\"262  Lochmere Lane\"," +
                "\"country\":\"United States\"," +
                "\"city\":\"LOUISVILLE\"," +
                "\"age\":35," +
                "\"role\":\"USER\"}}";




    static final String JSON_VALUE_BY_ID = "{\n" +
            "    \"id\": 2,\n" +
            "    \"email\": \"bernard@email.com\",\n" +
            "    \"username\": \"bernard\",\n" +
            "    \"account\": {\n" +
            "        \"id\": 2,\n" +
            "        \"name\": \"Bernard P Fendley\",\n" +
            "        \"address\": \"2903  Jarvis Street\",\n" +
            "        \"country\": \"United States\",\n" +
            "        \"city\": \"Buffalo\",\n" +
            "        \"age\": 28,\n" +
            "        \"role\": \"USER\"\n" +
            "    }\n" +
            "}";


    @Test
    public void jsonAssert() throws JSONException {
        String actaual = "{id:0,firstName:Mike}";
        String expected = "{id:0}";

        JSONAssert.assertEquals(expected,actaual,false); // this value checks if the contents are

    }

    @Test
    void checkConnection() throws Exception {
        var jsonObject = new JSONObject(JSON_VALUE);
        mockMvc
                .perform(MockMvcRequestBuilders.get("/users" ).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andReturn();

    }



    @Test
    void readAllUsers() throws Exception {
        var jsonObject = new JSONObject(JSON_VALUE);
        mockMvc
                .perform(MockMvcRequestBuilders.get("/users" ).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().json(JSON_VALUE))
                .andReturn();
    }

    @Test
    void readuserbyid() throws Exception {
        var jsonObject = new JSONObject(JSON_VALUE_BY_ID);

        mockMvc
                .perform(MockMvcRequestBuilders.get("/users/2" ).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().json(JSON_VALUE_BY_ID))
                .andReturn();
    }

    //Mock

    @Test
    void  getStudent() throws Exception {

//        when(userService.getUser()).thenReturn(Arrays.asList(
//                new User("email@email.com","Mike","Smith"),
//                new User("email@email2.com","John","Smith")
//        ));
        when(userRepository.findAll()).


        mockMvc.perform(MockMvcRequestBuilders.get("/user").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().json(JSON_VALUE))
                .andReturn();
    }
}