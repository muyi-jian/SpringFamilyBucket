package com.yj.spring6;

import org.springframework.core.io.ClassPathResource;

import java.io.InputStream;

/**
 * @author YangJian
 * @date 2023/12/6 15:44
 * @description
 */
public class ClassPathResourceDemo {
    public static void main(String[] args) throws Exception {
        // 该文件在类路径中
        loadAndReadUrlResource("test.txt");
    }
    public static void loadAndReadUrlResource(String path) throws Exception{
        // 创建一个 Resource 对象
        ClassPathResource resource = new ClassPathResource(path);
        // 获取文件名
        System.out.println("resource.getFileName = " + resource.getFilename());
        // 获取文件描述
        System.out.println("resource.getDescription = "+ resource.getDescription());
        //获取文件内容
        InputStream in = resource.getInputStream();
        byte[] b = new byte[1024];
        while(in.read(b)!=-1) {
            System.out.println(new String(b));
        }
    }

}
