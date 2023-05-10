//package com.kseolha.service;
//
//import java.util.List;
//import java.util.Map;
//
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import com.kseolha.domain.BlockVO;
//import com.kseolha.mapper.BlockMapper;
//import com.kseolha.mapper.FriendMapper;
//
//import lombok.AllArgsConstructor;
//
//@Service
//@AllArgsConstructor
//public class BlockServiceImpl implements BlockService {
//	private BlockMapper blockMapper;
//	private FriendMapper friendMapper;
////		friendMapper.unfollow(following, followed);
//
//	@Override
//	public void block(BlockVO vo) {
//		blockMapper.insertBlock(vo);
//	}
//
//	@Override
//	public void unblock(String me, String you) {
//		// TODO Auto-generated method stub
//		blockMapper.deleteBlock(me, you);
//	}
//
//	@Override
//	public int isBlock(String me, String you) {
//		// TODO Auto-generated method stub
//		return blockMapper.isBlocked(me, you);
//	}
//
//	@Override
//	@Transactional
//	public void blockAndUnfollow(BlockVO vo, String following, String followed) {
//		blockMapper.insertBlock(vo);
//	    friendMapper.unfollow(following, followed);
//	  }
//	
//	
//
//}
