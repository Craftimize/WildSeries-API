package xyz.wildseries.wildstacker.api.objects;

import org.bukkit.Location;
import org.bukkit.entity.ArmorStand;
import org.bukkit.inventory.ItemStack;

@Deprecated
@SuppressWarnings("unused")
public interface Barrel {

    ItemStack getItemStack(int amount);

    Location getLocation();

    void createBlockDisplay();

    void removeBlockDisplay();

    ArmorStand getBlockDisplay();

}
