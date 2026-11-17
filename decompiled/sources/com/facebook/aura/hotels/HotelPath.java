package com.facebook.aura.hotels;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.network.api.JarvisPath;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class HotelPath implements JarvisPath.Extension {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HotelPath[] $VALUES;
    public static final HotelPath DETAILS;
    public static final HotelPath EVENTS;
    public static final HotelPath RESULTS;
    public final String value;

    static {
        HotelPath hotelPath = new HotelPath("RESULTS", 0, "api/hotels/results");
        RESULTS = hotelPath;
        HotelPath hotelPath2 = new HotelPath("DETAILS", 1, "api/hotels/details");
        DETAILS = hotelPath2;
        HotelPath hotelPath3 = new HotelPath("EVENTS", 2, "api/hotels/events");
        EVENTS = hotelPath3;
        HotelPath[] hotelPathArr = {hotelPath, hotelPath2, hotelPath3};
        $VALUES = hotelPathArr;
        $ENTRIES = C3cG.A0w(hotelPathArr);
    }

    public static Ey9<HotelPath> getEntries() {
        return $ENTRIES;
    }

    public static HotelPath valueOf(String str) {
        return (HotelPath) Enum.valueOf(HotelPath.class, str);
    }

    public static HotelPath[] values() {
        return (HotelPath[]) $VALUES.clone();
    }

    @Override // com.facebook.aura.network.api.JarvisPath
    public String getValue() {
        return this.value;
    }

    public HotelPath(String str, int i, String str2) {
        this.value = str2;
    }
}
