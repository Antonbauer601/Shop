package de.nexo.shop;

import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;

public class ShopListener implements Listener
{
    @EventHandler
    public void click(PlayerInteractEvent event)
    {
        Block block = event.getClickedBlock();
        if (block == null)
        {
            return;
        }
        if (block.getBlockData().getMaterial() == Material.CHEST)
        {
            Inventory shopInventory = Bukkit.createInventory(null, 54, Component.text("Shop" + player));
            player.openInventory(shopInventory);
            inventories.put(player.getUniqueId(), backpack);

        }
    }
}
