package application;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Circle;

public class SampleController {

    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField passwordField;
    
    @FXML
    void loginButtonPressed() {
        String username = usernameField.getText();
        String password = passwordField.getText();
        
        /*check if username and password are correct*/
        if ((username.equals("admin")) && (password.equals("password"))) {
            System.out.println("Login successful!");
            //Switch scenes by calling the showDashboard method
            showDashboard();
            
            
        } else {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Login Error");
            alert.setHeaderText(null);
            alert.setContentText("Incorrect username or password. Please try again.");
            alert.showAndWait();
        }
    }

    private void showDashboard() {
    	try {
    	// Create a new FXML Loader object
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("Clickable_Worm.fxml"));
        Parent root;
        //Load the new FXML Object
		root = loader.load();
		//Get the current scene of the usernameField component
        Scene scene = usernameField.getScene();
        //Replace the current scene with the new FXML scene we just loaded
        scene.setRoot(root);
        // Catch any IO errors that occur and print them to the console
    	} catch (IOException e) {
			e.printStackTrace();
		}
    }
    
  //Instantiate the Scene Builder Shapes
    @FXML
    private Circle Head;
    @FXML
    private Circle Body1;
    @FXML
    private Circle Tail;
    @FXML
    private Circle Body2;
    @FXML
    private Circle Body3;
    @FXML
    private Circle Body4;
    
    public void mousePressed(MouseEvent e) {
    	//If the mouseEvent is on the Head source then execute
    	if (e.getSource().equals(Head)) {
    		//Create an instance of a new Random Color Object
    		RandomColor HeadColor = new RandomColor(Head);
    		//Execute the SetColor() method on the HeadColor Object
    		HeadColor.SetColor();
    	}
    	if(e.getSource().equals(Body1)) {
    		//Create an instance of a new Random Color Object
    		RandomColor Body1Color = new RandomColor(Body1);
    		//Execute the SetColor() method on the NeckColor Object
    		Body1Color.SetColor();
    	}
    	if(e.getSource().equals(Tail)) {
    		//Create an instance of a new Random Color Object
    		RandomColor TailColor = new RandomColor(Tail);
    		//Execute the SetColor() method on the EndColor Object
    		TailColor.SetColor();
    	}
    	if(e.getSource().equals(Stomach1)) {
    		//Create an instance of a new Random Color Object
    		RandomColor Body2Color = new RandomColor(Body2);
    		//Execute the SetColor() method on the Stomach1Color Object
    		Body2Color.SetColor();
    	}
    	if(e.getSource().equals(Body3)) {
    		//Create an instance of a new Random Color Object
    		RandomColor Body3Color = new RandomColor(Body3);
    		//Execute the SetColor() method on the Stomach2Color Object
    		Body3Color.SetColor();
    	}
    	if(e.getSource().equals(Body3)) {
    		//Create an instance of a new Random Color Object
    		RandomColor Body4Color = new RandomColor(Body4);
    		//Execute the SetColor() method on the Stomach3Color Object
    		Body4Color.SetColor();
    	}
    	
    }
    public void mouseDragged(MouseEvent e) {
    	//Create an instance of a new Draggable Object
    	Draggable Draggable_head = new Draggable(Head);
    	//Execute the Make_Draggable() method on the Draggable_head Object
    	Draggable_head.Make_Draggable();
    	
    	Draggable Draggable_neck = new Draggable(Body1);
    	Draggable_neck.Make_Draggable();
    	
    	Draggable Draggable_end = new Draggable(Tail);
    	Draggable_end.Make_Draggable();
    	
    	Draggable Draggable_stomach1 = new Draggable(Body2);
    	Draggable_stomach1.Make_Draggable();
    	
    	Draggable Draggable_stomach2 = new Draggable(Body3);
    	Draggable_stomach2.Make_Draggable();
    	
    	Draggable Draggable_stomach3 = new Draggable(Body4);
    	Draggable_stomach3.Make_Draggable();

    }
}