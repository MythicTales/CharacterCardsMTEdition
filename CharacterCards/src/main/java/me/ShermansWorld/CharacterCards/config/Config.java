package me.ShermansWorld.CharacterCards.config;

import java.util.LinkedHashMap;
import me.ShermansWorld.CharacterCards.Main;
import org.bukkit.Bukkit;

public class Config {
	public static int configVersion = 1;

	public static String lang = "enUS";

	public static int minAge = 14;

	public static int maxAge = 120;

	public static int descCharLimit = 512;

	public static boolean shiftRightClick = true;

	public static boolean paperRightClick = true;

	public static boolean integrateTowny = true;

	public static boolean integrateMythicalRaces = true;

	public static boolean integrateKonquest = true;

	public static boolean integrateMagic = true;

	public static boolean integratePAPI = true;

	public static boolean usingCustomFields = false;

	public static LinkedHashMap<String, String> customFieldsMap = new LinkedHashMap<>();

	public static void initConfigVals() {
		configVersion = Main.getInstance().getConfig().getInt("config-version");
		lang = Main.getInstance().getConfig().getString("lang");
		minAge = Main.getInstance().getConfig().getInt("MinAge");
		maxAge = Main.getInstance().getConfig().getInt("MaxAge");
		descCharLimit = Main.getInstance().getConfig().getInt("DescCharLimit");
		shiftRightClick = Main.getInstance().getConfig().getBoolean("ShiftRightClick");
		paperRightClick = Main.getInstance().getConfig().getBoolean("RightClickPaper");
		integrateTowny = Main.getInstance().getConfig().getBoolean("IntegrateTowny");
		integrateMythicalRaces = Main.getInstance().getConfig().getBoolean("IntegrateMythicalRaces");
		integrateKonquest = Main.getInstance().getConfig().getBoolean("IntegrateKonquest");
		integrateMagic = Main.getInstance().getConfig().getBoolean("IntegrateMagic");
		integratePAPI = Main.getInstance().getConfig().getBoolean("IntegratePAPI");
		if (Main.usingPAPI && integratePAPI) {
			int customFieldLen = Main.getInstance().getConfig().getConfigurationSection("CustomFields").getKeys(false)
					.size();
			if (customFieldLen > 0) {
				usingCustomFields = true;
				Bukkit.getLogger().info("[CharacterCards] Custom Fields detected! Loading...");
				for (int i = 1; i <= customFieldLen; i++) {
					String label = Main.getInstance().getConfig()
							.getString("CustomFields." + String.valueOf(i) + ".label");
					String placeholder = Main.getInstance().getConfig()
							.getString("CustomFields." + String.valueOf(i) + ".placeholder");
					customFieldsMap.put(label, placeholder);
				}
				Bukkit.getLogger().info(
						"[CharacterCards] Successfully loaded " + String.valueOf(customFieldLen) + " custom fields");
			}
		}
	}
}
