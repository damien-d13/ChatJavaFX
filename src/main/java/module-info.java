module fr.damien.chatjavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens fr.damien.chatjavafx to javafx.fxml;
    exports fr.damien.chatjavafx;
}