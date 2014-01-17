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
		
		
		
		return false;
	}
}
