package com.kseolha.mapper;

import java.util.List;
import java.util.stream.IntStream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.kseolha.domain.BoardVO;
import com.kseolha.domain.Criteria;
import com.kseolha.domain.ReplyVO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class ReplyMapperTests {
	@Autowired
	private ReplyMapper replyMapper;
	
	
	@Test
	public void testMapper() {
		log.info(replyMapper);
	}
	
	
	@Test // 4.4 테스트 완료
	public void testRead() {
		Long rno = 333L;
		log.info(replyMapper.read(rno));
	}
	
	@Test // 4.4 테스트 완료
	public void testDelete() {
		Long rno = 2L;
		log.info(replyMapper.delete(rno));
	}
	
	@Test // 4.5 테스트 완료
	public void testUpdate() {
		ReplyVO vo = replyMapper.read(2L);
		vo.setContent("댓글 수정 테스트"); //ReplyVO의 String Content
		
		log.info(replyMapper.update(vo));
	}
	
	@Test
	public void testList() { // 4.5 테스트 완료
		replyMapper.getList(844L, 336L, "parkhm323@gmail.com").forEach(log::info);
	}
	
	@Test
	public void testInsertLike() { // 4.17 테스트 완료
		replyMapper.insertLike(311L, "parkhm323@gmail.com");
	}
	
	@Test
	public void testDeleteLike() { // 4.17 테스트 완료
		replyMapper.deleteLike(311L, "parkhm323@gmail.com");
	}
	
	@Test
	public void testGetLike() { // 4.17 테스트 완료
		replyMapper.getLike("parkhm323@gmail.com");
	}
	
}
