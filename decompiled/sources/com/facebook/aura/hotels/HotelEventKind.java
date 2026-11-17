package com.facebook.aura.hotels;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class HotelEventKind {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HotelEventKind[] $VALUES;
    public static final HotelEventKind BOOKING_REVIEW;
    public static final HotelEventKind ROOM_DISCUSSION;
    public final boolean retainAccepted;

    static {
        HotelEventKind hotelEventKind = new HotelEventKind("BOOKING_REVIEW", 0, true);
        BOOKING_REVIEW = hotelEventKind;
        HotelEventKind hotelEventKind2 = new HotelEventKind("ROOM_DISCUSSION", 1, false);
        ROOM_DISCUSSION = hotelEventKind2;
        HotelEventKind[] hotelEventKindArr = {hotelEventKind, hotelEventKind2};
        $VALUES = hotelEventKindArr;
        $ENTRIES = C3cG.A0w(hotelEventKindArr);
    }

    public static Ey9<HotelEventKind> getEntries() {
        return $ENTRIES;
    }

    public static HotelEventKind valueOf(String str) {
        return (HotelEventKind) Enum.valueOf(HotelEventKind.class, str);
    }

    public static HotelEventKind[] values() {
        return (HotelEventKind[]) $VALUES.clone();
    }

    public final boolean getRetainAccepted() {
        return this.retainAccepted;
    }

    public HotelEventKind(String str, int i, boolean z) {
        this.retainAccepted = z;
    }
}
