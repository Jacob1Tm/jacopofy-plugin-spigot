package jacobtm.spigot.plugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandGod implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (!player.isInvulnerable()) {
                player.setInvulnerable(true);
                player.sendMessage(ChatColor.GRAY + "God Mode is now " + ChatColor.YELLOW + "enabled" );
                return true;
            } else if (player.isInvulnerable()) {
                player.setInvulnerable(false);
                player.sendMessage(ChatColor.GRAY + "God Mode is now " + ChatColor.YELLOW + "disabled" );
                return true;
            }
        }
        return false;
    }
}
