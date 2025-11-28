package class_controller.Ahnaf_2320401.Quality;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class trainingComplianceController
{
    @javafx.fxml.FXML
    private TableView<trainingComplianceClass> trainingTableView;
    @javafx.fxml.FXML
    private TableColumn<trainingComplianceClass, String> staffMemberTableColumn;
    @javafx.fxml.FXML
    private TableColumn<trainingComplianceClass, String> roleTableColumn;
    @javafx.fxml.FXML
    private TableColumn<trainingComplianceClass, String> requiredModulesTableColumn;
    @javafx.fxml.FXML
    private TableColumn<trainingComplianceClass, String> lastTrainedDateTableColumn;
    @javafx.fxml.FXML
    private TableColumn<trainingComplianceClass, String> expiryDateTableColumn;
    @javafx.fxml.FXML
    private TableColumn<trainingComplianceClass, String> complianceStatusTableColumn;
    @javafx.fxml.FXML
    private Label complianceRateLabel;
    @javafx.fxml.FXML
    private ComboBox<String> outletFilterComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> roleFilterComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> statusFilterComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> staffComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> moduleComboBox;
    @javafx.fxml.FXML
    private DatePicker dueDatePicker;
    @javafx.fxml.FXML
    private Label statusLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void openTrainingComplianceONA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void applyFiltersONA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void clearFiltersONA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void assignTrainingONA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void recordCompletionONA(ActionEvent actionEvent) {
    }
}

