package com.yj.spring6.xml;

import com.yj.spring6.xml.bean.Person;
import com.yj.spring6.xml.validation.PersonValidator;
import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;

/**
 * @author YangJian
 * @date 2023/12/6 16:41
 * @description
 */
public class TestDemo1 {
    public static void main(String[] args) {
        //创建person对象
        Person person = new Person();
        person.setName("lucy");
        person.setAge(-1);

        // 创建Person对应的DataBinder
        DataBinder binder = new DataBinder(person);

        // 设置校验
        binder.setValidator(new PersonValidator());

        // 由于Person对象中的属性为空，所以校验不通过
        binder.validate();

        //输出结果
        BindingResult results = binder.getBindingResult();
        System.out.println(results.getAllErrors());
    }
}
