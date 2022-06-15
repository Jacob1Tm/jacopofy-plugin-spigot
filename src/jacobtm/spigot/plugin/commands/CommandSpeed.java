package jacobtm.spigot.plugin.commands;

import org.bukkit.command.CommandExecutor;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;

public class CommandSpeed implements CommandExecutor, TabCompleter {
    public boolean onCommand(org.bukkit.command.CommandSender sender, org.bukkit.command.Command command, String label, String[] args) {
        Player player = (Player) sender;
        if (args.length == 0) {
            player.sendMessage("Użycie: /speed <1 - 10>");
            return true;
        }
        int number = Integer.parseInt(args[0]);

        if (number < 0) {
            player.sendMessage("Nie możesz ustawić prędkości ujemnej!");
            return true;
        }
        if (number > 10) {
            player.sendMessage("Nie możesz ustawić prędkości większej niż 10!");
            return true;
        }
        int type = 0;
        if (args.length == 2) {
            if (args[1].equals("fly")) {
                type = 1;
            } else if (args[1].equals("walk")) {
                type = 2;
            }
        }
        if(player.isFlying() && type == 0) {
            player.setFlySpeed((float) number / 10);
            player.sendMessage("Ustawiono prędkość lotu na " + args[0]);
            return true;
        } else if (!player.isFlying() && type == 0) {
            player.setWalkSpeed((float) number / 10);
            player.sendMessage("Ustawiono prędkość poruszania się na " + args[0]);
            return true;
        } else if (type == 1) {
            player.setFlySpeed((float) number / 10);
            player.sendMessage("Ustawiono prędkość lotu na " + args[0]);
            return true;
        } else if (type == 2) {
            player.setWalkSpeed((float) number / 10);
            player.sendMessage("Ustawiono prędkość poruszania się na " + args[0]);
            return true;
        }
        return false;
    }

    @Override
    public java.util.List<String> onTabComplete(org.bukkit.command.CommandSender sender, org.bukkit.command.Command command, String label, String[] args) {
        if (args.length == 1) {
            return java.util.Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10");
        } else if (args.length == 2) {
            return java.util.Arrays.asList("fly", "walk");
        } else {
            return null;
        }
    }
}
