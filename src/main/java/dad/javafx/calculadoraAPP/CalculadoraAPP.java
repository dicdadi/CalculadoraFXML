package dad.javafx.calculadoraAPP;

import dad.javafx.calculadorafxml.CalculadoraController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CalculadoraAPP extends Application {

	
	private CalculadoraController CalculadoraController;
	
	
	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		CalculadoraController = new CalculadoraController();
		
		
		Scene scene = new Scene(CalculadoraController.getView(), 800, 600);
		primaryStage.setTitle("Acceso a datos");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
		

	}

}
