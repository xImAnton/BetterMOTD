package de.ximanton.bettermotd.listener;

import de.ximanton.bettermotd.Main;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerListPingEvent;

public class PingListener implements Listener {

    @EventHandler
    public void onServerListPing(ServerListPingEvent e) {
        e.setMotd(Main.getInstance().getMotdBuilder().getMOTD());
    }

}
