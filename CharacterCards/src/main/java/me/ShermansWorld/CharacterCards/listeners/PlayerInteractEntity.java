package me.ShermansWorld.CharacterCards.listeners;

import org.bukkit.Material;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.inventory.EquipmentSlot;

import me.ShermansWorld.CharacterCards.Cards;
import me.ShermansWorld.CharacterCards.config.Config;
import me.ShermansWorld.CharacterCards.lang.Languages;

public class PlayerInteractEntity implements Listener {

	YamlConfiguration lang = Languages.getLang();

	@EventHandler
	public void onEntityClick(PlayerInteractEntityEvent e) {
		if (e.getRightClicked() instanceof Player) {
			Player player = e.getPlayer();
			Player target = (Player) e.getRightClicked();

			if ((player.getInventory().getItemInMainHand().getType() == Material.PAPER
					|| player.getInventory().getItemInOffHand().getType() == Material.PAPER)
					&& e.getHand().equals(EquipmentSlot.HAND)) {
				if (!Config.paperRightClick) {
					return;
				}
				Cards.displayCardFromInteract(player, target);
				return;
			}
			if (e.getRightClicked() instanceof Player && player.isSneaking() && e.getHand().equals(EquipmentSlot.HAND)
					&& player.getInventory().getItemInMainHand().getType().equals(Material.AIR)) {
				if (!Config.shiftRightClick) {
					return;
				}
				Cards.displayCardFromInteract(player, target);
				return;
			}
		}
	}

}
