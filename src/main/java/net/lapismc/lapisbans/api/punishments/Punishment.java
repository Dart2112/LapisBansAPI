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

package net.lapismc.lapisbans.api.punishments;

import net.lapismc.lapisbans.playerdata.DataStore;

import java.util.UUID;

@SuppressWarnings("unused")
public abstract class Punishment {

    private final UUID source;
    private final UUID target;
    private final String reason;
    private final boolean isTemp;
    private final Long expiry;

    Punishment(UUID source, UUID target, String reason, boolean isTemp, Long expiry) {
        this.source = source;
        this.target = target;
        this.reason = reason;
        this.isTemp = isTemp;
        this.expiry = isTemp ? expiry : 0L;
    }

    /**
     * @return Returns the {@link UUID} of the player who has been punished
     */
    public UUID getSource() {
        return source;
    }

    /**
     * @return Returns the UUID of the user who gave the punishment, this can be the ConsoleUUID
     */
    public UUID getTarget() {
        return target;
    }

    /**
     * @return Returns the reason given for this punishment
     */
    public String getReason() {
        return reason;
    }

    /**
     * @return True if the punishment has an expiry
     */
    public boolean isTemp() {
        return isTemp;
    }

    /**
     * @return Returns the epoch milliseconds that this punishment will expire at, will be 0L if the punishment doesn't expire
     */
    public Long getExpiry() {
        return expiry;
    }

    /**
     * @param ds The {@link DataStore} object that contains the history
     * @return Returns the Epoch time in milliseconds of when the punishment was made
     */
    public abstract Long getTimePlaced(DataStore ds);

}
