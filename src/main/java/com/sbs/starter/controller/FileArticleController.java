package com.sbs.starter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sbs.starter.dto.Article;
import com.sbs.starter.dto.FileArticleForm;
import com.sbs.starter.service.ArticleService;

import groovy.util.logging.Slf4j;

@Controller
@Slf4j // 이걸 해야 log.info() 등 가능..
public class FileArticleController {
	
	@Autowired
	private ArticleService articleService;
	
	@RequestMapping("/fileArticle/fileList")
	public String showList() {
		List<Article> list = articleService.getList();
		return "article/fileList";
	}
	
	@RequestMapping(value="/fileArticle/setProc", method=RequestMethod.POST)
    public void setProc(Article article) {
		System.out.println("1");
    }
	
	@RequestMapping(value="/fileArticle/setFileProc", method=RequestMethod.POST)
    public void setFileProc(Article article) {
		System.out.println("1");
    }
	
	@RequestMapping(value="/fileArticle/setFileListProc", method=RequestMethod.POST)
    public void setFileListProc(FileArticleForm fileArticleForm) {
		System.out.println("1");
    }
	
}