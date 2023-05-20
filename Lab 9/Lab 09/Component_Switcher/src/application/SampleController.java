package application;

import javafx.fxml.FXML;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class SampleController {

    //Instantiate your FXML variables
	@FXML
	private Circle circle;
	@FXML
	private Rectangle square;

    @FXML
    public void displaySquare() {
        //Use the setVisible() methods on your Circle/Rectangle objects to change their visibility
    	circle.setVisible(false);
    	square.setVisible(true);
    }

    @FXML
    public void displayCircle() {
    	//Use the setVisible() methods on your Circle/Rectangle objects to change their visibility
    	circle.setVisible(true);
    	square.setVisible(false);
    }

}