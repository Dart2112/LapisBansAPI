/*
 * Copyright 2019 Benjamin Martin
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.lapismc.lapisbans.api;

import net.lapismc.lapisbans.api.punishments.core.PunishmentInterface;
import net.lapismc.lapisbans.api.punishments.core.PunishmentType;

import java.util.List;
import java.util.UUID;

/**
 * This is the LapisBansAPI, it can be used to get and create punishments
 * Methods may be added or removed from this API while LapisBans 2.0.0 is still in Beta
 */
public interface LapisBansAPI {

    /**
     * Get all punishments applied to a UUID, this includes punishments that have ended e.g. expired temp bans
     *
     * @param uuid The UUID of the player you wish to lookup
     * @return Returns a list of punishments where the {@link PunishmentInterface#getAppliedTo()} is equal to the provided UUID
     */
    List<PunishmentInterface> getAllPunishments(UUID uuid);

    /**
     * Get all currently active punishments applied to a player, this excludes punishments that have ended
     *
     * @param uuid The UUID of the player you wish to lookup
     * @return Returns a list of punishments where the {@link PunishmentInterface#getAppliedTo()} is equal to the provided UUID
     */
    List<PunishmentInterface> getAllActivePunishments(UUID uuid);

    /**
     * Get all punishments applied by a user, these are punishments set by the provided UUID
     *
     * @param uuid The UUID of the user you wish to look up
     * @return Returns a list of punishments where the {@link PunishmentInterface#getAppliedBy()} is equal to the provided UUID
     */
    List<PunishmentInterface> getPunishmentsAppliedBy(UUID uuid);

    /**
     * Generate and return a punishment
     *
     * @param type      The type of punishment you would like to make e.g. {@link PunishmentType#Ban}
     * @param appliedTo The UUID of the player the punishment should be applied to
     *                  (Use {@link #ipAddressToUUID(String)} to get the UUID for IP bans)
     * @param appliedBy The UUID of the user that applied the punishment
     * @param reason    The reason for the punishment
     * @param isShadow  True if the punishment should be a shadow punishment (Doesn't apply to warning or kick)
     * @param isTemp    True if the punishment should expire at some point (Also doesn't apply to warning or kick)
     * @param start     The start time of the punishment
     * @param length    The length of the punishment in milliseconds, should be 0 if isTemp is false
     * @return Returns the Punishment object that represents values provided
     */
    PunishmentInterface createPunishment(PunishmentType type, UUID appliedTo, UUID appliedBy, String reason, boolean isShadow, boolean isTemp, Long start, Long length);

    /**
     * IP addresses are stored as UUIDs because all punishment types store data the same way,
     * This means you need a way to convert an IP address to an UUID to create a punishment
     * This is exactly what this method does, use the IP ban punishment method of getIPAddress() to do the reverse
     *
     * @param ip The IP address you wish to convert to an UUID
     * @return Returns the UUID of the IP address provided
     */
    UUID ipAddressToUUID(String ip);

    /**
     * Get the UUID of the console, this can be used for {@link #getPunishmentsAppliedBy(UUID)}
     */
    UUID getConsoleUUID();

}
