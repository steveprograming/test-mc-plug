package com.example;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class MySpigotPlugin extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {
        // Zaregistruj event listener
        Bukkit.getPluginManager().registerEvents(this, this);
        getLogger().info("MySpigotPlugin byl aktivován!");
    }

    @Override
    public void onDisable() {
        getLogger().info("MySpigotPlugin byl deaktivován!");
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        event.getPlayer().sendMessage("Vítej na serveru!");
    }
}

