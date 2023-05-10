//package com.kseolha.interceptor;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.stereotype.Component;
//import org.springframework.web.servlet.HandlerInterceptor;
//import org.springframework.web.servlet.ModelAndView;
//
//import com.kseolha.domain.BoardVO;
//import com.kseolha.domain.MemberVO;
//import com.kseolha.service.BlockService;
//import com.kseolha.service.MemberService;
//
//@Component
//public class BlockInterceptor implements HandlerInterceptor {
//
//    @Autowired
//    private MemberService memberService;
//    @Autowired
//    private BlockService blockService;
//
//    @Override
//    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        String email = request.getUserPrincipal().getName();
//        MemberVO member = memberService.read(email);
//
//     // 글 목록 가져오기
//        List<BoardVO> boards = (List<BoardVO>) request.getAttribute("boards");
//
//        // 차단된 사용자가 작성한 글 필터링
//        List<BoardVO> filteredBoards = new ArrayList<>();
//        for (BoardVO board : boards) {
//            // 작성자가 차단 목록에 없을 경우에만 게시글 목록에 추가
//            if (!isBlocked(emeil, board.getWriter())) {
//                filteredBoards.add(board);
//            }
//        }
//
//        // 차단된 사용자가 작성한 글이 모두 필터링된 경우에는 404 Not Found 에러 반환
//        if (filteredBoards.isEmpty()) {
//            response.sendError(HttpStatus.NOT_FOUND.value(), "No boards found.");
//            return false;
//        }
//
//        // 필터링된 글 목록으로 요청 속성 값 대체
//        request.setAttribute("boards", filteredBoards);
//
//        // 요청 처리 계속 진행
//        return true;
//    }
//
//    @Override
//    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
//        // do nothing
//    }
//
//    @Override
//    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
//        // do nothing
//    }
//
//    /**
//     * 작성자가 차단 목록에 있는지 확인합니다.
//     * 
//     * @param user  로그인한 사용자
//     * @param writer  게시글 작성자
//     * @return 차단 목록에 있으면 true, 그렇지 않으면 false
//     */
//    @Override
//    public int isBlock(String me, String you) {
//        return blockMapper.isBlocked(me, you);
//    }
//    
//}

