package com.facebook.aura.hotels;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class HotelBookingActionType {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HotelBookingActionType[] $VALUES;
    public static final HotelBookingActionType OPEN_URL;
    public static final HotelBookingActionType REQUEST_BOOKING_REVIEW;

    static {
        HotelBookingActionType hotelBookingActionType = new HotelBookingActionType("REQUEST_BOOKING_REVIEW", 0);
        REQUEST_BOOKING_REVIEW = hotelBookingActionType;
        HotelBookingActionType hotelBookingActionType2 = new HotelBookingActionType("OPEN_URL", 1);
        OPEN_URL = hotelBookingActionType2;
        HotelBookingActionType[] hotelBookingActionTypeArr = {hotelBookingActionType, hotelBookingActionType2};
        $VALUES = hotelBookingActionTypeArr;
        $ENTRIES = C3cG.A0w(hotelBookingActionTypeArr);
    }

    public static Ey9<HotelBookingActionType> getEntries() {
        return $ENTRIES;
    }

    public static HotelBookingActionType valueOf(String str) {
        return (HotelBookingActionType) Enum.valueOf(HotelBookingActionType.class, str);
    }

    public static HotelBookingActionType[] values() {
        return (HotelBookingActionType[]) $VALUES.clone();
    }

    public HotelBookingActionType(String str, int i) {
    }
}
