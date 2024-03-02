package com.okayjava.html.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {

    private String fname;
    private String lname;
    private String email;
    private String passwd;
    private String dob;
    private String gender;
}
