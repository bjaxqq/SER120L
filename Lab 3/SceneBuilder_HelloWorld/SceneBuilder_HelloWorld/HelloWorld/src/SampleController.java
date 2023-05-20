import javafx.event.ActionEvent;
import javafx.fxml.FXML;
//import the modules needed for each Scene Builder Control
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SampleController {
    //Instantiate the Scene Builder Controls
    //Notice how the name of the Label variable is the same as the Label's fx:id in Scene Builder
    @FXML private Label Output;
    @FXML private TextField Input;
    //Create a function to display the input text onto the Label output
    public void DisplayText(ActionEvent e) {
        //Use the TextField (input) getter/setter methods to extract the text.
        //Save the text as a String variable
        String display_text = Input.getText();
        //Use the Label's (output) getter/setter methods to set the Label's text value to your "display_text" variable
        Output.setText(display_text);
        //Display the Text to the Console for debugging
        System.out.println("Display Text:");
        System.out.println(Input.getText());
    }
}