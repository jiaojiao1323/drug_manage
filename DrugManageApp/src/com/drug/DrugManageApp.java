/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.drug;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import com.drug.model.Drug;
import com.drug.util.HttpMethod;
import com.drug.view.DrugDicOverviewController;
import com.drug.view.RootOverviewController;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author zjj
 */
public class DrugManageApp extends Application {
    
    public DrugManageApp() {
        this.drugDicList=FXCollections.observableArrayList();
        this.drugDicList.add(new Drug("drug1", "中药"));
        this.drugDicList.add(new Drug("drug2", "中药"));
        this.drugDicList.add(new Drug("drug3", "中药"));
        this.drugDicList.add(new Drug("drug4", "中药"));
        
    }

    private Stage primaryStage;
    private BorderPane rootOverview;
    
    private ObservableList<Drug> drugDicList;

   @Override
    public void start(Stage primaryStage) throws Exception{
        this.primaryStage=primaryStage;
        this.primaryStage.setTitle("DrugManageApp");
        
        this.initRootOverview();
//        this.showDrugDicOverview();
        System.out.println("jsonstr");
        String jsonstr=HttpMethod.getGETString();
        System.out.println("jsonstr");
    }
    
    private void initRootOverview() throws IOException{
        FXMLLoader loader=new FXMLLoader();
        loader.setLocation(getClass().getResource("view/RootOverview.fxml"));
        this.rootOverview=(BorderPane)loader.load();
        
        Scene scene=new Scene(this.rootOverview);
        this.primaryStage.setScene(scene);
        this.primaryStage.show();
        
        RootOverviewController rootOverviewController=loader.getController();
        rootOverviewController.setDrugManageApp(this);
    }
    
    public void showDrugDicOverview() throws Exception{
        FXMLLoader loader=new FXMLLoader();
        loader.setLocation(getClass().getResource("view/DrugDicOverview.fxml"));
        AnchorPane drugDicOverview=loader.load();
        
        this.rootOverview.setCenter(drugDicOverview);
        DrugDicOverviewController drugDicOverviewController=loader.getController();
        drugDicOverviewController.setDrugManageApp(this);
        
        String jsonstr=HttpMethod.getGETString();
    }
    
    private ObservableList<Drug> loadDrugDicList(){
        return this.drugDicList;
    }
    
     public ObservableList<Drug> getDrugDicList() {
        return drugDicList;
    }
     
    public static void main(String[] args) {
        launch(args);
    }
    
}
