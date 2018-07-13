package ru.loshmanov.spring1.web.ajax;

import java.util.List;

import ru.loshmanov.spring1.entity.Article;

public class ArticlesAjax {
	
	
	private List<Article> articles;

	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}
	
	
	

}
