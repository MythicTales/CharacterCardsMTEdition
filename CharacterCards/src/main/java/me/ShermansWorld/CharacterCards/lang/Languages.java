package me.ShermansWorld.CharacterCards.lang;

import java.io.File;
import java.io.IOException;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.YamlConfiguration;

import me.ShermansWorld.CharacterCards.config.Config;

public class Languages {
	
	public static void initEnglish() {
		File english = new File("plugins" + File.separator + "CharacterCards" + File.separator + "lang" + File.separator + "enUS.yml");
		if (!english.exists()) {
			try {
				english.createNewFile();
			} catch (IOException e) {
				Bukkit.getLogger().warning("[CharacterCards] Error when creating language file 'enUS'");
			}
			YamlConfiguration yamlConfiguration = YamlConfiguration.loadConfiguration(english);
			yamlConfiguration.set("NoPermission", "&cYou do not have permission to do this");
			yamlConfiguration.set("NoColors", "&cYou cannot use colors!");
			yamlConfiguration.set("EmptyField", "Empty ");
			yamlConfiguration.set("CharacterCardsCommands", null);
			yamlConfiguration.set("CharacterCardsCommands.Reload", "&3Reloads the config.yml");
			yamlConfiguration.set("CharacterCardsCommands.ReloadSuccess", "&econfig.yml reloaded");
			yamlConfiguration.set("CharacterCommands.NameHelp", "&7<&bFirst&7> &7{&bLast&7} &7{&bTitle&7} &8- &3Set your character's name.");
			yamlConfiguration.set("CharacterCommands.GenderHelp", "&7<&bMale&7/&bFemale> &8- &3Set your character's gender.");
			yamlConfiguration.set("CharacterCommands.AgeHelp", "&3Set your character's age.");
			yamlConfiguration.set("CharacterCommands.DescHelp", "&7<&bDescription&7> &8- &3Set your character's description.");
			yamlConfiguration.set("CharacterCommands.ViewHelp", "&7{&bPlayer&7} &8- &3View your card, or another player's!");
			yamlConfiguration.set("CharacterCommands.NameError1", "&cToo many args! &eUsage&7: &7/&cChar Name &7<&cFirst&7> &7{&cLast&7} &7{&cTitle&7}");
			yamlConfiguration.set("CharacterCommands.NameError2", "&cYou must enter a name!");
			yamlConfiguration.set("CharacterCommands.NameSuccess", "&3Name set as");
			yamlConfiguration.set("CharacterCommands.GenderError1", "&cYou must enter a gender! &7(&eMale&7/&eFemale)");
			yamlConfiguration.set("CharacterCommands.GenderError2", "&cToo many args! &eUsage&7: &7/&cChar Gender &7(&cMale &7or &cFemale)");
			yamlConfiguration.set("CharacterCommands.GenderError3", "&cYou must be Male&7/&cFemale&7");
			yamlConfiguration.set("CharacterCommands.GenderSuccess1", "&3Gender set as: &eMale");
			yamlConfiguration.set("CharacterCommands.GenderSuccess2", "&3Gender set as: &eFemale");
			yamlConfiguration.set("CharacterCommands.GenderSuccess3", "&3Gender set as: &eOther");
			yamlConfiguration.set("CharacterCommands.AgeError1", "&cYou must enter a age! Usage&7: &7/&cChar Age [age]");
			yamlConfiguration.set("CharacterCommands.AgeError2", "&cToo many args! &eUsage: &7/&cChar Age [age]");
			yamlConfiguration.set("CharacterCommands.AgeError3", "&7Age must be");
			yamlConfiguration.set("CharacterCommands.AgeSuccess", "&3Age set as");
			yamlConfiguration.set("CharacterCommands.DescError1", "&cYou must set a description!");
			yamlConfiguration.set("CharacterCommands.DescError2", "&cDescription is too long!");
			yamlConfiguration.set("CharacterCommands.DescSuccess", "&3Description set as");
			yamlConfiguration.set("CharacterCommands.DescCleared", "&aDescription cleared");
			yamlConfiguration.set("CharacterCommands.ViewError1", "&cToo many args! &eUsage&7: &7/&cChar View &8<&cPlayer&8>");
			yamlConfiguration.set("CharacterCommands.ViewError2", "&cThis card does not exist! Was it recently deleted?");
			yamlConfiguration.set("CharacterCommands.ViewError3", "&7is not online/has never joined before&3.");
			yamlConfiguration.set("CharacterCommands.Invalid", "&cInvalid Command");
			yamlConfiguration.set("CharacterCommands.DeleteSuccess", "@PLAYER's &aconfiguration file has been deleted!");
			yamlConfiguration.set("CharacterCommands.DeleteError1", "@PLAYER's &cconfiguration file doesn't exist!");
			yamlConfiguration.set("CharacterCommands.DeleteError2", " &cisn't online!");
			yamlConfiguration.set("CharacterCommands.DeleteError3", "&cYou must enter a &eplayer's &cname");
			yamlConfiguration.set("Cards", null);
			yamlConfiguration.set("Cards.Name", "Name");
			yamlConfiguration.set("Cards.Gender", "Gender");
			yamlConfiguration.set("Cards.Age", "Age");
			yamlConfiguration.set("Cards.Desc", "@PLAYER's Desc");
			yamlConfiguration.set("Cards.Card", "@PLAYER's Card");
			yamlConfiguration.set("Cards.Male", "Male ");
			yamlConfiguration.set("Cards.Female", "Female ");
			try {
				yamlConfiguration.save(english);
			} catch (IOException e) {
				Bukkit.getLogger().warning("[CharacterCards] Error when saving language file 'enUS'");
			}
		}
	}
	
