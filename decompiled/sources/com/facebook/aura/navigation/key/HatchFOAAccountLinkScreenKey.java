package com.facebook.aura.navigation.key;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.F60;
import com.facebook.aura.navigation.AuraContentAreaNavKey;
import com.facebook.aura.navigation.AuraOverlayNavKey;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class HatchFOAAccountLinkScreenKey extends C06G implements AuraContentAreaNavKey, AuraOverlayNavKey {
    public static final Companion Companion = new Companion();
    public final String accountTypeWire;

    public final class Companion {
        public final C9hr<HatchFOAAccountLinkScreenKey> serializer() {
            return HatchFOAAccountLinkScreenKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final HatchFOAAccountLinkScreenKey copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new HatchFOAAccountLinkScreenKey(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof HatchFOAAccountLinkScreenKey) && C7384Etj.areEqual(this.accountTypeWire, ((HatchFOAAccountLinkScreenKey) obj).accountTypeWire));
    }

    public /* synthetic */ HatchFOAAccountLinkScreenKey(int i, String str, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(HatchFOAAccountLinkScreenKey$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.accountTypeWire = str;
    }

    public static /* synthetic */ HatchFOAAccountLinkScreenKey copy$default(HatchFOAAccountLinkScreenKey hatchFOAAccountLinkScreenKey, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchFOAAccountLinkScreenKey.accountTypeWire;
        }
        C7384Etj.A0Y(str, 0);
        return new HatchFOAAccountLinkScreenKey(str);
    }

    public final String component1() {
        return this.accountTypeWire;
    }

    public final String getAccountTypeWire() {
        return this.accountTypeWire;
    }

    public int hashCode() {
        return this.accountTypeWire.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public HatchFOAAccountLinkScreenKey(String str) {
        C7384Etj.A0Y(str, 0);
        this.accountTypeWire = str;
    }
}
