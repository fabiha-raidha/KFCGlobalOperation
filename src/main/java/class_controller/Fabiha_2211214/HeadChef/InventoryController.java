// java
package class_controller.Fabiha_2211214.HeadChef;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class InventoryController {

    @FXML
    private TableView<?> ingredientTableView;

    @FXML
    private TableColumn<?, ?> nameTableColumn;

    @FXML
    private TableColumn<?, ?> idTableColumn;

    @FXML
    private TableColumn<?, ?> quantityTableColumn;

    @FXML
    private TableColumn<?, ?> requiredQuantityTableColumn;

    @FXML
    private TableColumn<?, ?> stockWarningTableColumn;

    @FXML
    private TableColumn<?, ?> usedInRecipesTableColumn;

    @FXML
    private Label statusLabel;

    @FXML
    private TextField nameFilterTextField;

    @FXML
    private TextField recipeFilterTextField;

    @FXML
    private ComboBox<String> stockWarningFilterComboBox;

    @FXML
    private Button someButton; // optional placeholder if needed

    @FXML
    private void handleFilterONA(ActionEvent event) {
        String name = safeText(nameFilterTextField);
        String recipe = safeText(recipeFilterTextField);
        String warning = stockWarningFilterComboBox == null ? "" : String.valueOf(stockWarningFilterComboBox.getValue());
        statusLabel.setText("Filter applied: name=" + name + " recipe=" + recipe + " warning=" + warning);
        // TODO: apply actual filtering to ingredientTableView items if desired
    }

    @FXML
    private void handleAddIngredientONA(ActionEvent event) {
        statusLabel.setText("Add New Ingredient clicked");
        // TODO: open add-ingredient dialog or navigate to add screen
    }

    @FXML
    private void handleUpdateStockONA(ActionEvent event) {
        statusLabel.setText("Update Stock / Recalculate clicked");
        // TODO: update stock calculations or refresh table data
    }

    private String safeText(TextField tf) {
        return tf == null ? "" : (tf.getText() == null ? "" : tf.getText());
    }
}
