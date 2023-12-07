package com.yj.spring6;

import org.springframework.core.io.UrlResource;

import java.io.IOException;
import java.net.MalformedURLException;

/**
 * @author YangJian
 * @date 2023/12/6 15:23
 * @description
 */
public class UrlResourceDemo {
    public static void main(String[] args) {
        //loadAndReadUrlResource("http://www.baidu.com");
        // 文件在根目录下
        loadAndReadUrlResource("file:test.txt");

    }

    private static void loadAndReadUrlResource(String url) {
        UrlResource urlResource = null;
        try {
             urlResource = new UrlResource(url);

            System.out.println(urlResource.getFilename());
            System.out.println(urlResource.getURL());
            System.out.println(urlResource.getURI());

            // 获取资源描述
            System.out.println(urlResource.getDescription());
            //获取资源内容
            System.out.println(urlResource.getInputStream().read());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
