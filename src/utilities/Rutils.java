package utilities;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by Signifies for sReach on 3/24/18/6:28 PM
 */
public class Rutils {

    public int getPing (Player player)
    {
        int ping = 0;
        try {
            Object entityPlayer = player.getClass().getMethod("getHandle").invoke(player);
             ping = (int) entityPlayer.getClass().getField("ping").get(entityPlayer);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException | NoSuchFieldException e) {
            e.printStackTrace();
        }
        return ping;
    }

    public void getPing (Player player, Player sender)
    {

        try {
            Object entityPlayer = player.getClass().getMethod("getHandle").invoke(player);
            int  ping = (int) entityPlayer.getClass().getField("ping").get(entityPlayer);
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&',"&6The players "+player.getName()+"'s current ping is: &a" + ping ));
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException | NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

}
