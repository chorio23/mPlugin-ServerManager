package de.ServerManager.mPlugins.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class dayCommand implements CommandExecutor {
    @Override
    public boolean onCommand(final CommandSender sender, final Command command, final String label, final String[] args) {

        if(args.length == 0){
            Bukkit.getWorld("world").setTime(1000);
            sender.sendMessage("§e[ServerManager] §7Die Zeit wurde auf §eTag §7gesetzt");
        }
        return false;
    }

}