package com.facebook.aura.common.formatting;

import X.AnonymousClass005;
import X.C3cI;
import X.C7384Etj;
import android.icu.text.DateIntervalFormat;
import android.icu.text.NumberFormat;
import android.icu.util.Currency;
import android.icu.util.DateInterval;
import android.icu.util.TimeZone;
import java.math.BigDecimal;
import java.text.FieldPosition;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Locale;

/* loaded from: classes3.dex */
public abstract class LocalizedFormattingKt {
    public static final String formatCurrency(BigDecimal bigDecimal, String str, Locale locale, boolean z, boolean z2) {
        AnonymousClass005.A10(bigDecimal, str, locale);
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(locale);
        currencyInstance.setCurrency(Currency.getInstance(str));
        if (z2) {
            currencyInstance.setMaximumFractionDigits(Math.max(currencyInstance.getMaximumFractionDigits(), bigDecimal.scale()));
        }
        if (z && LocalizedFormattingKt$$ExternalSyntheticBackportWithForwarding0.m(bigDecimal).scale() <= 0) {
            currencyInstance.setMaximumFractionDigits(0);
        }
        String str2 = currencyInstance.format(bigDecimal);
        C7384Etj.A0U(str2);
        return str2;
    }

    public static final String formatDateRange(LocalDateTime localDateTime, LocalDateTime localDateTime2, String str, Locale locale) {
        C7384Etj.A0Y(localDateTime, 0);
        AnonymousClass005.A11(localDateTime2, str, locale, 1);
        DateIntervalFormat dateIntervalFormat = DateIntervalFormat.getInstance(str, locale);
        dateIntervalFormat.setTimeZone(TimeZone.GMT_ZONE);
        return dateIntervalFormat.format(new DateInterval(utcMillis(localDateTime), utcMillis(localDateTime2)), new StringBuffer(), new FieldPosition(0)).toString();
    }

    public static /* synthetic */ String formatCurrency$default(BigDecimal bigDecimal, String str, Locale locale, boolean z, boolean z2, int i, Object obj) {
        Locale localeA13 = C3cI.A13(locale, i & 4);
        if ((i & 8) != 0) {
            z = true;
        }
        return formatCurrency(bigDecimal, str, localeA13, z, AnonymousClass005.A1Q(i, z2));
    }

    public static /* synthetic */ String formatDateRange$default(LocalDate localDate, LocalDate localDate2, Locale locale, LocalDate localDate3, int i, Object obj) {
        Locale localeA13 = C3cI.A13(locale, i & 4);
        if ((i & 8) != 0) {
            localDate3 = LocalDate.now();
            C7384Etj.A0U(localDate3);
        }
        return formatDateRange(localDate, localDate2, localeA13, localDate3);
    }

    public static final long utcMillis(LocalDateTime localDateTime) {
        return localDateTime.toInstant(ZoneOffset.UTC).toEpochMilli();
    }

    public static final String formatDateRange(LocalDate localDate, LocalDate localDate2, Locale locale, LocalDate localDate3) {
        String str;
        AnonymousClass005.A14(localDate, localDate2, locale, localDate3);
        if (localDate.getYear() == localDate3.getYear() && localDate2.getYear() == localDate3.getYear()) {
            str = "EEE MMM d";
        } else {
            str = "EEE MMM d y";
        }
        return formatDateRange(localDate, localDate2, str, locale);
    }

    public static final String formatDateRange(LocalDate localDate, LocalDate localDate2, String str, Locale locale) {
        AnonymousClass005.A14(localDate, localDate2, str, locale);
        LocalDateTime localDateTimeAtStartOfDay = localDate.atStartOfDay();
        C7384Etj.A0U(localDateTimeAtStartOfDay);
        LocalDateTime localDateTimeAtStartOfDay2 = localDate2.atStartOfDay();
        C7384Etj.A0U(localDateTimeAtStartOfDay2);
        return formatDateRange(localDateTimeAtStartOfDay, localDateTimeAtStartOfDay2, str, locale);
    }
}
