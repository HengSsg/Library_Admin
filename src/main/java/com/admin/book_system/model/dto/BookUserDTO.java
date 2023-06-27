package com.admin.book_system.model.dto;

import com.admin.book_system.model.entity.BookUser;
import lombok.*;

import java.util.Date;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BookUserDTO {
    private int user_seq ;
    private String user_id;
    private String user_pass;
    private String user_phone_number;
    private String status;
    private String user_grade;
    private int max_book;
    private Date service_stop;

    public BookUserDTO(final BookUser entity){
        this.user_seq = entity.getUser_seq();
        this.user_id = entity.getUser_id();
        this.user_pass = entity.getUser_pass();
        this.user_phone_number = entity.getUser_phone_number();
    }

    public BookUser toEntity(){
        return BookUser.builder()
                .user_seq(this.getUser_seq())
                .user_id(this.getUser_id())
                .user_pass(this.getUser_pass())
                .user_phone_number(this.getUser_phone_number())
                .build();
    }
}
