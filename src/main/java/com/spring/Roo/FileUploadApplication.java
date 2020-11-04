package com.spring.Roo;



import java.io.File;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import controller.FileUploadController;

@SpringBootApplication
@ComponentScan({"com.spring.Roo","controller"})
public class FileUploadApplication {

	public static void main(String[] args) {
		new File(FileUploadController.uploadDirectory).mkdir();
		SpringApplication.run(FileUploadApplication.class, args);
	}

}
