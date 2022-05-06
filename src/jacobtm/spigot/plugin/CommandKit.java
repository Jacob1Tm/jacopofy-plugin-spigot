package jacobtm.spigot.plugin;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class CommandKit implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (args.length == 0) {
                player.sendMessage(ChatColor.YELLOW + "Kits: " + ChatColor.GREEN + "cos");
                return true;
            } else if (args[0].equalsIgnoreCase("cos")) {
                ItemStack diamond = new ItemStack(Material.DIAMOND);

                ItemStack bricks = new ItemStack(Material.BRICK);

                bricks.setAmount(20);

                player.getInventory().addItem(bricks, diamond);
                player.sendMessage(ChatColor.YELLOW + "You got a " + ChatColor.GREEN + args[0] + ChatColor.YELLOW + " kit");
                return true;
            } else {
                player.sendMessage(ChatColor.YELLOW + "Kits: " + ChatColor.GREEN + "cos");
                return true;
            }
        }
        return false;
    }
}
