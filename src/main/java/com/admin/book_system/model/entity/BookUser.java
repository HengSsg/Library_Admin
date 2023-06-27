package com.admin.book_system.model.entity;


import lombok.*;

import java.util.Date;
@Getter
@Builder
public class BookUser {
    private int user_seq ;
    private String user_id;
    private String user_pass;
    private String user_phone_number;
    private String status;
    private String user_grade;
    private int max_book;
    private Date service_stop;
}
