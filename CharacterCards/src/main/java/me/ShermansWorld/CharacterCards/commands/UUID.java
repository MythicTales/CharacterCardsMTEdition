package me.ShermansWorld.CharacterCards.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.ShermansWorld.CharacterCards.Main;

public class UUID implements CommandExecutor {
  public UUID(Main plugin) {}
  
  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
    Player p = (Player)sender;
    if (cmd.getName().equalsIgnoreCase("uuid")) {
      if (!sender.hasPermission("CharacterCards.uuid")) {
        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cYou don't have permission for that command"));
        return true;
      } 
      if (args == null || args.length == 0) {
        p.sendMessage(mess("&8&l&m------------&7[&3" + p.getName() + "'s UUID" + "&7]&8&l&m------------"));
        p.sendMessage(mess("&b" + p.getUniqueId().toString()));
        p.sendMessage(mess("&8&l&m-----------------------------------"));
        p.sendMessage(mess("&bTo view another player's UUID: &8/&3UUID &8<&bplayer&8>"));
        p.sendMessage(mess("&8&l&m-----------------------------------"));
      } else if (args.length == 1) {
        Player target = Bukkit.getPlayerExact(args[0]);
        if (target != null) {
          p.sendMessage(mess("&8&l&m------------&7[&3" + target.getName() + "'s UUID" + "&7]&8&l&m------------"));
          p.sendMessage(mess("&b" + target.getUniqueId().toString()));
          p.sendMessage(mess("&8&l&m-----------------------------------"));
          p.sendMessage(mess("&bTo view another player's UUID: &8/&3UUID &8<&bplayer&8>"));
          p.sendMessage(mess("&8&l&m-----------------------------------"));
        } else {
          p.sendMessage(mess("&7[&cCharacterCards&7] &c" + args[0] + " &7is not online/has never joined before&c."));
        } 
      } 
    } 
    return false;
  }
  
  private String mess(String message) {
    return ChatColor.translateAlternateColorCodes('&', message);
  }
}
