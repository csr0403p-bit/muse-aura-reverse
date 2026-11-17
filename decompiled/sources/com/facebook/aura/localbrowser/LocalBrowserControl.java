package com.facebook.aura.localbrowser;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class LocalBrowserControl {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ LocalBrowserControl[] $VALUES;
    public static final LocalBrowserControl AGENT;
    public static final LocalBrowserControl STOPPED;
    public static final LocalBrowserControl USER;

    static {
        LocalBrowserControl localBrowserControl = new LocalBrowserControl("AGENT", 0);
        AGENT = localBrowserControl;
        LocalBrowserControl localBrowserControl2 = new LocalBrowserControl("USER", 1);
        USER = localBrowserControl2;
        LocalBrowserControl localBrowserControl3 = new LocalBrowserControl("STOPPED", 2);
        STOPPED = localBrowserControl3;
        LocalBrowserControl[] localBrowserControlArr = {localBrowserControl, localBrowserControl2, localBrowserControl3};
        $VALUES = localBrowserControlArr;
        $ENTRIES = C3cG.A0w(localBrowserControlArr);
    }

    public static Ey9<LocalBrowserControl> getEntries() {
        return $ENTRIES;
    }

    public static LocalBrowserControl valueOf(String str) {
        return (LocalBrowserControl) Enum.valueOf(LocalBrowserControl.class, str);
    }

    public static LocalBrowserControl[] values() {
        return (LocalBrowserControl[]) $VALUES.clone();
    }

    public LocalBrowserControl(String str, int i) {
    }
}
