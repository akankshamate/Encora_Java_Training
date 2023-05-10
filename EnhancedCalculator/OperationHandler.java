import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OperationHandler implements ActionListener {
   CalculatorFrame cf;

    public OperationHandler(CalculatorFrame calculatorFrame) {
        this.cf=calculatorFrame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int num1=  Integer.parseInt(cf.firstNumTxt.getText());
        int num2=  Integer.parseInt(cf.secondNumTxt.getText());
        if(e.getActionCommand().equalsIgnoreCase("add")){
          cf.ansLbl.setText("Addition is= "+(num1+num2));

        }else if(e.getActionCommand().equalsIgnoreCase("subtract")){
            cf.ansLbl.setText("Subtraction is= "+(num1-num2));

        }else if(e.getActionCommand().equalsIgnoreCase("multiply")){
            cf.ansLbl.setText("Multiplication is= "+(num1*num2));

        }else if(e.getActionCommand().equalsIgnoreCase("divide")){
            if(num2==0){
                cf.ansLbl.setText("A number can't divide by zero ");
            }
            cf.ansLbl.setText("Division is= "+(num1/num2));
        }
    }
}
