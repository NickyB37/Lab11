import java.util.ArrayList;

public class movie {
 
private	String title;
private	String category;
	
	
	public movie(String title, String category) {
		super();
		this.title = title;
		this.category = category;
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "movie [title=" + title + ", category=" + category + "]";
	}
	








}
