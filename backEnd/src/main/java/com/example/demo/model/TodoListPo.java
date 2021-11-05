package com.example.demo.model;

import lombok.Data;

@Data
public class TodoListPo {
    String id;
    String user_id;
    String create_time;
    String delete_time;
    boolean deleted;
    String type;
    String name;
    boolean reminded;
    String comment;
}
