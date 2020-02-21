package de.ServerManager.mPlugins.commands;
import org.bukkit.Bukkit;
import org.bukkit.command.*;

public class reloadCommand implements CommandExecutor {
    @Override
    public boolean onCommand(final CommandSender sender, final Command command, final String label, final String[] args) {
        if(args.length == 0){
            Bukkit.getServer().reload();
            sender.sendMessage("§e[ServerManager] §7Der Server §aReload §7wurde durchgeführt");
        }
        return false;
    }

}