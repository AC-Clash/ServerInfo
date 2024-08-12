package com.acclash.serverInfo;

import org.bukkit.plugin.java.JavaPlugin;

public final class ServerInfo extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("Displaying server info...");
        getLogger().info("Server Type: " + getServer().getName());
        getLogger().info("Server Version: " + getServer().getVersion());
        getLogger().info("Bukkit Version: " + getServer().getBukkitVersion());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
