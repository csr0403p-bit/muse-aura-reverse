package com.facebook.aura.hotels;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class HotelReviewState {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HotelReviewState[] $VALUES;
    public static final HotelReviewState ACCEPTED;
    public static final HotelReviewState IDLE;
    public static final HotelReviewState REJECTED;
    public static final HotelReviewState REQUESTING;
    public static final HotelReviewState UNCERTAIN;

    static {
        HotelReviewState hotelReviewState = new HotelReviewState("IDLE", 0);
        IDLE = hotelReviewState;
        HotelReviewState hotelReviewState2 = new HotelReviewState("REQUESTING", 1);
        REQUESTING = hotelReviewState2;
        HotelReviewState hotelReviewState3 = new HotelReviewState("ACCEPTED", 2);
        ACCEPTED = hotelReviewState3;
        HotelReviewState hotelReviewState4 = new HotelReviewState("UNCERTAIN", 3);
        UNCERTAIN = hotelReviewState4;
        HotelReviewState hotelReviewState5 = new HotelReviewState("REJECTED", 4);
        REJECTED = hotelReviewState5;
        HotelReviewState[] hotelReviewStateArr = {hotelReviewState, hotelReviewState2, hotelReviewState3, hotelReviewState4, hotelReviewState5};
        $VALUES = hotelReviewStateArr;
        $ENTRIES = C3cG.A0w(hotelReviewStateArr);
    }

    public static Ey9<HotelReviewState> getEntries() {
        return $ENTRIES;
    }

    public static HotelReviewState valueOf(String str) {
        return (HotelReviewState) Enum.valueOf(HotelReviewState.class, str);
    }

    public static HotelReviewState[] values() {
        return (HotelReviewState[]) $VALUES.clone();
    }

    public HotelReviewState(String str, int i) {
    }
}
