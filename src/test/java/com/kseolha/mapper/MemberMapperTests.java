package com.kseolha.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.kseolha.domain.MemberVO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class MemberMapperTests {
	/*
	 * 04.05
	 * 회원가입, 로그인 테스트
	 */
	
    @Autowired
    private MemberMapper memberMapper;
    
//    @Test
//    public void testSelectOne() {
//    	MemberVO vo = new MemberVO();
//    	vo.setEmail("test1");
//    	vo.setPw("1234");
//    	log.info(memberMapper.selectOne(vo));
//    }
    @Test
    public void testSelectOne() {
    	MemberVO vo = new MemberVO();
    	vo.setEmail("test144");
    	log.info(memberMapper.selectOne(vo));
    }
    
    @Test
    public void testInsert() {
    	MemberVO vo = new MemberVO();
    	vo.setEmail("memberTest");
    	vo.setId("memberId");
    	vo.setPw("memberPw");
    	vo.setName("memberName");
    	vo.setIntro("memberIntro");
    	vo.setTel("memberTel");
    	vo.setAddr("memberAddr");
    	memberMapper.register(vo);
    }
    
    @Test
    public void testIdCheck() throws Exception{
        String email ="test1";
        String email2= "test100";
        memberMapper.idCheck(email);
        memberMapper.idCheck(email2);
    }
    @Test
    public void testFindId() throws Exception{
    	MemberVO vo = new MemberVO();
       	vo.setId("id1");
    	vo.setName("김민수");
    	log.info(memberMapper.findId(vo));
    }
    
    
    @Test
    public void testAutoLogin() {
    	String email = "test144";
    }
    @Test
	public void testUpdate() {
		MemberVO vo = memberMapper.readmember("test2", "test2");
		vo.setPw("1111");
		
		log.info(vo);
		memberMapper.updatePw(vo);
	}
    @Test
    public void testDelete() {
    	MemberVO vo = memberMapper.getEmail("test12");
    	String email = "test12";
    	
    	log.info(vo);
    	memberMapper.deleteMember(email);;
    }
    
    @Test
    public void testModfiy() {
    	MemberVO memberVO = memberMapper.getEmail("test7");
    	
    	memberVO.setIntro("수정 테스트");
    	memberVO.setId("수정 테스트");
    	memberVO.setName("수정 테스트");
    	
    	memberMapper.memberUpdate(memberVO);
    }
    
    
}
