package me.signifies.sReach;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;
import utilities.Rutils;

/**
 * Created by Signifies for sReach on 3/24/18/1:48 PM
 */
public class Events extends Rutils implements Listener {

    //TODO Listener class for event management.

    @EventHandler //See archer class for more specific details. @Attacker
    public void onDetection(EntityDamageByEntityEvent event)
    {
        Entity attacker = event.getDamager();
        Entity recepient = event.getEntity();

        if(!(attacker instanceof Player)) return;



    }
}
