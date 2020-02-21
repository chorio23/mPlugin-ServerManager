package de.ServerManager.mPlugins.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.*;

public class noonCommand implements CommandExecutor {
    @Override
    public boolean onCommand(final CommandSender sender, final Command command, final String label, final String[] args) {
        if(args.length == 0){
            Bukkit.getWorld("world").setTime(6000);
            sender.sendMessage("§e[ServerManager] §7Die Zeit wurde auf §6Nachmittag §7gesetzt");
        }
        return false;

    }

}