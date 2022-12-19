package com.example.tabs_and_menus;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import java.net.URL;
import java.util.ResourceBundle;

public class TabsController implements Initializable {


    public AnchorPane rootPane;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        BorderPane borderPane= new BorderPane();
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

        tab1.setContent(btn1);
        tab2.setContent(btn2);
        tab3.setContent(btn3);

        tabPane.getTabs().addAll(tab1,tab2,tab3);
        borderPane.setCenter(tabPane);

        rootPane.getChildren().add(borderPane);


    }
}
