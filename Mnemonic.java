import java.awt.Container;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;



public class Mnemonic extends JFrame
{
	//Mnemonic is to have a keyboard shortcut.
	public Mnemonic()
	{
		initUI();
	}
	
	
	private void initUI()
	{
		JButton smallButton = new JButton("Button");
		//Button pressed and the "Button pressed" is outputted.
		smallButton.addActionListener((ActionEvent ae)->{
			System.out.println("Button pressed");
		});
		
		//This mnemonic for this button.
		//This key is specified with a virtual keycode from the 
		//KeyEvent class.
		//The mnemonic is combined with the look and feel of mouse.
		
		smallButton.setMnemonic(KeyEvent.VK_B);
		createLayout(smallButton);
	
		//Set the window.
	
		setTitle("Mnemonics");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private void createLayout(JComponent... arg)
	{
		Container pane = getContentPane();
		GroupLayout gl = new GroupLayout(pane);
		pane.setLayout(gl);
		
		gl.setAutoCreateContainerGaps(true);
		
		gl.setHorizontalGroup(gl.createSequentialGroup()
				.addComponent(arg[0])
				.addGap(200)
				);
		gl.setVerticalGroup(gl.createParallelGroup()
				.addComponent(arg[0])
				.addGap(200)
				);
				
		pack();
	}

	
	public static void main(String[] args)
	{
		EventQueue.invokeLater(()-> {
			Mnemonic ex = new Mnemonic();
			ex.setVisible(true);
		});
	}

}