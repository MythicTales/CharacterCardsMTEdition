package me.ShermansWorld.CharacterCards;

import java.io.File;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

public class API {
  public static boolean hasDing(Player p) {
    File f = new File("plugins" + File.separator + "CharacterCards" + File.separator + "users" + File.separator + p.getUniqueId() + ".yml");
    YamlConfiguration yamlConfiguration = YamlConfiguration.loadConfiguration(f);
    return yamlConfiguration.getBoolean("PlayExDing");
  }
}
