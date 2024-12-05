package de.nexo.shop;

import org.bukkit.Location;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class ShopInfo
{
    public static Map<Location, ShopInfo> infos =  new HashMap<>();

    private UUID uuid;
    private Location location;
    private ItemStack product;
    private ItemStack price;

    public ShopInfo(UUID uuid, Location location, ItemStack product, ItemStack price)
    {
        this.uuid = uuid;
        this.location = location;
        this. product = product;
        this.price = price;
    }

    public UUID getUuid()
    {
        return uuid;
    }

    public Location getLocation()
    {
        return location;
    }

    public ItemStack getProduct()
    {
        return product;
    }

    public ItemStack getPrice()
    {
        return price;
    }
}