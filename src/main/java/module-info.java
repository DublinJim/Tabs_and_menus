module com.example.tabs_and_menus {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tabs_and_menus to javafx.fxml;
    exports com.example.tabs_and_menus;
}