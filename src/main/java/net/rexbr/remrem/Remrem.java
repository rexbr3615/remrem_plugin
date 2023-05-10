package net.rexbr.remrem;

import net.rexbr.remrem.commands.flymin;
import net.rexbr.remrem.items.PlayerHandler;
import org.bukkit.ChatColor;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Remrem extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("RemRem Has Sucefully Started");

        getCommand("flymin").setExecutor(new flymin());

        new PlayerHandler(this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("RemRem Has Sucefully Terminated");
    }

    // dont working
    @EventHandler
    public void onKill(PlayerDeathEvent e)
    {
        String killed = e.getEntity().getName();
        String killer = e.getEntity().getKiller().getName();
        e.setDeathMessage(ChatColor.RED + killed + " has been slain by " + killer);
    }
}