	public static void initRomanian() {
		File romanian = new File("plugins" + File.separator + "CharacterCards" + File.separator + "lang" + File.separator + "ro.yml");
		if (!romanian.exists()) {
			try {
				romanian.createNewFile();
			} catch (IOException e) {
				Bukkit.getLogger().warning("[CharacterCards] Error when creating language file 'ro'");
			}
			YamlConfiguration yamlConfiguration = YamlConfiguration.loadConfiguration(romanian);
			yamlConfiguration.set("NoPermission", "&cNu ai permisiunea să faci asta");
			yamlConfiguration.set("NoColors", "&cNu poți folosi culori");
			yamlConfiguration.set("EmptyField", "Nespecificat ");
			yamlConfiguration.set("CharacterCardsCommands", null);
			yamlConfiguration.set("CharacterCardsCommands.Reload", "&3Reîncarcă fișierul config.yml");
			yamlConfiguration.set("CharacterCardsCommands.ReloadSuccess", "&econfig.yml reîncărcat");
			yamlConfiguration.set("CharacterCommands.NameHelp", "&7<&bPrenume&7> &7{&bNume de familie&7} &7{&bTitlu&7} &8- &3Alege numele personajului");
			yamlConfiguration.set("CharacterCommands.GenderHelp", "&7<&bMale&7/&bFemale/&bOther&7> &8- &3Alege sexul personajului");
			yamlConfiguration.set("CharacterCommands.AgeHelp", "&3Alege vârsta personajului");
			yamlConfiguration.set("CharacterCommands.DescHelp", "&7<&bDescriere&7> &8- &3Alege descrierea personajului");
			yamlConfiguration.set("CharacterCommands.ViewHelp", "&7{&bJucător&7} &8- &3Vezi informații despre personajul tău sau al altcuiva!");
			yamlConfiguration.set("CharacterCommands.NameError1", "&cPrea multe argumente! &eFolosește&7: &7/&cchar name &7<&cPrenume&7> &7{&cNume de familie&7} &7{&cTitlu&7}");
			yamlConfiguration.set("CharacterCommands.NameError2", "&cTrebuie să introduci un nume de familie!");
			yamlConfiguration.set("CharacterCommands.NameSuccess", "&3Numele este acum");
			yamlConfiguration.set("CharacterCommands.GenderError1", "&cTrebuie să introduci un sex! &7(&eMale&7/&eFemale/&eOther&7)");
			yamlConfiguration.set("CharacterCommands.GenderError2", "&cPrea multe argumente! &eFolosește&7: &7/&cchar gender &7(&cMale &7sau &cFemale &7sau &cOther)");
			yamlConfiguration.set("CharacterCommands.GenderError3", "&cTrebuie să alegi sexul dintre Male (masculin), Female (feminin), Other (altul)");
			yamlConfiguration.set("CharacterCommands.GenderSuccess1", "&3Sexul a fost setat la: &eMasculin");
			yamlConfiguration.set("CharacterCommands.GenderSuccess2", "&3Sexul a fost setat la: &eFeminin");
			yamlConfiguration.set("CharacterCommands.GenderSuccess3", "&3Sexul a fost setat la: &eAltul");
			yamlConfiguration.set("CharacterCommands.AgeError1", "&cTrebuie să introduci o vârstă! Folosește&7: &7/&cchar age [age]");
			yamlConfiguration.set("CharacterCommands.AgeError2", "&cPrea multe argumente! &eFolosește: &7/&cchar age [age]");
			yamlConfiguration.set("CharacterCommands.AgeError3", "&7Vârsta trebuie să fie");
			yamlConfiguration.set("CharacterCommands.AgeSuccess", "&3Vârsta a fost setată la");
			yamlConfiguration.set("CharacterCommands.DescError1", "&cTrebuie să setezi o descriere!");
			yamlConfiguration.set("CharacterCommands.DescError2", "&cDescrierea este prea lunga!");
			yamlConfiguration.set("CharacterCommands.DescSuccess", "&3Descrierea a fost setată la");
			yamlConfiguration.set("CharacterCommands.DescCleared", "&aDescrierea ștearsă");
			yamlConfiguration.set("CharacterCommands.ViewError1", "&cPrea multe argumente! &eFolosește&7: &7/&cchar view &8<&cJucător&8>");
			yamlConfiguration.set("CharacterCommands.ViewError2", "&cAcest personaj nu există. A fost șters înainte?");
			yamlConfiguration.set("CharacterCommands.ViewError3", "&7nu este online&3");
			yamlConfiguration.set("CharacterCommands.Invalid", "&c&cComandă invalidă");
			yamlConfiguration.set("CharacterCommands.DeleteSuccess", "@PLAYER &aconfigurație ștearsă!");
			yamlConfiguration.set("CharacterCommands.DeleteError1", "@PLAYER &cconfigurația nu există!");
			yamlConfiguration.set("CharacterCommands.DeleteError2", " &cnu este online!");
			yamlConfiguration.set("CharacterCommands.DeleteError3", "&cTrebuie să introduci numele unui jucător");
			yamlConfiguration.set("Cards", null);
			yamlConfiguration.set("Cards.Name", "Numele personajului");
			yamlConfiguration.set("Cards.Gender", "Sexul personajului");
			yamlConfiguration.set("Cards.Age", "Vârsta personajului");
			yamlConfiguration.set("Cards.Desc", "@PLAYER Descrierea personajului");
			yamlConfiguration.set("Cards.Card", "@PLAYER Card");
			yamlConfiguration.set("Cards.Male", "Masculin ");
			yamlConfiguration.set("Cards.Female", "Feminin ");
			yamlConfiguration.set("Cards.Other", "Altul ");

			try {
				yamlConfiguration.save(romanian);
			} catch (IOException e) {
				Bukkit.getLogger().warning("[CharacterCards] Error when saving language file 'ro'");
			}
		}
	}
	
