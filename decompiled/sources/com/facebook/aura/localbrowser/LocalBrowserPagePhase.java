package com.facebook.aura.localbrowser;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class LocalBrowserPagePhase {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ LocalBrowserPagePhase[] $VALUES;
    public static final LocalBrowserPagePhase BLANK;
    public static final LocalBrowserPagePhase CLOSED;
    public static final LocalBrowserPagePhase FAILED;
    public static final LocalBrowserPagePhase LOADING;
    public static final LocalBrowserPagePhase READY;

    static {
        LocalBrowserPagePhase localBrowserPagePhase = new LocalBrowserPagePhase("BLANK", 0);
        BLANK = localBrowserPagePhase;
        LocalBrowserPagePhase localBrowserPagePhase2 = new LocalBrowserPagePhase("LOADING", 1);
        LOADING = localBrowserPagePhase2;
        LocalBrowserPagePhase localBrowserPagePhase3 = new LocalBrowserPagePhase("READY", 2);
        READY = localBrowserPagePhase3;
        LocalBrowserPagePhase localBrowserPagePhase4 = new LocalBrowserPagePhase(CvmMigrationStatusJson.STAGE_FAILED, 3);
        FAILED = localBrowserPagePhase4;
        LocalBrowserPagePhase localBrowserPagePhase5 = new LocalBrowserPagePhase("CLOSED", 4);
        CLOSED = localBrowserPagePhase5;
        LocalBrowserPagePhase[] localBrowserPagePhaseArr = {localBrowserPagePhase, localBrowserPagePhase2, localBrowserPagePhase3, localBrowserPagePhase4, localBrowserPagePhase5};
        $VALUES = localBrowserPagePhaseArr;
        $ENTRIES = C3cG.A0w(localBrowserPagePhaseArr);
    }

    public static Ey9<LocalBrowserPagePhase> getEntries() {
        return $ENTRIES;
    }

    public static LocalBrowserPagePhase valueOf(String str) {
        return (LocalBrowserPagePhase) Enum.valueOf(LocalBrowserPagePhase.class, str);
    }

    public static LocalBrowserPagePhase[] values() {
        return (LocalBrowserPagePhase[]) $VALUES.clone();
    }

    public LocalBrowserPagePhase(String str, int i) {
    }
}
