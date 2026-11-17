package com.facebook.aura.navigation.key;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.F60;
import com.facebook.aura.navigation.AuraFullScreenNavKey;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class VmRecoveryFlowPreviewScreenKey extends C06G implements AuraFullScreenNavKey {
    public static final Companion Companion = new Companion();
    public final String flowType;

    public final class Companion {
        public final C9hr<VmRecoveryFlowPreviewScreenKey> serializer() {
            return VmRecoveryFlowPreviewScreenKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final VmRecoveryFlowPreviewScreenKey copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new VmRecoveryFlowPreviewScreenKey(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof VmRecoveryFlowPreviewScreenKey) && C7384Etj.areEqual(this.flowType, ((VmRecoveryFlowPreviewScreenKey) obj).flowType));
    }

    public /* synthetic */ VmRecoveryFlowPreviewScreenKey(int i, String str, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(VmRecoveryFlowPreviewScreenKey$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.flowType = str;
    }

    public static /* synthetic */ VmRecoveryFlowPreviewScreenKey copy$default(VmRecoveryFlowPreviewScreenKey vmRecoveryFlowPreviewScreenKey, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = vmRecoveryFlowPreviewScreenKey.flowType;
        }
        C7384Etj.A0Y(str, 0);
        return new VmRecoveryFlowPreviewScreenKey(str);
    }

    public final String component1() {
        return this.flowType;
    }

    public final String getFlowType() {
        return this.flowType;
    }

    public int hashCode() {
        return this.flowType.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public VmRecoveryFlowPreviewScreenKey(String str) {
        C7384Etj.A0Y(str, 0);
        this.flowType = str;
    }
}
