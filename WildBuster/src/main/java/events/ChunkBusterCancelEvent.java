package xyz.wildseries.wildbuster.api.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;
import xyz.wildseries.wildbuster.api.objects.PlayerBuster;

public class ChunkBusterCancelEvent extends PlayerEvent implements Cancellable {

    private static final HandlerList HANDLERS = new HandlerList();

    private final PlayerBuster playerBuster;

    private boolean cancelled;

    public ChunkBusterCancelEvent(Player player, PlayerBuster playerBuster){
        super(player);
        this.playerBuster = playerBuster;
        this.cancelled = false;
    }

    public PlayerBuster getPlayerBuster() {
        return playerBuster;
    }

    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Override
    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

}
