import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//
//* This is the public class, where program execution begins
//* ************************************************ 
public class helloWorld {

public static void main(String[] args)
{
JFrame helloWindow = new EgWindow2(); //Create a window
helloWindow.show(); //Display it
}

} 
//
//* This is the definition of the window, which extends JFrame
//* **************************************************
class EgWindow2 extends JFrame
{

//
//* The constructor for EgWindow2
//* ***************************
public EgWindow2()
{
setTitle("Example 2");
setSize(150,120);
//
//* Get a pointer to the content pane, create a label
//* and add it to the content pane
//* *****************************************
Container MyContentFrame = getContentPane();
JLabel HelloWorld=new JLabel("Hello World!");
MyContentFrame.add(HelloWorld);
//
//* An inner class is defined as the window listener
//* It is only interested in the windowClosing event,
//* which will shut down the program
//* *****************************************
addWindowListener(new WindowAdapter() {
public void windowClosing(WindowEvent e)
{
System.exit(0);
}
});
}

}

