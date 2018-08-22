package net.lapismc.lapisbans.api.events;

import net.lapismc.lapisbans.api.punishments.Ban;
import net.lapismc.lapisbans.api.punishments.Punishment;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 * This event is to notify plugins about punishment actions like a player being kicked because they are banned
 * or a players chat message or command being cancelled because they are muted
 * Note that you can't cancel this, it is only to notify
 */
@SuppressWarnings("WeakerAccess")
public class PunishmentActionEvent extends Event {

    public static HandlerList handlers = new HandlerList();
    private Punishment punishment;

    public PunishmentActionEvent(Punishment punishment) {
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
    public HandlerList getHandlers() {
        return handlers;
    }
}
