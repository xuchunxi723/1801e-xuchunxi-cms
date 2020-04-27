package com.xuchunxi.cms.service;

import java.util.List;

import com.xuchunxi.cms.domain.Article;

/**
 * 
 * @ClassName: ArticleService 
 * @Description: 文章service
 * @author: 徐春喜
 * @date: 2020年4月27日 下午8:35:28
 */
public interface ArticleService {
	List<Article> selects();
}
