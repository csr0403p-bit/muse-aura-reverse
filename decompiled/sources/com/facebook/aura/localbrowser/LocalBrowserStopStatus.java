package com.facebook.aura.localbrowser;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson;
import com.facebook.aura.conversation.offline.HatchPersistedMessageJson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class LocalBrowserStopStatus {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ LocalBrowserStopStatus[] $VALUES;
    public static final LocalBrowserStopStatus FAILED;
    public static final LocalBrowserStopStatus NONE;
    public static final LocalBrowserStopStatus REPORTING;
    public static final LocalBrowserStopStatus STOPPING;

    static {
        LocalBrowserStopStatus localBrowserStopStatus = new LocalBrowserStopStatus(HatchPersistedMessageJson.UNSEND_STATUS_NONE, 0);
        NONE = localBrowserStopStatus;
        LocalBrowserStopStatus localBrowserStopStatus2 = new LocalBrowserStopStatus("REPORTING", 1);
        REPORTING = localBrowserStopStatus2;
        LocalBrowserStopStatus localBrowserStopStatus3 = new LocalBrowserStopStatus("STOPPING", 2);
        STOPPING = localBrowserStopStatus3;
        LocalBrowserStopStatus localBrowserStopStatus4 = new LocalBrowserStopStatus(CvmMigrationStatusJson.STAGE_FAILED, 3);
        FAILED = localBrowserStopStatus4;
        LocalBrowserStopStatus[] localBrowserStopStatusArr = {localBrowserStopStatus, localBrowserStopStatus2, localBrowserStopStatus3, localBrowserStopStatus4};
        $VALUES = localBrowserStopStatusArr;
        $ENTRIES = C3cG.A0w(localBrowserStopStatusArr);
    }

    public static Ey9<LocalBrowserStopStatus> getEntries() {
        return $ENTRIES;
    }

    public static LocalBrowserStopStatus valueOf(String str) {
        return (LocalBrowserStopStatus) Enum.valueOf(LocalBrowserStopStatus.class, str);
    }

    public static LocalBrowserStopStatus[] values() {
        return (LocalBrowserStopStatus[]) $VALUES.clone();
    }

    public LocalBrowserStopStatus(String str, int i) {
    }
}
