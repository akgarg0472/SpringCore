package com.springcore.EL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Main {

    public static void main(String[] args) {
        // creating IoC container
        ApplicationContext context = new ClassPathXmlApplicationContext("ELConfig/ExpressionLanguageConfig.xml");
        Programming programming = (Programming) context.getBean("programming");
        System.out.println(programming);

        ExpressionParser expressionParser = new SpelExpressionParser();
        Expression expression = expressionParser.parseExpression("23+18");
        System.out.println("Value of expression: " + expression.getValue());
    }
}
