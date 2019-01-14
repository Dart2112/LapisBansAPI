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

package net.lapismc.lapisbans.api.punishments.temporary;

import net.lapismc.lapisbans.api.punishments.core.TemporaryPunishmentInterface;

public interface TempIPBanInterface extends TemporaryPunishmentInterface {

    /**
     * Get the IP address that this ban applies to
     * This is required as {@link #getAppliedTo()} returns a UUID
     *
     * @return Returns the IP Address this ban applies to
     */
    String getIPAddress();

}