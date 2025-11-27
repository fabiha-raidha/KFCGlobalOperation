package class_controller.Ahnaf_2320401.Supply;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class supplierController
{
    @javafx.fxml.FXML
    private TableColumn<supplierClass, String> nameTableColumn;
    @javafx.fxml.FXML
    private TextField emailTextField;
    @javafx.fxml.FXML
    private TextField nameTextField;
    @javafx.fxml.FXML
    private Label totalSuppliersLabel;
    @javafx.fxml.FXML
    private TableColumn<supplierClass, String> contactTableColumn;
    @javafx.fxml.FXML
    private TextField categoryTextField;
    @javafx.fxml.FXML
    private TableColumn<supplierClass, String> statusTableColumn;
    @javafx.fxml.FXML
    private TableView<supplierClass> supplierTableView;
    @javafx.fxml.FXML
    private TextField contactTextField;
    @javafx.fxml.FXML
    private TableColumn<supplierClass, Integer> supplierIdTableColumn;
    @javafx.fxml.FXML
    private TableColumn<supplierClass, String> categoryTableColumn;
    @javafx.fxml.FXML
    private Label successLabel;
    @javafx.fxml.FXML
    private Label errorLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void addSupplierONA(ActionEvent actionEvent) {
    }
}