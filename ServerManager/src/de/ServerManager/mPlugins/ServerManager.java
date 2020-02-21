package de.ServerManager.mPlugins;

import de.ServerManager.mPlugins.commands.ChatClearCommand;
import de.ServerManager.mPlugins.commands.dayCommand;
import de.ServerManager.mPlugins.commands.nightCommand;
import de.ServerManager.mPlugins.listener.JoinListener;
import de.ServerManager.mPlugins.commands.*;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public class ServerManager extends JavaPlugin {

    public static File file;
    public static FileConfiguration cfg;


    @Override
    public void onEnable() {
        final String enable = "§7[§6ServerManager§7] §2Der ServerManager wurde geladen!";
        saveDefaultConfig();

        ServerManager.file = new File("plugins/ServerManager", "config.yml");
        ServerManager.cfg = YamlConfiguration.loadConfiguration(ServerManager.file);


        //Commands registrieren
        getCommand("chatclear").setExecutor(new ChatClearCommand());
        getCommand("cclear").setExecutor(new ChatClearCommand());

        getCommand("night").setExecutor(new nightCommand());
        getCommand("day").setExecutor(new dayCommand());
        getCommand("rl").setExecutor(new reloadCommand());
        getCommand("survival").setExecutor(new survivalCommand());
        getCommand("creative").setExecutor(new creativeCommand());
        getCommand("spectator").setExecutor(new spectatorCommand());
        getCommand("gm").setExecutor(new gmCommand());
        getCommand("midnight").setExecutor(new midnightCommand());
        getCommand("noon").setExecutor(new noonCommand());
        getCommand("time").setExecutor(new timeCommand());
        getCommand("sm").setExecutor(new helpCommand());



        //Events registrieren
        Bukkit.getPluginManager().registerEvents(new JoinListener(), this);

        Bukkit.getConsoleSender().sendMessage(enable);
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("§7[§6ServerManager§7] §cDer ServerManager wurde beendet!");

    }
}

