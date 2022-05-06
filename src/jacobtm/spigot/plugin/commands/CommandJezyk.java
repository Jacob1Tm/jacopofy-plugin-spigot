package jacobtm.spigot.plugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandJezyk implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            player.sendMessage(ChatColor.YELLOW + "[Refren]\n" + " \n" + ChatColor.GREEN +
                    "(Ej, okej)\n" +
                    "Młody jeżyk, bo chciałbym tylko przeżyć\n" +
                    "Suszyć jedynki, po prostu zęby szczerzyć, (okej)\n" +
                    "Bujać budynki, w końcu w siebie wierzyć\n" +
                    "Młody je-e-e-e-e-e-eż (młody jeż)\n" +
                    "(Ej, okej)\n" +
                    "Młody jeżyk, bo chciałbym tylko przeżyć\n" +
                    "Suszyć jedynki, po prostu zęby szczerzyć, (okej)\n" +
                    "Bujać budynki, w końcu w siebie wierzyć\n" +
                    "Młody je-e-e-e-e-e-eż (młody jeż)\n");
            return true;
        }
        return false;
    }
}