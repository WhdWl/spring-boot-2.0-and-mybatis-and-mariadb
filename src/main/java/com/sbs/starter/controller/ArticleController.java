package com.sbs.starter.controller;

import java.util.List;

import jline.internal.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sbs.starter.dto.Article;
import com.sbs.starter.service.ArticleService;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@Controller
public class ArticleController {
	
	@Autowired
	private ArticleService articleService;
	
	@RequestMapping("/article/list")
	public ModelAndView showList() {
		ModelAndView mv = new  ModelAndView();
		List<Article> list = articleService.getList();
		Log.info("list : " + list);
		// return "article/list";
		mv.setViewName("article/list");
		return mv;
	}

//	@RequestMapping("/article/list")
//	public String showList() {
//		List<Article> list = articleService.getList();
//		Log.info("list : " + list);
//		return "article/list";
//	}
	
}