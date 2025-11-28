package class_controller.Ahnaf_2320401.Supply;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class inventoryOverviewController {

    @FXML
    private Label lowStockCountLabel;

    @FXML
    private TableColumn<inventoryOverviewClass, Integer> minLevelTableColumn;

    @FXML
    private ComboBox<String> ingredientFilterComboBox;

    @FXML
    private TableColumn<inventoryOverviewClass, Integer> currentQtyTableColumn;

    @FXML
    private ComboBox<String> outletFilterComboBox;

    @FXML
    private TableView<inventoryOverviewClass> inventoryTableView;

    @FXML
    private TableColumn<inventoryOverviewClass, String> stockWarningTableColumn;

    @FXML
    private TableColumn<inventoryOverviewClass, String> ingredientTableColumn;

    @FXML
    private Label statusLabel;

    @FXML
    private TableColumn<inventoryOverviewClass, String> outletTableColumn;

    @FXML
    private ComboBox<String> stockWarningFilterComboBox;

    @FXML
    public void initialize() {
    }

    @FXML
    public void raisePurchaseRequestONA(ActionEvent actionEvent) {
    }

    @FXML
    public void applyfiltersONA(ActionEvent actionEvent) {
    }
}