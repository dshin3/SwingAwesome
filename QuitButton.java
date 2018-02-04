import java.awt.Container;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;



public class QuitButton extends JFrame
{
	public QuitButton()
	{
		initUI();
	}
	
	private void initUI()
	{
		//Create button component. This constructor takes a string label as a parameter.
		JButton quitButton = new JButton("Quit");
		//Once quit button is clicked, the window is exited.
		quitButton.addActionListener((ActionEvent event)->{
			System.exit(0);
		});
		
		//Plug an action listener to the button.
		createLayout(quitButton);
		setTitle("Quit button");
		setSize(300,200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private void createLayout(JComponent... arg) {
		//Child components need to be placed into containers.
		Container pane = getContentPane();
		GroupLayout gl = new GroupLayout(pane);
		pane.setLayout(gl);
		
		//Layout managers. The child components are placed here.
		//The children are organized by specialized non-visible components called layout managers.
		gl.setAutoCreateContainerGaps(true);
		
		//These create gaps between components and the edges of the container.
		gl.setHorizontalGroup(gl.createSequentialGroup().addComponent(arg[0]));
		gl.setVerticalGroup(gl.createSequentialGroup().addComponent(arg[0]));
	}
	
	
	public static void main(String[] args)
	{
		EventQueue.invokeLater(() -> {
			QuitButton ex = new QuitButton();
			ex.setVisible(true);
		});
	}
}

