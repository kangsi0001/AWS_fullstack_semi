package com.kseolha.service;

import lombok.extern.log4j.Log4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardServiceTests {
    @Autowired
    private BoardService boardService;

    @Test
    public void testDeleteLike() {

    }

    @Test
    public void testGetList() {
//        log.info(boardService.getList(1000L, null, "test1"));
    }
}
