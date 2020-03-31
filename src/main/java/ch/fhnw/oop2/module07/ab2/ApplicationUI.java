package ch.fhnw.oop2.module07.ab2;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

public class ApplicationUI extends VBox {
	private Label label;
	private Slider slider;

	public ApplicationUI() {
		initializeControls();
		layoutControls();
	}

	private void initializeControls() {
		slider = new Slider();
		slider.valueProperty().addListener((observableValue, oldValue, newValue) -> label.setText(String.valueOf(newValue)));
		label = new Label();

	}

	private void layoutControls() {
		slider.setMax(10);
		slider.setMajorTickUnit(1);
		slider.isShowTickMarks();
		slider.setShowTickLabels(true);
		slider.snapToTicksProperty().setValue(true);
		slider.setValue(5);
		getChildren().addAll(label, slider);
		setPadding(new Insets(10));
	}

}
