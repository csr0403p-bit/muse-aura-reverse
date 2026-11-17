package com.facebook.aura.conversation.offline;

import X.AbstractC6555EEr;
import X.C7384Etj;
import X.EHO;
import X.EI3;
import android.database.SQLException;

/* loaded from: classes5.dex */
public final class PurgeOversizedMessagesCallback extends AbstractC6555EEr {
    public static final PurgeOversizedMessagesCallback INSTANCE = new PurgeOversizedMessagesCallback();

    @Override // X.AbstractC6555EEr
    public void onOpen(EI3 ei3) throws SQLException {
        C7384Etj.A0Y(ei3, 0);
        ((EHO) ei3).A00.execSQL("DELETE FROM offline_messages WHERE LENGTH(json) > ?", new Integer[]{524288});
    }
}
