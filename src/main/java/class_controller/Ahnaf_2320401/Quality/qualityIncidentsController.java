package class_controller.Ahnaf_2320401.Quality;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import java.time.LocalDate;

public class qualityIncidentsController
{
    @javafx.fxml.FXML
    private TableView<qualityIncidentClass> incidentTableView;
    @javafx.fxml.FXML
    private TableColumn<qualityIncidentClass, Integer> incidentIdTableColumn;
    @javafx.fxml.FXML
    private TableColumn<qualityIncidentClass, String> storeTableColumn;
    @javafx.fxml.FXML
    private TableColumn<qualityIncidentClass, String> typeTableColumn;
    @javafx.fxml.FXML
    private TableColumn<qualityIncidentClass, String> severityTableColumn;
    @javafx.fxml.FXML
    private TableColumn<qualityIncidentClass, String> statusTableColumn;
    @javafx.fxml.FXML
    private TableColumn<qualityIncidentClass, LocalDate> slaTableColumn;
    @javafx.fxml.FXML
    private TextField storeTextField;
    @javafx.fxml.FXML
    private TextField productTextField;
    @javafx.fxml.FXML
    private TextField lotTextField;
    @javafx.fxml.FXML
    private ComboBox<String> typeComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> severityComboBox;
    @javafx.fxml.FXML
    private TextArea descriptionTextArea;
    @javafx.fxml.FXML
    private Label statusLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void openIncidentsONA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void newIncidentONA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void saveIncidentONA(ActionEvent actionEvent) {
    }
}
