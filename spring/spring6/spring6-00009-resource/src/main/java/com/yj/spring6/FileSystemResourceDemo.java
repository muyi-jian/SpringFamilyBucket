package com.yj.spring6;

import org.springframework.core.io.FileSystemResource;

import java.io.InputStream;

/**
 * @author YangJian
 * @date 2023/12/6 15:52
 * @description
 */
public class FileSystemResourceDemo {
    public static void main(String[] args) throws Exception {
        loadAndReadUrlResource();
    }
    public static void loadAndReadUrlResource() throws Exception{
        //相对路径
        FileSystemResource resource = new FileSystemResource("test.txt");
        //绝对路径
        //FileSystemResource resource = new FileSystemResource("C:\\test.txt");
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
