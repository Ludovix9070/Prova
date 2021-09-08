package prove_dynamicpane;

import javafx.scene.image.Image;

public class Book {
	private String name;
	private String ImageSrc;
	private String author;
	private Image image;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImageSrc() {
		return ImageSrc;
	}
	public void setImageSrc(String imageSrc) {
		ImageSrc = imageSrc;
	}
	
	public void setImage(Image image) {
		this.image = image;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public Image getImage() {
		return this.image;
	}
	
	
	
	
	
	
}
