package de.nexo.shop;

import org.bukkit.block.Block;
import org.bukkit.block.Chest;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.PlayerInventory;
import org.jetbrains.annotations.NotNull;

public class ShopCommand implements CommandExecutor
{
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args)
    {
        if (!(sender instanceof Player player))
        {
            return true;
        }

        // Test 123

        PlayerInventory playerInventory = player.getInventory();
        Block block = player.getTargetBlock(null, 10);

        if (!(block instanceof Chest))
        {
            return true;
        }

        //ShopInfo shopInfo = new ShopInfo(player.getUniqueId(), block.getLocation(), playerInventory.getItemInOffHand());
        //ShopInfo.infos.put(block.getLocation(), shopInfo);

        return true;
    }
}