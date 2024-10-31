/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import jakarta.annotation.ManagedBean;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import java.io.Serializable;

/**
 *
 * @author Арина
 */
@ManagedBean
@Named("sourceBean")
@ViewScoped

public class SourceBean implements Serializable {

    private boolean visibility = true;

    public SourceBean() {

    }


    public boolean isVisibility() {
        return visibility;
    }

    public void setVisibility(boolean visibility) {
        this.visibility = visibility;
    }

    public void exit() {

    }

    public String clickOpen() {
        visibility = false;
        return "openPage";
    }

    public String clickCrate() {
        visibility = false;
        return "createPage";
    }

    public String clickManagment() {
        return "managementPage";
    }

    public String clickcargoFlows() {
        return "cargoFlowsPage";
    }

    public String clickVanFlows() {
        return "vanFlowsPage";
    }

    public String clickEnterData() {
        return "enterDataPage";
    }

    public String clickEnterStationsPage() {
        return "enterStationsPage";
    }

    public String clickGraficViewPage() {
        return "graficViewPage";
    }

    public String clickDataApproaches() {
        return "dataApproachesPage";
    }

    public String clickC011() {
        return "C011Page";
    }

    public String clickTargetStreams() {
        return "targetStreamsPage";
    }

    public String clickCargoFlows() {
        return "cargoFlowsPage";
    }

    public String clickTrainFlows() {
        return "trainFlowsPage";
    }

    public String clickTrainFlows2() {
        return "trainFlowsPage2";
    }

    public String clickOutputData() {
        return "outputDataPage";
    }
    
    public String clickHomePage() {
        return "home";
    }

    public String clickCalculation() {
        return "calculationPage";
    }

    public String clickCalculation2() {
        return "calculationPage2";
    }

    public String clickOutputData2() {
        return "outputDataPage2";
    }

    public String clickTable() {
        return "tablePage";
    }

    public String clickExcel() {
        return "excelPage";
    }

    public String clickTrainFlowsByStages() {
        return "trainFlowsByStagesPage";
    }

}
