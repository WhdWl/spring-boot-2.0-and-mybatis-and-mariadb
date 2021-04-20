package com.sbs.starter.dto;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class FileArticle {
	private String title;
	private String content;
	private MultipartFile demoFile;
}