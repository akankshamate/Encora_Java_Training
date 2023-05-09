package Employee.Controller;

import Employee.EmployeeDTO;
import Employee.View.EmployeeFrame;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmployeeHandler implements ActionListener {
    EmployeeFrame ef;
    public EmployeeHandler(EmployeeFrame employeeFrame){
        ef=employeeFrame;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
      String action=e.getActionCommand().toLowerCase();
      EmployeeDTO dto=getEmployeeData(ef);
      switch(action){
          case "save":
              saveOrUpdate(dto);
              break;
          case "search":
              saveOrUpdate(dto);
              break;
          case "update":
              saveOrUpdate(dto);
              break;
          case "delete":
              saveOrUpdate(dto);
              break;
      }
    }
    public void saveOrUpdate(EmployeeDTO dto){

    }
    public EmployeeDTO getEmployeeData(EmployeeFrame ef){

        EmployeeDTO empDTO=new EmployeeDTO();
        empDTO.setEmpId(Integer.parseInt(ef.getEmployeeIdTxt().getText()));
        empDTO.setEmpName(ef.getEmployeeNameTxt().getText());
        empDTO.setGender(ef.getGenderGroup().getSelectedCheckbox().getLabel());
        empDTO.setPf(ef.getPfOption().getState());
        empDTO.setGraduity(ef.getGraduityOption().getState());
        empDTO.setNps(ef.getNpsOption().getState());
        empDTO.setMealCard(ef.getMealCardOption().getState());
        empDTO.setMediClaim(ef.getMediclaimOption().getState());
        empDTO.setOfcLocation(ef.getOfficeLocation().getSelectedItem());

        return empDTO;

    }
}
