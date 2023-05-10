package net.rexbr.remrem.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class flymin implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String [] args) {

        if (!(sender instanceof Player)) {
            sender.sendMessage("Only players can run this command.");
            return true;
        }

        Player player = (Player) sender;

        if (player.getAllowFlight()) {
            player.setAllowFlight(false);
            player.sendMessage("Flyng disabled");
        } else {
            player.setAllowFlight(true);
            player.sendMessage("Flyng enabled");
        }

        return true;
    }
}
