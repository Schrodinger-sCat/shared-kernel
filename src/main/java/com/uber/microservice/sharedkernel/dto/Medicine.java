package com.uber.microservice.sharedkernel.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Medicine {
    private Long id;
    private String name;
    private String description;
}
