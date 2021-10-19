package dad.escenario1;

import dad.escenario1.modificar.ModificarController;
import dad.escenario1.ver.VerController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
	
	private ModificarController modificarController;
	private VerController verController;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		modificarController = new ModificarController();
		
		Scene modificarScene = new Scene(modificarController.getView(), 320, 200);

		Stage modificarStage = new Stage();
		modificarStage.setTitle("Modificar");
		modificarStage.setScene(modificarScene);
		modificarStage.show();
		
		//ver
		verController = new VerController();
		Scene verScene = new Scene(verController.getView(), 320, 200);
		
		Stage verStage = new Stage();
		verStage.setTitle("Ver");
		verStage.setScene(verScene);
		verStage.show();
		
		//bindings
		verController.getModel().valorProperty().bind(modificarController.getModel().valorProperty());
		
		modificarController.getModel().valorProperty().addListener((o, ov, nv) -> {
		       System.out.println("antes valia " + ov + " y ahora valgo " + nv);                                                                    
		});	
	}

	public static void main(String[] args) {
		launch(args);
	}

}
