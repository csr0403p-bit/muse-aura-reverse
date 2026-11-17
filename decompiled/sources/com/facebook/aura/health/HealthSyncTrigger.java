package com.facebook.aura.health;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.gateway.service.NodeCommandFallbackWorker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class HealthSyncTrigger {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HealthSyncTrigger[] $VALUES;
    public static final HealthSyncTrigger BACKFILL;
    public static final HealthSyncTrigger BACKGROUND_REFRESH;
    public static final HealthSyncTrigger COMMAND;
    public static final HealthSyncTrigger FOREGROUND_FLUSH;
    public static final HealthSyncTrigger INITIAL_SYNC;
    public static final HealthSyncTrigger OBSERVER;
    public final String wireValue;

    static {
        HealthSyncTrigger healthSyncTrigger = new HealthSyncTrigger("INITIAL_SYNC", 0, "initial_sync");
        INITIAL_SYNC = healthSyncTrigger;
        HealthSyncTrigger healthSyncTrigger2 = new HealthSyncTrigger("OBSERVER", 1, "observer");
        OBSERVER = healthSyncTrigger2;
        HealthSyncTrigger healthSyncTrigger3 = new HealthSyncTrigger("COMMAND", 2, NodeCommandFallbackWorker.KEY_COMMAND);
        COMMAND = healthSyncTrigger3;
        HealthSyncTrigger healthSyncTrigger4 = new HealthSyncTrigger("BACKFILL", 3, "backfill");
        BACKFILL = healthSyncTrigger4;
        HealthSyncTrigger healthSyncTrigger5 = new HealthSyncTrigger("BACKGROUND_REFRESH", 4, "background_refresh");
        BACKGROUND_REFRESH = healthSyncTrigger5;
        HealthSyncTrigger healthSyncTrigger6 = new HealthSyncTrigger("FOREGROUND_FLUSH", 5, "foreground_flush");
        FOREGROUND_FLUSH = healthSyncTrigger6;
        HealthSyncTrigger[] healthSyncTriggerArr = {healthSyncTrigger, healthSyncTrigger2, healthSyncTrigger3, healthSyncTrigger4, healthSyncTrigger5, healthSyncTrigger6};
        $VALUES = healthSyncTriggerArr;
        $ENTRIES = C3cG.A0w(healthSyncTriggerArr);
    }

    public static Ey9<HealthSyncTrigger> getEntries() {
        return $ENTRIES;
    }

    public static HealthSyncTrigger valueOf(String str) {
        return (HealthSyncTrigger) Enum.valueOf(HealthSyncTrigger.class, str);
    }

    public static HealthSyncTrigger[] values() {
        return (HealthSyncTrigger[]) $VALUES.clone();
    }

    public final String getWireValue() {
        return this.wireValue;
    }

    public HealthSyncTrigger(String str, int i, String str2) {
        this.wireValue = str2;
    }
}
