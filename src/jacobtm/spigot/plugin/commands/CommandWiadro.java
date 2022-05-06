package jacobtm.spigot.plugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class CommandWiadro implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            Location loc = player.getLocation();
            double x;
            double z;
            World currentworld = player.getWorld();
            x = loc.getBlockX();
            z = loc.getBlockZ();
            x = x+0.5;
            z = z+0.5;
            Bukkit.getLogger().info(x + "," + z);
            Location dest = new Location(currentworld, x, 256, z);
            player.teleport(dest);
            ItemStack wiadro = new ItemStack(Material.WATER_BUCKET);
            player.getInventory().addItem(wiadro);
            return true;
        } return false;
    }
}
