package com.facebook.aura.hotels;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class HotelContactAction {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HotelContactAction[] $VALUES;
    public static final HotelContactAction MAPS;
    public static final HotelContactAction PHONE;

    static {
        HotelContactAction hotelContactAction = new HotelContactAction("MAPS", 0);
        MAPS = hotelContactAction;
        HotelContactAction hotelContactAction2 = new HotelContactAction("PHONE", 1);
        PHONE = hotelContactAction2;
        HotelContactAction[] hotelContactActionArr = {hotelContactAction, hotelContactAction2};
        $VALUES = hotelContactActionArr;
        $ENTRIES = C3cG.A0w(hotelContactActionArr);
    }

    public static Ey9<HotelContactAction> getEntries() {
        return $ENTRIES;
    }

    public static HotelContactAction valueOf(String str) {
        return (HotelContactAction) Enum.valueOf(HotelContactAction.class, str);
    }

    public static HotelContactAction[] values() {
        return (HotelContactAction[]) $VALUES.clone();
    }

    public HotelContactAction(String str, int i) {
    }
}
