package ch.fhnw.oop2.module07.ab3;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.util.converter.NumberStringConverter;

public class ApplicationUI extends VBox {
	private TextField textField;
	private Slider slider;

	public ApplicationUI() {
		initializeControls();
		layoutControls();
	}

	private void initializeControls() {
		slider = new Slider();
		//slider.valueProperty().addListener((observableValue, oldValue, newValue) -> label.setText(String.valueOf(newValue)));
		textField = new TextField();
		textField.textProperty().bindBidirectional(slider.valueProperty(), new NumberStringConverter());
	}

	private void layoutControls() {
		slider.setMax(10);
		slider.setMajorTickUnit(1);
		slider.isShowTickMarks();
		slider.setShowTickLabels(true);
		slider.snapToTicksProperty().setValue(true);
		slider.setValue(5);
		getChildren().addAll(textField, slider);
		setPadding(new Insets(15));
	}

}
