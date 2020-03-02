package de.ServerManager;

import de.ServerManager.commands.*;
import de.ServerManager.listener.JoinListener;
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
        getCommand("smhelp").setExecutor(new helpCommand());
        getCommand("sm").setExecutor(new smCommand());

        //Events registrieren
        Bukkit.getPluginManager().registerEvents(new JoinListener(), this);

    }

    @Override
    public void onDisable() {

    }
}

