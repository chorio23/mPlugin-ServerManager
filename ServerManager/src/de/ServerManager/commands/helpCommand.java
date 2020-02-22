package de.ServerManager.commands;

import org.bukkit.command.*;

public class helpCommand implements CommandExecutor {
    @Override
    public boolean onCommand(final CommandSender sender, final Command command, final String label, final String[] args) {
        if(args.length == 0){
            sender.sendMessage("");
            sender.sendMessage("");
            sender.sendMessage("");
            sender.sendMessage("");
            sender.sendMessage("§e[ServerManager] §7Auflistung aller Befehle des Plugins:");
            sender.sendMessage("");
            sender.sendMessage("§e/time §7Zeit kann durch Klicken ausgewählt werden");
            sender.sendMessage("§e/gm §7Gamemode kann durch Klicken ausgewählt werden");
            sender.sendMessage("§e/cclear §7Löscht alle Chatnachrichten");
        }
        return false;
    }

}