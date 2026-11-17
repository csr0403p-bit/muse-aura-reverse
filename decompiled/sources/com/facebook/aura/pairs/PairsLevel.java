package com.facebook.aura.pairs;

import X.C06H;
import X.C3cG;
import X.C7384Etj;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class PairsLevel {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ PairsLevel[] $VALUES;
    public static final PairsLevel ACT_FREELY;
    public static final PairsLevel ASK_FIRST;
    public static final Companion Companion;
    public static final String LEGACY_COLLABORATOR = "collaborator";
    public static final String LEGACY_TRUSTED_CIRCLE = "trusted_circle";
    public final String wireValue;

    static {
        PairsLevel pairsLevel = new PairsLevel("ASK_FIRST", 0, "restricted");
        ASK_FIRST = pairsLevel;
        PairsLevel pairsLevel2 = new PairsLevel("ACT_FREELY", 1, "trusted");
        ACT_FREELY = pairsLevel2;
        PairsLevel[] pairsLevelArr = {pairsLevel, pairsLevel2};
        $VALUES = pairsLevelArr;
        $ENTRIES = C3cG.A0w(pairsLevelArr);
        Companion = new Companion();
    }

    public static Ey9<PairsLevel> getEntries() {
        return $ENTRIES;
    }

    public static PairsLevel valueOf(String str) {
        return (PairsLevel) Enum.valueOf(PairsLevel.class, str);
    }

    public static PairsLevel[] values() {
        return (PairsLevel[]) $VALUES.clone();
    }

    public final String getWireValue() {
        return this.wireValue;
    }

    public final class Companion {
        public final PairsLevel fromWire(String str) {
            C7384Etj.A0Y(str, 0);
            PairsLevel pairsLevel = PairsLevel.ASK_FIRST;
            if (!str.equals(pairsLevel.getWireValue())) {
                pairsLevel = PairsLevel.ACT_FREELY;
                if (!str.equals(pairsLevel.getWireValue()) && !str.equals(PairsLevel.LEGACY_COLLABORATOR) && !str.equals(PairsLevel.LEGACY_TRUSTED_CIRCLE)) {
                    return null;
                }
            }
            return pairsLevel;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public PairsLevel(String str, int i, String str2) {
        this.wireValue = str2;
    }
}
