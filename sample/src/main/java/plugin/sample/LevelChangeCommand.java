package plugin.sample;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import java.util.Random;

public class LevelChangeCommand implements CommandExecutor {

  @Override
  public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

    int newLevel = new Random().nextInt(30);

    if (sender instanceof Player player){
      player.setLevel(newLevel);
      sender.sendMessage("レベルが" + newLevel + "に変更されました。");
    }
    return false;
  }
}
