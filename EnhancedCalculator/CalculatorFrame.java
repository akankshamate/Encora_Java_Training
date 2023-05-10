import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CalculatorFrame extends Frame {
    public TextField firstNumTxt;
    public TextField secondNumTxt;
    public  Label ansLbl;
    public CalculatorFrame(){
        setBounds(100,100,500,450);
        setTitle("My Calculator");
        setVisible(true);
        this.setLayout(null);

        Label firstNumLbl=new Label("First Number");
        firstNumLbl.setBounds(20,40,100,20);
        add(firstNumLbl);

        firstNumTxt=new TextField();
        firstNumTxt.setBounds(140,40,80,20);
        add(firstNumTxt);

        Label secondNumLbl=new Label("Second Number");
        secondNumLbl.setBounds(240,40,100,20);
        add(secondNumLbl);

        secondNumTxt=new TextField();
        secondNumTxt.setBounds(380,40,80,20);
        add(secondNumTxt);

        ansLbl=new Label();
        ansLbl.setBounds(20,80,220,20);
        add(ansLbl);

        Button addButton=new Button("Add");
        addButton.setBounds(20,140,80,30);
        add(addButton);
        addButton.addActionListener(new OperationHandler(this));

        Button subButton=new Button("Subtract");
        subButton.setBounds(120,140,80,30);
        add(subButton);
        subButton.addActionListener(new OperationHandler(this));

        Button multiplyButton=new Button("Multiply");
        multiplyButton.setBounds(220,140,80,30);
        add(multiplyButton);
        multiplyButton.addActionListener(new OperationHandler(this));

        Button divideButton=new Button("Divide");
        divideButton.setBounds(320,140,80,30);
        add(divideButton);
        divideButton.addActionListener(new OperationHandler(this));

        //close Frame
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                CalculatorFrame cf= (CalculatorFrame) e.getSource();
                cf.dispose();
            }
        });
    }


}
