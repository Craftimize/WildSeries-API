package xyz.wildseries.wildstacker.api;

import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.block.CreatureSpawner;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Item;
import org.bukkit.entity.LivingEntity;
import xyz.wildseries.wildstacker.api.objects.Barrel;
import xyz.wildseries.wildstacker.api.objects.StackedBarrel;
import xyz.wildseries.wildstacker.api.objects.StackedEntity;
import xyz.wildseries.wildstacker.api.objects.StackedItem;
import xyz.wildseries.wildstacker.api.objects.StackedSpawner;

@SuppressWarnings({"WeakerAccess", "unused", "deprecation"})
public final class WildStackerAPI {

    private static WildStacker instance;

    /**
     * Get a stacked-item object for an item.
     *
     * @param item an item to check
     * @return stacked-item object
     */
    public static StackedItem getStackedItem(Item item){
        return instance.getSystemManager().getStackedItem(item);
    }

    /**
     * Get a stacked-amount for an item.
     *
     * @param item an item to check
     * @return stacked-amount
     */
    public static int getItemAmount(Item item){
        return getStackedItem(item).getStackAmount();
    }

    /**
     * Get a stacked-entity object for a living entity.
     *
     * @param livingEntity a living-entity to check
     * @return stacked-entity object
     */
    public static StackedEntity getStackedEntity(LivingEntity livingEntity){
        return instance.getSystemManager().getStackedEntity(livingEntity);
    }

    /**
     * Get a stacked-amount for an entity.
     *
     * @param livingEntity an entity to check
     * @return stacked-amount
     */
    public static int getEntityAmount(LivingEntity livingEntity){
        return getStackedEntity(livingEntity).getStackAmount();
    }

    /**
     * Get a stacked-spawner object for a spawner.
     *
     * @param spawner a spawner to check
     * @return stacked-spawner object
     */
    public static StackedSpawner getStackedSpawner(CreatureSpawner spawner){
        return instance.getSystemManager().getStackedSpawner(spawner);
    }

    /**
     * Get a stacked-amount for a spawner.
     *
     * @param spawner a spawner to check
     * @return stacked-amount
     */
    public static int getSpawnersAmount(CreatureSpawner spawner){
        return getStackedSpawner(spawner).getStackAmount();
    }

    /**
     * Get a stacked-barrel object for a block.
     *
     * @param block a block to check
     * @return stacked-barrel object
     */
    public static StackedBarrel getStackedBarrel(Block block){
        return instance.getSystemManager().getStackedBarrel(block);
    }

    /**
     * Get a stacked-amount for a barrel.
     *
     * @param block a barrel to check
     * @return stacked-amount
     */
    public static int getBarrelAmount(Block block){
        return getStackedBarrel(block).getStackAmount();
    }

    /**
     * Get a stacked-barrel object for a block.
     *
     * @param barrel a barrel to check
     * @return stacked-barrel object
     */
    public static StackedBarrel getStackedBarrel(Barrel barrel){
        return instance.getSystemManager().getStackedBarrel(barrel.getLocation().getBlock());
    }

    /**
     * Get a stacked-amount for a barrel.
     *
     * @param barrel a barrel to check
     * @return stacked-amount
     */
    public static int getBarrelAmount(Barrel barrel){
        return getStackedBarrel(barrel).getStackAmount();
    }

    /**
     * Get a barrel for a block.
     *
     * @param block a block to check
     * @return barrel object
     */
    public static Barrel getBarrel(Block block){
        return instance.getSystemManager().getLinkedBarrel(block);
    }

    /**
     * Get the wildstacker object.
     *
     * @return wildstacker object
     */
    public static WildStacker getWildStacker(){
        return instance;
    }

    /**
     * This method will spawn an entity without stacking it to another entity.
     *
     * @param location location to spawn the entity in
     * @param type type of entity to spawn
     * @return The entity that was spawned.
     */
    public static Entity spawnEntityWithoutStacking(Location location, EntityType type){
        return instance.getSystemManager().spawnEntityWithoutStacking(location, type.getEntityClass());
    }

}
