package com.baeldung.spring.web.thymeleaffragments.views;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.context.junit4.SpringRunner;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.hamcrest.Matchers.containsString;

@RunWith(SpringRunner.class)
@WebMvcTest
public class FragmentsTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void whenAccessingDefaultRoute_thenViewHasExpectedContent() throws Exception {
        this.mockMvc
            .perform(get("/"))
            .andDo(print())
            .andExpect(status().isOk())
            .andExpect(content().string(containsString("<h1>Thymeleaf Fragments sample</h1>")));
    }
    
    @Test
    public void whenAccessingHomeRoute_thenViewHasExpectedContent() throws Exception {
        this.mockMvc
            .perform(get("/home"))
            .andDo(print())
            .andExpect(status().isOk())
            .andExpect(content().string(containsString("<script src=\"/js/app.js\"></script>")));
    }
    
    @Test
    public void whenAccessingParamsRoute_thenViewHasExpectedContent() throws Exception {
        this.mockMvc
            .perform(get("/params"))
            .andDo(print())
            .andExpect(status().isOk())
            .andExpect(content().string(containsString("<label for=\"name\"><span>Name</span></label>")));
    }
    
    @Test
    public void whenAccessingMarkupRoute_thenViewHasExpectedContent() throws Exception {
        this.mockMvc
            .perform(get("/markup"))
            .andDo(print())
            .andExpect(status().isOk())
            .andExpect(content().string(containsString("<aside><div>This is a sidebar</div></aside>")));
    }
    @Test
    public void whenAccessingOtherRoute_thenViewHasExpectedContent() throws Exception {
        this.mockMvc
            .perform(get("/other"))
            .andDo(print())
            .andExpect(status().isOk())
            .andExpect(content().string(containsString("<td>John Doe</td>")));
    }
}