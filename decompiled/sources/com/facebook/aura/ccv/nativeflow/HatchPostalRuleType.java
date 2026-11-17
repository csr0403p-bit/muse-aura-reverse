package com.facebook.aura.ccv.nativeflow;

import X.C06H;
import X.C3cG;
import X.C7384Etj;
import X.Ey9;
import java.util.Iterator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class HatchPostalRuleType {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchPostalRuleType[] $VALUES;
    public static final Companion Companion;
    public static final HatchPostalRuleType EXACT_LENGTH;
    public static final HatchPostalRuleType MAX_LENGTH;
    public static final HatchPostalRuleType MIN_LENGTH;
    public static final HatchPostalRuleType REGEX;
    public final String wireValue;

    public final class Companion {
        public final HatchPostalRuleType fromWire(String str) {
            HatchPostalRuleType next;
            Iterator<HatchPostalRuleType> it = HatchPostalRuleType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (C7384Etj.areEqual(next.getWireValue(), str)) {
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

    static {
        HatchPostalRuleType hatchPostalRuleType = new HatchPostalRuleType("REGEX", 0, "REGEX");
        REGEX = hatchPostalRuleType;
        HatchPostalRuleType hatchPostalRuleType2 = new HatchPostalRuleType("EXACT_LENGTH", 1, "EXACT_LENGTH");
        EXACT_LENGTH = hatchPostalRuleType2;
        HatchPostalRuleType hatchPostalRuleType3 = new HatchPostalRuleType("MIN_LENGTH", 2, "MIN_LENGTH");
        MIN_LENGTH = hatchPostalRuleType3;
        HatchPostalRuleType hatchPostalRuleType4 = new HatchPostalRuleType("MAX_LENGTH", 3, "MAX_LENGTH");
        MAX_LENGTH = hatchPostalRuleType4;
        HatchPostalRuleType[] hatchPostalRuleTypeArr = {hatchPostalRuleType, hatchPostalRuleType2, hatchPostalRuleType3, hatchPostalRuleType4};
        $VALUES = hatchPostalRuleTypeArr;
        $ENTRIES = C3cG.A0w(hatchPostalRuleTypeArr);
        Companion = new Companion();
    }

    public static Ey9<HatchPostalRuleType> getEntries() {
        return $ENTRIES;
    }

    public static HatchPostalRuleType valueOf(String str) {
        return (HatchPostalRuleType) Enum.valueOf(HatchPostalRuleType.class, str);
    }

    public static HatchPostalRuleType[] values() {
        return (HatchPostalRuleType[]) $VALUES.clone();
    }

    public final String getWireValue() {
        return this.wireValue;
    }

    public HatchPostalRuleType(String str, int i, String str2) {
        this.wireValue = str2;
    }
}
