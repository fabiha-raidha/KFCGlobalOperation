package class_controller.Ahnaf_2320401.Supply;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class receiveShipmentController
{
    @javafx.fxml.FXML
    private TableColumn<receiveShipmentClass, Integer> receivedQtyColumn;
    @javafx.fxml.FXML
    private TableView<receiveShipmentClass> poDetailsTable;
    @javafx.fxml.FXML
    private TextField poNumberField;
    @javafx.fxml.FXML
    private TableColumn<receiveShipmentClass, String> itemColumn;
    @javafx.fxml.FXML
    private TableColumn<receiveShipmentClass, Integer> orderedQtyColumn;
    @javafx.fxml.FXML
    private Label statusLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void refreshList(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void confirmReceipt(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void openReceiveShipments(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void fetchPODetails(ActionEvent actionEvent) {
    }
}