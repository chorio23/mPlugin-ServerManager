package de.ServerManager.mPlugins.utils;

import de.ServerManager.mPlugins.ServerManager;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.Team;

public class ScorboardManager {
    boolean seeScoreboard;
    String serverName;
    String adminPrefix = ServerManager.cfg.getString("adminPrefix");
    String adminSuffix = ServerManager.cfg.getString("adminSuffix");
    String defaultSuffix = ServerManager.cfg.getString("defaultSuffix");
    String defaultPrefix = ServerManager.cfg.getString("defaultPrefix");


    public ScorboardManager () {
        this.seeScoreboard = ServerManager.cfg.getBoolean("scoreboard");
        this.serverName = ServerManager.cfg.getString("serverName");
    }

    public void set(){
        for(Player player :Bukkit.getOnlinePlayers()){
            Scoreboard board = Bukkit.getScoreboardManager().getNewScoreboard();
            Objective obj = board.registerNewObjective("stats" ,"dummy");


            Team admin = board.registerNewTeam("001ADMIN");
            Team def = board.registerNewTeam("00900DEFAULT");
            Team spieler = board.registerNewTeam("Spieler");

            admin.setPrefix(adminPrefix);
            admin.setSuffix(adminSuffix);
            def.setPrefix(defaultPrefix);
            def.setSuffix(defaultSuffix);

            spieler.setPrefix("§7"+ Bukkit.getOnlinePlayers().size());
            spieler.addEntry("§f");

            Bukkit.getOnlinePlayers().forEach(p -> {

                if(p.isOp()){
                    admin.addEntry(p.getName());
                } else {
                    def.addEntry(p.getName());
                }


            });
            obj.setDisplaySlot(DisplaySlot.SIDEBAR);
            obj.setDisplayName("§7[§6" + this.serverName + "§7]");
            obj.getScore("§aOnline Players:").setScore(1);
            obj.getScore("§7"+ Bukkit.getOnlinePlayers().size()).setScore(0);

            if(seeScoreboard == true){
                player.setScoreboard(board);
            }

        }




    }
        public void update(){
        for (Player p : Bukkit.getOnlinePlayers()){
            p.getScoreboard().getTeam("Spieler").setPrefix("§7" + (Bukkit.getOnlinePlayers().size()-1));
        }
        }
}
