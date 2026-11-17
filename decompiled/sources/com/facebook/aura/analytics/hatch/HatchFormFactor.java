package com.facebook.aura.analytics.hatch;

import X.AbstractC5321DgF;
import X.C06H;
import X.C3cG;
import X.Ey9;
import X.F0C;
import com.facebook.aura.devices.link.ordering.HatchLinkOrderSheetKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class HatchFormFactor {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchFormFactor[] $VALUES;
    public static final HatchFormFactor CAR;
    public static final Companion Companion;
    public static final HatchFormFactor FOLDABLE;
    public static final HatchFormFactor PHONE;
    public static final HatchFormFactor TABLET;
    public static final HatchFormFactor WATCH;
    public static final F0C<HatchFormFactor> device$delegate;
    public final String value;

    static {
        HatchFormFactor hatchFormFactor = new HatchFormFactor("PHONE", 0, HatchLinkOrderSheetKt.PHONE);
        PHONE = hatchFormFactor;
        HatchFormFactor hatchFormFactor2 = new HatchFormFactor("FOLDABLE", 1, "foldable");
        FOLDABLE = hatchFormFactor2;
        HatchFormFactor hatchFormFactor3 = new HatchFormFactor("TABLET", 2, "tablet");
        TABLET = hatchFormFactor3;
        HatchFormFactor hatchFormFactor4 = new HatchFormFactor("WATCH", 3, "watch");
        WATCH = hatchFormFactor4;
        HatchFormFactor hatchFormFactor5 = new HatchFormFactor("CAR", 4, "car");
        CAR = hatchFormFactor5;
        HatchFormFactor[] hatchFormFactorArr = {hatchFormFactor, hatchFormFactor2, hatchFormFactor3, hatchFormFactor4, hatchFormFactor5};
        $VALUES = hatchFormFactorArr;
        $ENTRIES = C3cG.A0w(hatchFormFactorArr);
        Companion = new Companion();
        device$delegate = AbstractC5321DgF.A03(HatchFormFactor$Companion$device$2.INSTANCE);
    }

    /* loaded from: classes.dex */
    public final class Companion {
        public final HatchFormFactor getDevice() {
            return (HatchFormFactor) HatchFormFactor.device$delegate.getValue();
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static Ey9<HatchFormFactor> getEntries() {
        return $ENTRIES;
    }

    public static HatchFormFactor valueOf(String str) {
        return (HatchFormFactor) Enum.valueOf(HatchFormFactor.class, str);
    }

    public static HatchFormFactor[] values() {
        return (HatchFormFactor[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public HatchFormFactor(String str, int i, String str2) {
        this.value = str2;
    }
}
