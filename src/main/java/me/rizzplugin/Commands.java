package me.rizzplugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Commands implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (!(sender instanceof Player)) {
            sender.sendMessage("Only players can use this command!");
            return true;
        }

        Player p = (Player) sender;

        if (args.length == 0) {
            p.sendMessage("§cUse: /givesword thunder");
            return true;
        }

        if (args[0].equalsIgnoreCase("thunder")) {
            p.getInventory().addItem(SwordManager.getThunderSword());
            p.sendMessage("§e⚡ Thunder Breathing Sword mil gaya!");
        } else {
            p.sendMessage("§cUnknown breathing!");
        }

        return true;
    }
              }
