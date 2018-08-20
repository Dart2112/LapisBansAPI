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

import net.lapismc.lapisbans.LapisBans;
import org.bukkit.OfflinePlayer;

import java.util.UUID;

@SuppressWarnings("unused")
public class LapisBansAPI {

    private static LapisBans plugin;
    /**
     * This UUID is used when console punishes someone
     */
    public UUID consoleUUID = UUID.nameUUIDFromBytes("Console".getBytes());

    /**
     * This is a constructor for LapisBans to set the plugin variable
     * Don't use this constructor
     *
     * @param plugin The LapisBans instance being used
     */
    public LapisBansAPI(LapisBans plugin) {
        LapisBansAPI.plugin = plugin;
    }

    /**
     * Use this constructor to get the API
     */
    public LapisBansAPI() {
    }

    /**
     * @param uuid The {@link UUID} of the player you wish to get
     * @return The {@link LapisBansPlayer} object for the UUID given
     */
    public LapisBansPlayer getPlayer(UUID uuid) {
        return plugin.getPlayer(uuid);
    }

    /**
     * @param op The {@link OfflinePlayer} or {@link org.bukkit.entity.Player} of the player you wish to get
     * @return The {@link LapisBansPlayer} object for the {@link org.bukkit.entity.Player} given
     */
    public LapisBansPlayer getPlayer(OfflinePlayer op) {
        return plugin.getPlayer(op);
    }

    /**
     * @param ip The String form of an IPAddress
     * @return Returns the {@link LapisBansAddress} object for the given IP
     */
    public LapisBansAddress getAddress(String ip) {
        return plugin.getAddress(ip);
    }

}
