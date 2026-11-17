package com.facebook.aura.subscription.repo;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07729ii;
import X.C07779iq;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class CurrencyAmountJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final Integer amount;
    public final String currency;

    public final class Companion {
        public final C9hr<CurrencyAmountJson> serializer() {
            return CurrencyAmountJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_subscription_repo_repo(CurrencyAmountJson currencyAmountJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || currencyAmountJson.currency != null) {
            c9j5.AAP(currencyAmountJson.currency, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || currencyAmountJson.amount != null) {
            c9j5.AAP(currencyAmountJson.amount, C07729ii.A00, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CurrencyAmountJson) {
                CurrencyAmountJson currencyAmountJson = (CurrencyAmountJson) obj;
                if (!C7384Etj.areEqual(this.currency, currencyAmountJson.currency) || !C7384Etj.areEqual(this.amount, currencyAmountJson.amount)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ CurrencyAmountJson copy$default(CurrencyAmountJson currencyAmountJson, String str, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = currencyAmountJson.currency;
        }
        if ((i & 2) != 0) {
            num = currencyAmountJson.amount;
        }
        return new CurrencyAmountJson(str, num);
    }

    public final String component1() {
        return this.currency;
    }

    public final Integer component2() {
        return this.amount;
    }

    public final CurrencyAmountJson copy(String str, Integer num) {
        return new CurrencyAmountJson(str, num);
    }

    public final Integer getAmount() {
        return this.amount;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public int hashCode() {
        return (AnonymousClass006.A0G(this.currency) * 31) + C3cH.A02(this.amount);
    }

    public final CurrencyAmount toDomain() {
        return new CurrencyAmount(this.currency, this.amount);
    }

    public CurrencyAmountJson(String str, Integer num) {
        this.currency = str;
        this.amount = num;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ CurrencyAmountJson(int i, String str, Integer num, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.currency = null;
        } else {
            this.currency = str;
        }
        if ((i & 2) == 0) {
            this.amount = null;
        } else {
            this.amount = num;
        }
    }

    public /* synthetic */ CurrencyAmountJson(String str, Integer num, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num);
    }

    public CurrencyAmountJson() {
        this(null, null);
    }
}
