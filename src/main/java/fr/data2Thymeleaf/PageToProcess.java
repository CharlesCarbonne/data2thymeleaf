package fr.data2Thymeleaf;

public class PageToProcess {

	private Data data;
	private PageConfig config;

	public PageToProcess(Data data, PageConfig config) {
		super();
		this.data = data;
		this.config = config;
	}
	
	public PageToProcess() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Data getData() {
		return data;
	}
	
	public void setData(Data data) {
		this.data = data;
	}
	
	public PageConfig getConfig() {
		return config;
	}
	
	public void setConfig(PageConfig config) {
		this.config = config;
	}
	
	@Override
	public String toString() {
		return "PageToProcess [data=" + data + ", config=" + config + "]";
	}
	

	

}
