package de.ServerManager.mPlugins.commands;
import org.bukkit.Bukkit;
import org.bukkit.command.*;

public class nightCommand implements CommandExecutor {
    @Override
    public boolean onCommand(final CommandSender sender, final Command command, final String label, final String[] args) {

        if(args.length == 0){
            Bukkit.getWorld("world").setTime(13000);
            sender.sendMessage("§e[ServerManager] §7Die Zeit wurde auf §9Nacht §7gesetzt");
        }
        return false;
    }

}