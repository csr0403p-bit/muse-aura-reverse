package com.facebook.aura.hotels;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class HotelDetailsStatus {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HotelDetailsStatus[] $VALUES;
    public static final HotelDetailsStatus LOADED;
    public static final HotelDetailsStatus NOT_LOADED;
    public static final HotelDetailsStatus UNAVAILABLE;

    static {
        HotelDetailsStatus hotelDetailsStatus = new HotelDetailsStatus("NOT_LOADED", 0);
        NOT_LOADED = hotelDetailsStatus;
        HotelDetailsStatus hotelDetailsStatus2 = new HotelDetailsStatus("LOADED", 1);
        LOADED = hotelDetailsStatus2;
        HotelDetailsStatus hotelDetailsStatus3 = new HotelDetailsStatus("UNAVAILABLE", 2);
        UNAVAILABLE = hotelDetailsStatus3;
        HotelDetailsStatus[] hotelDetailsStatusArr = {hotelDetailsStatus, hotelDetailsStatus2, hotelDetailsStatus3};
        $VALUES = hotelDetailsStatusArr;
        $ENTRIES = C3cG.A0w(hotelDetailsStatusArr);
    }

    public static Ey9<HotelDetailsStatus> getEntries() {
        return $ENTRIES;
    }

    public static HotelDetailsStatus valueOf(String str) {
        return (HotelDetailsStatus) Enum.valueOf(HotelDetailsStatus.class, str);
    }

    public static HotelDetailsStatus[] values() {
        return (HotelDetailsStatus[]) $VALUES.clone();
    }

    public HotelDetailsStatus(String str, int i) {
    }
}
