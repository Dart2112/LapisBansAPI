package net.lapismc.lapisbans.api.punishments;

import net.lapismc.lapisbans.playerdata.datastorage.DataStore;
import net.lapismc.lapisbans.playerdata.datastorage.Tables;

import java.util.UUID;

public class Kick extends Punishment {

    public Kick(UUID source, UUID target, String reason) {
        super(source, target, reason, false, 0L);
    }

    @Override
    public Long getTimePlaced(DataStore ds) {
        Long newest = 0L;
        for (Long time : ds.getLongList(Tables.History.name(), "UUID", getTarget().toString(), "Time")) {
            if (ds.getString(Tables.History.name(), "Time", time.toString(), "Action").equals("Kick")) {
                if (time > newest) {
                    newest = time;
                }
            }
        }
        return newest;
    }
}
