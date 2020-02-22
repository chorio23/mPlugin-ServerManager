package de.ServerManager.listener;

import de.ServerManager.ServerManager;
import de.ServerManager.utils.ScorboardManager;
import org.bukkit.event.*;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinListener implements Listener {
    String welcomeMessage1 = ServerManager.cfg.getString("joinmessage1");
    String welcomeMessage2 = ServerManager.cfg.getString("joinmessage2");

    @EventHandler
    public void onJoin(final PlayerJoinEvent event) {
        event.getPlayer().setFoodLevel(20);
        event.setJoinMessage(welcomeMessage1 + event.getPlayer().getDisplayName() + welcomeMessage2);

        new ScorboardManager().set();
    }



}