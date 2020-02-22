package de.ServerManager.commands;

import mkremins.fanciful.FancyMessage;
import org.bukkit.command.*;
import org.bukkit.entity.Player;

public class gmCommand implements CommandExecutor {
    @Override
    public boolean onCommand(final CommandSender sender, final Command command, final String label, final String[] args) {

        Player p = (Player) sender;
        sender.sendMessage("");
        new FancyMessage("§e[ServerManager] §aWähle einen Gamemode:\n \n")
                .then("§7=> §2§nSurvival \n  \n").command("/survival").tooltip("§7Survival-Mode")
                .then("§7=> §6§nCreative \n \n").command("/creative").tooltip("§7Creative-Mode")
                .then("§7=> §7§nSpectator \n ").command("/spectator").tooltip("§7Spectator-Mode").send(p);
        return true;
    }

}