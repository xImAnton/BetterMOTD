package de.ximanton.bettermotd;

import de.ximanton.bettermotd.listener.PingListener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    private static Main INSTANCE;

    public static Main getInstance() {
        return INSTANCE;
    }

    private MOTDBuilder motdBuilder;
    private Config config;

    public Main() {
        INSTANCE = this;
    }

    @Override
    public void onEnable() {
        config = new Config(getConfig());
        this.motdBuilder = new MOTDBuilder(getServer(), config.getWorldName());
        registerListeners();
    }

    private void registerListeners() {
        PluginManager pluginManager = getServer().getPluginManager();
        pluginManager.registerEvents(new PingListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public MOTDBuilder getMotdBuilder() {
        return motdBuilder;
    }

    private Config getConfiguration() {
        return config;
    }
}
