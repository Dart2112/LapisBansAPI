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

public interface TemporaryPunishmentInterface extends PunishmentInterface {

    /**
     * Get the length of the punishment in Milliseconds
     *
     * @return Returns the length of the punishment
     */
    Long getLength();

    /**
     * Set the length of this punishment
     * This is primarily used for warnings where the length is based on a config value
     *
     * @param length The length of time that this punishment will last (in Milliseconds)
     */
    void setLength(Long length);

    /**
     * Calculates and returns the end of the punishment based on the start and length values
     *
     * @return Returns the system time when the punishment should expire
     */
    Long getEnd();

    /**
     * Uses the {@link #getEnd()} method to check if the punishment has ended
     *
     * @return Returns true if the punishment has ended/expired, otherwise false
     */
    boolean hasEnded();

}
