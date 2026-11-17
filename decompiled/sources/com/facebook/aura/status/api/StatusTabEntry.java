package com.facebook.aura.status.api;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class StatusTabEntry {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ StatusTabEntry[] $VALUES;
    public static final StatusTabEntry LINK;
    public static final StatusTabEntry RESTORED;
    public static final StatusTabEntry TAP;

    static {
        StatusTabEntry statusTabEntry = new StatusTabEntry("TAP", 0);
        TAP = statusTabEntry;
        StatusTabEntry statusTabEntry2 = new StatusTabEntry("LINK", 1);
        LINK = statusTabEntry2;
        StatusTabEntry statusTabEntry3 = new StatusTabEntry("RESTORED", 2);
        RESTORED = statusTabEntry3;
        StatusTabEntry[] statusTabEntryArr = {statusTabEntry, statusTabEntry2, statusTabEntry3};
        $VALUES = statusTabEntryArr;
        $ENTRIES = new F3w(statusTabEntryArr);
    }

    public static Ey9<StatusTabEntry> getEntries() {
        return $ENTRIES;
    }

    public static StatusTabEntry valueOf(String str) {
        return (StatusTabEntry) Enum.valueOf(StatusTabEntry.class, str);
    }

    public static StatusTabEntry[] values() {
        return (StatusTabEntry[]) $VALUES.clone();
    }

    public StatusTabEntry(String str, int i) {
    }
}
