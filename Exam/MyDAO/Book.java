package MyDAO;

public class Book {
	private int idbook;

	public int getIdbook() {
		return idbook;
	}

	public void setIdbook(int idbook) {
		this.idbook = idbook;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCategorybook() {
		return categorybook;
	}

	public void setCategorybook(String categorybook) {
		this.categorybook = categorybook;
	}

	public String getReleasedate() {
		return releasedate;
	}

	public void setReleasedate(String releasedate) {
		this.releasedate = releasedate;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getSurnamebook() {
		return surnamebook;
	}

	public void setSurnamebook(String surnamebook) {
		this.surnamebook = surnamebook;
	}

	private String title;
	private String description;
	private String author;
	private String categorybook;
	private String releasedate;
	private String price;
	private String surnamebook;

}
