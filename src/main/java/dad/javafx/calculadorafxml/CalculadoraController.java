package dad.javafx.calculadorafxml;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class CalculadoraController implements Initializable {

	private CalculadoraModel model= new CalculadoraModel();


	@FXML
	private GridPane View;
	
	@FXML
	private TextField NumberText;
	
	@FXML
	private Button ButtonCero, ButtonUno,ButtonDos,ButtonTres,ButtonCuatro, ButtonCinco,ButtonSeis,
	ButtonSiete,ButtonOcho,ButtonNueve;
	
	@FXML
	private Button ButtonC,ButtonCE,ButtonDivision,ButtonMultiplicacion,ButtonMas,ButtonMenos,
	ButtonPunto,ButtonIgual;
	
	@FXML
	private void sieteOnAction(ActionEvent e) {
	model.getCalculadora().insertar('7');	
	}
	@FXML
	private void ochoOnAction(ActionEvent e) {
		model.getCalculadora().insertar('8');	
		
	}
	@FXML
	private void nueveOnAction(ActionEvent e) {
		model.getCalculadora().insertar('9');	
	}
	@FXML
	private void seisOnAction(ActionEvent e) {
		model.getCalculadora().insertar('6');	
	}
	@FXML
	private void cincoOnAction(ActionEvent e) {
		model.getCalculadora().insertar('5');	
	}
	
	@FXML
	private void cuatroOnAction(ActionEvent e) {
		model.getCalculadora().insertar('4');	
	}
	
	@FXML
	private void tresOnAction(ActionEvent e) {
		model.getCalculadora().insertar('3');	
	}
	
	@FXML
	private void dosOnAction(ActionEvent e) {
		model.getCalculadora().insertar('2');	
	}
	
	@FXML
	private void unoOnAction(ActionEvent e) {
		model.getCalculadora().insertar('1');	
	}
	@FXML
	private void ceroOnAction(ActionEvent e) {
		model.getCalculadora().insertar('0');	
	}
	
	@FXML
	private void ceOnAction(ActionEvent e) {
		model.getCalculadora().borrarTodo();
	}
	@FXML
	private void cOnAction(ActionEvent e) {
		model.getCalculadora().borrar();
	}
	@FXML
	private void igualOnAction(ActionEvent e) {
		model.getCalculadora().operar(model.getCalculadora().IGUAL);
	}
	@FXML
	private void masOnAction(ActionEvent e) {
		model.getCalculadora().operar(model.getCalculadora().SUMAR);
	}
	@FXML
	private void menosOnAction(ActionEvent e) {
		model.getCalculadora().operar(model.getCalculadora().RESTAR);
	}
	@FXML
	private void divisionOnAction(ActionEvent e) {
		model.getCalculadora().operar(model.getCalculadora().DIVIDIR);
	}
	@FXML
	private void multiplicacionOnAction(ActionEvent e) {
		model.getCalculadora().operar(model.getCalculadora().MULTIPLICAR);
	}
	@FXML
	private void puntoOnAction(ActionEvent e) {
		model.getCalculadora().insertarComa();
	}
	
	
	public CalculadoraController() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/CalculadoraFXMLView.fxml"));
		loader.setController(this);
		loader.load();
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {

		 NumberText.textProperty().bind( model.pantallaProperty());


	}
	
	

	public GridPane getView() {
		return View;
	}
	
}
