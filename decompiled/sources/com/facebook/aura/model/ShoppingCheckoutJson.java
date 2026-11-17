package com.facebook.aura.model;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class ShoppingCheckoutJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String checkout_flow_id;
    public final String entry_point;
    public final String provider;

    public final class Companion {
        public final C9hr<ShoppingCheckoutJson> serializer() {
            return ShoppingCheckoutJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(ShoppingCheckoutJson shoppingCheckoutJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(shoppingCheckoutJson.checkout_flow_id)) {
            c9j5.AAV(shoppingCheckoutJson.checkout_flow_id, c9iZ, 0);
        }
        if (zAfR || !"".equals(shoppingCheckoutJson.provider)) {
            c9j5.AAV(shoppingCheckoutJson.provider, c9iZ, 1);
        }
        if (zAfR || !"".equals(shoppingCheckoutJson.entry_point)) {
            c9j5.AAV(shoppingCheckoutJson.entry_point, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShoppingCheckoutJson) {
                ShoppingCheckoutJson shoppingCheckoutJson = (ShoppingCheckoutJson) obj;
                if (!C7384Etj.areEqual(this.checkout_flow_id, shoppingCheckoutJson.checkout_flow_id) || !C7384Etj.areEqual(this.provider, shoppingCheckoutJson.provider) || !C7384Etj.areEqual(this.entry_point, shoppingCheckoutJson.entry_point)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ShoppingCheckoutJson copy$default(ShoppingCheckoutJson shoppingCheckoutJson, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shoppingCheckoutJson.checkout_flow_id;
        }
        if ((i & 2) != 0) {
            str2 = shoppingCheckoutJson.provider;
        }
        if ((i & 4) != 0) {
            str3 = shoppingCheckoutJson.entry_point;
        }
        return shoppingCheckoutJson.copy(str, str2, str3);
    }

    public final String component1() {
        return this.checkout_flow_id;
    }

    public final String component2() {
        return this.provider;
    }

    public final String component3() {
        return this.entry_point;
    }

    public final String getCheckout_flow_id() {
        return this.checkout_flow_id;
    }

    public final String getEntry_point() {
        return this.entry_point;
    }

    public final String getProvider() {
        return this.provider;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.entry_point, AnonymousClass005.A0I(this.provider, AnonymousClass001.A0G(this.checkout_flow_id)));
    }

    public final ShoppingCheckoutAttribution toDomain() {
        String strA0l;
        int length;
        String strA0l2 = AnonymousClass002.A0l(this.checkout_flow_id);
        int length2 = strA0l2.length();
        if (length2 <= 0 || length2 > 128 || (length = (strA0l = AnonymousClass002.A0l(this.provider)).length()) <= 0 || length > 64) {
            return null;
        }
        String str = this.entry_point;
        if (!ExternalLinkPresentationJsonKt.SAVED_CHECKOUT_ENTRY_POINTS.contains(str) || str == null) {
            return null;
        }
        return new ShoppingCheckoutAttribution(strA0l2, strA0l, str);
    }

    public ShoppingCheckoutJson(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        this.checkout_flow_id = str;
        this.provider = str2;
        this.entry_point = str3;
    }

    public final ShoppingCheckoutJson copy(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        return new ShoppingCheckoutJson(str, str2, str3);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ShoppingCheckoutJson(int i, String str, String str2, String str3, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.checkout_flow_id = "";
        } else {
            this.checkout_flow_id = str;
        }
        if ((i & 2) == 0) {
            this.provider = "";
        } else {
            this.provider = str2;
        }
        if ((i & 4) == 0) {
            this.entry_point = "";
        } else {
            this.entry_point = str3;
        }
    }

    public /* synthetic */ ShoppingCheckoutJson(String str, String str2, String str3, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }

    public ShoppingCheckoutJson() {
        this("", "", "");
    }
}
