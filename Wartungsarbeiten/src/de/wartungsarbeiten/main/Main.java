package de.wartungsarbeiten.main;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {
	
	public void onEnable(){
		Bukkit.getServer().getPluginManager().registerEvents(this, this);
		 
	}
	
	@EventHandler
	public void LogIn(PlayerLoginEvent e) {
		if(e.getPlayer().isOp() == false) {
			e.disallow(null, "§4WARTUNGSARBEITEN \n §cmomentan wird der Server gewartet");
		}
	}
	

}
