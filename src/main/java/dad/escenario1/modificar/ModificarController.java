package dad.escenario1.modificar;

import javafx.event.ActionEvent;
import javafx.util.converter.NumberStringConverter;

public class ModificarController {

	private ModificarModel model = new ModificarModel();
	private ModificarView view = new ModificarView();
	
	public ModificarController() {
		
		view.getValorText().textProperty().bindBidirectional(model.entradaProperty(), new NumberStringConverter());
		
		view.getEstablecerButton().setOnAction(e -> onEstablecerAction(e));
		
		view.getIncrementarButton().setOnAction(e -> onIncrementarButton(e));
		 
		view.getDecrementarButton().setOnAction(e -> onDecrementarButton(e));
	}
	
	public ModificarModel getModel() {
		return model;
	}
	public ModificarView getView() {
		return view;
	}

	//logica de negocio (listeners)
	private void onDecrementarButton(ActionEvent e) {
		model.setValor(model.getValor() + 1);
	}

	private void onIncrementarButton(ActionEvent e) {
		model.setValor(model.getValor() - 1);
	}

	private void onEstablecerAction(ActionEvent e) {
		model.setValor(model.getEntrada());
	}
}
