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
/* loaded from: classes.dex */
public final class PdpAttribute extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String label;
    public final String value;

    public final class Companion {
        public final C9hr<PdpAttribute> serializer() {
            return PdpAttribute$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_model_model(PdpAttribute pdpAttribute, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(pdpAttribute.label, c9iZ, 0);
        c9j5.AAV(pdpAttribute.value, c9iZ, 1);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PdpAttribute) {
                PdpAttribute pdpAttribute = (PdpAttribute) obj;
                if (!C7384Etj.areEqual(this.label, pdpAttribute.label) || !C7384Etj.areEqual(this.value, pdpAttribute.value)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ PdpAttribute copy$default(PdpAttribute pdpAttribute, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pdpAttribute.label;
        }
        if ((i & 2) != 0) {
            str2 = pdpAttribute.value;
        }
        AnonymousClass003.A0u(str, str2);
        return new PdpAttribute(str, str2);
    }

    public final String component1() {
        return this.label;
    }

    public final String component2() {
        return this.value;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.value, AnonymousClass001.A0G(this.label));
    }

    public PdpAttribute(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.label = str;
        this.value = str2;
    }

    public final PdpAttribute copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new PdpAttribute(str, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ PdpAttribute(int i, String str, String str2, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(PdpAttribute$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.label = str;
        this.value = str2;
    }
}
