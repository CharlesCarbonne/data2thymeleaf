package fr.data2Thymeleaf;

import java.util.Date;
import java.util.List;

public class PageToProcess {

	private String title;
	private String author;
	private Date generationDate;
	// private List<String> cssFilesPath;
	private String baseUri;
	private List<Article> articles;
	private Boolean pageNumerotation;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getGenerationDate() {
		return generationDate;
	}

	public void setGenerationDate(Date generationDate) {
		this.generationDate = generationDate;
	}

	public String getBaseUri() {
		return baseUri;
	}

	public PageToProcess(String title, String author, Date generationDate, String baseUri, List<Article> articles,
			Boolean pageNumerotation) {
		super();
		this.title = title;
		this.author = author;
		this.generationDate = generationDate;
		this.baseUri = baseUri;
		this.articles = articles;
		this.pageNumerotation = pageNumerotation;
	}

	public void setBaseUri(String baseUri) {
		this.baseUri = baseUri;
	}

	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

	@Override
	public String toString() {
		return "PageToProcess [title=" + title + ", author=" + author + ", generationDate=" + generationDate
				+ ", baseUri=" + baseUri + ", articles=" + articles + ", pageNumerotation=" + pageNumerotation + "]";
	}

	public Boolean getPageNumerotation() {
		return pageNumerotation;
	}

	public void setPageNumerotation(Boolean pageNumerotation) {
		this.pageNumerotation = pageNumerotation;
	}

	public PageToProcess() {
		super();
	}
	
	

}
