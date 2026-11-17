package com.facebook.aura.shopping.model;

import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j1;
import X.C9j5;
import java.util.Locale;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class CouponMoneyJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final Long amount;
    public final String currency;

    public final class Companion {
        public final C9hr<CouponMoneyJson> serializer() {
            return CouponMoneyJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_model_model(CouponMoneyJson couponMoneyJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || couponMoneyJson.amount != null) {
            c9j5.AAP(couponMoneyJson.amount, C9j1.A00, c9iZ, 0);
        }
        if (zAfR || couponMoneyJson.currency != null) {
            c9j5.AAP(couponMoneyJson.currency, C07779iq.A01, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CouponMoneyJson) {
                CouponMoneyJson couponMoneyJson = (CouponMoneyJson) obj;
                if (!C7384Etj.areEqual(this.amount, couponMoneyJson.amount) || !C7384Etj.areEqual(this.currency, couponMoneyJson.currency)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ CouponMoneyJson copy$default(CouponMoneyJson couponMoneyJson, Long l, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            l = couponMoneyJson.amount;
        }
        if ((i & 2) != 0) {
            str = couponMoneyJson.currency;
        }
        return new CouponMoneyJson(l, str);
    }

    public final Long component1() {
        return this.amount;
    }

    public final String component2() {
        return this.currency;
    }

    public final CouponMoneyJson copy(Long l, String str) {
        return new CouponMoneyJson(l, str);
    }

    public final Long getAmount() {
        return this.amount;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public int hashCode() {
        return (AnonymousClass006.A0D(this.amount) * 31) + AnonymousClass005.A0H(this.currency);
    }

    public final PdpPrice toPdpPrice(String str) {
        String strValidCurrencyCode;
        Long l = this.amount;
        if (l != null) {
            long jLongValue = l.longValue();
            if (jLongValue >= 0 && (strValidCurrencyCode = ShoppingProductDisplayKt.validCurrencyCode(this.currency)) != null && (str == null || strValidCurrencyCode.equals(AnonymousClass002.A0l(str).toUpperCase(Locale.ROOT)))) {
                return new PdpPrice(ShoppingProductDisplayKt.formatMinorUnits(jLongValue, strValidCurrencyCode), strValidCurrencyCode);
            }
        }
        return null;
    }

    public CouponMoneyJson(Long l, String str) {
        this.amount = l;
        this.currency = str;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ CouponMoneyJson(int i, Long l, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.amount = null;
        } else {
            this.amount = l;
        }
        if ((i & 2) == 0) {
            this.currency = null;
        } else {
            this.currency = str;
        }
    }

    public /* synthetic */ CouponMoneyJson(Long l, String str, int i, C06H c06h) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : str);
    }

    public CouponMoneyJson() {
        this(null, null);
    }
}
