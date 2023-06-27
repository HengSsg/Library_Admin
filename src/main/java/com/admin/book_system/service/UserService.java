package com.admin.book_system.service;

import com.admin.book_system.model.dto.BookUserDTO;
import com.admin.book_system.model.entity.BookUser;

import java.util.Optional;

public interface UserService {
    // 회원가입
    int saveUser(BookUserDTO user);

    BookUser getUserInfo(String id);
}
