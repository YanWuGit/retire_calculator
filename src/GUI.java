import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;
import javax.swing.*;

public class GUI extends JFrame implements ActionListener {
    private JTextArea outputDisplay;
    private JTextField personName;
    private JTextField sexuality;
    private JTextField age;
    private JTextField retiringAge;
    private JTextField annualSpend;
    private JButton runButton;


    public GUI(){
        buildGUI();
        setTitle("Retirement Calculator");
        pack();
        setVisible(true);
    }



    public void buildGUI(){
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        outputDisplay = new JTextArea(1,1);
        personName = new JTextField((20));
        sexuality = new JTextField((1));
        age = new JTextField((3));
        retiringAge = new JTextField((3));
        annualSpend = new JTextField((11));
        runButton = new JButton("Calculate!");
        runButton.addActionListener(this);

        //input section
        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Name:"));
        inputPanel.add(personName);
        inputPanel.add(new JLabel("Sexuality: (M/F)"));
        inputPanel.add(sexuality);
        inputPanel.add(new JLabel("Age:"));
        inputPanel.add(age);
        inputPanel.add(new JLabel("Retiring Age:"));
        inputPanel.add(retiringAge);
        inputPanel.add(new JLabel("Annual living expense:"));
        inputPanel.add(annualSpend);
        inputPanel.add(runButton);

        // box layout
        inputPanel.setLayout(new BoxLayout(inputPanel, BoxLayout.Y_AXIS));

        // add sections to pane
        contentPane.add("Center", inputPanel);
        contentPane.add("South", outputDisplay);

    }

    public void actionPerformed(ActionEvent e){

        // get inputs
        String inPersonName = personName.getText();
        String inSexuality = sexuality.getText();
        int inAge = Integer.parseInt(age.getText());
        int inRetiringAge = Integer.parseInt(retiringAge.getText());
        Double inAnnualSpend = Double.parseDouble(annualSpend.getText());

        // calculate how much money is needed for retirement
        Profile profile = new Profile(inPersonName, inSexuality, inAge, inRetiringAge, inAnnualSpend);
        int wealthGoal = (int)Math.round(TotalMoneyRequired.genWealthGoalForOne(profile));

        // display
        outputDisplay.append(String.valueOf(wealthGoal));
    }

}
