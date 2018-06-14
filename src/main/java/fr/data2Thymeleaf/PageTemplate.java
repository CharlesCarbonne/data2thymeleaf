package fr.data2Thymeleaf;

public class PageTemplate {
	
	private String templateUri;

	public String getTemplateUri() {
		return templateUri;
	}

	public void setTemplateUri(String templateUri) {
		this.templateUri = templateUri;
	}

	public PageTemplate(String templateUri) {
		super();
		this.templateUri = templateUri;
	}

	@Override
	public String toString() {
		return "PageTemplate [templateUri=" + templateUri + "]";
	}
	
	

}
