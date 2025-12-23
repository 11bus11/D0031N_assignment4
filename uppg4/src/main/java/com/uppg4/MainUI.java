package com.uppg4;

import java.io.IOException;
import javafx.fxml.FXML;

public class MainUI{

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    
}

