package de.ServerManager.commands;
import org.bukkit.Bukkit;
import org.bukkit.command.*;

public class reloadCommand implements CommandExecutor {
    @Override
    public boolean onCommand(final CommandSender sender, final Command command, final String label, final String[] args) {
        if(Bukkit.getPlayer(sender.getName()).isOp()) {
            if (args.length == 0) {
                Bukkit.getServer().reload();
                sender.sendMessage("§e[ServerManager] §7Der Server §aReload §7wurde durchgeführt");
            }
        } else {
            sender.sendMessage("§e[ServerManager] §cDu hast keine Berechtigungen um diesen Command auszuführen");
        }
        return false;
    }

}