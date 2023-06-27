package com.admin.book_system.mapper;

import com.admin.book_system.model.dto.BookUserDTO;
import com.admin.book_system.model.entity.BookUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@Mapper
public interface UserMapper {
    // create
    int save(BookUserDTO user);

    BookUser findByUserId(String id);
}
