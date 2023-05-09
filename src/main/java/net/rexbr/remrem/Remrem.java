package net.rexbr.remrem;

import org.bukkit.plugin.java.JavaPlugin;

public final class Remrem extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("RemRem Has Sucefully Started");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("RemRem Has Sucefully Terminated");
    }
}
