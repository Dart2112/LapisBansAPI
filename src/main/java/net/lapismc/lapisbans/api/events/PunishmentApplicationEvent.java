package net.lapismc.lapisbans.api.events;

import net.lapismc.lapisbans.api.punishments.Punishment;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

@SuppressWarnings("WeakerAccess")
public class PunishmentApplicationEvent extends Event implements Cancellable {

    public static HandlerList handlers = new HandlerList();
    private Punishment punishment;
    private String reason;
    private boolean cancelled = false;

    public PunishmentApplicationEvent(Punishment punishment) {
        this.punishment = punishment;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    public Punishment getPunishment() {
        return punishment;
    }

    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Deprecated
    @Override
    public void setCancelled(boolean cancel) {
        cancelled = cancel;
    }

    public void setCancelled(boolean cancel, String reason) {
        cancelled = cancel;
        this.reason = reason;
    }

    public String getReason() {
        return reason;
    }

    @Override
    public HandlerList getHandlers() {
        return null;
    }
}
