package com.beesion.ms.test.dto;

import lombok.Data;

@Data
public class PersonDto {

    private String name;
        

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}



