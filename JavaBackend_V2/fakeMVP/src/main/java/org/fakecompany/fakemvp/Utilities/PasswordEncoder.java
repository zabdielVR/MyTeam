package org.fakecompany.fakemvp.Utilities;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoder {

    public static void main(String[] args) {

        org.springframework.security.crypto.password.PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        System.out.println(passwordEncoder.encode("holamundo"));


    }

}
