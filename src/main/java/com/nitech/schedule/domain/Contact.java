package com.nitech.schedule.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Contact {

    private UUID id;
    private String name;
    private String email;
    private String url;
    private String whats;

    public String toString() {
        return "CsvPessoa{name='" + name + "\', email=" + email + "\'}";
    }

}
