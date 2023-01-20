package me.ShermansWorld.CharacterCards.commands;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;

public class CharTabCompletion implements TabCompleter {
	public List<String> onTabComplete(CommandSender sender, Command cmd, String label, String[] args) {
		List<String> completions = new ArrayList<String>();

		if (args.length == 1) {
			completions.add("Name");
			completions.add("Gender");
			completions.add("Age");
			completions.add("Desc");
			completions.add("View");

			return completions;
		}
		
		if (args.length == 2 && args[0].toUpperCase().contentEquals("GENDER")) {
			completions.add("Male");
			completions.add("Female");

			return completions;
		}
		
		if (args.length == 2 && args[0].toUpperCase().contentEquals("AGE")) {
			for (int i = 14; i <= 120; i++) {
				completions.add(String.valueOf(i));
			}

			return completions;
		}
		
		
		if (args.length == 2 && args[0].toUpperCase().contentEquals("VIEW")) {
			for (Player p : Bukkit.getOnlinePlayers()) {
				completions.add(p.getName());
			}
			return completions;
		}
		
		if (args.length == 2 && args[0].toUpperCase().contentEquals("DESC")) {
			completions.add("Add");
			completions.add("Clear");
			return completions;
		}

		return Collections.emptyList();
	}
}