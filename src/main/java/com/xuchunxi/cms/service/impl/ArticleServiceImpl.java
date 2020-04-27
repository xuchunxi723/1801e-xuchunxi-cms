package com.xuchunxi.cms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xuchunxi.cms.dao.ArticleMapper;
import com.xuchunxi.cms.domain.Article;
import com.xuchunxi.cms.service.ArticleService;
@Service
public class ArticleServiceImpl implements ArticleService{
	@Resource
	ArticleMapper articleMapper;
	@Override
	public List<Article> selects() {
		
		return articleMapper.selects();
	}

}
