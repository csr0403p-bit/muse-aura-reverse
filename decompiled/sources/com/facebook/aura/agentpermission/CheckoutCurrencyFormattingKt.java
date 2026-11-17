package com.facebook.aura.agentpermission;

import X.AbstractC7559F3s;
import X.AnonymousClass005;
import X.C3cI;
import X.C7384Etj;
import X.G0U;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import kotlin.Unit;

/* loaded from: classes2.dex */
public abstract class CheckoutCurrencyFormattingKt {

    /* renamed from: com.facebook.aura.agentpermission.CheckoutCurrencyFormattingKt$checkoutCurrencyAmount$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<NumberFormat, Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(NumberFormat numberFormat) {
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(NumberFormat numberFormat) {
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.CheckoutCurrencyFormattingKt$checkoutCurrencyAmountWithCurrencyPrecision$1, reason: invalid class name and case insensitive filesystem */
    public final class C108021 extends AbstractC7559F3s implements G0U<NumberFormat, Unit> {
        public final /* synthetic */ Currency $currency;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(NumberFormat numberFormat) {
            C7384Etj.A0Y(numberFormat, 0);
            numberFormat.setMinimumFractionDigits(this.$currency.getDefaultFractionDigits());
            numberFormat.setMaximumFractionDigits(this.$currency.getDefaultFractionDigits());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C108021(Currency currency) {
            super(1);
            this.$currency = currency;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(NumberFormat numberFormat) {
            invoke2(numberFormat);
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ String checkoutCurrencyAmount$default(BigDecimal bigDecimal, Currency currency, Locale locale, G0U g0u, int i, Object obj) {
        Locale localeA13 = C3cI.A13(locale, i & 4);
        if ((i & 8) != 0) {
            g0u = AnonymousClass1.INSTANCE;
        }
        return checkoutCurrencyAmount(bigDecimal, currency, localeA13, g0u);
    }

    public static final String checkoutCurrencyAmount(BigDecimal bigDecimal, Currency currency, Locale locale, G0U<? super NumberFormat, Unit> g0u) {
        AnonymousClass005.A14(bigDecimal, currency, locale, g0u);
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(locale);
        currencyInstance.setCurrency(currency);
        g0u.invoke(currencyInstance);
        String str = currencyInstance.format(bigDecimal);
        C7384Etj.A0U(str);
        return str;
    }

    public static final String checkoutCurrencyAmountWithCurrencyPrecision(BigDecimal bigDecimal, Currency currency, Locale locale) {
        AnonymousClass005.A0x(bigDecimal, currency, locale);
        return checkoutCurrencyAmount(bigDecimal, currency, locale, new C108021(currency));
    }
}
