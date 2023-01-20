package me.ShermansWorld.CharacterCards.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import me.ShermansWorld.CharacterCards.Helper;
import me.ShermansWorld.CharacterCards.Main;
import me.ShermansWorld.CharacterCards.config.Config;
import me.ShermansWorld.CharacterCards.lang.Languages;

public class CharacterCardsCommands implements CommandExecutor {
	String version = Bukkit.getPluginManager().getPlugin("CharacterCards").getDescription().getVersion();
	YamlConfiguration lang = Languages.getLang();

	public CharacterCardsCommands(Main plugin) {
	}

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player player = (Player) sender;
		if (args.length == 0) {
			player.sendMessage(
					Helper.color("&8&l&m--------------&7[&3CharacterCards &7v&b" + this.version + "&7]&8&l&m--------------\n"));
			player.sendMessage(Helper.color("&7/&3CharacterCards Reload &8- " + lang.getString("CharacterCardsCommands.Reload")));
			player.sendMessage(Helper.color("&8&l&m---------------------------------------------"));
			return true;
		}
		if (args.length == 1) {
			if (args[0].equalsIgnoreCase("help")) {
				if (args.length == 0) {
					player.sendMessage(Helper.color("&8&l&m--------------&7[&3CharacterCards &7v&b" + this.version
							+ "&7]&8&l&m--------------\n"));
					player.sendMessage(Helper.color("&7/&3CharacterCards reload &8- " + lang.getString("CharacterCardsCommands.Reload")));
					player.sendMessage(Helper.color("&8&l&m---------------------------------------------"));
					return true;
				}
			} else if (args[0].equalsIgnoreCase("reload")) {
				if (!player.hasPermission("CharacterCards.reload")) {
					player.sendMessage(Helper.color("&7[&3CharacterCards&7] " + lang.getString("NoPermission")));
					return false;
				}
				Main.getInstance().reloadConfig();
				Main.getInstance().saveDefaultConfig();
				Config.initConfigVals();
				player.sendMessage(Helper.color("&7[&3CharacterCards&7] " + lang.getString("CharacterCardsCommands.ReloadSuccess")));
				return true;
			}
		}
		return false;
	}
}