	public static void initPortuguese() {
		File portuguese = new File("plugins" + File.separator + "CharacterCards" + File.separator + "lang" + File.separator + "ptBR.yml");
		if (!portuguese.exists()) {
			try {
				portuguese.createNewFile();
			} catch (IOException e) {
				Bukkit.getLogger().warning("[CharacterCards] Error when creating language file 'ptBR'");
			}
			YamlConfiguration yamlConfiguration = YamlConfiguration.loadConfiguration(portuguese);
			yamlConfiguration.set("NoPermission", "&cVocê não tem permissão para fazer isso");
			yamlConfiguration.set("NoColors", "&cVocê não pode usar cores!");
			yamlConfiguration.set("EmptyField", "Vazio ");
			yamlConfiguration.set("CharacterCardsCommands", null);
			yamlConfiguration.set("CharacterCardsCommands.Reload", "&3Recarrega o config.yml");
			yamlConfiguration.set("CharacterCardsCommands.ReloadSuccess", "&econfig.yml recarregado");
			yamlConfiguration.set("CharacterCommands.NameHelp", "&7<&bPrimeiro&7> &7{&bÚltimo&7} &7{&bTítulo&7} &8- &3Defina o seu personagem nome");
			yamlConfiguration.set("CharacterCommands.GenderHelp", "&7<&bMale&7/&bFemale/&bOther&7> &8- &3Defina o gênero do seu personagem");
			yamlConfiguration.set("CharacterCommands.AgeHelp", "&3Defina a idade do seu personagem");
			yamlConfiguration.set("CharacterCommands.DescHelp", "&7<&bDescrição&7> &8- &3Defina a descrição do seu personagem");
			yamlConfiguration.set("CharacterCommands.ViewHelp", "&7{&bPlayer&7} &8- &3Visualize seu cartão ou o de outro jogador!");
			yamlConfiguration.set("CharacterCommands.NameError1", "&cMuitos argumentos! &eUse&7: &7/&cChar Name &7<&cPrimeiro&7> &7{&cÚltimo&7} &7{&cTítulo&7}");
			yamlConfiguration.set("CharacterCommands.NameError2", "&cVocê deve inserir um nome!");
			yamlConfiguration.set("CharacterCommands.NameSuccess", "&3Nome definido como");
			yamlConfiguration.set("CharacterCommands.GenderError1", "&cVocê deve inserir um gênero! &7(&eMale&7/&eFemale/&eOther&7)");
			yamlConfiguration.set("CharacterCommands.GenderError2", "&cMuitos argumentos! &eUse&7: &7/&cChar Gender &7(&cMale &7ou &cFemale &7ou &cOther)");
			yamlConfiguration.set("CharacterCommands.GenderError3", "&cVocê deve ser Male&7/&cFemale&7/&cOther");
			yamlConfiguration.set("CharacterCommands.GenderSuccess1", "&3Gênero definido como: &eMacho");
			yamlConfiguration.set("CharacterCommands.GenderSuccess2", "&3Gênero definido como: &eFêmea");
			yamlConfiguration.set("CharacterCommands.GenderSuccess3", "&3Gênero definido como: &eOutro");
			yamlConfiguration.set("CharacterCommands.AgeError1", "&cVocê deve inserir uma idade! Use&7: &7/&cChar Age [idade]");
			yamlConfiguration.set("CharacterCommands.AgeError2", "&cMuitos argumentos! &eUse: &7/&cChar Age [idade]");
			yamlConfiguration.set("CharacterCommands.AgeError3", "&7A idade deve ser");
			yamlConfiguration.set("CharacterCommands.AgeSuccess", "&3Idade definida como");
			yamlConfiguration.set("CharacterCommands.DescError1", "&cVocê deve definir uma descrição!");
			yamlConfiguration.set("CharacterCommands.DescError2", "&cA descrição é muito longa!");
			yamlConfiguration.set("CharacterCommands.DescSuccess", "&3Descrição definida como");
			yamlConfiguration.set("CharacterCommands.DescCleared", "&aDescrição limpa");
			yamlConfiguration.set("CharacterCommands.ViewError1", "&cMuitos argumentos! &eUse&7: &7/&cChar View &8<&cJogador&8>");
			yamlConfiguration.set("CharacterCommands.ViewError2", "&cEste cartão não existe! Foi deletado recentemente?");
			yamlConfiguration.set("CharacterCommands.ViewError3", "&7não está online/nunca entrou antes&3");
			yamlConfiguration.set("CharacterCommands.Invalid", "&cComando inválido");
			yamlConfiguration.set("CharacterCommands.DeleteSuccess", "@PLAYER''s &aarquivo de configuração foi deletado!");
			yamlConfiguration.set("CharacterCommands.DeleteError1", "@PLAYER''s &carquivo de configuração não existe!");
			yamlConfiguration.set("CharacterCommands.DeleteError2", " &cnão está online!");
			yamlConfiguration.set("CharacterCommands.DeleteError3", "&cVocê deve inserir o &cnome &cdo &ejogador");
			yamlConfiguration.set("Cards", null);
			yamlConfiguration.set("Cards.Name", "Nome");
			yamlConfiguration.set("Cards.Gender", "Gênero");
			yamlConfiguration.set("Cards.Age", "Idade");
			yamlConfiguration.set("Cards.Desc", "@PLAYER Desc");
			yamlConfiguration.set("Cards.Card", "@PLAYER Cartão");
			yamlConfiguration.set("Cards.Male", "Macho ");
			yamlConfiguration.set("Cards.Female", "Fêmea ");
			yamlConfiguration.set("Cards.Other", "Outro ");

			try {
				yamlConfiguration.save(portuguese);
			} catch (IOException e) {
				Bukkit.getLogger().warning("[CharacterCards] Error when saving language file 'ptBR'");
			}
		}
	}
	
