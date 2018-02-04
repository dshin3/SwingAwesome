import java.awt.EventQueue;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;




public class ToolTip extends JFrame
{
	public ToolTip()
	{
		initUI();
	}

	
	private void initUI()
	{
		JButton coolButton = new JButton("Cool Button");
		coolButton.setToolTipText("A button component");
		
		//Publish the button.
		createLayout(coolButton);
		
		setTitle("Tooltip");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	private void createLayout(JComponent... arg)
	{
		JPanel pane = (JPanel) getContentPane();
		GroupLayout gl = new GroupLayout(pane);
		pane.setLayout(gl);
		//Content pane is an instance of JPanel component
		//getContentPane() method returns a Container type.
		pane.setToolTipText("Content pane");
		
		//A tooltip is set for the content pane.
		gl.setAutoCreateContainerGaps(true);
		//width of window
		gl.setHorizontalGroup(gl.createSequentialGroup()
				.addComponent(arg[0])
				.addGap(200)
				);
		//height of window
		gl.setVerticalGroup(gl.createSequentialGroup()
				.addComponent(arg[0])
				.addGap(300)
				);
	
		//Sizes the frame so that all its contents are at or above their preferred sizes.
		//Without pack(), the window will be completely minimized with
		//no button visible. It is needed to have a sufficiently opened window.
		pack();
	}
	
	public static void main(String[] args)
	{
		EventQueue.invokeLater(()->{
			ToolTip ex = new ToolTip();
			ex.setVisible(true);
		});
	}

}