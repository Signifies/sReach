package me.signifies.sReach;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;
import utilities.Rutils;

/**
 * Created by Signifies for sReach on 3/24/18/1:45 PM
 */
public class Reach extends JavaPlugin
{

    public PluginDescriptionFile pdfFile = this.getDescription();
    Rutils utils = new Rutils();
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

        if(cmd.getName().equalsIgnoreCase("ping"))
        {
            if(args.length == 0)
            {
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&',"&6Your current ping is: &a" + utils.getPing(p)));
            }else
            {
                Player target = Bukkit.getServer().getPlayer(args[0]);
                if(target == null)
                {
                    sender.sendMessage(ChatColor.RED + "Sorry, " +args[0] + " isn't online right now.");
                }else
                {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&',"&6The player, "+target.getName()+"'s current ping is: &a" + utils.getPing(p)));
                }
            }
        }
        return true;
    }

}
