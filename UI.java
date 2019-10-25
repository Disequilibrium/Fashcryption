import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
/**
 * @author  Disequilibrium
 * @created October 18, 2019
 */
public class UI extends JFrame
{

	//jvider generated vars
	static UI theUI;

	JPanel pnPanel0;
	JTabbedPane tbpTabbedPane0;

	JPanel pnPanel6;

	JPanel pnPanel16;
	JTextArea taInputText;
	JLabel lbLabel3;
	JTextField tfKeyText;
	JButton btDecBtn;
	JButton btEncBtn;

	JPanel pnPanel21;
	JTextArea taOutputText;

	JPanel pnPanel7;
	JLabel lbLabel5;


	//my variables
	private Controller controller;

/**
 * UI Constructor
 */
public UI(Controller input)
{



    super( "Fashcryption 1.0" );
    
    //setting up the controller input
    this.controller = input;
    
    //jvider generated script start
    pnPanel0 = new JPanel();
    pnPanel0.setBorder( BorderFactory.createTitledBorder( "Fashcryption V1" ) );
    GridBagLayout gbPanel0 = new GridBagLayout();
    GridBagConstraints gbcPanel0 = new GridBagConstraints();
    pnPanel0.setLayout( gbPanel0 );

    tbpTabbedPane0 = new JTabbedPane( );

    pnPanel6 = new JPanel();
    GridBagLayout gbPanel6 = new GridBagLayout();
    GridBagConstraints gbcPanel6 = new GridBagConstraints();
    pnPanel6.setLayout( gbPanel6 );

    pnPanel16 = new JPanel();
    pnPanel16.setBorder( BorderFactory.createTitledBorder( "Input" ) );
    GridBagLayout gbPanel16 = new GridBagLayout();
    GridBagConstraints gbcPanel16 = new GridBagConstraints();
    pnPanel16.setLayout( gbPanel16 );

    taInputText = new JTextArea(2,10);
    JScrollPane scpInputText = new JScrollPane( taInputText );
    gbcPanel16.gridx = 0;
    gbcPanel16.gridy = 0;
    gbcPanel16.gridwidth = 13;
    gbcPanel16.gridheight = 4;
    gbcPanel16.fill = GridBagConstraints.BOTH;
    gbcPanel16.weightx = 1;
    gbcPanel16.weighty = 1;
    gbcPanel16.anchor = GridBagConstraints.NORTH;
    gbPanel16.setConstraints( scpInputText, gbcPanel16 );
    pnPanel16.add( scpInputText );

    lbLabel3 = new JLabel( "Key:"  );
    gbcPanel16.gridx = 0;
    gbcPanel16.gridy = 4;
    gbcPanel16.gridwidth = 3;
    gbcPanel16.gridheight = 2;
    gbcPanel16.fill = GridBagConstraints.BOTH;
    gbcPanel16.weightx = 1;
    gbcPanel16.weighty = 1;
    gbcPanel16.anchor = GridBagConstraints.NORTH;
    gbPanel16.setConstraints( lbLabel3, gbcPanel16 );
    pnPanel16.add( lbLabel3 );

    tfKeyText = new JTextField( );
    gbcPanel16.gridx = 3;
    gbcPanel16.gridy = 4;
    gbcPanel16.gridwidth = 10;
    gbcPanel16.gridheight = 2;
    gbcPanel16.fill = GridBagConstraints.BOTH;
    gbcPanel16.weightx = 1;
    gbcPanel16.weighty = 0;
    gbcPanel16.anchor = GridBagConstraints.NORTH;
    gbPanel16.setConstraints( tfKeyText, gbcPanel16 );
    pnPanel16.add( tfKeyText );
    gbcPanel6.gridx = 0;
    gbcPanel6.gridy = 0;
    gbcPanel6.gridwidth = 13;
    gbcPanel6.gridheight = 9;
    gbcPanel6.fill = GridBagConstraints.BOTH;
    gbcPanel6.weightx = 1;
    gbcPanel6.weighty = 0;
    gbcPanel6.anchor = GridBagConstraints.NORTH;
    gbPanel6.setConstraints( pnPanel16, gbcPanel6 );
    pnPanel6.add( pnPanel16 );

    btDecBtn = new JButton( "Decrypt"  );
    btDecBtn.setName("Decrypt");
    gbcPanel6.gridx = 0;
    gbcPanel6.gridy = 9;
    gbcPanel6.gridwidth = 6;
    gbcPanel6.gridheight = 2;
    gbcPanel6.fill = GridBagConstraints.BOTH;
    gbcPanel6.weightx = 1;
    gbcPanel6.weighty = 0;
    gbcPanel6.anchor = GridBagConstraints.NORTH;
    gbPanel6.setConstraints( btDecBtn, gbcPanel6 );
    pnPanel6.add( btDecBtn );

    btEncBtn = new JButton( "Encrypt"  );
    btEncBtn.setName("Encrypt");
    gbcPanel6.gridx = 7;
    gbcPanel6.gridy = 9;
    gbcPanel6.gridwidth = 6;
    gbcPanel6.gridheight = 2;
    gbcPanel6.fill = GridBagConstraints.BOTH;
    gbcPanel6.weightx = 1;
    gbcPanel6.weighty = 0;
    gbcPanel6.anchor = GridBagConstraints.NORTH;
    gbPanel6.setConstraints( btEncBtn, gbcPanel6 );
    pnPanel6.add( btEncBtn );

    pnPanel21 = new JPanel();
    pnPanel21.setBorder( BorderFactory.createTitledBorder( "Output" ) );
    GridBagLayout gbPanel21 = new GridBagLayout();
    GridBagConstraints gbcPanel21 = new GridBagConstraints();
    pnPanel21.setLayout( gbPanel21 );

    taOutputText = new JTextArea(2,10);
    JScrollPane scpOutputText = new JScrollPane( taOutputText );
    gbcPanel21.gridx = 0;
    gbcPanel21.gridy = 0;
    gbcPanel21.gridwidth = 13;
    gbcPanel21.gridheight = 7;
    gbcPanel21.fill = GridBagConstraints.BOTH;
    gbcPanel21.weightx = 1;
    gbcPanel21.weighty = 1;
    gbcPanel21.anchor = GridBagConstraints.NORTH;
    gbPanel21.setConstraints( scpOutputText, gbcPanel21 );
    pnPanel21.add( scpOutputText );
    gbcPanel6.gridx = 0;
    gbcPanel6.gridy = 11;
    gbcPanel6.gridwidth = 13;
    gbcPanel6.gridheight = 7;
    gbcPanel6.fill = GridBagConstraints.BOTH;
    gbcPanel6.weightx = 1;
    gbcPanel6.weighty = 0;
    gbcPanel6.anchor = GridBagConstraints.NORTH;
    gbPanel6.setConstraints( pnPanel21, gbcPanel6 );
    pnPanel6.add( pnPanel21 );
    tbpTabbedPane0.addTab("Program",pnPanel6);

    pnPanel7 = new JPanel();
    GridBagLayout gbPanel7 = new GridBagLayout();
    GridBagConstraints gbcPanel7 = new GridBagConstraints();
    pnPanel7.setLayout( gbPanel7 );

    lbLabel5 = new JLabel( ""  );
    lbLabel5.setBackground( new Color( 162,162,162 ) );
    JScrollPane scpLabel5 = new JScrollPane( lbLabel5 );
    gbcPanel7.gridx = 0;
    gbcPanel7.gridy = 0;
    gbcPanel7.gridwidth = 21;
    gbcPanel7.gridheight = 23;
    gbcPanel7.fill = GridBagConstraints.BOTH;
    gbcPanel7.weightx = 1;
    gbcPanel7.weighty = 1;
    gbcPanel7.anchor = GridBagConstraints.NORTH;
    gbPanel7.setConstraints( scpLabel5, gbcPanel7 );
    pnPanel7.add( scpLabel5 );
    tbpTabbedPane0.addTab("About",pnPanel7);
    gbcPanel0.gridx = 0;
    gbcPanel0.gridy = 0;
    gbcPanel0.gridwidth = 1;
    gbcPanel0.gridheight = 1;
    gbcPanel0.fill = GridBagConstraints.BOTH;
    gbcPanel0.weightx = 1;
    gbcPanel0.weighty = 1;
    gbcPanel0.anchor = GridBagConstraints.NORTH;
    gbPanel0.setConstraints( tbpTabbedPane0, gbcPanel0 );
    pnPanel0.add( tbpTabbedPane0 );

    setDefaultCloseOperation( EXIT_ON_CLOSE );

    setContentPane( pnPanel0 );
    pack();
    setVisible( true );
    //jvider generated script end
    
    //my script
    btDecBtn.addActionListener(controller);
    btEncBtn.addActionListener(controller);
}

	public String getInput(){
		return this.taInputText.getText();
	}

	public String getKey(){
		return this.tfKeyText.getText();
	}

	public void setOutput(String input){
		this.taOutputText.setText(input);
	}
}
