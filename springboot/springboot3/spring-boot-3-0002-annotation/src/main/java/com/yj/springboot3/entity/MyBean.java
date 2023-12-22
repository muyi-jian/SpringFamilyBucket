package com.yj.springboot3.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.sound.midi.Soundbank;

/**
 * @author YangJian
 * @date 2023/12/21 14:31
 * @description
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MyBean {
    private Integer id;
    private String name;

    public void test(){
        System.out.println("test.........");
    }


}
