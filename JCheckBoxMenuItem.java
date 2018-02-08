import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import javax.swing.BorderFactory;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;




public class CheckBoxMenuItem extends JFrame{
	private JLabel statusbar;
	
	public CheckBoxMenuItem()
	{
		initUI();
	}
	
	private void initUI()
	{
		createMenuBar();
		statusbar = new JLabel("Ready");
		statusbar.setBorder(BorderFactory.createEtchedBorder());
		add(statusbar, BorderLayout.SOUTH);
		
		setTitle("JCheckBoxMenuItem");
		setSize(360,250);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);	
	}
	
	private void createMenuBar()
	{
		JMenuBar menubar = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		fileMenu.setMnemonic(KeyEvent.VK_F);
		
		JMenu viewMenu = new JMenu("VIEW");
		viewMenu.setMnemonic(KeyEvent.VK_V);
	
		JCheckBoxMenuItem sbarMi = new JCheckBoxMenuItem("Show statusbar");
		sbarMi.setMnemonic(KeyEvent.VK_S);
		sbarMi.setDisplayedMnemonicIndex(5);
		sbarMi.setSelected(true);
		
		sbarMi.addItemListener((ItemEvent e)->{
			if(e.getStateChange() == ItemEvent.SELECTED) {
				statusbar.setVisible(true);
			}
			else
			{
				statusbar.setVisible(false);
			}
		});
		
		viewMenu.add(sbarMi);
		menubar.add(fileMenu);
		menubar.add(menubar);
	}
	
	public static void main(String[] args)
	{
		EventQueue.invokeLater(()->{
			CheckBoxMenuItem ex = new CheckBoxMenuItem();
			ex.setVisible(true);
		});
	}
}