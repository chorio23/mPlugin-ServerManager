package de.ServerManager.commands;
import org.bukkit.Bukkit;
import org.bukkit.command.*;

public class nightCommand implements CommandExecutor {
    @Override
    public boolean onCommand(final CommandSender sender, final Command command, final String label, final String[] args) {

        if(args.length == 0){
            if(Bukkit.getPlayer(sender.getName()).isOp()){

                Bukkit.getWorld("world").setTime(13000);
                sender.sendMessage("§e[ServerManager] §7Die Zeit wurde auf §9Nacht §7gesetzt");

            } else {
                sender.sendMessage("§e[ServerManager] §cDu hast keine Berechtigungen um diesen Command auszuführen");
            }

        }
        return false;
    }

}