package com.facebook.aura.agentpermission;

import X.AnonymousClass003;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Currency;
import java.util.List;
import java.util.Locale;

/* loaded from: classes2.dex */
public abstract class ReservationCheckoutFormattingKt {
    public static final String formattedAmount(HatchAgentPermissionsRepository.ReservationCheckoutApproval reservationCheckoutApproval, Locale locale) {
        AnonymousClass003.A0u(reservationCheckoutApproval, locale);
        return CheckoutCurrencyFormattingKt.checkoutCurrencyAmountWithCurrencyPrecision(reservationCheckoutApproval.amount, reservationCheckoutApproval.currency, locale);
    }

    public static final String reservationCheckoutAmount(BigDecimal bigDecimal, Currency currency, Locale locale) {
        return CheckoutCurrencyFormattingKt.checkoutCurrencyAmountWithCurrencyPrecision(bigDecimal, currency, locale);
    }

    public static final CheckoutSummaryPresentation toCheckoutSummaryPresentation(HatchAgentPermissionsRepository.ReservationCheckoutApproval reservationCheckoutApproval, Locale locale) {
        AnonymousClass003.A0u(reservationCheckoutApproval, locale);
        List<HatchAgentPermissionsRepository.ReservationCheckoutTotal> list = reservationCheckoutApproval.totals;
        ArrayList arrayListA0i = AnonymousClass003.A0i(list);
        for (HatchAgentPermissionsRepository.ReservationCheckoutTotal reservationCheckoutTotal : list) {
            arrayListA0i.add(new HatchAgentPermissionsRepository.CheckoutTotal(reservationCheckoutTotal.type, reservationCheckoutTotal.displayText, CheckoutCurrencyFormattingKt.checkoutCurrencyAmountWithCurrencyPrecision(reservationCheckoutTotal.amount, reservationCheckoutApproval.currency, locale), reservationCheckoutApproval.currency.getCurrencyCode()));
        }
        return CheckoutApprovalPresentationKt.retailCheckoutSummary(arrayListA0i);
    }
}
