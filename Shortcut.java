import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import static javax.swing.Action.MNEMONIC_KEY;
import static javax.swing.Action.SMALL_ICON;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;





public class Shortcut extends JFrame
{
	public Shortcut()
	{
		initUI();
	}
	
	private void initUI()
	{
		createMenuBar();
		setTitle("Mnemonics and accelerator");
		setSize(360, 250);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	private void createMenuBar()
	{
		JMenuBar menubar = new JMenuBar();
		
		ImageIcon iconNew = new ImageIcon("new.png");
		ImageIcon iconOpen = new ImageIcon("open.png");
		ImageIcon iconSave = new ImageIcon("save.png");
		ImageIcon iconExit = new ImageIcon("exit.png");
		
		JMenu fileMenu = new JMenu("File");
		fileMenu.setMnemonic(KeyEvent.VK_F);
		
		JMenuItem newMi = new JMenuItem(new MenuItemAction("New", iconNew, KeyEvent.VK_N));
		JMenuItem openMi = new JMenuItem(new MenuItemAction("Open", iconOpen, KeyEvent.VK_O));
		
		JMenuItem saveMi = new JMenuItem(new MenuItemAction("Save", iconSave, KeyEvent.VK_S));
		
		JMenuItem exitMi = new JMenuItem("Exit", iconExit);
		
		exitMi.setMnemonic(KeyEvent.VK_E);
		exitMi.setToolTipText("Exit application");
		exitMi.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, ActionEvent.CTRL_MASK));
		
		exitMi.addActionListener((ActionEvent event)-> {
			System.exit(0);
		});
	
		
		
		//Adding in fileMenu
		fileMenu.add(newMi);
		fileMenu.add(openMi);
		fileMenu.add(saveMi);
		fileMenu.addSeparator();
		fileMenu.add(exitMi);
		
		menubar.add(fileMenu);
		setJMenuBar(menubar);
	}
	
	//abstract action
	private class MenuItemAction extends AbstractAction{
		
		public MenuItemAction(String text, ImageIcon icon, Integer mnemonic)
		{
			super(text);
			putValue(SMALL_ICON, icon);
			putValue(MNEMONIC_KEY, mnemonic);
			
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println(e.getActionCommand());
		}
	}
	
	public static void main(String[] args)
	{
		EventQueue.invokeLater(()->{
			Shortcut ex = new Shortcut();
			ex.setVisible(true);
		});
	}
}
