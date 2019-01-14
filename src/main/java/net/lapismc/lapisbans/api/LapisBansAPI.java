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

public interface LapisBansAPI {

    /*
    This API is not complete
    It may take some time to completely implement it
     */

    List<PunishmentInterface> getAllPunishments(UUID uuid);

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

}
