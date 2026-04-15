package me.rizzplugin;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class AbilityManager implements Listener {

    @EventHandler
    public void onClick(PlayerInteractEvent e) {
        Player p = e.getPlayer();

        ItemStack item = p.getInventory().getItemInMainHand();

        if (item == null || !item.hasItemMeta()) return;

        if (item.getItemMeta().getDisplayName().contains("Thunder")) {

            Location loc = p.getTargetBlock(null, 50).getLocation();

            loc.getWorld().strikeLightning(loc);

            p.sendMessage("§e⚡ Thunder Attack!");
        }
    }
              }
