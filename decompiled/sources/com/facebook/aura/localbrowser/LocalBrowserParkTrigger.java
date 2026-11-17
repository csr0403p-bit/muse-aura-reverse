package com.facebook.aura.localbrowser;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class LocalBrowserParkTrigger {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ LocalBrowserParkTrigger[] $VALUES;
    public static final LocalBrowserParkTrigger COMMAND;
    public static final LocalBrowserParkTrigger IDLE;
    public static final LocalBrowserParkTrigger NEEDS_USER;
    public static final LocalBrowserParkTrigger PARKED_OUTCOME;
    public static final LocalBrowserParkTrigger TAKEOVER;
    public static final LocalBrowserParkTrigger TASK_STATE;
    public static final LocalBrowserParkTrigger TERMINAL;
    public static final LocalBrowserParkTrigger VIEW;

    static {
        LocalBrowserParkTrigger localBrowserParkTrigger = new LocalBrowserParkTrigger("NEEDS_USER", 0);
        NEEDS_USER = localBrowserParkTrigger;
        LocalBrowserParkTrigger localBrowserParkTrigger2 = new LocalBrowserParkTrigger("PARKED_OUTCOME", 1);
        PARKED_OUTCOME = localBrowserParkTrigger2;
        LocalBrowserParkTrigger localBrowserParkTrigger3 = new LocalBrowserParkTrigger("TERMINAL", 2);
        TERMINAL = localBrowserParkTrigger3;
        LocalBrowserParkTrigger localBrowserParkTrigger4 = new LocalBrowserParkTrigger("TASK_STATE", 3);
        TASK_STATE = localBrowserParkTrigger4;
        LocalBrowserParkTrigger localBrowserParkTrigger5 = new LocalBrowserParkTrigger("IDLE", 4);
        IDLE = localBrowserParkTrigger5;
        LocalBrowserParkTrigger localBrowserParkTrigger6 = new LocalBrowserParkTrigger("COMMAND", 5);
        COMMAND = localBrowserParkTrigger6;
        LocalBrowserParkTrigger localBrowserParkTrigger7 = new LocalBrowserParkTrigger("TAKEOVER", 6);
        TAKEOVER = localBrowserParkTrigger7;
        LocalBrowserParkTrigger localBrowserParkTrigger8 = new LocalBrowserParkTrigger("VIEW", 7);
        VIEW = localBrowserParkTrigger8;
        LocalBrowserParkTrigger[] localBrowserParkTriggerArr = {localBrowserParkTrigger, localBrowserParkTrigger2, localBrowserParkTrigger3, localBrowserParkTrigger4, localBrowserParkTrigger5, localBrowserParkTrigger6, localBrowserParkTrigger7, localBrowserParkTrigger8};
        $VALUES = localBrowserParkTriggerArr;
        $ENTRIES = C3cG.A0w(localBrowserParkTriggerArr);
    }

    public static Ey9<LocalBrowserParkTrigger> getEntries() {
        return $ENTRIES;
    }

    public static LocalBrowserParkTrigger valueOf(String str) {
        return (LocalBrowserParkTrigger) Enum.valueOf(LocalBrowserParkTrigger.class, str);
    }

    public static LocalBrowserParkTrigger[] values() {
        return (LocalBrowserParkTrigger[]) $VALUES.clone();
    }

    public LocalBrowserParkTrigger(String str, int i) {
    }
}
