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
        List<String> lore = new ArrayList<String>();
        lore.add(ChatColor.GRAY + "An Strange Stick");
        meta.setLore(lore);
        hell_stick.setItemMeta(meta);

    }

}
