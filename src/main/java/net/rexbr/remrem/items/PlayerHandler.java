package net.rexbr.remrem.items;

import net.rexbr.remrem.Remrem;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerHandler implements Listener {
    public PlayerHandler(Remrem plugin) {
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){
       Player player = event.getPlayer();
    }

}
