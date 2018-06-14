package fr.data2Thymeleaf;

import java.util.List;

public class Data {

	private String title;
	private String content;
	private int level;
	private List<Data> data;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getTitle() {
		return "<h" + level + ">" + title + "</h" + level + ">";
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
		return "Data [title=" + title + ", content=" + content + ", level=" + level + ", data=" + data + "]";
	}

	public int getLevel() {
		return level;

	}

	public void setLevel(int level) {
		this.level = level;
	}

}
