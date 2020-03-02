package de.ServerManager.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.*;

public class noonCommand implements CommandExecutor {
    @Override
    public boolean onCommand(final CommandSender sender, final Command command, final String label, final String[] args) {
        if(args.length == 0){
            if(Bukkit.getPlayer(sender.getName()).isOp()) {

                Bukkit.getWorld("world").setTime(6000);
                sender.sendMessage("§e[ServerManager] §7Die Zeit wurde auf §6Nachmittag §7gesetzt");

            } else {
                sender.sendMessage("§e[ServerManager] §cDu hast keine Berechtigungen um diesen Command auszuführen");

            }

        }
        return false;

    }

}