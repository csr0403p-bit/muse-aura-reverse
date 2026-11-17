package com.facebook.aura.model;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class ShoppingCheckoutAttribution extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String entryPoint;
    public final String flowId;
    public final String provider;

    public final class Companion {
        public final C9hr<ShoppingCheckoutAttribution> serializer() {
            return ShoppingCheckoutAttribution$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(ShoppingCheckoutAttribution shoppingCheckoutAttribution, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(shoppingCheckoutAttribution.flowId, c9iZ, 0);
        c9j5.AAV(shoppingCheckoutAttribution.provider, c9iZ, 1);
        c9j5.AAV(shoppingCheckoutAttribution.entryPoint, c9iZ, 2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShoppingCheckoutAttribution) {
                ShoppingCheckoutAttribution shoppingCheckoutAttribution = (ShoppingCheckoutAttribution) obj;
                if (!C7384Etj.areEqual(this.flowId, shoppingCheckoutAttribution.flowId) || !C7384Etj.areEqual(this.provider, shoppingCheckoutAttribution.provider) || !C7384Etj.areEqual(this.entryPoint, shoppingCheckoutAttribution.entryPoint)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ShoppingCheckoutAttribution copy$default(ShoppingCheckoutAttribution shoppingCheckoutAttribution, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shoppingCheckoutAttribution.flowId;
        }
        if ((i & 2) != 0) {
            str2 = shoppingCheckoutAttribution.provider;
        }
        if ((i & 4) != 0) {
            str3 = shoppingCheckoutAttribution.entryPoint;
        }
        return shoppingCheckoutAttribution.copy(str, str2, str3);
    }

    public final String component1() {
        return this.flowId;
    }

    public final String component2() {
        return this.provider;
    }

    public final String component3() {
        return this.entryPoint;
    }

    public final String getEntryPoint() {
        return this.entryPoint;
    }

    public final String getFlowId() {
        return this.flowId;
    }

    public final String getProvider() {
        return this.provider;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.entryPoint, AnonymousClass005.A0I(this.provider, AnonymousClass001.A0G(this.flowId)));
    }

    public ShoppingCheckoutAttribution(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        this.flowId = str;
        this.provider = str2;
        this.entryPoint = str3;
    }

    public final ShoppingCheckoutAttribution copy(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        return new ShoppingCheckoutAttribution(str, str2, str3);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ShoppingCheckoutAttribution(int i, String str, String str2, String str3, C2hx c2hx) {
        if (7 != (i & 7)) {
            C9iI.A00(ShoppingCheckoutAttribution$$serializer.descriptor, i, 7);
            throw F60.createAndThrow();
        }
        this.flowId = str;
        this.provider = str2;
        this.entryPoint = str3;
    }
}
