package class_controller.Ahnaf_2320401.Supply;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;

public class stocktransfersController
{
    @javafx.fxml.FXML
    private TableColumn<stockTransfersClass, Integer> transferIdTableColumn;
    @javafx.fxml.FXML
    private TableColumn<stockTransfersClass, String> fromOutletTableColumn;
    @javafx.fxml.FXML
    private TableColumn<stockTransfersClass, String> toOutletTableColumn;
    @javafx.fxml.FXML
    private TableColumn<stockTransfersClass, String> itemsTableColumn;
    @javafx.fxml.FXML
    private TableColumn<stockTransfersClass, String> statusTableColumn;
    @javafx.fxml.FXML
    private ComboBox<String> fromOutletComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> toOutletComboBox;
    @javafx.fxml.FXML
    private TableView<stockTransfersClass> transferTableView;
    @javafx.fxml.FXML
    private TextField ingredientTextField;
    @javafx.fxml.FXML
    private TextField quantityTextField;
    @javafx.fxml.FXML
    private Label statusLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void createTransferONA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void addTransferItemONA(ActionEvent actionEvent) {
    }
}