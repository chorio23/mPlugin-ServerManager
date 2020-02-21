package de.ServerManager.mPlugins.commands;

import mkremins.fanciful.FancyMessage;
import org.bukkit.command.*;
import org.bukkit.entity.Player;

public class timeCommand implements CommandExecutor {
    @Override
    public boolean onCommand(final CommandSender sender, final Command command, final String label, final String[] args) {

        Player p = (Player) sender;
        sender.sendMessage("");
        new FancyMessage("§e[ServerManager] §7Wähle einen Zeit:\n \n")
                .then("§7=> §e§nTag\n \n").command("/day")
                .then("§7=> §6§nNachmittag\n \n").command("/noon")
                .then("§7=> §9§nNacht\n \n").command("/night")
                .then("§7=> §1§nMitternacht\n").command("/midnight").send(p);
        return true;
    }

}