	public static void initLangs() {
		initEnglish();
		initRomanian();
		initPortuguese();
	}
	
	public static YamlConfiguration getEnglish() {
		File english = new File("plugins" + File.separator + "CharacterCards" + File.separator + "lang" + File.separator + "enUS.yml");
		return YamlConfiguration.loadConfiguration(english);
	}
	
	public static YamlConfiguration getRomanian() {
		File romanian = new File("plugins" + File.separator + "CharacterCards" + File.separator + "lang" + File.separator + "ro.yml");
		return YamlConfiguration.loadConfiguration(romanian);
	}
	
	public static YamlConfiguration getPortuguese() {
		File portuguese = new File("plugins" + File.separator + "CharacterCards" + File.separator + "lang" + File.separator + "ptBR.yml");
		return YamlConfiguration.loadConfiguration(portuguese);
	}
	
	public static YamlConfiguration getLang() {
		if (Config.lang.equalsIgnoreCase("enUs")) {
			return getEnglish();
		} else if (Config.lang.equalsIgnoreCase("ro")) {
			return getRomanian();
		} else if (Config.lang.equalsIgnoreCase("ptBR")) {
			return getPortuguese();
		} else {
			File otherLang = new File("plugins" + File.separator + "CharacterCards" + File.separator + "lang" + File.separator + Config.lang);
			return YamlConfiguration.loadConfiguration(otherLang);
		}
	}
	
	public static String translateGender(YamlConfiguration card, YamlConfiguration lang) {
		if (card.getString("Gender").equalsIgnoreCase("Male")) {
			return lang.getString("Cards.Male");
		} else if (card.getString("Gender").equalsIgnoreCase("Female")) {
			return lang.getString("Cards.Female");
		} else {
			return lang.getString("Gender");
		}
	}
}
