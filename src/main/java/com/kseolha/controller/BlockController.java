//package com.kseolha.controller;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//import org.apache.ibatis.annotations.Delete;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.kseolha.domain.BlockVO;
//import com.kseolha.service.BlockService;
//
//
//import lombok.AllArgsConstructor;
//
//
//@RequestMapping("/block")
//@Controller
//@AllArgsConstructor
//public class BlockController {
//	@Autowired
//    private BlockService blockService;
//
//    @PostMapping(value="/blockUser", produces = MediaType.APPLICATION_JSON_VALUE)
//    @ResponseBody
//    public BlockVO block(@RequestBody BlockVO vo){
//    	
//    	blockService.block(vo);
//		return vo;
//    	
//    }
//
//    @DeleteMapping("/unblock/{me}/{you}")
//    @ResponseBody
//    public String unblockUser(@PathVariable("me") String me, @PathVariable("you") String you) {
//        
//        blockService.unblock(me, you);
//        return me;
//    }
//
//    @GetMapping(value="/isBlocked/{me}/{you}", produces = MediaType.APPLICATION_JSON_VALUE)
//    @ResponseBody
//    public  int isBlock(@PathVariable("me") String me, @PathVariable("you") String you) {
//    	int result = blockService.isBlock(me, you);
//       
//        return result;
//    
//    }
//    
//}
