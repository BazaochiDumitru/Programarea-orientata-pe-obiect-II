package application;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.control.Label;
import javafx.application.Application;

public class Main extends Application {
	
	Label response;
	
	@Override
	public void start(Stage myStage) {
		myStage.setTitle("Using button and events in JavaFx");
		FlowPane rootNode = new FlowPane(10, 10);
		rootNode.setAlignment(Pos.CENTER);
		Scene myScene = new Scene(rootNode, 300, 100);
		myStage.setScene(myScene);
		response = new Label("Click button");
		
		Button btnUp = new Button("UP");
		Button btnDown = new Button("DOWN");
		
		btnUp.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent ae) {
				response.setText("You clicked Up");
			}
		});
		
		btnDown.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent ae) {
				response.setText("You clicked Down");
			}
		});
		
		rootNode.getChildren().addAll(btnUp, btnDown, response);
		myStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
