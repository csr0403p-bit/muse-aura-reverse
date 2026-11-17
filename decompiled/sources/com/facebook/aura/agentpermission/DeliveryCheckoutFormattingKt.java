package com.facebook.aura.agentpermission;

import X.AnonymousClass003;
import X.BFM;
import X.C7384Etj;
import android.content.Context;
import android.text.format.DateUtils;
import com.facebook.aura.gateway.DeliveryCheckoutMoney;
import com.facebook.aura.gateway.DeliveryCheckoutTime;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Currency;
import java.util.Formatter;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public abstract class DeliveryCheckoutFormattingKt {
    public static final String deliveryCheckoutAmount(DeliveryCheckoutMoney deliveryCheckoutMoney) {
        C7384Etj.A0Y(deliveryCheckoutMoney, 0);
        BigDecimal bigDecimal = deliveryCheckoutMoney.amount;
        Currency currency = deliveryCheckoutMoney.currency;
        Locale locale = Locale.getDefault();
        C7384Etj.A0U(locale);
        return CheckoutCurrencyFormattingKt.checkoutCurrencyAmountWithCurrencyPrecision(bigDecimal, currency, locale);
    }

    public static final String deliveryStopTimeText(DeliveryCheckoutTime deliveryCheckoutTime, BFM bfm, int i) {
        C7384Etj.A0Y(deliveryCheckoutTime, 0);
        Context contextA0O = AnonymousClass003.A0O(bfm);
        Formatter formatter = new Formatter(new StringBuilder(), Locale.getDefault());
        long j = deliveryCheckoutTime.startMs;
        Long l = deliveryCheckoutTime.endMs;
        String string = DateUtils.formatDateRange(contextA0O, formatter, j, l != null ? l.longValue() : j, deliveryStopTimeFlags(deliveryCheckoutTime), TimeZone.getDefault().getID()).toString();
        C7384Etj.A0U(string);
        return string;
    }

    public static final int deliveryStopTimeFlags(DeliveryCheckoutTime deliveryCheckoutTime) {
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        return C7384Etj.areEqual(Instant.ofEpochMilli(deliveryCheckoutTime.startMs).atZone(zoneIdSystemDefault).toLocalDate(), LocalDate.now(zoneIdSystemDefault)) ? 1 : 65561;
    }
}
