package com.sbs.starter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sbs.starter.dto.Article;
import com.sbs.starter.service.ArticleService;

import groovy.util.logging.Slf4j;
import jdk.internal.org.jline.utils.Log;

@Controller
@Slf4j // 이걸 해야 log.info() 등 가능..
public class ArticleController {
	
	@Autowired
	private ArticleService articleService;
	
	@RequestMapping("/article/list")
	public String showList() {
		List<Article> list = articleService.getList();
		Log.info("list : " + list);
		return "article/list";
	}
	
}