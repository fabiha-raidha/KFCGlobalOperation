package class_controller.Ahnaf_2320401.Supply;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import java.time.LocalDate;

public class purchaseOrderController
{
    @javafx.fxml.FXML
    private DatePicker deliveryDatePicker;
    @javafx.fxml.FXML
    private TableView<purchaseOrderClass> purchaseOrderTableView;
    @javafx.fxml.FXML
    private TableColumn<purchaseOrderClass, LocalDate> dateTableColumn;
    @javafx.fxml.FXML
    private TextField deliveryLocationTextField;
    @javafx.fxml.FXML
    private Label statusLabel;
    @javafx.fxml.FXML
    private TableColumn<purchaseOrderClass, String> supplierTableColumn;
    @javafx.fxml.FXML
    private TableColumn<purchaseOrderClass, String> statusTableColumn;
    @javafx.fxml.FXML
    private Label totalPOsLabel;
    @javafx.fxml.FXML
    private TextField priceTextField;
    @javafx.fxml.FXML
    private TextField ingredientTextField;
    @javafx.fxml.FXML
    private TableColumn<purchaseOrderClass, Double> totalTableColumn;
    @javafx.fxml.FXML
    private TableColumn<purchaseOrderClass, Integer> poNumberTableColumn;
    @javafx.fxml.FXML
    private ComboBox<String> supplierComboBox;
    @javafx.fxml.FXML
    private TextField quantityTextField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void addLineItemONA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void createPurchaseOrderONA(ActionEvent actionEvent) {
    }
}