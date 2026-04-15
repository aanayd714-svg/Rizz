package me.rizzplugin;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public static Main instance;

    @Override
    public void onEnable() {
        instance = this;

        // Events register
        getServer().getPluginManager().registerEvents(new AbilityManager(), this);

        // Command register
        getCommand("givesword").setExecutor(new Commands());

        getLogger().info("Rizz Plugin Enabled 🔥");
    }

    @Override
    public void onDisable() {
        getLogger().info("Rizz Plugin Disabled ❌");
    }
  }
