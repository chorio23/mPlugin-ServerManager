package de.ServerManager.commands;

import mkremins.fanciful.FancyMessage;
import org.bukkit.Bukkit;
import org.bukkit.command.*;
import org.bukkit.entity.Player;

public class smCommand implements CommandExecutor {
    @Override
    public boolean onCommand(final CommandSender sender, final Command command, final String label, final String[] args) {
        if(args.length == 0) {
            if (Bukkit.getPlayer(sender.getName()).isOp()) {
                Player p = (Player) sender;
                sender.sendMessage("");
                new FancyMessage("§e[ServerManager] §aWähle eine Server-Aktion:\n \n")
                        .then("§7=> §2§nReload \n  \n").command("/rl")
                        .then("§7=> §6§nStop \n \n").command("/stop")
                        .then("§7=> §7§nRestart \n ").command("/restart").send(p);

            }  else {
                sender.sendMessage("§e[ServerManager] §cDu hast keine Berechtigungen um diesen Command auszuführen");
            }
        }
        return true;
    }

}