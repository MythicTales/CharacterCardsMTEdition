package me.ShermansWorld.CharacterCards.commands;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;

public class CharacterCardsTabCompletion implements TabCompleter {
  public List<String> onTabComplete(CommandSender sender, Command cmd, String label, String[] args) {
    List<String> completions = new ArrayList<>();
    if (args.length == 1) {
      completions.add("Reload");
      return completions;
    } 
    return Collections.emptyList();
  }
}
