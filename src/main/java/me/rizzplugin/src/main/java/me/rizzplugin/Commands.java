package me.rizzplugin;

import org.bukkit.command.*;
import org.bukkit.entity.Player;

public class Commands implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (!(sender instanceof Player)) return true;

        Player p = (Player) sender;

        if (args.length == 1 && args[0].equalsIgnoreCase("thunder")) {
            p.getInventory().addItem(SwordManager.getThunderSword());
            p.sendMessage("§e⚡ Thunder Sword mil gaya!");
        }

        return true;
    }
}
