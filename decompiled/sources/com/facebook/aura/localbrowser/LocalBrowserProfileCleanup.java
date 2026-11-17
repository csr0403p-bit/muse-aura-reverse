package com.facebook.aura.localbrowser;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class LocalBrowserProfileCleanup {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ LocalBrowserProfileCleanup[] $VALUES;
    public static final LocalBrowserProfileCleanup ACTIVE;
    public static final LocalBrowserProfileCleanup CLEARED_AWAITING_PROCESS_RESTART;
    public static final LocalBrowserProfileCleanup CLEARING;
    public static final LocalBrowserProfileCleanup FAILED;

    static {
        LocalBrowserProfileCleanup localBrowserProfileCleanup = new LocalBrowserProfileCleanup("ACTIVE", 0);
        ACTIVE = localBrowserProfileCleanup;
        LocalBrowserProfileCleanup localBrowserProfileCleanup2 = new LocalBrowserProfileCleanup("CLEARING", 1);
        CLEARING = localBrowserProfileCleanup2;
        LocalBrowserProfileCleanup localBrowserProfileCleanup3 = new LocalBrowserProfileCleanup("CLEARED_AWAITING_PROCESS_RESTART", 2);
        CLEARED_AWAITING_PROCESS_RESTART = localBrowserProfileCleanup3;
        LocalBrowserProfileCleanup localBrowserProfileCleanup4 = new LocalBrowserProfileCleanup(CvmMigrationStatusJson.STAGE_FAILED, 3);
        FAILED = localBrowserProfileCleanup4;
        LocalBrowserProfileCleanup[] localBrowserProfileCleanupArr = {localBrowserProfileCleanup, localBrowserProfileCleanup2, localBrowserProfileCleanup3, localBrowserProfileCleanup4};
        $VALUES = localBrowserProfileCleanupArr;
        $ENTRIES = C3cG.A0w(localBrowserProfileCleanupArr);
    }

    public static Ey9<LocalBrowserProfileCleanup> getEntries() {
        return $ENTRIES;
    }

    public static LocalBrowserProfileCleanup valueOf(String str) {
        return (LocalBrowserProfileCleanup) Enum.valueOf(LocalBrowserProfileCleanup.class, str);
    }

    public static LocalBrowserProfileCleanup[] values() {
        return (LocalBrowserProfileCleanup[]) $VALUES.clone();
    }

    public LocalBrowserProfileCleanup(String str, int i) {
    }
}
