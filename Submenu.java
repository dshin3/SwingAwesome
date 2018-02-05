import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;




public class Submenu extends JFrame
{
	public Submenu()
	{
		initUI();
	}
	
	private void initUI()
	{
		createMenuBar();
		setTitle("Submenu");
		setSize(360,250);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	private void createMenuBar()
	{
		JMenuBar menubar = new JMenuBar();
		ImageIcon iconNew = new ImageIcon("new.png");
		ImageIcon iconOpen = new ImageIcon("open.png");
		ImageIcon iconSave = new ImageIcon("save.png");
		ImageIcon iconTime = new ImageIcon("time.png");
		ImageIcon iconExit = new ImageIcon("exit.png");
		
		
		JMenu fileMenu = new JMenu("File");
		JMenu impMenu = new JMenu("Import");
		
		
		
		JMenuItem newsfMi = new JMenuItem("import newsfeed list...");
		JMenuItem bookmMi = new JMenuItem("Import bookmarks...");
		JMenuItem mailMi = new JMenuItem("Import mail...");
		JMenuItem appleMi = new JMenuItem("Import apples...");
		
		//These are submenu options.
		impMenu.add(newsfMi);
		impMenu.addSeparator();
		impMenu.add(bookmMi);
		impMenu.addSeparator();
		impMenu.add(mailMi);
		impMenu.addSeparator();
		impMenu.add(appleMi);
		
		//This is main menu options.
		JMenuItem newMi = new JMenuItem("New", iconNew);
		JMenuItem openMi = new JMenuItem("Open", iconOpen);
		JMenuItem timeMi = new JMenuItem("Show current time",iconTime);
		JMenuItem saveMi = new JMenuItem("Save", iconSave);
		
		
		JMenuItem exitMi = new JMenuItem("Exit", iconExit);
		exitMi.setToolTipText("Exit application");
		
		//This exits the application.
		exitMi.addActionListener((ActionEvent event)->{
			System.exit(0);
		});
		//End
		
		//This shows current time.
		timeMi.addActionListener((ActionEvent event)->{
			System.out.println(System.currentTimeMillis());
		});
		
		fileMenu.add(newMi);
		fileMenu.addSeparator();
		fileMenu.add(openMi);
		fileMenu.addSeparator();
		fileMenu.add(saveMi);
		fileMenu.addSeparator();
		fileMenu.add(impMenu);
		fileMenu.addSeparator();
		fileMenu.add(timeMi);
		fileMenu.addSeparator();
		fileMenu.add(exitMi);
		
		menubar.add(fileMenu);
		setJMenuBar(menubar);
	
	}
		
	public static void main(String[] args)
	{
		EventQueue.invokeLater(()-> {
				Submenu ex = new Submenu();
				ex.setVisible(true);
			});
	}

}