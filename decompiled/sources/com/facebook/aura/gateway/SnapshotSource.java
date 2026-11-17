package com.facebook.aura.gateway;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class SnapshotSource {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ SnapshotSource[] $VALUES;
    public static final SnapshotSource DECISION_RESPONSE;
    public static final SnapshotSource HTTP_RECOVERY;
    public static final SnapshotSource WEBSOCKET;

    static {
        SnapshotSource snapshotSource = new SnapshotSource("WEBSOCKET", 0);
        WEBSOCKET = snapshotSource;
        SnapshotSource snapshotSource2 = new SnapshotSource("HTTP_RECOVERY", 1);
        HTTP_RECOVERY = snapshotSource2;
        SnapshotSource snapshotSource3 = new SnapshotSource("DECISION_RESPONSE", 2);
        DECISION_RESPONSE = snapshotSource3;
        SnapshotSource[] snapshotSourceArr = {snapshotSource, snapshotSource2, snapshotSource3};
        $VALUES = snapshotSourceArr;
        $ENTRIES = C3cG.A0w(snapshotSourceArr);
    }

    public static Ey9<SnapshotSource> getEntries() {
        return $ENTRIES;
    }

    public static SnapshotSource valueOf(String str) {
        return (SnapshotSource) Enum.valueOf(SnapshotSource.class, str);
    }

    public static SnapshotSource[] values() {
        return (SnapshotSource[]) $VALUES.clone();
    }

    public SnapshotSource(String str, int i) {
    }
}
