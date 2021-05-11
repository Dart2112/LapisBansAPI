/*
 * Copyright 2021 Benjamin Martin
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

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * A class for storing a list of {@link PunishmentInterface}'s. This is required because of the way the API is structured
 * There is no need for the user of this API to use this class, it is simply used to make
 * converting a list of punishments to a list of {@link PunishmentInterface}'s easier
 */
public class PunishmentList {

    private final List<Object> list;

    /**
     * Setup the list
     */
    public PunishmentList() {
        list = new ArrayList<>();
    }

    /**
     * Get the number of items currently in the list
     *
     * @return Returns the number of Punishments stored
     */
    public Integer size() {
        return list.size();
    }

    /**
     * Get the punishment at any index
     *
     * @param index The index you wish to fetch
     * @return Returns the {@link PunishmentInterface} at the index provided
     */
    public PunishmentInterface get(Integer index) {
        return (PunishmentInterface) list.get(index);
    }

    /**
     * Add a {@link PunishmentInterface} to the list
     *
     * @param punishment The punishment you wish to add
     */
    public void add(PunishmentInterface punishment) {
        list.add(punishment);
    }

    /**
     * Add multiple vales at once
     *
     * @param punishments The collection of {@link PunishmentInterface}'s you wish to add
     */
    public void addAll(Collection<PunishmentInterface> punishments) {
        list.addAll(punishments);
    }

    /**
     * Remove a {@link PunishmentInterface} from the list
     *
     * @param punishment the punishment you wish to remove
     */
    public void remove(PunishmentInterface punishment) {
        list.remove(punishment);
    }

    /**
     * Get the {@link PunishmentInterface}'s currently stored as a {@link List}
     *
     * @return Returns a list of the currently stored punishments
     */
    public List<PunishmentInterface> getAsList() {
        List<PunishmentInterface> interfaceList = new ArrayList<>();
        for (Object pObject : list) {
            interfaceList.add((PunishmentInterface) pObject);
        }
        return interfaceList;
    }

}
