package de.ServerManager.mPlugins.commands;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.*;

public class spectatorCommand implements CommandExecutor {
    @Override
    public boolean onCommand(final CommandSender sender, final Command command, final String label, final String[] args) {
        if(args.length == 0){
            if(Bukkit.getPlayer(sender.getName()).isOp()){
            Bukkit.getPlayer(sender.getName()).setGameMode(GameMode.SPECTATOR);
            sender.sendMessage("§e[ServerManager] §7Du bist jetzt im §aSpectator §7Modus");
            } else {
                sender.sendMessage("§e[ServerManager] §cDu hast keine Berechtigungen um diesen Command auszuführen");
            }
        }

        return false;
    }

}