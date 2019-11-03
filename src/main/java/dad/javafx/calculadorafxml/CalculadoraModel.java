package dad.javafx.calculadorafxml;

import dad.javafx.calculadoraClass.CalculadoraModificada;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class CalculadoraModel {
	
	//Uso la calculadoraModificada para utilizar un listener cada vez que cambiar el valor de la variable pantalla de la calculadora
	private CalculadoraModificada calculadora= new CalculadoraModificada();

	private StringProperty pantalla = new SimpleStringProperty(calculadora.getPantalla());
	//private ObjectProperty<CalculadoraModificada> pantalla2 = new SimpleObjectProperty<CalculadoraModificada>();
	
	public CalculadoraModel() {
	calculadora.pantallaProperty().addListener((o, ov, nv) -> onPantallaChanged(nv));
	
	}
private void onPantallaChanged(String nv) {
		pantalla.set(nv);
		
	}
public CalculadoraModificada getCalculadora() {
	return calculadora;
}


public void setCalculadora(CalculadoraModificada calculadora) {
	this.calculadora = calculadora;
}
public final StringProperty pantallaProperty() {
	return this.pantalla;
}

public final String getPantalla() {
	return this.pantallaProperty().get();
}

public final void setPantalla(final String pantalla) {
	this.pantallaProperty().set(pantalla);
}




	
}
