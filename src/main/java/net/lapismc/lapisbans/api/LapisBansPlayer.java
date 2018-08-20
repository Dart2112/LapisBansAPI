/*
 * Copyright 2018 Benjamin Martin
 *
 * MICROSOFT REFERENCE SOURCE LICENSE (MS-RSL)
 *
 * This license governs use of the accompanying software. If you use the software, you accept this license. If you do not accept the license, do not use the software.
 * 1. Definitions
 *
 * The terms "reproduce," "reproduction" and "distribution" have the same meaning here as under U.S. copyright law.
 *
 * "You" means the licensee of the software.
 *
 * "Your company" means the company you worked for when you downloaded the software.
 *
 * "Reference use" means use of the software within your company as a reference, in read only form, for the sole purposes of debugging your products, maintaining your products, or enhancing the interoperability of your products with the software, and specifically excludes the right to distribute the software outside of your company.
 *
 * "Licensed patents" means any Licensor patent claims which read directly on the software as distributed by the Licensor under this license.
 * 2. Grant of Rights
 *
 * (A) Copyright Grant- Subject to the terms of this license, the Licensor grants you a non-transferable, non-exclusive, worldwide, royalty-free copyright license to reproduce the software for reference use.
 *
 * (B) Patent Grant- Subject to the terms of this license, the Licensor grants you a non-transferable, non-exclusive, worldwide, royalty-free patent license under licensed patents for reference use.
 * 3. Limitations
 *
 * (A) No Trademark License- This license does not grant you any rights to use the Licensor's name, logo, or trademarks.
 *
 * (B) If you begin patent litigation against the Licensor over patents that you think may apply to the software (including a cross-claim or counterclaim in a lawsuit), your license to the software ends automatically.
 *
 * (C) The software is licensed "as-is." You bear the risk of using it. The Licensor gives no express warranties, guarantees or conditions. You may have additional consumer rights under your local laws which this license cannot change. To the extent permitted under your local laws, the Licensor excludes the implied warranties of merchantability, fitness for a particular purpose and non-infringement.
 */

package net.lapismc.lapisbans.api;

import net.lapismc.lapisbans.api.punishments.Ban;
import net.lapismc.lapisbans.api.punishments.Mute;
import net.lapismc.lapisbans.api.punishments.Warning;

import java.util.List;
import java.util.UUID;

public interface LapisBansPlayer {

    /**
     * @return Returns the {@link UUID} of the player this object represents
     */
    UUID getUniqueId();

    /**
     * Set the IP address of the player in the LapisBans database
     *
     * @param ip The IP address you wish to associate with this player
     */
    void setIPAddress(String ip);

    /**
     * @return Returns the {@link LapisBansAddress} object representing the players IP address
     */
    LapisBansAddress getAddress();

    /**
     * @return Returns true if the player is banned
     */
    boolean isBanned();

    /**
     * @return Returns the {@link Ban} object representing this players ban, null if the player isn't banned
     */
    Ban getBan();

    /**
     * Ban the player
     *
     * @param source   The {@link UUID} of the banner
     * @param reason   The reason for the ban
     * @param isTemp   True if the ban is only temporary
     * @param expiry   The Epoch milliseconds that the ban will expire at, use 0L if it is a permanent ban
     * @param isShadow True if the player should be shadow banned
     */
    void banPlayer(UUID source, String reason, boolean isTemp, Long expiry, boolean isShadow);

    /**
     * Remove the ban from this player
     */
    void unBanPlayer();

    /**
     * @return Returns true if the player is currently banned
     */
    boolean isMuted();

    /**
     * @return Returns the {@link Mute} object representing the mute, null if the player isn't muted
     */
    Mute getMute();

    /**
     * Mute the player
     *
     * @param source The {@link UUID} of the muter
     * @param reason The reason for the mute
     * @param isTemp True if the mute is only temporary
     * @param expiry The Epoch milliseconds that the mute will expire at, use 0L if it is a permanent mute
     */
    void mutePlayer(UUID source, String reason, boolean isTemp, Long expiry);

    /**
     * Removed the mute from the player
     */
    void unMutePlayer();

    /**
     * @return Returns a {@link List} of {@link Warning} that contains all of the players active warnings
     */
    List<Warning> getWarnings();

    /**
     * Warn the player
     *
     * @param source The {@link UUID} of the warner
     * @param reason The reason for the warning
     * @param expiry The Epoch milliseconds that the warning will expire at
     */
    void warnPlayer(UUID source, String reason, Long expiry);

    /**
     * @param warning Remove the warning from a player
     */
    void removeWarning(Warning warning);

}
