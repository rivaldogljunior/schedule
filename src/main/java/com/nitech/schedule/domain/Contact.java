package com.nitech.schedule.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
public class Contact {

    private UUID id;
    private String name;
    private String email;
    private String url;
    private String whats;

}
