package com.facebook.aura.navigation.key;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.F0C;
import X.F60;
import com.facebook.aura.navigation.AuraFullScreenNavKey;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class ConfidentialVmSwitchIntroScreenKey extends C06G implements AuraFullScreenNavKey, ConfidentialVmSwitchFlowKey {
    public final ConfidentialVmSwitchEntryPoint entryPoint;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C06G.A0x(C79.A01, ConfidentialVmSwitchIntroScreenKey$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<ConfidentialVmSwitchIntroScreenKey> serializer() {
            return ConfidentialVmSwitchIntroScreenKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final ConfidentialVmSwitchIntroScreenKey copy(ConfidentialVmSwitchEntryPoint confidentialVmSwitchEntryPoint) {
        C7384Etj.A0Y(confidentialVmSwitchEntryPoint, 0);
        return new ConfidentialVmSwitchIntroScreenKey(confidentialVmSwitchEntryPoint);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ConfidentialVmSwitchIntroScreenKey) && this.entryPoint == ((ConfidentialVmSwitchIntroScreenKey) obj).entryPoint);
    }

    public /* synthetic */ ConfidentialVmSwitchIntroScreenKey(int i, ConfidentialVmSwitchEntryPoint confidentialVmSwitchEntryPoint, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(ConfidentialVmSwitchIntroScreenKey$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.entryPoint = confidentialVmSwitchEntryPoint;
    }

    public static /* synthetic */ ConfidentialVmSwitchIntroScreenKey copy$default(ConfidentialVmSwitchIntroScreenKey confidentialVmSwitchIntroScreenKey, ConfidentialVmSwitchEntryPoint confidentialVmSwitchEntryPoint, int i, Object obj) {
        if ((i & 1) != 0) {
            confidentialVmSwitchEntryPoint = confidentialVmSwitchIntroScreenKey.entryPoint;
        }
        C7384Etj.A0Y(confidentialVmSwitchEntryPoint, 0);
        return new ConfidentialVmSwitchIntroScreenKey(confidentialVmSwitchEntryPoint);
    }

    public final ConfidentialVmSwitchEntryPoint component1() {
        return this.entryPoint;
    }

    public final ConfidentialVmSwitchEntryPoint getEntryPoint() {
        return this.entryPoint;
    }

    public int hashCode() {
        return this.entryPoint.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public ConfidentialVmSwitchIntroScreenKey(ConfidentialVmSwitchEntryPoint confidentialVmSwitchEntryPoint) {
        C7384Etj.A0Y(confidentialVmSwitchEntryPoint, 0);
        this.entryPoint = confidentialVmSwitchEntryPoint;
    }
}
