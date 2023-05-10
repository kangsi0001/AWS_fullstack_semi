//package com.kseolha.mapper;
//
//import static org.junit.Assert.*;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import com.kseolha.domain.BlockVO;
//
//import lombok.extern.log4j.Log4j;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
//@Log4j
//public class BlockMapperTests {
//	@Autowired
//    private BlockMapper blockMapper;
//
//    @Test
//    public void testInsertBlock() {
//        BlockVO vo = new BlockVO();
//        vo.setMe("test5");
//        vo.setYou("test4");
//
//        blockMapper.insertBlock(vo);
//
//      //  assertTrue(blockMapper.isBlocked(me, you));
//    }
//
//    @Test
//    public void testDeleteBlock() {
//        String me = "test5";
//        String you = "test5";
//
////        blockMapper.insertBlock(me, you);
////        assertTrue(blockMapper.isBlocked(me, you));
//
//        blockMapper.deleteBlock(me, you);
//        //assertFalse(blockMapper.isBlocked(me, you));
//    }
//
//    @Test
//    public void testIsBlock() {
//        String me = "test3";
//        String you = "test5";
//
//   //     assertFalse(blockMapper.isBlocked(me, you));
//
//   //     blockMapper.insertBlock(me, you);
//        log.info(blockMapper.isBlocked(me, you));
//    }
//}
