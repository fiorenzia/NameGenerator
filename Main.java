package pac;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application{
	public static void main(String[] args){
		System.out.print("a");
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		Label label;
		TextField field;
		Button button;
		String msg;
		label = new Label("This is JavaFX!");
		field = new TextField();
		button = new Button("Click");
		// アクションイベント処理の組み込み
		button.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				NameOutPutReader nameReader = new NameOutPutReader();
				label.setText(nameReader.nameOutPut());
			}
		});
		BorderPane pane = new BorderPane();
		pane.setTop(label);
		pane.setCenter(field);
		pane.setBottom(button);
		button.getOnMouseClicked();
		Scene scene = new Scene(pane, 320, 120);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
