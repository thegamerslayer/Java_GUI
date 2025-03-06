import javax.swing.*;

public class GUI {
    public static void main(String[] args) {
        JFrame frame=new JFrame("First Java Frame");
        frame.setSize(400,400);//setting height and width
        frame.setLayout(null);
        frame.setVisible(true);
/*
        //adding label
        JLabel label=new JLabel("Click the button");
        label.setBounds(120,80,100,30);

        //adding the label to the frame
        frame.add(label);

        //for create button
        JButton button=new JButton(new ImageIcon("C:\\Users\\deban\\Downloads\\12023054006106.jpg"));
        button.setBounds(120,100,150,100);

        //now add the button to the frame
        frame.add(button);

*/
        //adding text field
        JTextField textField=new JTextField();
        textField.setBounds(100,100,100,30);

        //adding text field to the frame
        frame.add(textField);


        //setting password field
        JPasswordField passwordField=new JPasswordField();
        passwordField.setBounds(100,150,100,30);

        //adding password field to the frame
        frame.add(passwordField);

        //creating text area
        JTextArea textArea=new JTextArea();
        textArea.setBounds(100,200,100,60);

        //adding text area to the frame
        frame.add(textArea);
    }
}
