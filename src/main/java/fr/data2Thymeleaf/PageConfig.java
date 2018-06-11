package fr.data2Thymeleaf;

public class PageConfig {

	private String title;
	private String author;
	private Boolean generationDate;
	private String baseUri;
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

	public Boolean getGenerationDate() {
		return generationDate;
	}

	public void setGenerationDate(Boolean generationDate) {
		this.generationDate = generationDate;
	}

	public String getBaseUri() {
		return baseUri;
	}

	public void setBaseUri(String baseUri) {
		this.baseUri = baseUri;
	}

	public Boolean getPageNumerotation() {
		return pageNumerotation;
	}

	public void setPageNumerotation(Boolean pageNumerotation) {
		this.pageNumerotation = pageNumerotation;
	}

	public PageConfig(String title, String author, Boolean generationDate, String baseUri, Boolean pageNumerotation) {
		super();
		this.title = title;
		this.author = author;
		this.generationDate = generationDate;
		this.baseUri = baseUri;
		this.pageNumerotation = pageNumerotation;
	}

	public PageConfig() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "PageConfig [title=" + title + ", author=" + author + ", generationDate=" + generationDate + ", baseUri="
				+ baseUri + ", pageNumerotation=" + pageNumerotation + "]";
	}

}
