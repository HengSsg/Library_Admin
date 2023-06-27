package com.admin.book_system.service.impl;

import com.admin.book_system.model.dto.BookUserDTO;
import com.admin.book_system.model.entity.BookUser;
import com.admin.book_system.mapper.UserMapper;
import com.admin.book_system.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Slf4j
@Service
public class UserServiceImpl implements UserService {
    private final UserMapper mapper;
    @Autowired
    public UserServiceImpl(UserMapper userRepository) {
        this.mapper = userRepository;
    }

    // 회원가입
    @Override
    public int saveUser(BookUserDTO user) {
        int result = mapper.save(user); // 실행 결과 => 1이면 성송
        log.info("signUp > BookUserDTO : user_seq ====>  "+user.toEntity().getUser_seq());  // 자동값 seq 반환
        return user.toEntity().getUser_seq();
    }

    @Override
    public BookUser getUserInfo(String id) {
        return  mapper.findByUserId(id);
    }

    @Override
    public int delete(String id) {
        return mapper.delete(id);
    }
}
