package class_controller.Ahnaf_2320401.Supply;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class receiveShipmentController
{
    @javafx.fxml.FXML
    private Label statusLabel;
    @javafx.fxml.FXML
    private TableView<receiveShipmentClass> poDetailsTableView;
    @javafx.fxml.FXML
    private TextField poNumberTextField;
    @javafx.fxml.FXML
    private TableColumn<receiveShipmentClass, Integer> orderedQtyTableColumn;
    @javafx.fxml.FXML
    private TableColumn<receiveShipmentClass, String> itemTableColumn;
    @javafx.fxml.FXML
    private TableColumn<receiveShipmentClass, Integer> receivedQtyTableColumn;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @Deprecated
    public void refreshList(ActionEvent actionEvent) {
    }

    @Deprecated
    public void confirmReceipt(ActionEvent actionEvent) {
    }

    @Deprecated
    public void openReceiveShipments(ActionEvent actionEvent) {
    }

    @Deprecated
    public void fetchPODetails(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void fetchPODetailsONA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void openReceiveShipmentsONA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void confirmReceiptONA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void refreshListONA(ActionEvent actionEvent) {
    }
}