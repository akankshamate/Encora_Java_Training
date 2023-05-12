import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class JugglerFrame extends Frame {
    public TextField firstTxtBox;
    public TextField secondTxtBox;
    public TextField thirdTxtBox;
    public TextField tempTxtBox;
    public Button clockwiseButton;
    public Button antiClockWiseButton;

    public JugglerFrame(){
        setBounds(100,100,500,450);
        setTitle("Juggler");
        setVisible(true);
        this.setLayout(null);

        firstTxtBox=new TextField();
        firstTxtBox.setBounds(20,40,80,30);
        add(firstTxtBox);

        secondTxtBox=new TextField();
        secondTxtBox.setBounds(150,40,80,30);
        add(secondTxtBox);

        thirdTxtBox=new TextField();
        thirdTxtBox.setBounds(80,100,80,30);
        add(thirdTxtBox);

        tempTxtBox=new TextField();
        tempTxtBox.setBounds(20,40,80,30);
        add(tempTxtBox);

        clockwiseButton=new Button("Clock-Wise");
        clockwiseButton.setBounds(20,160,80,30);
        add(clockwiseButton);
        clockwiseButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                buttonClicked("clockwise");
            }
        });

        antiClockWiseButton=new Button("Anti Clock Wise");
        antiClockWiseButton.setBounds(120,160,140,30);
        add(antiClockWiseButton);
        antiClockWiseButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Anti clock wise button clicked");
                buttonClicked("anticlockwise");
            }
        });

        //close Frame
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                JugglerFrame cf= (JugglerFrame) e.getSource();
                cf.dispose();
            }
        });
    }
    void buttonClicked(String action){
        if(action=="clockwise"){
            this.clockwiseButton.addActionListener(new JugglerHandler(this));
        }else if(action=="anticlockwise"){
            this.antiClockWiseButton.addActionListener(new JugglerHandler(this));
        }

    }

}
