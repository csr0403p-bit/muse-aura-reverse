package com.facebook.aura.hotels;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class HotelPolicy {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HotelPolicy[] $VALUES;
    public static final HotelPolicy CANCELLATION;
    public static final HotelPolicy TAXES_AND_FEES;

    static {
        HotelPolicy hotelPolicy = new HotelPolicy("CANCELLATION", 0);
        CANCELLATION = hotelPolicy;
        HotelPolicy hotelPolicy2 = new HotelPolicy("TAXES_AND_FEES", 1);
        TAXES_AND_FEES = hotelPolicy2;
        HotelPolicy[] hotelPolicyArr = {hotelPolicy, hotelPolicy2};
        $VALUES = hotelPolicyArr;
        $ENTRIES = C3cG.A0w(hotelPolicyArr);
    }

    public static Ey9<HotelPolicy> getEntries() {
        return $ENTRIES;
    }

    public static HotelPolicy valueOf(String str) {
        return (HotelPolicy) Enum.valueOf(HotelPolicy.class, str);
    }

    public static HotelPolicy[] values() {
        return (HotelPolicy[]) $VALUES.clone();
    }

    public HotelPolicy(String str, int i) {
    }
}
