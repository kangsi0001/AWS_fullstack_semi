package com.kseolha.mapper;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.kseolha.domain.FriendVO;

import lombok.extern.log4j.Log4j;
/**
 * 
 * @author 강태수
 * 4/5일 생성
 *   팔로우 delete 생성 친구목록조회(통과못함)
 * 4/6 delete -> unfollow 로 대체  (팔로우 ,팔로워)  팔로우가 가지고있는 팔로워 삭제
 * 4/6 팔로잉 팔로워 목록 테스트 생성 통과
 * 
 * 4/10일 testSelectFriend() 생성 테스트 통과
 * 
 * 4/12일 팔로잉 팔로워 목록 수정 테스트 통과
 *   
 * 4/17일 팔로워 팔로잉 사람의수 카운트 테스트 통과  
 * 
 * 4/21
 * check 추가
 * 
 * 4/21
 * select 추가 
 * 
 * 4/24
 * unfollowing 삭제
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class FriendMapperTests {
	
	@Autowired
	private FriendMapper friendMapper;
	
	
	
	
	@Test // 4/5 일 테스트 성공
	public void testInsert() {
		FriendVO vo = new FriendVO();
		vo.setFollowing("test4");
		vo.setFollowed("test1");
		friendMapper.insert(vo);
		log.info(vo);
		
	}
	

	// 4.6 delete -> unfollow 로 대체  (팔로우 ,팔로워)  팔로우가 가지고있는 팔로워 삭제
	@Test  
	public void testUnfollow(){
		FriendVO vo = new FriendVO();
		friendMapper.unfollow("test1", "kangsi0909@naver.com");
		log.info(vo);
	}
	// 4.6 팔로워가 팔로잉을 삭제하는것   통과 
//	@Test
//	public void testUnfollowing(){
//		FriendVO vo = new FriendVO();
//		friendMapper.unfollow("test4", "test1");
//	}

	
	@Test  // 4.6 팔로잉 목록 통과 4/12수정
	public void testGetFollowings() {
	   List<Map<String, Object>> followings = friendMapper.getFollowings("test2");

	    
	}
	// 4.6 팔로워 목록 통과 a 의 팔로워 하면 a가 가지고있는 팔로워목록나옴
	@Test 
	public void testGetFollowers(){
		List<Map<String, Object>> followers = friendMapper.getFollowers("test2");
	}
	
	
	@Test  // 4/10일 테스트 통과 
	public void testSelectFriend() {

		List<Map<String, Object>> result = friendMapper.selectFriend("test1","test2" );
	
		log.info(result);
			
	}
	@Test  
	public void testselect() {

		List<Map<String, Object>> result = friendMapper.select("test1","test2" );
	
		log.info(result);
			
	}
	

	@Test //4/17 팔로잉한 사람의수 체크 테스트통과
	public void testFollowCount(){
		int count = friendMapper.followCount("test1");
		log.info(count);	
	}
	@Test // 4/17일 나를 팔로잉 한 사람의수 체크 테스트 통과
	public void testFollowerCount(){
		int count = friendMapper.followerCount("test1");
		log.info(count);
		
		
	}
	@Test //4/21 일 개인 팔로우 체크
	public void testCheck(){
		friendMapper.check("kangsi0009@gmail.com", "test3");
	}
	
	@Test
	public void testDelete(){
		friendMapper.delete("nhue630@gmail.com");
	}

}
