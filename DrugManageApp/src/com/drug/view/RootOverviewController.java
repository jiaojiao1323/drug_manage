/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.drug.view;

import com.drug.DrugManageApp;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

/**
 *
 * @author zjj
 */
public class RootOverviewController implements Initializable {
    @FXML
    private MenuItem drugDicMenuItem;
    
    private DrugManageApp drugManageApp;

    @FXML
    private void showDrugDicOverview() throws Exception{
        this.drugManageApp.showDrugDicOverview();
    }
    @FXML
    private void close(){
        Platform.exit();
    }
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }
    
    public void setDrugManageApp(DrugManageApp drugManageApp) {
        this.drugManageApp = drugManageApp;
    }
    
}
