package org.example;

import org.springframework.stereotype.Component;

//@Component("jaz")
public class JazMusic implements Music {
    @Override
    public String getSong() {
        return "Jaz music";
    }
}
