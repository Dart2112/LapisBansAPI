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

import java.util.Collection;
import java.util.List;

/**
 * A class for storing a list of {@link PunishmentInterface}'s. This is required because of the way the API is structured
 * There is no need for the user of this API to use this interface or any implementation of it, it is simply used to make
 * converting a list of punishments to a list of {@link PunishmentInterface}'s easier
 */
public interface PunishmentListInterface {

    /**
     * Get the number of items currently in the list
     *
     * @return Returns the number of Punishments stored
     */
    Integer size();

    /**
     * Get the punishment at any index
     *
     * @param index The index you wish to fetch
     * @return Returns the {@link PunishmentInterface} at the index provided
     */
    PunishmentInterface get(Integer index);

    /**
     * Add a {@link PunishmentInterface} to the list
     *
     * @param punishment The punishment you wish to add
     */
    void add(PunishmentInterface punishment);

    /**
     * Add multiple vales at once
     *
     * @param punishments The collection of {@link PunishmentInterface}'s you wish to add
     */
    void addAll(Collection<PunishmentInterface> punishments);

    /**
     * Remove a {@link PunishmentInterface} from the list
     *
     * @param punishment the punishment you wish to remove
     */
    void remove(PunishmentInterface punishment);

    /**
     * Get the {@link PunishmentInterface}'s currently stored as a {@link List}
     *
     * @return Returns a list of the currently stored punishments
     */
    List<PunishmentInterface> getAsList();

}
