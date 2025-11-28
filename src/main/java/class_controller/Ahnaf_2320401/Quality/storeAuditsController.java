package class_controller.Ahnaf_2320401.Quality;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class storeAuditsController
{
    @javafx.fxml.FXML
    private TableView<storeAuditsClass> auditsTableView;
    @javafx.fxml.FXML
    private TableColumn<storeAuditsClass, Integer> auditIdTableColumn;
    @javafx.fxml.FXML
    private TableColumn<storeAuditsClass, String> storeTableColumn;
    @javafx.fxml.FXML
    private TableColumn<storeAuditsClass, String> dateTableColumn;
    @javafx.fxml.FXML
    private TableColumn<storeAuditsClass, Double> scoreTableColumn;
    @javafx.fxml.FXML
    private TableColumn<storeAuditsClass, String> statusTableColumn;
    @javafx.fxml.FXML
    private TableColumn<storeAuditsClass, String> auditorTableColumn;
    @javafx.fxml.FXML
    private Label totalAuditsLabel;
    @javafx.fxml.FXML
    private ComboBox<String> storeComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> auditorComboBox;
    @javafx.fxml.FXML
    private DatePicker auditDatePicker;
    @javafx.fxml.FXML
    private TextField checklistVersionTextField;
    @javafx.fxml.FXML
    private Label statusLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void openStoreAuditsONA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void scheduleAuditONA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void openAuditRecordONA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void submitAuditONA(ActionEvent actionEvent) {
    }
}
