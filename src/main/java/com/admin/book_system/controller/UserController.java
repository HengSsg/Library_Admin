package com.admin.book_system.controller;

import com.admin.book_system.model.dto.BookUserDTO;
import com.admin.book_system.model.dto.ResponseDTO;
import com.admin.book_system.model.entity.BookUser;
import com.admin.book_system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    // POST - 회원가입
    @PostMapping("/signup")
    public int signUpUser(@RequestBody BookUserDTO userDTO){
        return userService.saveUser(userDTO);
    }

    // GET - 아이디로 회원정보 조회
    @GetMapping("/{id}")
    public BookUser getUserInfo(@PathVariable String id){
        return userService.getUserInfo(id);
    }

    // DELETE - 회원 삭제
    @DeleteMapping("/{id}")
    public int deleteUser(@PathVariable String id){
        return userService.delete(id);
    }


//    // GET - 아이디로 회원정보 조회
//    @GetMapping("/ResponseEntity/{id}")
//    public ResponseEntity<?> getUserInfoByResponseEntity(@PathVariable String id){
//        ResponseDTO dto = new ResponseDTO();
//        dto.setData(userService.getUserInfo(id));
//        return new ResponseEntity<>(dto,  HttpStatus.OK);
//    }

}
