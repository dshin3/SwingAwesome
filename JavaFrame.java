import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;



public class JavaFrame extends JFrame
{
	public JavaFrame()
	{
		initUI();
	}

	
	private void initUI()
	{
		//Create the icon, web.png.
		ImageIcon webIcon = new ImageIcon("a.png");
		setIconImage(webIcon.getImage());
		
		setTitle("Icon");
		setSize(300,200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args)
	{
		EventQueue.invokeLater(()-> {
			JavaFrame ex = new JavaFrame();
			ex.setVisible(true);
		});
	}
	
}