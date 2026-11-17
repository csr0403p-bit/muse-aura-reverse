package com.facebook.aura.storagerecovery.data;

import X.AbstractC2159Azp;
import X.C06H;
import X.C3cG;
import X.Ey9;
import java.util.Iterator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class HatchStorageRecoveryEntryKind {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchStorageRecoveryEntryKind[] $VALUES;
    public static final Companion Companion;
    public static final HatchStorageRecoveryEntryKind DIRECTORY;
    public static final HatchStorageRecoveryEntryKind FILE;
    public final String wire;

    static {
        HatchStorageRecoveryEntryKind hatchStorageRecoveryEntryKind = new HatchStorageRecoveryEntryKind("FILE", 0, "file");
        FILE = hatchStorageRecoveryEntryKind;
        HatchStorageRecoveryEntryKind hatchStorageRecoveryEntryKind2 = new HatchStorageRecoveryEntryKind("DIRECTORY", 1, "directory");
        DIRECTORY = hatchStorageRecoveryEntryKind2;
        HatchStorageRecoveryEntryKind[] hatchStorageRecoveryEntryKindArr = {hatchStorageRecoveryEntryKind, hatchStorageRecoveryEntryKind2};
        $VALUES = hatchStorageRecoveryEntryKindArr;
        $ENTRIES = C3cG.A0w(hatchStorageRecoveryEntryKindArr);
        Companion = new Companion();
    }

    public final class Companion {
        public final HatchStorageRecoveryEntryKind fromWire(String str) {
            HatchStorageRecoveryEntryKind next;
            Iterator<HatchStorageRecoveryEntryKind> it = HatchStorageRecoveryEntryKind.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (AbstractC2159Azp.A12(next.getWire(), str, true)) {
                    break;
                }
            }
            return next;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static Ey9<HatchStorageRecoveryEntryKind> getEntries() {
        return $ENTRIES;
    }

    public static HatchStorageRecoveryEntryKind valueOf(String str) {
        return (HatchStorageRecoveryEntryKind) Enum.valueOf(HatchStorageRecoveryEntryKind.class, str);
    }

    public static HatchStorageRecoveryEntryKind[] values() {
        return (HatchStorageRecoveryEntryKind[]) $VALUES.clone();
    }

    public final String getWire() {
        return this.wire;
    }

    public HatchStorageRecoveryEntryKind(String str, int i, String str2) {
        this.wire = str2;
    }
}
