package jacobtm.spigot.plugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandFly implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (!player.getAllowFlight()) {
                player.setAllowFlight(true);
                player.sendMessage(ChatColor.GRAY + "Flying is now " + ChatColor.YELLOW + "enabled" );
                return true;
            } else if (player.getAllowFlight()) {
                player.setAllowFlight(false);
                player.sendMessage(ChatColor.GRAY + "Flying is now " + ChatColor.YELLOW + "disabled" );
                return true;
            }
        }
        return false;
    }
}