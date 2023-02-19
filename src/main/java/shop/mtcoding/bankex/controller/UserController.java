package shop.mtcoding.bankex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import shop.mtcoding.bankex.dto.UserReq.JoinReqDto;
import shop.mtcoding.bankex.handler.ex.CustomException;
import shop.mtcoding.bankex.service.UserService;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/join")
    public String join(JoinReqDto joinReqDto) { // DTO로 받는 것이 좋다.
        // 1. POST, PUT일 때만 유효성 검사 (이것보다 우선되는 것이 인증 검사이다)
        if (joinReqDto.getUsername() == null || joinReqDto.getUsername().isEmpty()) {
            throw new CustomException("username을 입력해주세요", HttpStatus.BAD_REQUEST);
        }
        if (joinReqDto.getPassword() == null || joinReqDto.getPassword().isEmpty()) {
            throw new CustomException("password를 입력해주세요", HttpStatus.BAD_REQUEST);
        }
        if (joinReqDto.getFullname() == null || joinReqDto.getFullname().isEmpty()) {
            throw new CustomException("fullname을 입력해주세요", HttpStatus.BAD_REQUEST);
        }

        // 컨벤션 : post, put, delete 할때만 하기
        // 서비스 호출 => 회원가입();
        userService.회원가입(joinReqDto);

        return "redirect:/loginForm";
    }

    @GetMapping("/joinForm")
    public String join() {

        return "user/joinForm";
    }

    @GetMapping("/loginForm")
    public String login() {

        return "user/loginForm";
    }
}