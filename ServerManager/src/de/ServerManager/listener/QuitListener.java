package de.ServerManager.listener;

import de.ServerManager.utils.ScorboardManager;
import org.bukkit.event.*;
import org.bukkit.event.player.PlayerQuitEvent;

public class QuitListener implements Listener {
    @EventHandler
    public void onEvent(final PlayerQuitEvent event) {
        new ScorboardManager().update();
    }


}