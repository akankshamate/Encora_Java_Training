import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JugglerHandler implements ActionListener {
    JugglerFrame jf;
    int num1;
    int num2;
    int num3;

    public JugglerHandler(JugglerFrame jugglerFrame){
        this.jf=jugglerFrame;
        num1= Integer.parseInt(jf.firstTxtBox.getText());
        num2= Integer.parseInt(jf.secondTxtBox.getText());
        num3= Integer.parseInt(jf.thirdTxtBox.getText());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equalsIgnoreCase("clock-wise")){
            num1=num1+1;
            num2=num2+1;
            num3=num3+1;
            jf.tempTxtBox.setText(String.valueOf(num1));
            jf.firstTxtBox.setText(String.valueOf(num3));
            jf.secondTxtBox.setText(jf.tempTxtBox.getText());
            jf.thirdTxtBox.setText(String.valueOf(num2));

        }else if(e.getActionCommand().equalsIgnoreCase("anti clock wise")){
            num1=num1-1;
            num2=num2-1;
            num3=num3-1;
            jf.tempTxtBox.setText(String.valueOf(num1));
            jf.firstTxtBox.setText(String.valueOf(num2));
            jf.secondTxtBox.setText(String.valueOf(num3));
            jf.thirdTxtBox.setText(jf.tempTxtBox.getText());

        }
    }
}
