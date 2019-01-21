package me.angeschossen.lands.api.events;

import me.angeschossen.lands.api.objects.LandChunk;
import me.angeschossen.lands.api.objects.LandPlayer;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class LandChunkLeaveEvent extends Event implements Cancellable {

    public static HandlerList handlerList = new HandlerList();
    private boolean cancelled;

    private LandPlayer landPlayer;
    private LandChunk landChunk;
    private boolean delete;

    public LandChunkLeaveEvent(LandPlayer landPlayer, LandChunk landChunk, boolean delete) {
        this.landChunk = landChunk;
        this.landPlayer = landPlayer;
        this.delete = delete;
    }

    public LandChunk getLandChunk() {
        return landChunk;
    }

    public LandPlayer getLandPlayer() {
        return landPlayer;
    }

    public boolean isDelete() {
        return delete;
    }

    public static HandlerList getHandlerList() {
        return handlerList;
    }

    @Override
    public boolean isCancelled() {
        return this.cancelled;
    }

    @Override
    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    @Override
    public HandlerList getHandlers() {
        return handlerList;
    }
}
