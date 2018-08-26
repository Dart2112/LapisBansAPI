package net.lapismc.lapisbans.api.events;

import net.lapismc.lapisbans.api.punishments.Ban;
import net.lapismc.lapisbans.api.punishments.Punishment;
import net.lapismc.lapiscore.LapisCoreCancellableEvent;

/**
 * This event is fires when a punishment is given to a player
 * You can get the details of the punishment by checking the type of the punishment and casting it to ban for example
 */
@SuppressWarnings("WeakerAccess")
public class PunishmentApplicationEvent extends LapisCoreCancellableEvent {

    private Punishment punishment;

    public PunishmentApplicationEvent(Punishment punishment) {
        this.punishment = punishment;
    }

    /**
     * @return Returns the punishment being acted upon, this will be an extension of punishment like {@link Ban}
     */
    public Punishment getPunishment() {
        return punishment;
    }
}
