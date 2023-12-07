package com.yj.spring6.anno;

import com.yj.spring6.anno.bean.Person;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class MyValidation1 {

    @Autowired
    private Validator validator;

    public boolean validatorByUserOne(Person person) {
        Set<ConstraintViolation<Person>> validate = validator.validate(person);
        return validate.isEmpty();
    }

}
