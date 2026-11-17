package com.facebook.aura.storagerecovery.data;

import X.AbstractC2159Azp;
import X.C06H;
import X.C3cG;
import X.Ey9;
import java.util.Iterator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class HatchStorageRecoveryDeleteOutcome {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchStorageRecoveryDeleteOutcome[] $VALUES;
    public static final HatchStorageRecoveryDeleteOutcome COMPLETE;
    public static final Companion Companion;
    public static final HatchStorageRecoveryDeleteOutcome PARTIAL;
    public final String wire;

    static {
        HatchStorageRecoveryDeleteOutcome hatchStorageRecoveryDeleteOutcome = new HatchStorageRecoveryDeleteOutcome("COMPLETE", 0, "complete");
        COMPLETE = hatchStorageRecoveryDeleteOutcome;
        HatchStorageRecoveryDeleteOutcome hatchStorageRecoveryDeleteOutcome2 = new HatchStorageRecoveryDeleteOutcome("PARTIAL", 1, "partial");
        PARTIAL = hatchStorageRecoveryDeleteOutcome2;
        HatchStorageRecoveryDeleteOutcome[] hatchStorageRecoveryDeleteOutcomeArr = {hatchStorageRecoveryDeleteOutcome, hatchStorageRecoveryDeleteOutcome2};
        $VALUES = hatchStorageRecoveryDeleteOutcomeArr;
        $ENTRIES = C3cG.A0w(hatchStorageRecoveryDeleteOutcomeArr);
        Companion = new Companion();
    }

    public final class Companion {
        public final HatchStorageRecoveryDeleteOutcome fromWire(String str) {
            HatchStorageRecoveryDeleteOutcome next;
            Iterator<HatchStorageRecoveryDeleteOutcome> it = HatchStorageRecoveryDeleteOutcome.getEntries().iterator();
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

    public static Ey9<HatchStorageRecoveryDeleteOutcome> getEntries() {
        return $ENTRIES;
    }

    public static HatchStorageRecoveryDeleteOutcome valueOf(String str) {
        return (HatchStorageRecoveryDeleteOutcome) Enum.valueOf(HatchStorageRecoveryDeleteOutcome.class, str);
    }

    public static HatchStorageRecoveryDeleteOutcome[] values() {
        return (HatchStorageRecoveryDeleteOutcome[]) $VALUES.clone();
    }

    public final String getWire() {
        return this.wire;
    }

    public HatchStorageRecoveryDeleteOutcome(String str, int i, String str2) {
        this.wire = str2;
    }
}
