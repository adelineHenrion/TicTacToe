module com.isep.tictactoe {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.isep.tictactoe to javafx.fxml;
    exports com.isep.tictactoe;
}
