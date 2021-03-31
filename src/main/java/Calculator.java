
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.UIManager;
import java.awt.FlowLayout;
import javax.swing.JPanel;


public class Calculator extends JFrame {
  

    public Calculator() throws Exception {
        super("Calculadora");

        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350, 350);
        setLocation(400, 200);
        setLayout(new BorderLayout());
        
        
        
          TextPanel textPanel = new TextPanel();
           
          
        JPanel digitePanel = new JPanel();
        digitePanel.setLayout (new BorderLayout());
        add(BorderLayout.CENTER, digitePanel);
        digitePanel.add(BorderLayout.CENTER, new NumbersPanel(textPanel.getTxtNumber()));
        digitePanel.add(BorderLayout.EAST, new OperationsPanel(textPanel.getTxtNumber()));
        
        
      
        add (BorderLayout.NORTH,textPanel);

        setVisible(true);
    }

    public static void main(String[] args) throws Exception {
        new Calculator();

    }

}
