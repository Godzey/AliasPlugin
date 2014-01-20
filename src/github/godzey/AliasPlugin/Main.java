package github.godzey.AliasPlugin;

import java.io.File;
import java.util.logging.Logger;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	private Logger log = Logger.getLogger("Minecraft");
	File myfile = new File("aliases.txt");
	
	@Override
	public void onEnable(){
		log.info("AliasPlugin has started.");
		
		if(myfile.exists()) {
			//do wat?
		}
		else {
			log.info("Error: aliases.txt is not found!");
		}
	}
	
	public void onDisalbe(){
		log.info("AliasPlugin has stopped.");
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		
		if (label.equalsIgnoreCase("alias")) {
			if(args.length >= 1) {
				if(args[0].equalsIgnoreCase("new"))
					return commandnew(sender, args);
					
			}
			return true;
		}
		
		private boolean commandNew(CommandSender sender1, String[] args){
			if(args.length >=2) {
				//add the new alias to the .txt file...
				//this should be do-able trough commands or just editing the .txt file!
				log.info("Adding " + String + " to alias.txt...");
			}
			else
				sender.sendMessage("Not enough arguments");
			
			return true; //for the command executor
		}
		
	}
}
