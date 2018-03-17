package com.baeldung.spring.web.thymeleaffragments.domain;

public class Friend {
    private Long id;
    private String name;

    public Friend(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
