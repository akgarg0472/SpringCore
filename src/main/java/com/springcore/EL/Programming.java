package com.springcore.EL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Programming {
    @Value("#{23 + 18}")
    private int languages;
    @Value("#{23 - 18}")
    private int advantages;
    @Value("#{ T(java.lang.Math).sqrt(16) }") // calling static  method
    private double demand;
    @Value("#{ T(java.lang.Thread).MAX_PRIORITY }")   // calling static constant(s)/field(s)
    private int priority;

    @Override
    public String toString() {
        return "Programming {" +
                "\n\tlanguages='" + languages + '\'' +
                ",\n\tadvantages='" + advantages + '\'' +
                "\n\tdemand = " + '\'' + demand +
                "\n\tpriority = " + priority +
                "\n}";
    }
}
