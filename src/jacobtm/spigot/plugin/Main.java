package jacobtm.spigot.plugin;

import jacobtm.spigot.plugin.commands.*;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public class Main extends JavaPlugin {

    public static void main(String[] args) { System.out.println("to plugin do minecrafta debilu");}

    @Override
    public void onEnable() {
        Bukkit.getLogger().info("Plugin włączony");
        Objects.requireNonNull(this.getCommand("kit")).setExecutor(new CommandKit());
        Objects.requireNonNull(this.getCommand("god")).setExecutor(new CommandGod());
        Objects.requireNonNull(this.getCommand("fly")).setExecutor(new CommandFly());
        Objects.requireNonNull(this.getCommand("jezyk")).setExecutor(new CommandJezyk());
        Objects.requireNonNull(this.getCommand("fulljezyk")).setExecutor(new CommandFullJezyk());
        Objects.requireNonNull(this.getCommand("wiadro")).setExecutor(new CommandWiadro());
        Objects.requireNonNull(this.getCommand("test")).setExecutor(new CommandTest());
        Objects.requireNonNull(this.getCommand("speed")).setExecutor(new CommandSpeed());
        Objects.requireNonNull(this.getCommand("speed")).setTabCompleter(new CommandSpeed());
        //command day
        Objects.requireNonNull(this.getCommand("day")).setExecutor(new CommandDay());
        //command night
        Objects.requireNonNull(this.getCommand("night")).setExecutor(new CommandNight());
    }

    @Override
    public void onDisable() { Bukkit.getLogger().info("Plugin wyłączony" );}
}