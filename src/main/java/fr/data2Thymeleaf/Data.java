package fr.data2Thymeleaf;

import java.util.List;

public class Data {

	private String title;
	private String content;
	private List<Data> data;

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

	public List<Data> getData() {
		return data;
	}

	public void setData(List<Data> data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Article [title=" + title + ", content=" + content + ", articles=" + data + "]";
	}

}
