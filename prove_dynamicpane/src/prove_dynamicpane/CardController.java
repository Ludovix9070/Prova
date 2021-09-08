package prove_dynamicpane;



import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;

public class CardController{

	
	 @FXML
	    private HBox box;

	    @FXML
	    private ImageView bookImage;

	    
	    @FXML
	    private Label bookName;

	    @FXML
	    private Label authorName;
	    
	    /*private String [] colors = { "B9E5FF","BDB2FE","FB99AAB","FF5856" };*/
	    
	    public void setData(Book book) {
	    	//Image image = new Image(getClass().getResourceAsStream(book.getImageSrc()));
	   
	    	bookImage.setImage(book.getImage());
	    	bookName.setText(book.getName());
	    	authorName.setText(book.getAuthor());
	    	/*
	    	box.setStyle("-fx-backgfround-color: #"+ colors[(int)(Math.random()*colors.length)] +";"+"-fx-background-radius:15;"+ 
	    	"-fx-effect: dropShadow(three-pass-box,rgba(0,0,0,0),10,0,0,10);");
	    	*/
	    	
	    	
	    	
	    }
}
