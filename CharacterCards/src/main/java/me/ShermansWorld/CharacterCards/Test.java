package me.ShermansWorld.CharacterCards;

import java.util.Map;
import me.ShermansWorld.CharacterCards.config.Config;
import org.bukkit.Bukkit;

public class Test {
  public static void checkCustomFieldsMap() {
    for (Map.Entry<String, String> entry : (Iterable<Map.Entry<String, String>>)Config.customFieldsMap.entrySet()) {
      String fieldLabel = entry.getKey();
      String fieldPlaceholder = entry.getValue();
      Bukkit.broadcastMessage(fieldLabel);
      Bukkit.broadcastMessage(fieldPlaceholder);
    } 
  }
}