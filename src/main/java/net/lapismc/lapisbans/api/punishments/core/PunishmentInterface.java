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

package net.lapismc.lapisbans.api.punishments.core;

import java.util.UUID;

public interface PunishmentInterface {

    /**
     * Get the UUID of the player the punishment has been applied to
     *
     * @return Returns the UUID of the player that this punishment has been applied to
     */
    UUID getAppliedTo();

    /**
     * Get the UUID of the user who applied the punishment
     *
     * @return Returns the UUID of the user that applied this punishment
     */
    UUID getAppliedBy();

    /**
     * Get the reason for this punishment
     *
     * @return Returns the reason that was given when this punishment was applied
     */
    String getReason();

    /**
     * Is the punishment shadow, shadow punishments will not notify the player in any way
     *
     * @return Returns true if this punishment is a shadow punishment, otherwise false
     */
    boolean isShadow();

    /**
     * Get the system time when the punishment started
     *
     * @return Returns the time when the punishment started
     */
    Long getStart();

    /**
     * Creates the punishment in the database and adds it to the punishment manager
     * Adding it to the punishment manager will implement the punishment, e.g. kicking the player if its a ban
     */
    void createPunishment();

    /**
     * Reverse the punishment
     * This will disable the effects of the punishment and remove it from the database and history
     */
    void reversePunishment();

    /**
     * Returns the action this punishment makes e.g. Ban would return Banned
     * This is used for announcements
     *
     * @return The action this punishment takes
     */
    String getActioned();

    /**
     * Returns the name of the punishment, e.g. Ban would return Ban
     *
     * @return Returns the name of the punishment
     */
    String getAction();


}
