package com.facebook.aura.shopping.model;

import X.AnonymousClass001;
import X.AnonymousClass003;
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
/* loaded from: classes4.dex */
public final class PdpPrice extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String currency;
    public final String value;

    public final class Companion {
        public final C9hr<PdpPrice> serializer() {
            return PdpPrice$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_model_model(PdpPrice pdpPrice, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(pdpPrice.value, c9iZ, 0);
        c9j5.AAV(pdpPrice.currency, c9iZ, 1);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PdpPrice) {
                PdpPrice pdpPrice = (PdpPrice) obj;
                if (!C7384Etj.areEqual(this.value, pdpPrice.value) || !C7384Etj.areEqual(this.currency, pdpPrice.currency)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ PdpPrice copy$default(PdpPrice pdpPrice, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pdpPrice.value;
        }
        if ((i & 2) != 0) {
            str2 = pdpPrice.currency;
        }
        AnonymousClass003.A0u(str, str2);
        return new PdpPrice(str, str2);
    }

    public final String component1() {
        return this.value;
    }

    public final String component2() {
        return this.currency;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.currency, AnonymousClass001.A0G(this.value));
    }

    public PdpPrice(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.value = str;
        this.currency = str2;
    }

    public final PdpPrice copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new PdpPrice(str, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ PdpPrice(int i, String str, String str2, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(PdpPrice$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.value = str;
        this.currency = str2;
    }
}
