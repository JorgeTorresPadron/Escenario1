package dad.escenario1.modificar;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class ModificarModel {
	
	private IntegerProperty entrada = new SimpleIntegerProperty();
	private IntegerProperty valor= new SimpleIntegerProperty();
	
	public IntegerProperty entradaProperty() {
		return this.entrada;
	}
	
	public int getEntrada() {
		return this.entradaProperty().get();
	}
	
	public void setEntrada(final int entrada) {
		this.entradaProperty().set(entrada);
	}
	
	public IntegerProperty valorProperty() {
		return this.valor;
	}
	
	public int getValor() {
		return this.valorProperty().get();
	}
	
	public void setValor(final int valor) {
		this.valorProperty().set(valor);
	}
	

}
