package com.springcore.noXMLConfiguration;

import org.springframework.beans.factory.annotation.Value;

// we are not using any @Component annotation, we are using configuration Java file to create bean
public class Programming {
    @Value("Java")
    private String languageName;
    @Value("#{true}")
    private boolean isObjectOriented;
    @Value("1995")
    private int launchYear;
    @Value("#{'Desktop Applications, Backend programming, Mobile application development'}")
    private String usage;

    @Override
    public String toString() {
        return "Programming {" +
                "\n\tlanguageName = '" + languageName + '\'' +
                ",\n\tisObjectOriented = " + isObjectOriented +
                ",\n\tlaunchYear = " + launchYear +
                ",\n\tusage = '" + usage + '\'' +
                "\n}";
    }
}
