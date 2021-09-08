package prove_dynamicpane;

import java.util.List;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;



public class Controller implements Initializable{
	
	@FXML
	private HBox cardLayout;
	
	@FXML
	private GridPane bookContainer;

	private List<Book> recentlyAdded;
	
	private List<Book> recommended;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		recentlyAdded = new ArrayList<>(recentlyAdded());
		recommended = new ArrayList<>(books());
		int column = 0;
		int row = 1;
		try {
			for(int i=0;i<recentlyAdded.size();i++) {
				FXMLLoader fxmlloader = new FXMLLoader();
				fxmlloader.setLocation(getClass().getResource("card.fxml"));
				HBox cardBox = fxmlloader.load();
				CardController cardcontroller = fxmlloader.getController();
				cardcontroller.setData(recentlyAdded.get(i));
				cardLayout.getChildren().add(cardBox);
				
				
			}
			
			for(Book book: recommended) {
				FXMLLoader fxmlloader = new FXMLLoader();
				fxmlloader.setLocation(getClass().getResource("book.fxml"));
				VBox bookBox = fxmlloader.load();
				BookController bookController = fxmlloader.getController();
				bookController.setData(book);
				
				if(column == 3) {
					column = 0;
					++row;
				}
				
				bookContainer.add(bookBox, column++, row);
				GridPane.setMargin(bookBox,new Insets(10));
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	private List<Book> recentlyAdded(){
		List<Book> ls= new ArrayList<>();
		Book book;
		for(int i=0;i<10;i++) {
			book = new Book();
			book.setName("TITOLO LIBRO "+String.valueOf(i));
			String imageSource = "https://static.vecteezy.com/system/resources/previews/001/200/123/original/book-png.png";
	    	Image image = new Image(imageSource);
			book.setImage(image);
			book.setAuthor("Autore "+String.valueOf(i));
			
			ls.add(book);
			
		}
		
		/*
		book = new Book();
		book.setName("TITOLO LIBRO 1");
		/*book.setImageSrc("/img/mvf4");
		book.setAuthor("Autore 1");
		
		ls.add(book);
		
		
		book = new Book();
		book.setName("TITOLO LIBRO 2");
		/*book.setImageSrc("/img/mvf4");
		book.setAuthor("Autore 2");
		
		ls.add(book);*/
		
		
		
		return ls;
		
			
		
	}
	
	private List<Book> books(){
		List<Book> ls2= new ArrayList<>();
		Book book2;
		for(int i=0;i<10;i++) {
			book2 = new Book();
			book2.setName("TITOLO LIBRO "+String.valueOf(i));
			String imageSource = "https://static.vecteezy.com/system/resources/previews/001/200/123/original/book-png.png";
	    	Image image = new Image(imageSource);
			book2.setImage(image);
			book2.setAuthor("Autore "+String.valueOf(i));
			
			ls2.add(book2);
			
		}
		
		return ls2;
		
	}

}
