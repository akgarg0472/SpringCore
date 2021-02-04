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

// expression language is used to evaluate expressions using either @Value("") annotation or by using Spring interfaces for expression language.
// we can use any expression which returns some value same as the field type.
// we can call static method, static variables of a class using expression language
/* syntax of expression language:
     - for normal expression: @Value("#{expression}")
     - for static method call: @Value("#{ T(class with complete package name).staticMethodName(Parameters) }")
     - for static fields call: @Value("#{ T(class with complete package name).staticFieldName }")
*/