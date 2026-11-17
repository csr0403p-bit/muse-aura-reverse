package com.facebook.aura.shopping.repo;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C8j4;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class ShoppingDisplayedCartJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String captured_at;
    public final String retailer_name;

    public final class Companion {
        public final C9hr<ShoppingDisplayedCartJson> serializer() {
            return ShoppingDisplayedCartJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public ShoppingDisplayedCartJson(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        this.captured_at = str;
        this.retailer_name = str2;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_repo_repo(ShoppingDisplayedCartJson shoppingDisplayedCartJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(shoppingDisplayedCartJson.captured_at, c9iZ, 0);
        if (c9j5.AfR() || shoppingDisplayedCartJson.retailer_name != null) {
            c9j5.AAP(shoppingDisplayedCartJson.retailer_name, C07779iq.A01, c9iZ, 1);
        }
    }

    public final ShoppingDisplayedCartJson copy(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        return new ShoppingDisplayedCartJson(str, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShoppingDisplayedCartJson) {
                ShoppingDisplayedCartJson shoppingDisplayedCartJson = (ShoppingDisplayedCartJson) obj;
                if (!C7384Etj.areEqual(this.captured_at, shoppingDisplayedCartJson.captured_at) || !C7384Etj.areEqual(this.retailer_name, shoppingDisplayedCartJson.retailer_name)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ShoppingDisplayedCartJson copy$default(ShoppingDisplayedCartJson shoppingDisplayedCartJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shoppingDisplayedCartJson.captured_at;
        }
        if ((i & 2) != 0) {
            str2 = shoppingDisplayedCartJson.retailer_name;
        }
        C7384Etj.A0Y(str, 0);
        return new ShoppingDisplayedCartJson(str, str2);
    }

    public final String component1() {
        return this.captured_at;
    }

    public final String component2() {
        return this.retailer_name;
    }

    public final String getCaptured_at() {
        return this.captured_at;
    }

    public final String getRetailer_name() {
        return this.retailer_name;
    }

    public int hashCode() {
        return AnonymousClass001.A0G(this.captured_at) + AnonymousClass006.A0G(this.retailer_name);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ShoppingDisplayedCartJson(int i, String str, String str2, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(ShoppingDisplayedCartJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.captured_at = str;
        this.retailer_name = C8j4.A0t(i, str2);
    }

    public /* synthetic */ ShoppingDisplayedCartJson(String str, String str2, int i, C06H c06h) {
        this(str, AnonymousClass006.A0s(i, str2));
    }
}
