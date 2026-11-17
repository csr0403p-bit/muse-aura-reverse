package com.facebook.aura.hotels;

import X.AnonymousClass002;
import X.C3cG;

/* loaded from: classes3.dex */
public abstract class HotelResultModelsKt {
    public static final int HOTEL_MAX_PAYLOAD_BYTES = 1048576;
    public static final String HOTEL_RESULTS_KIND = "hotel_results";
    public static final int HOTEL_RESULTS_SCHEMA_VERSION = 1;
    public static final int VISIBLE_HOTEL_RESULTS = 4;

    public static final String hotelNonBlank(String str) {
        String strA0l;
        if (str == null || (strA0l = AnonymousClass002.A0l(str)) == null || strA0l.length() <= 0) {
            return null;
        }
        return strA0l;
    }

    public static final String hotelReference(String str) {
        String strHotelNonBlank = hotelNonBlank(str);
        if (strHotelNonBlank == null || C3cG.A1S(strHotelNonBlank).length > 4096) {
            return null;
        }
        return strHotelNonBlank;
    }
}
