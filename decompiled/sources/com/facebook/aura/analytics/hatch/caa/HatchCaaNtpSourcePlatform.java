package com.facebook.aura.analytics.hatch.caa;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class HatchCaaNtpSourcePlatform {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchCaaNtpSourcePlatform[] $VALUES;
    public static final HatchCaaNtpSourcePlatform FACEBOOK;
    public static final HatchCaaNtpSourcePlatform FRL;
    public static final HatchCaaNtpSourcePlatform INSTAGRAM;
    public static final HatchCaaNtpSourcePlatform WHATSAPP;

    static {
        HatchCaaNtpSourcePlatform hatchCaaNtpSourcePlatform = new HatchCaaNtpSourcePlatform("FACEBOOK", 0);
        FACEBOOK = hatchCaaNtpSourcePlatform;
        HatchCaaNtpSourcePlatform hatchCaaNtpSourcePlatform2 = new HatchCaaNtpSourcePlatform("INSTAGRAM", 1);
        INSTAGRAM = hatchCaaNtpSourcePlatform2;
        HatchCaaNtpSourcePlatform hatchCaaNtpSourcePlatform3 = new HatchCaaNtpSourcePlatform("FRL", 2);
        FRL = hatchCaaNtpSourcePlatform3;
        HatchCaaNtpSourcePlatform hatchCaaNtpSourcePlatform4 = new HatchCaaNtpSourcePlatform("WHATSAPP", 3);
        WHATSAPP = hatchCaaNtpSourcePlatform4;
        HatchCaaNtpSourcePlatform[] hatchCaaNtpSourcePlatformArr = {hatchCaaNtpSourcePlatform, hatchCaaNtpSourcePlatform2, hatchCaaNtpSourcePlatform3, hatchCaaNtpSourcePlatform4};
        $VALUES = hatchCaaNtpSourcePlatformArr;
        $ENTRIES = C3cG.A0w(hatchCaaNtpSourcePlatformArr);
    }

    public static Ey9<HatchCaaNtpSourcePlatform> getEntries() {
        return $ENTRIES;
    }

    public static HatchCaaNtpSourcePlatform valueOf(String str) {
        return (HatchCaaNtpSourcePlatform) Enum.valueOf(HatchCaaNtpSourcePlatform.class, str);
    }

    public static HatchCaaNtpSourcePlatform[] values() {
        return (HatchCaaNtpSourcePlatform[]) $VALUES.clone();
    }

    public HatchCaaNtpSourcePlatform(String str, int i) {
    }
}
