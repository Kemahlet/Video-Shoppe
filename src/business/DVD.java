package business;

public class DVD {
	private String title;
	private String genre;
	private String[] actors;
	private String year;
	private String director;
	private String ageRating;
	private float price;
	
	public String getTitle() {
		return title;
	}
	
	public String getGenre() {
		return genre;
	}
	
	public String getActors() {
		String result = "";
		for (int i = 0; i < actors.length; i++) {
			if (actors[i] != null)
				result += actors[i] + ", ";
			else
				break;
		}
		return result;
	}
	
	public String getYear() {
		return year;
	}
	
	public String getDirector() {
		return director;
	}
	
	public String getAgeRating() {
		return ageRating;
	}
	
	public float getPrice() {
		return price;
	}
	
	public void updatePrice(float newPrice) {
		price = newPrice;
	}
}
