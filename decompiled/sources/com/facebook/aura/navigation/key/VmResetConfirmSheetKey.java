package com.facebook.aura.navigation.key;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C9hr;
import X.C9iI;
import X.F60;
import com.facebook.aura.navigation.AuraBottomSheetNavKey;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class VmResetConfirmSheetKey extends C06G implements AuraBottomSheetNavKey {
    public static final Companion Companion = new Companion();
    public final boolean preview;

    public final class Companion {
        public final C9hr<VmResetConfirmSheetKey> serializer() {
            return VmResetConfirmSheetKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof VmResetConfirmSheetKey) && this.preview == ((VmResetConfirmSheetKey) obj).preview);
    }

    public /* synthetic */ VmResetConfirmSheetKey(int i, boolean z, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(VmResetConfirmSheetKey$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.preview = z;
    }

    public static /* synthetic */ VmResetConfirmSheetKey copy$default(VmResetConfirmSheetKey vmResetConfirmSheetKey, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = vmResetConfirmSheetKey.preview;
        }
        return new VmResetConfirmSheetKey(z);
    }

    public final boolean component1() {
        return this.preview;
    }

    public final VmResetConfirmSheetKey copy(boolean z) {
        return new VmResetConfirmSheetKey(z);
    }

    public final boolean getPreview() {
        return this.preview;
    }

    public int hashCode() {
        return this.preview ? 1231 : 1237;
    }

    public String toString() {
        return super.toString();
    }

    public VmResetConfirmSheetKey(boolean z) {
        this.preview = z;
    }
}
