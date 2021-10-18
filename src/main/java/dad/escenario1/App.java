package dad.escenario1;

import dad.escenario1.modificar.ModificarController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
	
	private ModificarController modificarController;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		modificarController = new ModificarController();
		
		Scene modificarScene = new Scene(modificarController.getView(), 320, 200);

		Stage modificarStage = new Stage();
		modificarStage.setTitle("Modificar");
		modificarStage.setScene(modificarScene);
		modificarStage.show();
		
		modificarController.getModel().valorProperty().addListener((o, ov, nv) -> {
		       System.out.println("antes valia " + ov + " y ahora valgo " + nv);                                                                    
		});	
	}

	public static void main(String[] args) {
		launch(args);
	}

}
