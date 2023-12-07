package com.yj.spring6.anno;

import com.yj.spring6.anno.bean.Person;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestValidation {

    @Test
    public void testValidationOne() {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(ValidationConfig.class);
        MyValidation1 validation1 = context.getBean(MyValidation1.class);

        Person user = new Person();
        user.setName("lucy");
        user.setAge(20);
        boolean message = validation1.validatorByUserOne(user);
        System.out.println(message);
    }

    @Test
    public void testValidationTwo() {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(ValidationConfig.class);
        MyValidation2 validation2 = context.getBean(MyValidation2.class);

        Person user = new Person();
        user.setName("lucy");
        user.setAge(200);

        boolean message = validation2.validatorByUserTwo(user);
        System.out.println(message);

    }
}
