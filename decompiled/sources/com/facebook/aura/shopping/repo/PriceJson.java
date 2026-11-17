package com.facebook.aura.shopping.repo;

import X.AnonymousClass001;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import com.facebook.aura.shopping.model.PdpPrice;
import com.facebook.aura.shopping.model.ShoppingProductDisplayKt;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class PriceJson extends C06G {
    public static final Companion Companion = new Companion();
    public final int amount;
    public final String currency;

    public final class Companion {
        public final C9hr<PriceJson> serializer() {
            return PriceJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public PriceJson(int i, String str) {
        C7384Etj.A0Y(str, 1);
        this.amount = i;
        this.currency = str;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_repo_repo(PriceJson priceJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || priceJson.amount != 0) {
            c9j5.AAK(c9iZ, 0, priceJson.amount);
        }
        if (zAfR || !C3cH.A1Q(priceJson.currency)) {
            c9j5.AAV(priceJson.currency, c9iZ, 1);
        }
    }

    public final PriceJson copy(int i, String str) {
        C7384Etj.A0Y(str, 1);
        return new PriceJson(i, str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PriceJson) {
                PriceJson priceJson = (PriceJson) obj;
                if (this.amount != priceJson.amount || !C7384Etj.areEqual(this.currency, priceJson.currency)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ PriceJson copy$default(PriceJson priceJson, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = priceJson.amount;
        }
        if ((i2 & 2) != 0) {
            str = priceJson.currency;
        }
        C7384Etj.A0Y(str, 1);
        return new PriceJson(i, str);
    }

    public final int component1() {
        return this.amount;
    }

    public final String component2() {
        return this.currency;
    }

    public final int getAmount() {
        return this.amount;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.currency, this.amount * 31);
    }

    public final PdpPrice toPdpPrice() {
        return new PdpPrice(ShoppingProductDisplayKt.formatMinorUnits(this.amount, this.currency), this.currency);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ PriceJson(int i, int i2, String str, C2hx c2hx) {
        this.amount = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.currency = "";
        } else {
            this.currency = str;
        }
    }

    public /* synthetic */ PriceJson(int i, String str, int i2, C06H c06h) {
        this(C3cI.A00(i2, i), (i2 & 2) != 0 ? "" : str);
    }

    public PriceJson() {
        this(0, "");
    }
}
