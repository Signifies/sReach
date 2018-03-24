package me.signifies.sReach;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by Signifies for sReach on 3/24/18/1:45 PM
 */
public class Reach extends JavaPlugin
{

    public PluginDescriptionFile pdfFile = this.getDescription();

    public void onEnable()
    {

    }

    public boolean onCommand(CommandSender sender, Command cmd, String commandlabel, String args[])
    {

        if(!(sender instanceof Player))
        {
            sender.sendMessage(ChatColor.RED + "Console usage disabled... For now...");
            return true;
        }

        Player p = (Player)sender;



        return true;
    }

}
