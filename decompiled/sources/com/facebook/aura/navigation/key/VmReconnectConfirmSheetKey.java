package com.facebook.aura.navigation.key;

import X.AnonymousClass001;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import com.facebook.aura.navigation.AuraBottomSheetNavKey;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class VmReconnectConfirmSheetKey extends C06G implements AuraBottomSheetNavKey {
    public static final Companion Companion = new Companion();
    public final String flowType;
    public final boolean preview;

    public final class Companion {
        public final C9hr<VmReconnectConfirmSheetKey> serializer() {
            return VmReconnectConfirmSheetKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public VmReconnectConfirmSheetKey(String str, boolean z) {
        C7384Etj.A0Y(str, 0);
        this.flowType = str;
        this.preview = z;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_navigation_key_key(VmReconnectConfirmSheetKey vmReconnectConfirmSheetKey, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(vmReconnectConfirmSheetKey.flowType, c9iZ, 0);
        c9j5.AA7(c9iZ, 1, vmReconnectConfirmSheetKey.preview);
    }

    public final VmReconnectConfirmSheetKey copy(String str, boolean z) {
        C7384Etj.A0Y(str, 0);
        return new VmReconnectConfirmSheetKey(str, z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VmReconnectConfirmSheetKey) {
                VmReconnectConfirmSheetKey vmReconnectConfirmSheetKey = (VmReconnectConfirmSheetKey) obj;
                if (!C7384Etj.areEqual(this.flowType, vmReconnectConfirmSheetKey.flowType) || this.preview != vmReconnectConfirmSheetKey.preview) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ VmReconnectConfirmSheetKey copy$default(VmReconnectConfirmSheetKey vmReconnectConfirmSheetKey, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = vmReconnectConfirmSheetKey.flowType;
        }
        if ((i & 2) != 0) {
            z = vmReconnectConfirmSheetKey.preview;
        }
        C7384Etj.A0Y(str, 0);
        return new VmReconnectConfirmSheetKey(str, z);
    }

    public final String component1() {
        return this.flowType;
    }

    public final boolean component2() {
        return this.preview;
    }

    public final String getFlowType() {
        return this.flowType;
    }

    public final boolean getPreview() {
        return this.preview;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass001.A0G(this.flowType), this.preview);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ VmReconnectConfirmSheetKey(int i, String str, boolean z, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(VmReconnectConfirmSheetKey$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.flowType = str;
        this.preview = z;
    }
}
