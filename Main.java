package application;
	
//always import this
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;


public class Main extends Application { //we can't see application class
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane(); //root has a top, bottom, left, right, center
			
			//set top
			Label greetingLabel = new Label("Hello World!");
			root.setTop(greetingLabel);
			
			//set bottom
			Button bottomButton = new Button("Done");
			root.setBottom(bottomButton);
			
			
			//set left
			ObservableList<String> options = FXCollections.observableArrayList("Option 1", "Option 2", "Option 3");
			ComboBox myComboBox = new ComboBox(options);
			
			TextField myTextField = new TextField("sup");
			root.setRight(myTextField);
			TextArea myTextArea = new TextArea();
			myTextArea.setMaxSize(100, 120);
			myTextArea.appendText("This is \nme writing p5 \non my way \nto Chicago");
			
			VBox myBox = new VBox(myTextArea, myComboBox);
			root.setLeft(myBox);
			
			//set right
			CheckBox myCheckBox = new CheckBox("Check Box");
			root.setRight(myCheckBox);
			
			//set center
			String imagePath = ("p5_pic.jpg");
			Image myImage = new Image(imagePath);
			ImageView imageView = new ImageView(myImage);
			imageView.setFitHeight(100);
			imageView.setPreserveRatio(true);
			root.setCenter(imageView);
			
			Scene scene = new Scene(root,400,400); //sets the size
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("Ryker's first JavaFx program");
			primaryStage.show(); //every stage must have a scene
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args); //calls application's launch method, then launch calls start
	}
}
