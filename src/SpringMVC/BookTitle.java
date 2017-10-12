package SpringMVC;

import java.util.LinkedHashMap;

public class BookTitle {
	
	private String title;
	private String isbn;
	private String author;
	private String edition;
	private String binding;
	
	private LinkedHashMap<String, String> bindingOptions;

	// no arg constructor
	public BookTitle() {
		
		bindingOptions = new LinkedHashMap <>();
		
		bindingOptions.put("PB", "Paper Back");
		bindingOptions.put("HB", "Hard Back");

	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getEdition() {
		return edition;
	}

	public void setEdition(String edition) {
		this.edition = edition;
	}
	
	public String getBinding() {
		return binding;
	}

	public void setBinding(String binding) {
		this.binding = binding;
	}

	public LinkedHashMap<String, String> getBindingOptions() {
		return bindingOptions;
	}

	
}
