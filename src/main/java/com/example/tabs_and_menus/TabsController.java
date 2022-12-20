package com.example.tabs_and_menus;

import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class TabsController implements Initializable {

    public String[] choices;
    public AnchorPane rootPane;
    public Text txt1;
    public CheckBox checkBox;
    public ChoiceBox<String> choiceBox = new ChoiceBox<>();

    public Boolean isOn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        BorderPane borderPane = new BorderPane();
        TabPane tabPane = new TabPane();

        Tab tab1 = new Tab("First");
        Tab tab2 = new Tab("Second");
        Tab tab3 = new Tab("Third");

        tab1.setClosable(false);
        tab2.setClosable(false);
        tab3.setClosable(false);

        Button btn1 = new Button("Function 1");
        Button btn2 = new Button("Function 2");
        Button btn3 = new Button("Function 3");


        checkBox = new CheckBox("Always on top");
        setOn();
        btn1.setOnAction(e -> settingText());
        tab1.setContent(btn1);

        choices = new String[]{"One", "Two", "Three"};
        choiceBox.getItems().addAll(choices);

        VBox tab1vBox = new VBox(50.0, btn1, btn2, btn3, checkBox,choiceBox);

        tab1.setContent(tab1vBox);


        tabPane.getTabs().addAll(tab1, tab2, tab3);
        borderPane.setCenter(tabPane);

        rootPane.getChildren().add(borderPane);




    }

    public void setOn() {
        if (checkBox.isSelected()) {
            txt1.setText("Selected");
            System.out.println(isOn);
        } else {
            txt1.setText("is off");
            isOn = false;
            System.out.println(isOn);
        }
    }

    public void settingText() {
        txt1.setText("Button 1 pressed");
    }
}
