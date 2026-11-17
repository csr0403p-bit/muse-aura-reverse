package com.facebook.aura.storagerecovery;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class StorageRecoveryErrorKind {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ StorageRecoveryErrorKind[] $VALUES;
    public static final StorageRecoveryErrorKind DELETE_FAILED;
    public static final StorageRecoveryErrorKind PARTIAL_DELETE;
    public static final StorageRecoveryErrorKind REQUEST_FAILED;
    public static final StorageRecoveryErrorKind SELECTION_EXPIRED;

    static {
        StorageRecoveryErrorKind storageRecoveryErrorKind = new StorageRecoveryErrorKind("REQUEST_FAILED", 0);
        REQUEST_FAILED = storageRecoveryErrorKind;
        StorageRecoveryErrorKind storageRecoveryErrorKind2 = new StorageRecoveryErrorKind("DELETE_FAILED", 1);
        DELETE_FAILED = storageRecoveryErrorKind2;
        StorageRecoveryErrorKind storageRecoveryErrorKind3 = new StorageRecoveryErrorKind("SELECTION_EXPIRED", 2);
        SELECTION_EXPIRED = storageRecoveryErrorKind3;
        StorageRecoveryErrorKind storageRecoveryErrorKind4 = new StorageRecoveryErrorKind("PARTIAL_DELETE", 3);
        PARTIAL_DELETE = storageRecoveryErrorKind4;
        StorageRecoveryErrorKind[] storageRecoveryErrorKindArr = {storageRecoveryErrorKind, storageRecoveryErrorKind2, storageRecoveryErrorKind3, storageRecoveryErrorKind4};
        $VALUES = storageRecoveryErrorKindArr;
        $ENTRIES = C3cG.A0w(storageRecoveryErrorKindArr);
    }

    public static Ey9<StorageRecoveryErrorKind> getEntries() {
        return $ENTRIES;
    }

    public static StorageRecoveryErrorKind valueOf(String str) {
        return (StorageRecoveryErrorKind) Enum.valueOf(StorageRecoveryErrorKind.class, str);
    }

    public static StorageRecoveryErrorKind[] values() {
        return (StorageRecoveryErrorKind[]) $VALUES.clone();
    }

    public StorageRecoveryErrorKind(String str, int i) {
    }
}
