/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.drug.view;

import com.drug.DrugManageApp;
import com.drug.model.Drug;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author zjj
 */
public class DrugDicOverviewController implements Initializable {

    @FXML
    private TableView<Drug> drugDicTableView;
    @FXML
    private TableColumn<Drug,String> cnameColumn;
    @FXML
    private TableColumn<Drug,String> enameColumn;
    @FXML
    private TableColumn<Drug,String> mdseCNameColumn;
    @FXML
    private TableColumn<Drug,String> mdseENameColumn;
    @FXML
    private TableColumn<Drug,String> stdCodeColumn;
    @FXML
    private TableColumn<Drug,String> typeColumn;
    @FXML
    private TableColumn<Drug,String> dosageFormColumn;
    @FXML
    private TableColumn<Drug,String> specColumn;
    @FXML
    private TableColumn<Drug,String> appvNumberColumn;
    @FXML
    private TableColumn<Drug,String> origAppvNumberColumn;
    @FXML
    private TableColumn<Drug,LocalDate> appvDateColumn;
    @FXML
    private TableColumn<Drug,String> mfrNameColumn;
    @FXML
    private TableColumn<Drug,String> mfrAddrColumn;
    
    private DrugManageApp drugManageApp;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.cnameColumn.setCellValueFactory(cellData->cellData.getValue().cnameProperty());
        this.enameColumn.setCellValueFactory(cellData->cellData.getValue().enameProperty());
        this.mdseCNameColumn.setCellValueFactory(cellData->cellData.getValue().mdseCNameProperty());
        this.mdseENameColumn.setCellValueFactory(cellData->cellData.getValue().mdseENameProperty());
        this.mdseENameColumn.setCellValueFactory(cellData->cellData.getValue().mdseENameProperty());
        this.stdCodeColumn.setCellValueFactory(cellData->cellData.getValue().stdCodeProperty());
        this.typeColumn.setCellValueFactory(cellData->cellData.getValue().typeProperty());
        this.dosageFormColumn.setCellValueFactory(cellData->cellData.getValue().dosageFormProperty());
        this.specColumn.setCellValueFactory(cellData->cellData.getValue().specProperty());
        this.appvNumberColumn.setCellValueFactory(cellData->cellData.getValue().appvNumberProperty());
        this.origAppvNumberColumn.setCellValueFactory(cellData->cellData.getValue().origAppvNumberProperty());
        this.appvDateColumn.setCellValueFactory(cellData->cellData.getValue().appvDateProperty());
        this.mfrNameColumn.setCellValueFactory(cellData->cellData.getValue().mfrNameProperty());
        this.mfrAddrColumn.setCellValueFactory(cellData->cellData.getValue().mfrAddrProperty());
    }    
    
      public void setDrugManageApp(DrugManageApp drugManageApp) {
        this.drugManageApp = drugManageApp;
        
        this.drugDicTableView.setItems(this.drugManageApp.getDrugDicList());
    }
}
