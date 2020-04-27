package com.xuchunxi.cms.dao;

import java.util.List;

import com.xuchunxi.cms.domain.Article;

/**
 * 
 * @ClassName: ArticleMapper 
 * @Description: 文章mapper
 * @author: xuchunxi
 * @date: 2020年4月27日 下午8:32:54
 */
public interface ArticleMapper {
	List<Article> selects();
}
