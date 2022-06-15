package jacobtm.spigot.plugin.commands;

import org.bukkit.command.CommandExecutor;

import java.util.Objects;

public class CommandDay implements CommandExecutor {
    @Override
    public boolean onCommand(org.bukkit.command.CommandSender sender, org.bukkit.command.Command command, String label, String[] args) {
        //set current world time to day
        Objects.requireNonNull(sender.getServer().getWorld(sender.getServer().getWorlds().get(0).getName())).setTime(0);
        //wyślij wiadomośc do gracza
        sender.sendMessage("§aZmieniono czas na §6dzień§a!");
        return true;
    }
}
