package me.signifies.sReach;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;

/**
 * Created by Signifies for sReach on 3/24/18/1:48 PM
 */
public class Events implements Listener {

    //TODO Listener class for event management.

    @EventHandler
    public void onDetection(PlayerInteractAtEntityEvent event)
    {
        Player p = event.getPlayer();

        

    }
}
