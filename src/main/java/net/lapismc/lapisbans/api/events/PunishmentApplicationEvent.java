package net.lapismc.lapisbans.api.events;

import net.lapismc.lapisbans.api.punishments.Ban;
import net.lapismc.lapisbans.api.punishments.Punishment;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 * This event is fires when a punishment is given to a player
 * You can get the details of the punishment by checking the type of the punishment and casting it to ban for example
 */
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

    /**
     * @return Returns the punishment being acted upon, this will be an extension of punishment like {@link Ban}
     */
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

    /**
     * Use this method to cancel the punishment with a reason that will be relayed to the source of the punishment
     *
     * @param cancel true if the punishment should be stopped
     * @param reason The reason that the punishment was cancelled and to be sent to the source of the punishment
     */
    public void setCancelled(boolean cancel, String reason) {
        cancelled = cancel;
        this.reason = reason;
    }

    /**
     * @return Returns true if the application of punishment has been cancelled
     */
    public String getReason() {
        return reason;
    }

    @Override
    public HandlerList getHandlers() {
        return null;
    }
}
