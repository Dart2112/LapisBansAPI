/*
 * Copyright 2026 Benjamin Martin
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

/**
 * This is used to refer to the type of each punishment, note that these do not distinguish if it is a temporary punishment
 * To test for a temp punishment, check if it implements TemporaryPunishmentInterface
 */
public enum PunishmentType {
    /**
     * Ban is used for both Ban and TempBan
     */
    Ban,
    /**
     * Kicks are instantaneous and therefore a player may have multiple of these
     */
    Kick,
    /**
     * IPBan is used for both IPBan and TempIPBan
     */
    IPBan,
    /**
     * Mute is used for both Mute and TempMute
     */
    Mute,
    /**
     * Warnings are instantaneous and therefore a player may have multiple of these
     */
    Warning
}
