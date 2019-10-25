import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.InvalidKeyException;
import javax.swing.*;

public class Controller implements ActionListener {

	private Encryption encryption;
	private UI ui;

	public Controller(){
		encryption = new Encryption();
		ui = new UI(this);
	}

	public void actionPerformed(ActionEvent e) {
		
		if(!ui.getInput().equals("")){
			
			String input = ui.getInput();
			String output = "";
			
			Object key = encryption.makeKey(ui.getKey());
			
			//encrypt button action
			if(((JComponent) e.getSource()).getName().equals("Encrypt")){
				output += "<ENCRYPTION>"; 
				output += encryption.encrypt(input, key);
				output += "</ENCRYPTION>";
			}
			//decrypt button action
			else if(((JComponent) e.getSource()).getName().equals("Decrypt")){
				output = encryption.decrypt(input, key);
			}
			
			ui.setOutput(output);
		}

	}	
} 
