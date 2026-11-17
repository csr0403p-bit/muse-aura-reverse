package com.facebook.aura.storagerecovery.data;

import X.AbstractC2159Azp;
import X.AnonymousClass002;
import X.C06H;
import X.C3cG;
import X.Ey9;
import java.util.Iterator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class HatchStorageRecoveryServerStatus {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchStorageRecoveryServerStatus[] $VALUES;
    public static final Companion Companion;
    public static final HatchStorageRecoveryServerStatus OK;
    public static final HatchStorageRecoveryServerStatus STARTING;
    public static final HatchStorageRecoveryServerStatus STORAGE_CRITICAL;
    public static final HatchStorageRecoveryServerStatus STORAGE_FULL;
    public static final HatchStorageRecoveryServerStatus STORAGE_LOW;
    public static final HatchStorageRecoveryServerStatus STORAGE_READ_ONLY;
    public static final HatchStorageRecoveryServerStatus STORAGE_UNAVAILABLE;
    public static final HatchStorageRecoveryServerStatus UNAVAILABLE;
    public final String wire;

    public final class Companion {
        public final HatchStorageRecoveryServerStatus fromWire(String str) {
            HatchStorageRecoveryServerStatus hatchStorageRecoveryServerStatus;
            Iterator<HatchStorageRecoveryServerStatus> it = HatchStorageRecoveryServerStatus.getEntries().iterator();
            while (true) {
                hatchStorageRecoveryServerStatus = null;
                if (!it.hasNext()) {
                    break;
                }
                HatchStorageRecoveryServerStatus next = it.next();
                if (AbstractC2159Azp.A12(next.getWire(), str != null ? AnonymousClass002.A0l(str) : null, true)) {
                    hatchStorageRecoveryServerStatus = next;
                    break;
                }
            }
            return hatchStorageRecoveryServerStatus;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        HatchStorageRecoveryServerStatus hatchStorageRecoveryServerStatus = new HatchStorageRecoveryServerStatus("OK", 0, "OK");
        OK = hatchStorageRecoveryServerStatus;
        HatchStorageRecoveryServerStatus hatchStorageRecoveryServerStatus2 = new HatchStorageRecoveryServerStatus("STARTING", 1, "STARTING");
        STARTING = hatchStorageRecoveryServerStatus2;
        HatchStorageRecoveryServerStatus hatchStorageRecoveryServerStatus3 = new HatchStorageRecoveryServerStatus("STORAGE_LOW", 2, "STORAGE_LOW");
        STORAGE_LOW = hatchStorageRecoveryServerStatus3;
        HatchStorageRecoveryServerStatus hatchStorageRecoveryServerStatus4 = new HatchStorageRecoveryServerStatus("STORAGE_CRITICAL", 3, "STORAGE_CRITICAL");
        STORAGE_CRITICAL = hatchStorageRecoveryServerStatus4;
        HatchStorageRecoveryServerStatus hatchStorageRecoveryServerStatus5 = new HatchStorageRecoveryServerStatus("STORAGE_FULL", 4, "STORAGE_FULL");
        STORAGE_FULL = hatchStorageRecoveryServerStatus5;
        HatchStorageRecoveryServerStatus hatchStorageRecoveryServerStatus6 = new HatchStorageRecoveryServerStatus("STORAGE_READ_ONLY", 5, "STORAGE_READ_ONLY");
        STORAGE_READ_ONLY = hatchStorageRecoveryServerStatus6;
        HatchStorageRecoveryServerStatus hatchStorageRecoveryServerStatus7 = new HatchStorageRecoveryServerStatus("STORAGE_UNAVAILABLE", 6, "STORAGE_UNAVAILABLE");
        STORAGE_UNAVAILABLE = hatchStorageRecoveryServerStatus7;
        HatchStorageRecoveryServerStatus hatchStorageRecoveryServerStatus8 = new HatchStorageRecoveryServerStatus("UNAVAILABLE", 7, "UNAVAILABLE");
        UNAVAILABLE = hatchStorageRecoveryServerStatus8;
        HatchStorageRecoveryServerStatus[] hatchStorageRecoveryServerStatusArr = {hatchStorageRecoveryServerStatus, hatchStorageRecoveryServerStatus2, hatchStorageRecoveryServerStatus3, hatchStorageRecoveryServerStatus4, hatchStorageRecoveryServerStatus5, hatchStorageRecoveryServerStatus6, hatchStorageRecoveryServerStatus7, hatchStorageRecoveryServerStatus8};
        $VALUES = hatchStorageRecoveryServerStatusArr;
        $ENTRIES = C3cG.A0w(hatchStorageRecoveryServerStatusArr);
        Companion = new Companion();
    }

    public static Ey9<HatchStorageRecoveryServerStatus> getEntries() {
        return $ENTRIES;
    }

    public static HatchStorageRecoveryServerStatus valueOf(String str) {
        return (HatchStorageRecoveryServerStatus) Enum.valueOf(HatchStorageRecoveryServerStatus.class, str);
    }

    public static HatchStorageRecoveryServerStatus[] values() {
        return (HatchStorageRecoveryServerStatus[]) $VALUES.clone();
    }

    public final String getWire() {
        return this.wire;
    }

    public final boolean isRecoveryActive() {
        return this == STORAGE_FULL || this == STORAGE_CRITICAL;
    }

    public HatchStorageRecoveryServerStatus(String str, int i, String str2) {
        this.wire = str2;
    }
}
