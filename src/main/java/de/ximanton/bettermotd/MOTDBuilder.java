package de.ximanton.bettermotd;

import org.bukkit.ChatColor;
import org.bukkit.Server;
import org.bukkit.World;

import java.util.Objects;

public class MOTDBuilder {

    private final Server server;
    private final World world;

    public MOTDBuilder(Server server, String worldName) {
        this.server = server;
        this.world = Objects.requireNonNull(server.getWorld(worldName));
    }

    private String getDaytime(boolean text) {
        long time = world.getTime();
        if (time < 23500 && time > 12500) { // if players can sleep
            return ChatColor.YELLOW + "☾ " + (text ? ChatColor.GRAY + "Night " : "");
        } else {
            return ChatColor.YELLOW + "☀ " + (text ? ChatColor.GRAY + "Day " : "");
        }
    }

    public String getMOTD() {
        return getDaytime(true);
    }

}
