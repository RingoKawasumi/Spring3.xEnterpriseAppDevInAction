package com.baobaotao.resource;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by kawasumi on 15/12/3.
 */
public class FileSourceExample {
    public static void main(String[] args) {
        try {
            String filePath = "/Users/kawasumi/Documents/Mycode/Workspaces_Study/Spring3.xEnterpriseAppDevInAction/_03_IoCOverview/src/main/resources/conf/file1.txt";

            Resource res1 = new FileSystemResource(filePath);

            Resource res2 = new ClassPathResource("conf/file1.txt");

            InputStream ins1 = res1.getInputStream();
            InputStream ins2 = res2.getInputStream();
            System.out.println("res1:" + res1.getFilename());
            System.out.println("res2:" + res2.getFilename());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
