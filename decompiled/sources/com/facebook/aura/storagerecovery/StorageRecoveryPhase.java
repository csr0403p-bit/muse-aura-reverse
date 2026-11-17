package com.facebook.aura.storagerecovery;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class StorageRecoveryPhase {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ StorageRecoveryPhase[] $VALUES;
    public static final StorageRecoveryPhase AVAILABLE;
    public static final StorageRecoveryPhase DELETING;
    public static final StorageRecoveryPhase LOADING;
    public static final StorageRecoveryPhase READY;
    public static final StorageRecoveryPhase RECONNECTING;
    public static final StorageRecoveryPhase RECONNECT_FAILED;

    static {
        StorageRecoveryPhase storageRecoveryPhase = new StorageRecoveryPhase("LOADING", 0);
        LOADING = storageRecoveryPhase;
        StorageRecoveryPhase storageRecoveryPhase2 = new StorageRecoveryPhase("READY", 1);
        READY = storageRecoveryPhase2;
        StorageRecoveryPhase storageRecoveryPhase3 = new StorageRecoveryPhase("DELETING", 2);
        DELETING = storageRecoveryPhase3;
        StorageRecoveryPhase storageRecoveryPhase4 = new StorageRecoveryPhase("RECONNECTING", 3);
        RECONNECTING = storageRecoveryPhase4;
        StorageRecoveryPhase storageRecoveryPhase5 = new StorageRecoveryPhase("RECONNECT_FAILED", 4);
        RECONNECT_FAILED = storageRecoveryPhase5;
        StorageRecoveryPhase storageRecoveryPhase6 = new StorageRecoveryPhase("AVAILABLE", 5);
        AVAILABLE = storageRecoveryPhase6;
        StorageRecoveryPhase[] storageRecoveryPhaseArr = {storageRecoveryPhase, storageRecoveryPhase2, storageRecoveryPhase3, storageRecoveryPhase4, storageRecoveryPhase5, storageRecoveryPhase6};
        $VALUES = storageRecoveryPhaseArr;
        $ENTRIES = C3cG.A0w(storageRecoveryPhaseArr);
    }

    public static Ey9<StorageRecoveryPhase> getEntries() {
        return $ENTRIES;
    }

    public static StorageRecoveryPhase valueOf(String str) {
        return (StorageRecoveryPhase) Enum.valueOf(StorageRecoveryPhase.class, str);
    }

    public static StorageRecoveryPhase[] values() {
        return (StorageRecoveryPhase[]) $VALUES.clone();
    }

    public StorageRecoveryPhase(String str, int i) {
    }
}
