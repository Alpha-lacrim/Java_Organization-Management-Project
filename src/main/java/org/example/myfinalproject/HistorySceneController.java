package org.example.myfinalproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class HistorySceneController implements Initializable {
    //file and variables for base salaried.
    File baseSalariedFile = new File("BaseSalaried.txt");
    ArrayList<BaseSalariedEmployee> baseSalariedArrayList = new ArrayList<>();
    ArrayList<BaseSalariedEmployee> employeeBaseSalariedArrayList = new ArrayList<>();
    ArrayList<BaseSalariedEmployee> managerBaseSalariedArraylist = new ArrayList<>();

    @FXML
    private TableView<BaseSalariedEmployee> employeeBaseSalaryTable;

    @FXML
    private TableColumn<BaseSalariedEmployee,String> employeeBaseSalaryBirthColumn;

    @FXML
    private TableColumn<BaseSalariedEmployee,Status> employeeBaseSalaryStatusColumn;

    @FXML
    private TableColumn<BaseSalariedEmployee,String> employeeBaseSalaryEndDateColumn;

    @FXML
    private TableColumn<BaseSalariedEmployee,String> employeeBaseSalaryStartDateColumn;

    @FXML
    private TableColumn<BaseSalariedEmployee,Double> employeeBaseSalaryColumn;

    @FXML
    private TableColumn<BaseSalariedEmployee,Department> employeeBaseSalaryDepartmentColumn;

    @FXML
    private TableColumn<BaseSalariedEmployee,Double> employeeBaseSalaryEarningColumn;

    @FXML
    private TableColumn<BaseSalariedEmployee,String> employeeBaseSalaryFamilyColumn;

    @FXML
    private TableColumn<BaseSalariedEmployee,Integer> employeeBaseSalaryIdColumn;

    @FXML
    private TableColumn<BaseSalariedEmployee,String> employeeBaseSalaryNameColumn;

    @FXML
    private TableColumn<BaseSalariedEmployee,String> employeeBaseSalaryNationalColumn;

    @FXML
    private TableColumn<BaseSalariedEmployee,String> employeeBaseSalaryPhoneColumn;


    @FXML
    private TableView<BaseSalariedEmployee> managerBaseSalaryTable;

    @FXML
    private TableColumn<BaseSalariedEmployee,String> managerBaseSalaryBirthColumn;

    @FXML
    private TableColumn<BaseSalariedEmployee,String> managerBaseSalaryStartDateColumn;

    @FXML
    private TableColumn<BaseSalariedEmployee,Status> managerBaseSalaryStatusColumn;

    @FXML
    private TableColumn<BaseSalariedEmployee,String> managerBaseSalaryEndDateColumn;

    @FXML
    private TableColumn<BaseSalariedEmployee,Double> managerBaseSalaryBonusColumn;

    @FXML
    private TableColumn<BaseSalariedEmployee,Double> managerBaseSalaryColumn;

    @FXML
    private TableColumn<BaseSalariedEmployee,Department> managerBaseSalaryDepartmentColumn;

    @FXML
    private TableColumn<BaseSalariedEmployee,Double> managerBaseSalaryEarningColumn;

    @FXML
    private TableColumn<BaseSalariedEmployee,String> managerBaseSalaryFamilyColumn;

    @FXML
    private TableColumn<BaseSalariedEmployee,Integer> managerBaseSalaryIdColumn;

    @FXML
    private TableColumn<BaseSalariedEmployee,String> managerBaseSalaryNameColumn;

    @FXML
    private TableColumn<BaseSalariedEmployee,String> managerBaseSalaryNationalColumn;

    @FXML
    private TableColumn<BaseSalariedEmployee,String> managerBaseSalaryPhoneColumn;


    //file and variables for hourly salaried.
    File hourlySalaryFile = new File("HourlySalaried.txt");
    ArrayList<HourlySalariedEmployee> hourlySalariedArrayList = new ArrayList<>();
    ArrayList<HourlySalariedEmployee> employeeHourlySalariedArrayList = new ArrayList<>();
    ArrayList<HourlySalariedEmployee> managerHourlySalariedArraylist = new ArrayList<>();

    @FXML
    private TableView<HourlySalariedEmployee> employeeHourlySalaryTable;

    @FXML
    private TableColumn<HourlySalariedEmployee, Double> employeeHourlySalaryAmountOfHoursColumn;

    @FXML
    private TableColumn<HourlySalariedEmployee, String> employeeHourlySalaryBirthColumn;

    @FXML
    private TableColumn<HourlySalariedEmployee, String> employeeHourlySalaryStartDateColumn;

    @FXML
    private TableColumn<HourlySalariedEmployee, String > employeeHourlySalaryStatusColumn;

    @FXML
    private TableColumn<HourlySalariedEmployee, String> employeeHourlySalaryEndDateColumn;

    @FXML
    private TableColumn<HourlySalariedEmployee, Department> employeeHourlySalaryDepartmentColumn;

    @FXML
    private TableColumn<HourlySalariedEmployee, Double> employeeHourlySalaryEarningColumn;

    @FXML
    private TableColumn<HourlySalariedEmployee, String> employeeHourlySalaryFamilyColumn;

    @FXML
    private TableColumn<HourlySalariedEmployee, Integer> employeeHourlySalaryIdColumn;

    @FXML
    private TableColumn<HourlySalariedEmployee, String> employeeHourlySalaryNameColumn;

    @FXML
    private TableColumn<HourlySalariedEmployee, String> employeeHourlySalaryNationalColumn;

    @FXML
    private TableColumn<HourlySalariedEmployee, Double> employeeHourlySalaryPayColumn;

    @FXML
    private TableColumn<HourlySalariedEmployee, String> employeeHourlySalaryPhoneColumn;



    @FXML
    private TableColumn<HourlySalariedEmployee, Double> managerHourlySalaryAmountOfHoursColumn;

    @FXML
    private TableColumn<HourlySalariedEmployee, String> managerHourlySalaryBirthColumn;

    @FXML
    private TableColumn<HourlySalariedEmployee, String> managerHourlySalaryEndDateColumn;

    @FXML
    private TableColumn<HourlySalariedEmployee, String> managerHourlySalaryStartDateColumn;

    @FXML
    private TableColumn<HourlySalariedEmployee, Status> managerHourlySalaryStatusColumn;

    @FXML
    private TableColumn<HourlySalariedEmployee, Double> managerHourlySalaryBonusColumn;

    @FXML
    private TableColumn<HourlySalariedEmployee, Department> managerHourlySalaryDepartmentColumn;

    @FXML
    private TableColumn<HourlySalariedEmployee, Double> managerHourlySalaryEarningColumn;

    @FXML
    private TableColumn<HourlySalariedEmployee, String> managerHourlySalaryFamilyColumn;

    @FXML
    private TableColumn<HourlySalariedEmployee, Integer> managerHourlySalaryIdColumn;

    @FXML
    private TableColumn<HourlySalariedEmployee, String> managerHourlySalaryNameColumn;

    @FXML
    private TableColumn<HourlySalariedEmployee, String> managerHourlySalaryNationalColumn;

    @FXML
    private TableColumn<HourlySalariedEmployee, Double> managerHourlySalaryPayColumn;

    @FXML
    private TableColumn<HourlySalariedEmployee, String> managerHourlySalaryPhoneColumn;

    @FXML
    private TableView<HourlySalariedEmployee> managerHourlySalaryTable;

    //file and variables for commission salaried.
    File commissionSalaryFile = new File("CommissionSalaried.txt");
    ArrayList<CommissionSalariedEmployee> commissionSalariedArrayList = new ArrayList<>();
    ArrayList<CommissionSalariedEmployee> employeeCommissionSalariedArrayList = new ArrayList<>();
    ArrayList<CommissionSalariedEmployee> managerCommissionSalariedArrayList = new ArrayList<>();

    @FXML
    private TableView<CommissionSalariedEmployee> employeeCommissionSalaryTable;

    @FXML
    private TableColumn<CommissionSalariedEmployee,String> employeeCommissionSalaryBirthColumn;

    @FXML
    private TableColumn<CommissionSalariedEmployee, String> employeeCommissionSalaryStartDateColumn;

    @FXML
    private TableColumn<CommissionSalariedEmployee, Status> employeeCommissionSalaryStatusColumn;

    @FXML
    private TableColumn<CommissionSalariedEmployee, String> employeeCommissionSalaryEndDateColumn;

    @FXML
    private TableColumn<CommissionSalariedEmployee,Department> employeeCommissionSalaryDepartmentColumn;

    @FXML
    private TableColumn<CommissionSalariedEmployee,Double> employeeCommissionSalaryEarningColumn;

    @FXML
    private TableColumn<CommissionSalariedEmployee,String> employeeCommissionSalaryFamilyColumn;

    @FXML
    private TableColumn<CommissionSalariedEmployee,Integer> employeeCommissionSalaryIdColumn;

    @FXML
    private TableColumn<CommissionSalariedEmployee,String> employeeCommissionSalaryNameColumn;

    @FXML
    private TableColumn<CommissionSalariedEmployee,String> employeeCommissionSalaryNationalColumn;

    @FXML
    private TableColumn<CommissionSalariedEmployee,String> employeeCommissionSalaryPhoneColumn;

    @FXML
    private TableColumn<CommissionSalariedEmployee,Double> employeeCommissionSalaryRateColumn;

    @FXML
    private TableColumn<CommissionSalariedEmployee,Integer> employeeCommissionSalarySalesColumn;


    @FXML
    private TableView<CommissionSalariedEmployee> managerCommissionSalaryTable;

    @FXML
    private TableColumn<CommissionSalariedEmployee,String> managerCommissionSalaryBirthColumn;

    @FXML
    private TableColumn<CommissionSalariedEmployee, String> managerCommissionSalaryStartDateColumn;

    @FXML
    private TableColumn<CommissionSalariedEmployee, Status> managerCommissionSalaryStatusColumn;

    @FXML
    private TableColumn<CommissionSalariedEmployee, String> managerCommissionSalaryEndDateColumn;

    @FXML
    private TableColumn<CommissionSalariedEmployee,Double> managerCommissionSalaryBonusColumn;

    @FXML
    private TableColumn<CommissionSalariedEmployee,Department> managerCommissionSalaryDepartmentColumn;

    @FXML
    private TableColumn<CommissionSalariedEmployee,Double> managerCommissionSalaryEarningColumn;

    @FXML
    private TableColumn<CommissionSalariedEmployee,String> managerCommissionSalaryFamilyColumn;

    @FXML
    private TableColumn<CommissionSalariedEmployee,Integer> managerCommissionSalaryIdColumn;

    @FXML
    private TableColumn<CommissionSalariedEmployee,String> managerCommissionSalaryNameColumn;

    @FXML
    private TableColumn<CommissionSalariedEmployee,String> managerCommissionSalaryNationalColumn;

    @FXML
    private TableColumn<CommissionSalariedEmployee,String> managerCommissionSalaryPhoneColumn;

    @FXML
    private TableColumn<CommissionSalariedEmployee,Double> managerCommissionSalaryRateColumn;

    @FXML
    private TableColumn<CommissionSalariedEmployee,Integer> managerCommissionSalarySalesColumn;

    //file and variables for commission base salaried.
    File commissionBaseSalaryFile = new File("CommissionBaseSalaried.txt");
    ArrayList<CommissionBaseSalariedEmployee> commissionBaseSalariedArrayList = new ArrayList<>();
    ArrayList<CommissionBaseSalariedEmployee> employeeCommissionBaseSalariedArrayList = new ArrayList<>();
    ArrayList<CommissionBaseSalariedEmployee> managerCommissionBaseSalariedArraylist = new ArrayList<>();

    @FXML
    private TableView<CommissionBaseSalariedEmployee> employeeCommissionBaseTable;

    @FXML
    private TableColumn<CommissionBaseSalariedEmployee,String> employeeCommissionBaseBirthColumn;

    @FXML
    private TableColumn<CommissionBaseSalariedEmployee, String> employeeCommissionBaseEndDateColumn;

    @FXML
    private TableColumn<CommissionBaseSalariedEmployee, String> employeeCommissionBaseStartDateColumn;

    @FXML
    private TableColumn<CommissionBaseSalariedEmployee, Status> employeeCommissionBaseStatusColumn;

    @FXML
    private TableColumn<CommissionBaseSalariedEmployee,Department> employeeCommissionBaseDepartmentColumn;

    @FXML
    private TableColumn<CommissionBaseSalariedEmployee,Double> employeeCommissionBaseEarningColumn;

    @FXML
    private TableColumn<CommissionBaseSalariedEmployee,String> employeeCommissionBaseFamilyColumn;

    @FXML
    private TableColumn<CommissionBaseSalariedEmployee,Integer> employeeCommissionBaseIdColumn;

    @FXML
    private TableColumn<CommissionBaseSalariedEmployee,String> employeeCommissionBaseNameColumn;

    @FXML
    private TableColumn<CommissionBaseSalariedEmployee,String> employeeCommissionBaseNationalColumn;

    @FXML
    private TableColumn<CommissionBaseSalariedEmployee, Integer> employeeCommissionBaseNumberOfSalesColumn;

    @FXML
    private TableColumn<CommissionBaseSalariedEmployee, String> employeeCommissionBasePhoneColumn;

    @FXML
    private TableColumn<CommissionBaseSalariedEmployee, Double> employeeCommissionBaseRateColumn;

    @FXML
    private TableColumn<CommissionBaseSalariedEmployee, Double> employeeCommissionBaseSalaryColumn;



    @FXML
    private TableView<CommissionBaseSalariedEmployee> managerCommissionBaseTable;

    @FXML
    private TableColumn<CommissionBaseSalariedEmployee,String> managerCommissionBaseBirthColumn;

    @FXML
    private TableColumn<CommissionBaseSalariedEmployee, String> managerCommissionBaseStartDateColumn;

    @FXML
    private TableColumn<CommissionBaseSalariedEmployee, Status> managerCommissionBaseStatusColumn;

    @FXML
    private TableColumn<CommissionBaseSalariedEmployee, String> managerCommissionBaseEndDateColumn;

    @FXML
    private TableColumn<CommissionBaseSalariedEmployee,Double> managerCommissionBaseBonusColumn;

    @FXML
    private TableColumn<CommissionBaseSalariedEmployee,Department> managerCommissionBaseDepartmentColumn;

    @FXML
    private TableColumn<CommissionBaseSalariedEmployee,Double> managerCommissionBaseEarningColumn;

    @FXML
    private TableColumn<CommissionBaseSalariedEmployee,String> managerCommissionBaseFamilyColumn;

    @FXML
    private TableColumn<CommissionBaseSalariedEmployee,Integer> managerCommissionBaseIdColumn;

    @FXML
    private TableColumn<CommissionBaseSalariedEmployee,String> managerCommissionBaseNameColumn;

    @FXML
    private TableColumn<CommissionBaseSalariedEmployee,String> managerCommissionBaseNationalColumn;

    @FXML
    private TableColumn<CommissionBaseSalariedEmployee, Integer> managerCommissionBaseNumberOfSalesColumn;

    @FXML
    private TableColumn<CommissionBaseSalariedEmployee, String> managerCommissionBasePhoneColumn;

    @FXML
    private TableColumn<CommissionBaseSalariedEmployee, Double> managerCommissionBaseRateColumn;

    @FXML
    private TableColumn<CommissionBaseSalariedEmployee, Double> managerCommissionBaseSalaryColumn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        baseSalaryReadFromFile();
        hourlySalaryReadFromFile();
        commissionSalaryReadFromFile();
        commissionBaseSalaryReadFromFile();

        //initialize manager base salary table.
        managerBaseSalaryColumn.setCellValueFactory(new PropertyValueFactory<>("baseSalary"));
        managerBaseSalaryEarningColumn.setCellValueFactory(new PropertyValueFactory<>("earning"));
        managerBaseSalaryBirthColumn.setCellValueFactory(new PropertyValueFactory<>("birthDate"));
        managerBaseSalaryStartDateColumn.setCellValueFactory(new PropertyValueFactory<>("startDate"));
        managerBaseSalaryEndDateColumn.setCellValueFactory(new PropertyValueFactory<>("endDate"));
        managerBaseSalaryStatusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));
        managerBaseSalaryBonusColumn.setCellValueFactory(new PropertyValueFactory<>("managerBonus"));
        managerBaseSalaryFamilyColumn.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        managerBaseSalaryIdColumn.setCellValueFactory(new PropertyValueFactory<>("ID"));
        managerBaseSalaryNameColumn.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        managerBaseSalaryNationalColumn.setCellValueFactory(new PropertyValueFactory<>("nationalID"));
        managerBaseSalaryPhoneColumn.setCellValueFactory(new PropertyValueFactory<>("phoneNumber"));
        managerBaseSalaryDepartmentColumn.setCellValueFactory(new PropertyValueFactory<>("department"));

        //initialize employee base salary table.
        employeeBaseSalaryColumn.setCellValueFactory(new PropertyValueFactory<>("baseSalary"));
        employeeBaseSalaryEarningColumn.setCellValueFactory(new PropertyValueFactory<>("earning"));
        employeeBaseSalaryBirthColumn.setCellValueFactory(new PropertyValueFactory<>("birthDate"));
        employeeBaseSalaryStartDateColumn.setCellValueFactory(new PropertyValueFactory<>("startDate"));
        employeeBaseSalaryEndDateColumn.setCellValueFactory(new PropertyValueFactory<>("endDate"));
        employeeBaseSalaryStatusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));
        employeeBaseSalaryFamilyColumn.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        employeeBaseSalaryIdColumn.setCellValueFactory(new PropertyValueFactory<>("ID"));
        employeeBaseSalaryNameColumn.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        employeeBaseSalaryNationalColumn.setCellValueFactory(new PropertyValueFactory<>("nationalID"));
        employeeBaseSalaryPhoneColumn.setCellValueFactory(new PropertyValueFactory<>("phoneNumber"));
        employeeBaseSalaryDepartmentColumn.setCellValueFactory(new PropertyValueFactory<>("department"));

        //initialize manager hourly salary table.
        managerHourlySalaryAmountOfHoursColumn.setCellValueFactory(new PropertyValueFactory<>("amountOfHours"));
        managerHourlySalaryBirthColumn.setCellValueFactory(new PropertyValueFactory<>("birthDate"));
        managerHourlySalaryStartDateColumn.setCellValueFactory(new PropertyValueFactory<>("startDate"));
        managerHourlySalaryEndDateColumn.setCellValueFactory(new PropertyValueFactory<>("endDate"));
        managerHourlySalaryStatusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));
        managerHourlySalaryBonusColumn.setCellValueFactory(new PropertyValueFactory<>("managerBonus"));
        managerHourlySalaryDepartmentColumn.setCellValueFactory(new PropertyValueFactory<>("department"));
        managerHourlySalaryEarningColumn.setCellValueFactory(new PropertyValueFactory<>("earning"));
        managerHourlySalaryFamilyColumn.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        managerHourlySalaryIdColumn.setCellValueFactory(new PropertyValueFactory<>("ID"));
        managerHourlySalaryNameColumn.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        managerHourlySalaryNationalColumn.setCellValueFactory(new PropertyValueFactory<>("nationalID"));
        managerHourlySalaryPayColumn.setCellValueFactory(new PropertyValueFactory<>("payPerHour"));
        managerHourlySalaryPhoneColumn.setCellValueFactory(new PropertyValueFactory<>("phoneNumber"));

        //initialize employee hourly salary table.
        employeeHourlySalaryAmountOfHoursColumn.setCellValueFactory(new PropertyValueFactory<>("amountOfHours"));
        employeeHourlySalaryBirthColumn.setCellValueFactory(new PropertyValueFactory<>("birthDate"));
        employeeHourlySalaryStartDateColumn.setCellValueFactory(new PropertyValueFactory<>("startDate"));
        employeeHourlySalaryEndDateColumn.setCellValueFactory(new PropertyValueFactory<>("endDate"));
        employeeHourlySalaryStatusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));
        employeeHourlySalaryDepartmentColumn.setCellValueFactory(new PropertyValueFactory<>("department"));
        employeeHourlySalaryEarningColumn.setCellValueFactory(new PropertyValueFactory<>("earning"));
        employeeHourlySalaryFamilyColumn.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        employeeHourlySalaryIdColumn.setCellValueFactory(new PropertyValueFactory<>("ID"));
        employeeHourlySalaryNameColumn.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        employeeHourlySalaryNationalColumn.setCellValueFactory(new PropertyValueFactory<>("nationalID"));
        employeeHourlySalaryPayColumn.setCellValueFactory(new PropertyValueFactory<>("payPerHour"));
        employeeHourlySalaryPhoneColumn.setCellValueFactory(new PropertyValueFactory<>("phoneNumber"));

        //initialize manager commission salary table.
        managerCommissionSalaryBirthColumn.setCellValueFactory(new PropertyValueFactory<>("birthDate"));
        managerCommissionSalaryStartDateColumn.setCellValueFactory(new PropertyValueFactory<>("startDate"));
        managerCommissionSalaryEndDateColumn.setCellValueFactory(new PropertyValueFactory<>("endDate"));
        managerCommissionSalaryStatusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));
        managerCommissionSalaryBonusColumn.setCellValueFactory(new PropertyValueFactory<>("managerBonus"));
        managerCommissionSalaryDepartmentColumn.setCellValueFactory(new PropertyValueFactory<>("department"));
        managerCommissionSalaryEarningColumn.setCellValueFactory(new PropertyValueFactory<>("earning"));
        managerCommissionSalaryFamilyColumn.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        managerCommissionSalaryIdColumn.setCellValueFactory(new PropertyValueFactory<>("ID"));
        managerCommissionSalaryNameColumn.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        managerCommissionSalaryNationalColumn.setCellValueFactory(new PropertyValueFactory<>("nationalID"));
        managerCommissionSalaryPhoneColumn.setCellValueFactory(new PropertyValueFactory<>("phoneNumber"));
        managerCommissionSalaryRateColumn.setCellValueFactory(new PropertyValueFactory<>("commissionRate"));
        managerCommissionSalarySalesColumn.setCellValueFactory(new PropertyValueFactory<>("numberOfSales"));

        //initialize employee commission salary table.
        employeeCommissionSalaryBirthColumn.setCellValueFactory(new PropertyValueFactory<>("birthDate"));
        employeeCommissionSalaryStartDateColumn.setCellValueFactory(new PropertyValueFactory<>("startDate"));
        employeeCommissionSalaryEndDateColumn.setCellValueFactory(new PropertyValueFactory<>("endDate"));
        employeeCommissionSalaryStatusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));
        employeeCommissionSalaryDepartmentColumn.setCellValueFactory(new PropertyValueFactory<>("department"));
        employeeCommissionSalaryEarningColumn.setCellValueFactory(new PropertyValueFactory<>("earning"));
        employeeCommissionSalaryFamilyColumn.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        employeeCommissionSalaryIdColumn.setCellValueFactory(new PropertyValueFactory<>("ID"));
        employeeCommissionSalaryNameColumn.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        employeeCommissionSalaryNationalColumn.setCellValueFactory(new PropertyValueFactory<>("nationalID"));
        employeeCommissionSalaryPhoneColumn.setCellValueFactory(new PropertyValueFactory<>("phoneNumber"));
        employeeCommissionSalaryRateColumn.setCellValueFactory(new PropertyValueFactory<>("commissionRate"));
        employeeCommissionSalarySalesColumn.setCellValueFactory(new PropertyValueFactory<>("numberOfSales"));

        //initialize manager commission Base salary table.
        managerCommissionBaseBirthColumn.setCellValueFactory(new PropertyValueFactory<>("birthDate"));
        managerCommissionBaseStartDateColumn.setCellValueFactory(new PropertyValueFactory<>("startDate"));
        managerCommissionBaseEndDateColumn.setCellValueFactory(new PropertyValueFactory<>("endDate"));
        managerCommissionBaseStatusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));
        managerCommissionBaseBonusColumn.setCellValueFactory(new PropertyValueFactory<>("managerBonus"));
        managerCommissionBaseDepartmentColumn.setCellValueFactory(new PropertyValueFactory<>("department"));
        managerCommissionBaseEarningColumn.setCellValueFactory(new PropertyValueFactory<>("earning"));
        managerCommissionBaseFamilyColumn.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        managerCommissionBaseIdColumn.setCellValueFactory(new PropertyValueFactory<>("ID"));
        managerCommissionBaseNameColumn.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        managerCommissionBaseNationalColumn.setCellValueFactory(new PropertyValueFactory<>("nationalID"));
        managerCommissionBaseNumberOfSalesColumn.setCellValueFactory(new PropertyValueFactory<>("numberOfSales"));
        managerCommissionBasePhoneColumn.setCellValueFactory(new PropertyValueFactory<>("phoneNumber"));
        managerCommissionBaseRateColumn.setCellValueFactory(new PropertyValueFactory<>("commissionRate"));
        managerCommissionBaseSalaryColumn.setCellValueFactory(new PropertyValueFactory<>("baseSalary"));

        //initialize employee commission base salary table.
        employeeCommissionBaseBirthColumn.setCellValueFactory(new PropertyValueFactory<>("birthDate"));
        employeeCommissionBaseStartDateColumn.setCellValueFactory(new PropertyValueFactory<>("startDate"));
        employeeCommissionBaseEndDateColumn.setCellValueFactory(new PropertyValueFactory<>("endDate"));
        employeeCommissionBaseStatusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));
        employeeCommissionBaseDepartmentColumn.setCellValueFactory(new PropertyValueFactory<>("department"));
        employeeCommissionBaseEarningColumn.setCellValueFactory(new PropertyValueFactory<>("earning"));
        employeeCommissionBaseFamilyColumn.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        employeeCommissionBaseIdColumn.setCellValueFactory(new PropertyValueFactory<>("ID"));
        employeeCommissionBaseNameColumn.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        employeeCommissionBaseNationalColumn.setCellValueFactory(new PropertyValueFactory<>("nationalID"));
        employeeCommissionBaseNumberOfSalesColumn.setCellValueFactory(new PropertyValueFactory<>("numberOfSales"));
        employeeCommissionBasePhoneColumn.setCellValueFactory(new PropertyValueFactory<>("phoneNumber"));
        employeeCommissionBaseRateColumn.setCellValueFactory(new PropertyValueFactory<>("commissionRate"));
        employeeCommissionBaseSalaryColumn.setCellValueFactory(new PropertyValueFactory<>("baseSalary"));
    }

    @FXML
    void onBackButton(ActionEvent event) throws IOException {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confirmation");
        alert.setContentText("Are you sure you want to go back?");
        alert.showAndWait();
        if(alert.getResult().equals(ButtonType.OK)){
            Stage stage;
            Scene scene;
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("MainScene.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(fxmlLoader.load());
            stage.setScene(scene);
            stage.setResizable(false);
            stage.centerOnScreen();
            stage.show();
        }
    }


    //methods for reading from file.
    private void baseSalaryReadFromFile() {

        if(baseSalariedFile.isFile()) {
            try {
                ObjectInputStream ois;
                ois = new ObjectInputStream(new FileInputStream(baseSalariedFile));
                baseSalariedArrayList = (ArrayList<BaseSalariedEmployee>) ois.readObject();
                for (BaseSalariedEmployee emp : baseSalariedArrayList) {
                    if (!emp.isManager() && !emp.isActive() && !employeeBaseSalariedArrayList.contains(emp)) {
                        employeeBaseSalariedArrayList.add(emp);
                    } else if (emp.isManager() && !emp.isActive() && !employeeBaseSalariedArrayList.contains(emp) ) {
                        managerBaseSalariedArraylist.add(emp);
                    }
                }
                ois.close();
            } catch (IOException | ClassNotFoundException e) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Nothing to show !");
                alert.setContentText("There is no base Salaried Employee in this department ...");
                alert.showAndWait();
            }
        }
    }

    private void hourlySalaryReadFromFile(){
        if(hourlySalaryFile.isFile()) {
            try {
                ObjectInputStream ois;
                ois = new ObjectInputStream(new FileInputStream(hourlySalaryFile));
                hourlySalariedArrayList = (ArrayList<HourlySalariedEmployee>) ois.readObject();
                for (HourlySalariedEmployee emp : hourlySalariedArrayList) {
                    if (!emp.isManager() && !emp.isActive() && !employeeHourlySalariedArrayList.contains(emp)) {
                        employeeHourlySalariedArrayList.add(emp);
                    } else if (emp.isManager() && !emp.isActive() && !employeeHourlySalariedArrayList.contains(emp)) {
                        managerHourlySalariedArraylist.add(emp);
                    }
                }
                ois.close();
            } catch (IOException | ClassNotFoundException e) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Nothing to show !");
                alert.setContentText("There is no hourly Salaried Employee in this department ...");
                alert.showAndWait();
            }
        }
    }

    private void commissionSalaryReadFromFile(){
        if(commissionSalaryFile.isFile()) {
            try {
                ObjectInputStream ois;
                ois = new ObjectInputStream(new FileInputStream(commissionSalaryFile));
                commissionSalariedArrayList = (ArrayList<CommissionSalariedEmployee>) ois.readObject();
                for (CommissionSalariedEmployee emp : commissionSalariedArrayList) {
                    if (!emp.isManager() && !emp.isActive() && !employeeCommissionSalariedArrayList.contains(emp)) {
                        employeeCommissionSalariedArrayList.add(emp);
                    } else if(emp.isManager() && !emp.isActive() && !employeeCommissionSalariedArrayList.contains(emp)){
                        managerCommissionSalariedArrayList.add(emp);
                    }
                }
                ois.close();
            } catch (IOException | ClassNotFoundException e) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Nothing to show !");
                alert.setContentText("There is no commission Salaried Employee in this department ...");
                alert.showAndWait();
            }
        }
    }

    private void commissionBaseSalaryReadFromFile(){
        if(commissionBaseSalaryFile.isFile()) {
            try {
                ObjectInputStream ois;
                ois = new ObjectInputStream(new FileInputStream(commissionBaseSalaryFile));
                commissionBaseSalariedArrayList = (ArrayList<CommissionBaseSalariedEmployee>) ois.readObject();
                for (CommissionBaseSalariedEmployee emp : commissionBaseSalariedArrayList) {
                    if (!emp.isManager() && !emp.isActive() && !employeeCommissionBaseSalariedArrayList.contains(emp)) {
                        employeeCommissionBaseSalariedArrayList.add(emp);
                    } else if(emp.isManager() && !emp.isActive() && !employeeCommissionBaseSalariedArrayList.contains(emp)){
                        managerCommissionBaseSalariedArraylist.add(emp);
                    }
                }
                ois.close();
            } catch (IOException | ClassNotFoundException e) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Nothing to show !");
                alert.setContentText("There is no Commission Base Salaried Employee in this department ...");
                alert.showAndWait();
            }
        }
    }

}
