package Employee.View;

import Employee.Controller.EmployeeHandler;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class EmployeeFrame extends Frame {
    private Label employeeIdLbl;
    private TextField employeeIdTxt;
    private Label employeeNameLbl;
    private TextField employeeNameTxt;
    private Label employeeGenderLbl;
    private Checkbox maleOption;
    private Checkbox femaleOption;
    private Checkbox otherOption;
    private Label employeePerkLbl;
    private Checkbox pfOption;
    private Checkbox graduityOption;
    private Checkbox mealCardOption;
    private Checkbox npsOption;
    private Checkbox mediclaimOption;
    private CheckboxGroup genderGroup;
    private Choice officeLocation;
    private Label locationLbl;
    private Button saveButton;
    private Button searchButton;
    private Button updateButton;
    private Button deleteButton;
    private Button firstButton;
    private Button nextButton;
    private Button previousButton;
    private Button lastButton;
    public EmployeeFrame(){
        setBounds(50,50,800,500);
        setTitle("Employee Information");
        setVisible(true);
        setLayout(null);
        genderGroup=new CheckboxGroup();
        employeeIdLbl=new Label("Employee ID");
        employeeIdLbl.setBounds(20,50,100,20);
        add(employeeIdLbl);

        employeeIdTxt=new TextField();
        employeeIdTxt.setBounds(140,50,100,20);
        add(employeeIdTxt);

        employeeNameLbl=new Label("Employee Name");
        employeeNameLbl.setBounds(20,90,100,20);
        add(employeeNameLbl);

        employeeNameTxt=new TextField();
        employeeNameTxt.setBounds(140,90,100,20);
        add(employeeNameTxt);

        employeeGenderLbl=new Label("Employee Gender");
        employeeGenderLbl.setBounds(20,130,150,20);
        add(employeeGenderLbl);

        maleOption=new Checkbox("Male",false,genderGroup);
        maleOption.setBounds(190,130,80,20);
        add(maleOption);

        femaleOption=new Checkbox("Female",true,genderGroup);
        femaleOption.setBounds(290,130,80,20);
        add(femaleOption);

        otherOption=new Checkbox("Other",false,genderGroup);
        otherOption.setBounds(390,130,80,20);
        add(otherOption);

        employeePerkLbl = new Label("Employee Perks");
        employeePerkLbl.setBounds(20,170,100,20);
        add(employeePerkLbl);

        pfOption=new Checkbox("PF");
        pfOption.setBounds(140,170,60,20);
        add(pfOption);

        graduityOption =new Checkbox("Graduity");
        graduityOption.setBounds(220,170,120,20);
        add(graduityOption);

        mealCardOption=new Checkbox("Meal Card");
        mealCardOption.setBounds(360,170,140,20);
        add(mealCardOption);

        npsOption =new Checkbox("NPS");
        npsOption.setBounds(520,170,60,20);
        add(npsOption);

        mediclaimOption=new Checkbox("MediClaim");
        mediclaimOption.setBounds(600,170,140,20);
        add(mediclaimOption);

        locationLbl=new Label("Location");
        locationLbl.setBounds(20,210,100,20);
        add(locationLbl);

        officeLocation =new Choice();
        officeLocation.setBounds(140,210,100,20);
        officeLocation.add("Pune");
        officeLocation.add("Hydrabad");
        officeLocation.add("Banglore");
        officeLocation.add("Hubali");
        officeLocation.add("Chennai");
        add(officeLocation);

        saveButton=new Button("Save");
        saveButton.setBounds(20,250,100,30);
        add(saveButton);
        saveButton.addActionListener(new EmployeeHandler(this));

        searchButton=new Button("Search");
        searchButton.setBounds(140,250,100,30);
        add(searchButton);
        searchButton.addActionListener((new EmployeeHandler(this)));

        updateButton=new Button("Update");
        updateButton.setBounds(260,250,100,30);
        add(updateButton);
        updateButton.addActionListener((new EmployeeHandler(this)));

        deleteButton=new Button("Delete");
        deleteButton.setBounds(380,250,100,30);
        add(deleteButton);
        deleteButton.addActionListener((new EmployeeHandler(this)));

        firstButton=new Button("First");
        firstButton.setBounds(20,300,100,30);
        add(firstButton);
        firstButton.addActionListener((new EmployeeHandler(this)));

        nextButton=new Button("Next");
        nextButton.setBounds(140,300,100,30);
        add(nextButton);
        nextButton.addActionListener((new EmployeeHandler(this)));

        previousButton=new Button("Prev");
        previousButton.setBounds(260,300,100,30);
        add(previousButton);
        previousButton.addActionListener((new EmployeeHandler(this)));

        lastButton=new Button("First");
        lastButton.setBounds(380,300,100,30);
        add(lastButton);
        lastButton.addActionListener((new EmployeeHandler(this)));

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                EmployeeFrame ef=(EmployeeFrame)e.getSource();
                ef.dispose();
            }
        });
    }

    public Label getEmployeeIdLbl() {
        return employeeIdLbl;
    }

    public void setEmployeeIdLbl(Label employeeIdLbl) {
        this.employeeIdLbl = employeeIdLbl;
    }

    public TextField getEmployeeIdTxt() {
        return employeeIdTxt;
    }

    public void setEmployeeIdTxt(TextField employeeIdTxt) {
        this.employeeIdTxt = employeeIdTxt;
    }

    public Label getEmployeeNameLbl() {
        return employeeNameLbl;
    }

    public void setEmployeeNameLbl(Label employeeNameLbl) {
        this.employeeNameLbl = employeeNameLbl;
    }

    public TextField getEmployeeNameTxt() {
        return employeeNameTxt;
    }

    public void setEmployeeNameTxt(TextField employeeNameTxt) {
        this.employeeNameTxt = employeeNameTxt;
    }

    public Label getEmployeeGenderLbl() {
        return employeeGenderLbl;
    }

    public void setEmployeeGenderLbl(Label employeeGenderLbl) {
        this.employeeGenderLbl = employeeGenderLbl;
    }

    public Checkbox getMaleOption() {
        return maleOption;
    }

    public void setMaleOption(Checkbox maleOption) {
        this.maleOption = maleOption;
    }

    public Checkbox getFemaleOption() {
        return femaleOption;
    }

    public void setFemaleOption(Checkbox femaleOption) {
        this.femaleOption = femaleOption;
    }

    public Checkbox getOtherOption() {
        return otherOption;
    }

    public void setOtherOption(Checkbox otherOption) {
        this.otherOption = otherOption;
    }

    public Label getEmployeePerkLbl() {
        return employeePerkLbl;
    }

    public void setEmployeePerkLbl(Label employeePerkLbl) {
        this.employeePerkLbl = employeePerkLbl;
    }

    public Checkbox getPfOption() {
        return pfOption;
    }

    public void setPfOption(Checkbox pfOption) {
        this.pfOption = pfOption;
    }

    public Checkbox getGraduityOption() {
        return graduityOption;
    }

    public void setGraduityOption(Checkbox graduityOption) {
        this.graduityOption = graduityOption;
    }

    public Checkbox getMealCardOption() {
        return mealCardOption;
    }

    public void setMealCardOption(Checkbox mealCardOption) {
        this.mealCardOption = mealCardOption;
    }

    public Checkbox getNpsOption() {
        return npsOption;
    }

    public void setNpsOption(Checkbox npsOption) {
        this.npsOption = npsOption;
    }

    public Checkbox getMediclaimOption() {
        return mediclaimOption;
    }

    public void setMediclaimOption(Checkbox mediclaimOption) {
        this.mediclaimOption = mediclaimOption;
    }

    public CheckboxGroup getGenderGroup() {
        return genderGroup;
    }

    public void setGenderGroup(CheckboxGroup genderGroup) {
        this.genderGroup = genderGroup;
    }

    public Choice getOfficeLocation() {
        return officeLocation;
    }

    public void setOfficeLocation(Choice officeLocation) {
        this.officeLocation = officeLocation;
    }

    public Label getLocationLbl() {
        return locationLbl;
    }

    public void setLocationLbl(Label locationLbl) {
        this.locationLbl = locationLbl;
    }

    public Button getSaveButton() {
        return saveButton;
    }

    public void setSaveButton(Button saveButton) {
        this.saveButton = saveButton;
    }

    public Button getSearchButton() {
        return searchButton;
    }

    public void setSearchButton(Button searchButton) {
        this.searchButton = searchButton;
    }

    public Button getUpdateButton() {
        return updateButton;
    }

    public void setUpdateButton(Button updateButton) {
        this.updateButton = updateButton;
    }
}

