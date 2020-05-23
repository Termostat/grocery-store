package models;

public class Comment {

	private int id;
	private String text;
	
	
	public Comment() {
		super();
	}


	public Comment(final int id, final String text) {
		this.id = id;
		this.text = text;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getText() {
		return text;
	}


	public void setText(String text) {
		this.text = text;
	}
	
	
	
}
