package com.xuchunxi.cms.service.impl;

import java.util.List;

import javax.annotation.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xuchunxi.cms.domain.Article;
import com.xuchunxi.cms.service.ArticleService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-beans.xml")
public class ArticleServiceImplTest {
	@Resource
	private ArticleService articleService;
	@Test
	public void test() {
		List<Article> list = articleService.selects();
		System.out.println(list);
	}

}
