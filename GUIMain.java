
//Event queue
import java.awt.EventQueue;
import javax.swing.JFrame;


public class GUIMain extends JFrame {

	
    public GUIMain() {
        initUI();
    }

    private void initUI() {
        //Initializes the JFrame.
        setTitle("Simple example");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    
    
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            GUIMain obj = new GUIMain();
            obj.setVisible(true);
        });
    }


	
	
	
}
