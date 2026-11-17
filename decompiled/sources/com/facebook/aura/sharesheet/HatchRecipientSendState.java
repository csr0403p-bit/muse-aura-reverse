package com.facebook.aura.sharesheet;

import X.Ey9;
import X.F3w;
import com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson;
import com.facebook.aura.conversation.offline.HatchPersistedMessageJson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class HatchRecipientSendState {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchRecipientSendState[] $VALUES;
    public static final HatchRecipientSendState FAILED;
    public static final HatchRecipientSendState IDLE;
    public static final HatchRecipientSendState SENDING;
    public static final HatchRecipientSendState SENT;
    public static final HatchRecipientSendState UNDO;

    static {
        HatchRecipientSendState hatchRecipientSendState = new HatchRecipientSendState("IDLE", 0);
        IDLE = hatchRecipientSendState;
        HatchRecipientSendState hatchRecipientSendState2 = new HatchRecipientSendState("UNDO", 1);
        UNDO = hatchRecipientSendState2;
        HatchRecipientSendState hatchRecipientSendState3 = new HatchRecipientSendState("SENDING", 2);
        SENDING = hatchRecipientSendState3;
        HatchRecipientSendState hatchRecipientSendState4 = new HatchRecipientSendState(HatchPersistedMessageJson.SEND_STATUS_SENT, 3);
        SENT = hatchRecipientSendState4;
        HatchRecipientSendState hatchRecipientSendState5 = new HatchRecipientSendState(CvmMigrationStatusJson.STAGE_FAILED, 4);
        FAILED = hatchRecipientSendState5;
        HatchRecipientSendState[] hatchRecipientSendStateArr = {hatchRecipientSendState, hatchRecipientSendState2, hatchRecipientSendState3, hatchRecipientSendState4, hatchRecipientSendState5};
        $VALUES = hatchRecipientSendStateArr;
        $ENTRIES = new F3w(hatchRecipientSendStateArr);
    }

    public static Ey9<HatchRecipientSendState> getEntries() {
        return $ENTRIES;
    }

    public static HatchRecipientSendState valueOf(String str) {
        return (HatchRecipientSendState) Enum.valueOf(HatchRecipientSendState.class, str);
    }

    public static HatchRecipientSendState[] values() {
        return (HatchRecipientSendState[]) $VALUES.clone();
    }

    public HatchRecipientSendState(String str, int i) {
    }
}
