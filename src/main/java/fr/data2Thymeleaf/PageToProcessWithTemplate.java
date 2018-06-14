package fr.data2Thymeleaf;

public class PageToProcessWithTemplate extends PageToProcess{
	
	private PageTemplate pageTemplate;

	public PageTemplate getPageTemplate() {
		return pageTemplate;
	}

	public void setPageTemplate(PageTemplate pageTemplate) {
		this.pageTemplate = pageTemplate;
	}

	public PageToProcessWithTemplate(Data data, PageConfig config, PageTemplate template, PageTemplate pageTemplate) {
		super(data, config, template);
		this.pageTemplate = pageTemplate;
	}
	
	
	public PageToProcessWithTemplate() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "PageToProcessWithTemplate [pageTemplate=" + pageTemplate + "]";
	}
	
	

}
