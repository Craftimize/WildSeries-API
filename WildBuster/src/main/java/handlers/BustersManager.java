package xyz.wildseries.wildbuster.api.handlers;

import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.OfflinePlayer;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import xyz.wildseries.wildbuster.api.objects.BlockData;
import xyz.wildseries.wildbuster.api.objects.ChunkBuster;
import xyz.wildseries.wildbuster.api.objects.PlayerBuster;

import java.util.List;
import java.util.UUID;

public interface BustersManager {

    ChunkBuster getChunkBuster(String name);

    ChunkBuster getChunkBuster(ItemStack item);

    List<ChunkBuster> getChunkBusters();

    PlayerBuster getPlayerBuster(Chunk chunk);

    boolean isChunkBusted(Chunk chunk);

    List<PlayerBuster> getPlayerBusters();

    List<PlayerBuster> getPlayerBusters(OfflinePlayer player);

    ChunkBuster createChunkBuster(String name, int radius, ItemStack busterItem);

    PlayerBuster createPlayerBuster(Player player, Location placedLocation, ChunkBuster buster);

    PlayerBuster loadPlayerBuster(String busterName, UUID uuid, World world, boolean cancelStatus, boolean notifyStatus, int currentLevel, List<Chunk> chunksList, List<BlockData> removedBlocks);

    void removePlayerBuster(PlayerBuster buster);

    void setNotifyBuster(PlayerBuster buster);

    PlayerBuster getNotifyBuster(UUID uuid);

}
