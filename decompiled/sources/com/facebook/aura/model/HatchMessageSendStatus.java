package com.facebook.aura.model;

import X.Ey9;
import X.F3w;
import com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson;
import com.facebook.aura.conversation.offline.HatchPersistedMessageJson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class HatchMessageSendStatus {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchMessageSendStatus[] $VALUES;
    public static final HatchMessageSendStatus FAILED;
    public static final HatchMessageSendStatus SENDING;
    public static final HatchMessageSendStatus SENT;

    static {
        HatchMessageSendStatus hatchMessageSendStatus = new HatchMessageSendStatus(HatchPersistedMessageJson.SEND_STATUS_SENT, 0);
        SENT = hatchMessageSendStatus;
        HatchMessageSendStatus hatchMessageSendStatus2 = new HatchMessageSendStatus("SENDING", 1);
        SENDING = hatchMessageSendStatus2;
        HatchMessageSendStatus hatchMessageSendStatus3 = new HatchMessageSendStatus(CvmMigrationStatusJson.STAGE_FAILED, 2);
        FAILED = hatchMessageSendStatus3;
        HatchMessageSendStatus[] hatchMessageSendStatusArr = {hatchMessageSendStatus, hatchMessageSendStatus2, hatchMessageSendStatus3};
        $VALUES = hatchMessageSendStatusArr;
        $ENTRIES = new F3w(hatchMessageSendStatusArr);
    }

    public static Ey9<HatchMessageSendStatus> getEntries() {
        return $ENTRIES;
    }

    public static HatchMessageSendStatus valueOf(String str) {
        return (HatchMessageSendStatus) Enum.valueOf(HatchMessageSendStatus.class, str);
    }

    public static HatchMessageSendStatus[] values() {
        return (HatchMessageSendStatus[]) $VALUES.clone();
    }

    public HatchMessageSendStatus(String str, int i) {
    }
}
