package net.rexbr.remrem.items;

import net.rexbr.remrem.Remrem;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;

public class PlayerHandler implements Listener {
    public PlayerHandler(Remrem plugin) {
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }



}
