package com.example.demo.model;

import lombok.Data;

@Data
public class TodoListItemPo {
    String id;
    String todolist_id;
    String name;
    String description;
    boolean ifFinished;
    String otherInfo;
}
