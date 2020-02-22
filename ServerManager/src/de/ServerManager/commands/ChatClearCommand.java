package de.ServerManager.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.*;
import org.bukkit.entity.Player;

public class ChatClearCommand implements CommandExecutor {
    @Override
    public boolean onCommand(final CommandSender sender, final Command command, final String label, final String[] args) {
        if(args.length == 0){
            for(int i = 0; i< 120;i++){
                for(Player player : Bukkit.getOnlinePlayers()){
                    Bukkit.broadcastMessage("");
                }
            }
            Bukkit.broadcastMessage("§e[ServerManager] §7Der Chat wurde geleert");
        }
        return false;
    }

}