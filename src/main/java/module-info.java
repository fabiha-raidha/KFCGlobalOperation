module oop.kfcglobaloperation {
    requires javafx.controls;
    requires javafx.fxml;


    opens class_controller to javafx.fxml;
    exports class_controller;
    exports class_controller.Fabiha_2211214.CMO;
    opens class_controller.Fabiha_2211214.CMO to javafx.fxml;
    exports class_controller.Fabiha_2211214.HeadChef;
    opens class_controller.Fabiha_2211214.HeadChef to javafx.fxml;
}