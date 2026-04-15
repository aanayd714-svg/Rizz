package me.rizzplugin;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class SwordManager {

    public static ItemStack getThunderSword() {
        ItemStack sword = new ItemStack(Material.DIAMOND_SWORD);
        ItemMeta meta = sword.getItemMeta();

        meta.setDisplayName("§e⚡ Thunder Breathing Sword");

        sword.setItemMeta(meta);

        return sword;
    }
}
