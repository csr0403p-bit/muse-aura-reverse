package com.facebook.aura.model;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.conversation.offline.HatchPersistedMessageJson;
import com.facebook.aura.gateway.HatchChatHandlerKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class HatchMessageUnsendStatus {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchMessageUnsendStatus[] $VALUES;
    public static final HatchMessageUnsendStatus DELETED;
    public static final HatchMessageUnsendStatus NONE;
    public static final HatchMessageUnsendStatus UNSENDING;

    static {
        HatchMessageUnsendStatus hatchMessageUnsendStatus = new HatchMessageUnsendStatus(HatchPersistedMessageJson.UNSEND_STATUS_NONE, 0);
        NONE = hatchMessageUnsendStatus;
        HatchMessageUnsendStatus hatchMessageUnsendStatus2 = new HatchMessageUnsendStatus("UNSENDING", 1);
        UNSENDING = hatchMessageUnsendStatus2;
        HatchMessageUnsendStatus hatchMessageUnsendStatus3 = new HatchMessageUnsendStatus(HatchChatHandlerKt.MESSAGE_STATE_DELETED, 2);
        DELETED = hatchMessageUnsendStatus3;
        HatchMessageUnsendStatus[] hatchMessageUnsendStatusArr = {hatchMessageUnsendStatus, hatchMessageUnsendStatus2, hatchMessageUnsendStatus3};
        $VALUES = hatchMessageUnsendStatusArr;
        $ENTRIES = C3cG.A0w(hatchMessageUnsendStatusArr);
    }

    public static Ey9<HatchMessageUnsendStatus> getEntries() {
        return $ENTRIES;
    }

    public static HatchMessageUnsendStatus valueOf(String str) {
        return (HatchMessageUnsendStatus) Enum.valueOf(HatchMessageUnsendStatus.class, str);
    }

    public static HatchMessageUnsendStatus[] values() {
        return (HatchMessageUnsendStatus[]) $VALUES.clone();
    }

    public HatchMessageUnsendStatus(String str, int i) {
    }
}
