package net.rexbr.remrem.items;

import net.rexbr.remrem.Remrem;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class PlayerHandler implements Listener {
    public PlayerHandler(Remrem plugin) {
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){
       Player player = event.getPlayer();


        ItemStack hell_stick = new ItemStack(Material.STICK, 1);
        ItemMeta meta = hell_stick.getItemMeta();
        meta.setDisplayName("Hell Stick");
        hell_stick.setItemMeta(meta);

        ItemStack sus = new ItemStack(Material.DIAMOND_SWORD, 1);
        ItemMeta sus_meta = sus.getItemMeta();
        sus_meta.setDisplayName("SUSUS");
        sus.setItemMeta(sus_meta);


        Inventory inv = player.getInventory();

        inv.addItem(hell_stick);
        inv.setItem(8, hell_stick);

        inv.addItem(sus);
        inv.setItem(7, sus);

    }

}
