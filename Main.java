import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main implements Runnable, ActionListener{

  // Class Variables  
  JPanel mainPanel;
  
  JLabel firstLabel; 
  JLabel secondLabel; 
  JLabel thirdLabel; 

  JTextField firstInput;
  JTextField secondInput;

  JTextArea resultArea; 

  JButton addButton; 
  JButton subtractButton;
  JButton multButton;
  JButton divButton;


  // Method to assemble our GUI
  public void run(){
    // Creats a JFrame that is 800 pixels by 600 pixels, and closes when you click on the X
    JFrame frame = new JFrame("Title");
    // Makes the X button close the program
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // makes the windows 800 pixel wide by 600 pixels tall
    frame.setSize(800,600);
    // shows the window
    frame.setVisible(true); 

    //intalize the main JPanel 
    mainPanel = new JPanel(); 

    //disable any layout helpers 
    mainPanel.setLayout(null); 

    //create side labels 
    firstLabel = new JLabel("First number"); 
    secondLabel = new JLabel("Second number"); 
    thirdLabel = new JLabel("Result"); 

    //set location and size 
    firstLabel.setBounds(10,10,150,20);    
    secondLabel.setBounds(10,40,150,20); 
    thirdLabel.setBounds(10,70,150,20); 

    //intalize the input text field 
    firstInput = new JTextField(); 
    secondInput = new JTextField(); 
    
    //set location and size 
    firstInput.setBounds(220,10,150,20); 
    secondInput.setBounds(220,40,150,20); 

    //intalize the buttons 
    addButton = new JButton("Add"); 
    subtractButton = new JButton("Sub"); 
    multButton = new JButton("Mult"); 
    divButton = new JButton("Div"); 

    //set location and size 
    addButton.setBounds(150,100,70,25);
    subtractButton.setBounds(210,100,70,25);
    multButton.setBounds(270,100,70,25);
    divButton.setBounds(330,100,70,25);
    
    //add an action listener to the buttons
    addButton.addActionListener(this); 
    subtractButton.addActionListener(this); 
    multButton.addActionListener(this); 
    divButton.addActionListener(this); 

    //set the action command to the buttons
    addButton.setActionCommand("add"); 
    subtractButton.setActionCommand("subtract"); 
    multButton.setActionCommand("multiply"); 
    divButton.setActionCommand("divide"); 

    //add text area  
    resultArea = new JTextArea(); 
    
    //set the location and size of the text areas
    resultArea.setBounds(220,70,150,20); 

    //add to main panel
    mainPanel.add(resultArea);

    //disable text area so user cannot type in them 
    resultArea.setEnabled(false); 

    //add the buttons to the panel 
    mainPanel.add(addButton); 
    mainPanel.add(subtractButton); 
    mainPanel.add(multButton); 
    mainPanel.add(divButton); 

    //add the text fields to the panel 
    mainPanel.add(firstInput); 
    mainPanel.add(secondInput);

    //add the labels to the panel 
    mainPanel.add(firstLabel); 
    mainPanel.add(secondLabel); 
    mainPanel.add(thirdLabel); 

    //add the panel to the window 
    frame.add(mainPanel); 

  }

  // method called when a button is pressed
  public void actionPerformed(ActionEvent e){
    // get the command from the action
    String command = e.getActionCommand();

    //get the command from the action 
    String command = e.getActionCommand();

     
    if(command.equals("add")){
      //get the text from each box 
      String firstText = firstInput.getText();String secondText = secondInput.getText();

      //change the string into an integer
      int numberOne = Integer.parseInt(firstText);
      int numberTwo = Integer.parseInt(secondText);  
    }

  }

  // Main method to start our program
  public static void main(String[] args){
    // Creates an instance of our program
    Main gui = new Main();
    // Lets the computer know to start it in the event thread
    SwingUtilities.invokeLater(gui);
  }
}
