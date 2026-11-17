package com.facebook.aura.gateway;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.HxE;
import java.math.BigDecimal;
import java.util.Currency;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class DeliveryCheckoutMoneyJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String amount;
    public final String currency;

    public final class Companion {
        public final C9hr<DeliveryCheckoutMoneyJson> serializer() {
            return DeliveryCheckoutMoneyJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(DeliveryCheckoutMoneyJson deliveryCheckoutMoneyJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || deliveryCheckoutMoneyJson.amount != null) {
            c9j5.AAP(deliveryCheckoutMoneyJson.amount, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || deliveryCheckoutMoneyJson.currency != null) {
            c9j5.AAP(deliveryCheckoutMoneyJson.currency, C07779iq.A01, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DeliveryCheckoutMoneyJson) {
                DeliveryCheckoutMoneyJson deliveryCheckoutMoneyJson = (DeliveryCheckoutMoneyJson) obj;
                if (!C7384Etj.areEqual(this.amount, deliveryCheckoutMoneyJson.amount) || !C7384Etj.areEqual(this.currency, deliveryCheckoutMoneyJson.currency)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ DeliveryCheckoutMoneyJson copy$default(DeliveryCheckoutMoneyJson deliveryCheckoutMoneyJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deliveryCheckoutMoneyJson.amount;
        }
        if ((i & 2) != 0) {
            str2 = deliveryCheckoutMoneyJson.currency;
        }
        return new DeliveryCheckoutMoneyJson(str, str2);
    }

    public final String component1() {
        return this.amount;
    }

    public final String component2() {
        return this.currency;
    }

    public final DeliveryCheckoutMoneyJson copy(String str, String str2) {
        return new DeliveryCheckoutMoneyJson(str, str2);
    }

    public final String getAmount() {
        return this.amount;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public int hashCode() {
        return (AnonymousClass006.A0G(this.amount) * 31) + AnonymousClass005.A0H(this.currency);
    }

    public final DeliveryCheckoutMoney toDomainOrNull() {
        HxE<BigDecimal, Currency> hxECheckoutMoneyOrNull = CheckoutMoneyKt.checkoutMoneyOrNull(this.amount, this.currency);
        if (hxECheckoutMoneyOrNull == null) {
            return null;
        }
        return new DeliveryCheckoutMoney(hxECheckoutMoneyOrNull.first, hxECheckoutMoneyOrNull.second);
    }

    public DeliveryCheckoutMoneyJson(String str, String str2) {
        this.amount = str;
        this.currency = str2;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ DeliveryCheckoutMoneyJson(int i, String str, String str2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.amount = null;
        } else {
            this.amount = str;
        }
        if ((i & 2) == 0) {
            this.currency = null;
        } else {
            this.currency = str2;
        }
    }

    public /* synthetic */ DeliveryCheckoutMoneyJson(String str, String str2, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    public DeliveryCheckoutMoneyJson() {
        this(null, null);
    }
}
