package prove_dynamicpane;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class BookController {

	 @FXML
	    private ImageView bookImage;

	    @FXML
	    private Label bookName;

	    @FXML
	    private Label authorName;

	    
	    public void setData(Book book) {
	    	//Image Image = new Image(getClass().getResourceAsStream(book.getImageSrc()));
	    	
	    	
	    	bookImage.setImage(book.getImage());
	    	bookName.setText(book.getName());
	    	authorName.setText(book.getAuthor());
	    	}
}
