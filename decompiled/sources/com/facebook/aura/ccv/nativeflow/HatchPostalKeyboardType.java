package com.facebook.aura.ccv.nativeflow;

import X.C06H;
import X.C3cG;
import X.C60O;
import X.Ey9;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class HatchPostalKeyboardType {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchPostalKeyboardType[] $VALUES;
    public static final Companion Companion;
    public static final HatchPostalKeyboardType NUMBER = new HatchPostalKeyboardType("NUMBER", 0, Collections.singleton("NUMERICAL"));
    public static final HatchPostalKeyboardType UPPERCASE_TEXT;
    public final Set<String> wireValues;

    static {
        HatchPostalKeyboardType hatchPostalKeyboardType = new HatchPostalKeyboardType("UPPERCASE_TEXT", 1, C60O.A19("STRING_UPPERCASE", "ALPHA_NUMERIC_UPPERCASE"));
        UPPERCASE_TEXT = hatchPostalKeyboardType;
        HatchPostalKeyboardType[] hatchPostalKeyboardTypeArr = {NUMBER, hatchPostalKeyboardType};
        $VALUES = hatchPostalKeyboardTypeArr;
        $ENTRIES = C3cG.A0w(hatchPostalKeyboardTypeArr);
        Companion = new Companion();
    }

    public static Ey9<HatchPostalKeyboardType> getEntries() {
        return $ENTRIES;
    }

    public static HatchPostalKeyboardType valueOf(String str) {
        return (HatchPostalKeyboardType) Enum.valueOf(HatchPostalKeyboardType.class, str);
    }

    public static HatchPostalKeyboardType[] values() {
        return (HatchPostalKeyboardType[]) $VALUES.clone();
    }

    public final class Companion {
        public final HatchPostalKeyboardType fromWire(String str) {
            HatchPostalKeyboardType hatchPostalKeyboardType = null;
            if (str == null) {
                return null;
            }
            Iterator<HatchPostalKeyboardType> it = HatchPostalKeyboardType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                HatchPostalKeyboardType next = it.next();
                if (next.wireValues.contains(str)) {
                    hatchPostalKeyboardType = next;
                    break;
                }
            }
            return hatchPostalKeyboardType;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public HatchPostalKeyboardType(String str, int i, Set set) {
        this.wireValues = set;
    }
}
