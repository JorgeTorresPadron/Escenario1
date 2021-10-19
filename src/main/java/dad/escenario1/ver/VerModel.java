package dad.escenario1.ver;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class VerModel {

	private IntegerProperty valor = new SimpleIntegerProperty();
	
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

