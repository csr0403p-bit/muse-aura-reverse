package com.facebook.aura.agentpermission;

import X.AnonymousClass002;
import X.AnonymousClass003;
import X.C10571Hud;
import X.C3cG;
import X.C7384Etj;
import android.text.format.DateFormat;
import com.facebook.aura.agentpermission.CheckoutCurrencyFormattingKt;
import com.facebook.aura.agentpermission.HotelCheckoutRefundability;
import com.facebook.aura.common.formatting.LocalizedFormattingKt;
import com.facebook.aura.gateway.CheckoutLodgingCancellation;
import com.facebook.aura.gateway.CheckoutLodgingTrip;
import com.facebook.aura.gateway.PlainDecimalAmountKt;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Currency;
import java.util.Locale;

/* loaded from: classes2.dex */
public abstract class HotelCheckoutFormattingKt {
    public static final String getPartialRefundPolicy(CheckoutLodgingCancellation checkoutLodgingCancellation) {
        C7384Etj.A0Y(checkoutLodgingCancellation, 0);
        HotelCheckoutRefundability refundability = getRefundability(checkoutLodgingCancellation);
        if ((refundability instanceof HotelCheckoutRefundability.FullyRefundable) || (refundability instanceof HotelCheckoutRefundability.FullRefundBefore)) {
            String str = checkoutLodgingCancellation.description;
            if (str != null && checkoutLodgingCancellation.hasPenalties) {
                return str;
            }
        } else if (!C7384Etj.areEqual(refundability, HotelCheckoutRefundability.NonRefundable.INSTANCE) && refundability != null) {
            throw C3cG.A0q();
        }
        return null;
    }

    public static final HotelCheckoutRefundability getRefundability(CheckoutLodgingCancellation checkoutLodgingCancellation) {
        HotelCheckoutRefundability fullRefundBefore;
        C7384Etj.A0Y(checkoutLodgingCancellation, 0);
        if (!AnonymousClass002.A1b(checkoutLodgingCancellation.refundable, false)) {
            if (AnonymousClass002.A1b(checkoutLodgingCancellation.freeCancellation, true)) {
                String str = checkoutLodgingCancellation.freeCancellationUntil;
                if (!checkoutLodgingCancellation.hasPenalties) {
                    fullRefundBefore = new HotelCheckoutRefundability.FullyRefundable(str);
                } else if (str != null) {
                    fullRefundBefore = new HotelCheckoutRefundability.FullRefundBefore(str);
                }
            }
            return null;
        }
        fullRefundBefore = HotelCheckoutRefundability.NonRefundable.INSTANCE;
        return fullRefundBefore;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.Hud] */
    public static final String hotelCheckoutAmount(String str, String str2, Locale locale) {
        String strTrimToNonEmpty;
        String strA0s;
        String strTrimToNonEmpty2;
        C7384Etj.A0Y(locale, 2);
        String upperCase = null;
        if (str == null || (strTrimToNonEmpty = CheckoutRowPrimitivesKt.trimToNonEmpty(str)) == null) {
            return null;
        }
        if (str2 != null && (strTrimToNonEmpty2 = CheckoutRowPrimitivesKt.trimToNonEmpty(str2)) != null) {
            Locale locale2 = Locale.ROOT;
            C7384Etj.A0V(locale2);
            upperCase = strTrimToNonEmpty2.toUpperCase(locale2);
        }
        if (upperCase == null || !PlainDecimalAmountKt.PLAIN_DECIMAL_AMOUNT.A08(strTrimToNonEmpty)) {
            return strTrimToNonEmpty;
        }
        try {
            BigDecimal bigDecimal = new BigDecimal(strTrimToNonEmpty);
            Currency currency = Currency.getInstance(upperCase);
            C7384Etj.A0U(currency);
            strA0s = CheckoutCurrencyFormattingKt.checkoutCurrencyAmount(bigDecimal, currency, locale, CheckoutCurrencyFormattingKt.AnonymousClass1.INSTANCE);
        } catch (Throwable th) {
            strA0s = C3cG.A0s(th);
        }
        if (!(strA0s instanceof C10571Hud)) {
            strTrimToNonEmpty = strA0s;
        }
        return strTrimToNonEmpty;
    }

    public static final Integer hotelNights(CheckoutLodgingTrip checkoutLodgingTrip) {
        C7384Etj.A0Y(checkoutLodgingTrip, 0);
        long jBetween = ChronoUnit.DAYS.between(checkoutLodgingTrip.checkIn, checkoutLodgingTrip.checkOut);
        long jLongValue = Long.valueOf(jBetween).longValue();
        if (1 > jLongValue || jLongValue >= 2147483648L) {
            return null;
        }
        return Integer.valueOf((int) jBetween);
    }

    public static final boolean isZeroAmount(String str) {
        C7384Etj.A0Y(str, 0);
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isDigit(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        String string = sb.toString();
        int length2 = string.length();
        if (length2 <= 0) {
            return false;
        }
        int i2 = 0;
        while (string.charAt(i2) == '0') {
            i2++;
            if (i2 >= length2) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.Hud] */
    public static final String hotelCheckoutDeadline(String str, Locale locale) {
        Object objA0s;
        String strA0s;
        LocalDateTime localDateTime;
        AnonymousClass003.A0u(str, locale);
        try {
            try {
                objA0s = OffsetDateTime.parse(str);
            } catch (Throwable th) {
                objA0s = C3cG.A0s(th);
            }
            if (objA0s instanceof C10571Hud) {
                objA0s = null;
            }
            OffsetDateTime offsetDateTime = (OffsetDateTime) objA0s;
            if (offsetDateTime == null || (localDateTime = offsetDateTime.toLocalDateTime()) == null) {
                localDateTime = LocalDateTime.parse(str);
            }
            strA0s = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM, FormatStyle.SHORT).withLocale(locale).format(localDateTime);
        } catch (Throwable th2) {
            strA0s = C3cG.A0s(th2);
        }
        if (!(strA0s instanceof C10571Hud)) {
            str = strA0s;
        }
        return str;
    }

    public static final String hotelCheckoutStay(CheckoutLodgingTrip checkoutLodgingTrip, Locale locale) {
        AnonymousClass003.A0u(checkoutLodgingTrip, locale);
        return LocalizedFormattingKt.formatDateRange(checkoutLodgingTrip.checkIn, checkoutLodgingTrip.checkOut, "yMMMEd", locale);
    }

    public static final String hotelCheckoutStayDate(LocalDate localDate, Locale locale) {
        AnonymousClass003.A0u(localDate, locale);
        String str = DateTimeFormatter.ofPattern(DateFormat.getBestDateTimePattern(locale, "EEEMMMd"), locale).format(localDate);
        C7384Etj.A0U(str);
        return str;
    }
}
