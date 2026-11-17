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
import com.facebook.aura.navigation.AuraOverlayNavKey;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class ConfidentialVmDataTransferResumeOverlayScreenKey extends C06G implements AuraFullScreenNavKey, AuraOverlayNavKey {
    public final ConfidentialVmSwitchDirection direction;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C06G.A0x(C79.A01, ConfidentialVmDataTransferResumeOverlayScreenKey$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<ConfidentialVmDataTransferResumeOverlayScreenKey> serializer() {
            return ConfidentialVmDataTransferResumeOverlayScreenKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final ConfidentialVmDataTransferResumeOverlayScreenKey copy(ConfidentialVmSwitchDirection confidentialVmSwitchDirection) {
        C7384Etj.A0Y(confidentialVmSwitchDirection, 0);
        return new ConfidentialVmDataTransferResumeOverlayScreenKey(confidentialVmSwitchDirection);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ConfidentialVmDataTransferResumeOverlayScreenKey) && this.direction == ((ConfidentialVmDataTransferResumeOverlayScreenKey) obj).direction);
    }

    public /* synthetic */ ConfidentialVmDataTransferResumeOverlayScreenKey(int i, ConfidentialVmSwitchDirection confidentialVmSwitchDirection, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(ConfidentialVmDataTransferResumeOverlayScreenKey$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.direction = confidentialVmSwitchDirection;
    }

    public static /* synthetic */ ConfidentialVmDataTransferResumeOverlayScreenKey copy$default(ConfidentialVmDataTransferResumeOverlayScreenKey confidentialVmDataTransferResumeOverlayScreenKey, ConfidentialVmSwitchDirection confidentialVmSwitchDirection, int i, Object obj) {
        if ((i & 1) != 0) {
            confidentialVmSwitchDirection = confidentialVmDataTransferResumeOverlayScreenKey.direction;
        }
        C7384Etj.A0Y(confidentialVmSwitchDirection, 0);
        return new ConfidentialVmDataTransferResumeOverlayScreenKey(confidentialVmSwitchDirection);
    }

    public final ConfidentialVmSwitchDirection component1() {
        return this.direction;
    }

    public final ConfidentialVmSwitchDirection getDirection() {
        return this.direction;
    }

    public int hashCode() {
        return this.direction.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public ConfidentialVmDataTransferResumeOverlayScreenKey(ConfidentialVmSwitchDirection confidentialVmSwitchDirection) {
        C7384Etj.A0Y(confidentialVmSwitchDirection, 0);
        this.direction = confidentialVmSwitchDirection;
    }
}
