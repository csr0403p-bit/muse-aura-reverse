package com.facebook.aura.shopping.repo;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07729ii;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import com.facebook.aura.shopping.model.PdpPrice;
import com.facebook.aura.shopping.model.ShoppingProductDisplayKt;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class ShippingMoneyJson extends C06G {
    public static final Companion Companion = new Companion();
    public final Integer amount;
    public final String currency;

    public final class Companion {
        public final C9hr<ShippingMoneyJson> serializer() {
            return ShippingMoneyJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_repo_repo(ShippingMoneyJson shippingMoneyJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || shippingMoneyJson.amount != null) {
            c9j5.AAP(shippingMoneyJson.amount, C07729ii.A00, c9iZ, 0);
        }
        if (zAfR || shippingMoneyJson.currency != null) {
            c9j5.AAP(shippingMoneyJson.currency, C07779iq.A01, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShippingMoneyJson) {
                ShippingMoneyJson shippingMoneyJson = (ShippingMoneyJson) obj;
                if (!C7384Etj.areEqual(this.amount, shippingMoneyJson.amount) || !C7384Etj.areEqual(this.currency, shippingMoneyJson.currency)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ShippingMoneyJson copy$default(ShippingMoneyJson shippingMoneyJson, Integer num, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = shippingMoneyJson.amount;
        }
        if ((i & 2) != 0) {
            str = shippingMoneyJson.currency;
        }
        return new ShippingMoneyJson(num, str);
    }

    public final Integer component1() {
        return this.amount;
    }

    public final String component2() {
        return this.currency;
    }

    public final ShippingMoneyJson copy(Integer num, String str) {
        return new ShippingMoneyJson(num, str);
    }

    public final Integer getAmount() {
        return this.amount;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public int hashCode() {
        return (AnonymousClass006.A0D(this.amount) * 31) + AnonymousClass005.A0H(this.currency);
    }

    public final PdpPrice toPdpPrice() {
        String str;
        if (this.amount == null || (str = this.currency) == null) {
            return null;
        }
        return new PdpPrice(ShoppingProductDisplayKt.formatMinorUnits(r0.intValue(), str), this.currency);
    }

    public ShippingMoneyJson(Integer num, String str) {
        this.amount = num;
        this.currency = str;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ShippingMoneyJson(int i, Integer num, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.amount = null;
        } else {
            this.amount = num;
        }
        if ((i & 2) == 0) {
            this.currency = null;
        } else {
            this.currency = str;
        }
    }

    public /* synthetic */ ShippingMoneyJson(Integer num, String str, int i, C06H c06h) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str);
    }

    public ShippingMoneyJson() {
        this(null, null);
    }
}
