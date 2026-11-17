package com.facebook.aura.agentpermission;

import X.AbstractC2271BQs;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BBI;
import X.BFM;
import X.C10571Hud;
import X.C3cG;
import X.C7384Etj;
import com.facebook.aura.R;
import com.facebook.aura.gateway.WalletBalance;
import com.facebook.aura.gateway.WalletPaymentOption;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Locale;

/* loaded from: classes2.dex */
public abstract class WalletFundingPresentationKt {
    public static final String walletFundingLabel(WalletPaymentOption walletPaymentOption, BFM bfm, int i) {
        BBI bbiA0M;
        Object objA0s;
        Currency currency;
        String strA0t;
        C7384Etj.A0Y(walletPaymentOption, 0);
        bfm.AgE(-726883983);
        if ("balance".equals(walletPaymentOption.paymentType)) {
            bbiA0M = AnonymousClass002.A0M(bfm, 624664497);
            WalletBalance walletBalance = walletPaymentOption.balance;
            String strCheckoutCurrencyAmountWithCurrencyPrecision = null;
            if (walletBalance != null) {
                try {
                    String str = walletBalance.currency;
                    Locale locale = Locale.ROOT;
                    C7384Etj.A0V(locale);
                    objA0s = Currency.getInstance(str.toUpperCase(locale));
                } catch (Throwable th) {
                    objA0s = C3cG.A0s(th);
                }
                if (objA0s instanceof C10571Hud) {
                    objA0s = null;
                }
                currency = (Currency) objA0s;
            } else {
                currency = null;
            }
            if (walletBalance != null && currency != null && currency.getDefaultFractionDigits() >= 0) {
                BigDecimal bigDecimalMovePointLeft = BigDecimal.valueOf(walletBalance.amount).movePointLeft(currency.getDefaultFractionDigits());
                C7384Etj.A0U(bigDecimalMovePointLeft);
                Locale locale2 = Locale.getDefault();
                C7384Etj.A0U(locale2);
                strCheckoutCurrencyAmountWithCurrencyPrecision = CheckoutCurrencyFormattingKt.checkoutCurrencyAmountWithCurrencyPrecision(bigDecimalMovePointLeft, currency, locale2);
            }
            if (strCheckoutCurrencyAmountWithCurrencyPrecision == null) {
                bfm.AgE(1544186733);
                strA0t = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12014c);
            } else {
                bfm.AgE(1544188924);
                strA0t = AnonymousClass001.A0t(bfm, strCheckoutCurrencyAmountWithCurrencyPrecision, R.string._name_removed__res_0x7f12014d);
            }
        } else {
            bfm.AgE(624475180);
            strA0t = CheckoutApprovalSharedKt.checkoutPaymentMethodLabel(walletPaymentOption.paymentMethodLabel, walletPaymentOption.cardLast4, bfm, 0);
            if (strA0t == null) {
                strA0t = walletPaymentOption.cardBrand;
            }
            if (strA0t == null) {
                bfm.AgE(1544168854);
                strA0t = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12008f);
            } else {
                bfm.AgE(1544165413);
            }
            bbiA0M = C3cG.A07(bfm);
        }
        BBI.A0R(bbiA0M, false);
        BBI.A0R(bbiA0M, false);
        return strA0t;
    }

    public static final int walletProviderLogo(String str) {
        return "stripe_link".equals(str) ? R.drawable.hatch_connector_logos_connectorstripe : "shop_pay".equals(str) ? R.drawable.hatch_connector_logos_connectorshoppay : R.drawable.wallet_outline_24_wght400;
    }
}
