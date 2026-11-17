package com.facebook.aura.hotels;

import X.AnonymousClass005;
import X.C3cI;
import X.C60P;
import X.C7384Etj;
import com.facebook.aura.common.formatting.LocalizedFormattingKt;
import java.time.LocalDate;
import java.util.Locale;

/* loaded from: classes3.dex */
public abstract class HotelResultsFormattingKt {
    public static /* synthetic */ String dateRange$default(HotelTrip hotelTrip, Locale locale, LocalDate localDate, int i, Object obj) {
        Locale localeA13 = C3cI.A13(locale, i & 1);
        if ((i & 2) != 0) {
            localDate = LocalDate.now();
            C7384Etj.A0U(localDate);
        }
        return dateRange(hotelTrip, localeA13, localDate);
    }

    public static final String dateRange(HotelTrip hotelTrip, Locale locale, LocalDate localDate) {
        AnonymousClass005.A0x(hotelTrip, locale, localDate);
        return LocalizedFormattingKt.formatDateRange(hotelTrip.checkIn, hotelTrip.checkOut, locale, localDate);
    }

    public static final String formatted(HotelMoney hotelMoney, Locale locale) {
        boolean zA1Y = C60P.A1Y(hotelMoney, locale);
        return LocalizedFormattingKt.formatCurrency(hotelMoney.amount, hotelMoney.currency, locale, zA1Y, zA1Y);
    }
}
