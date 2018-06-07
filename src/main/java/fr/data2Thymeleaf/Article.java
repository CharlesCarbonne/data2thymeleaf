package fr.data2Thymeleaf;

import java.util.List;

public class Article {

	private String title;
	private String content;
	private List<Article> articles;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

	@Override
	public String toString() {
		return "Article [title=" + title + ", content=" + content + ", articles=" + articles + "]";
	}

}
