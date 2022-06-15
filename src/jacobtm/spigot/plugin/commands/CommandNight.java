package jacobtm.spigot.plugin.commands;

import org.bukkit.command.CommandExecutor;

import java.util.Objects;

public class CommandNight implements CommandExecutor {
    public boolean onCommand(org.bukkit.command.CommandSender sender, org.bukkit.command.Command command, String label, String[] args) {
        //set current world time to night
        Objects.requireNonNull(sender.getServer().getWorld(sender.getServer().getWorlds().get(0).getName())).setTime(18000);
        //wyślij wiadomośc do gracza
        sender.sendMessage("§aZmieniono czas na §6NOC§a!");
        return true;
    }
}
