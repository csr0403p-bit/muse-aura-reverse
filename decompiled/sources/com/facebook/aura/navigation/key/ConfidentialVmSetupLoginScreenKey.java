package com.facebook.aura.navigation.key;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import com.facebook.aura.navigation.AuraFullScreenNavKey;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class ConfidentialVmSetupLoginScreenKey extends C06G implements AuraFullScreenNavKey {
    public final RegisterPinEntryPoint entryPoint;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C06G.A0x(C79.A01, ConfidentialVmSetupLoginScreenKey$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<ConfidentialVmSetupLoginScreenKey> serializer() {
            return ConfidentialVmSetupLoginScreenKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final ConfidentialVmSetupLoginScreenKey copy(RegisterPinEntryPoint registerPinEntryPoint) {
        C7384Etj.A0Y(registerPinEntryPoint, 0);
        return new ConfidentialVmSetupLoginScreenKey(registerPinEntryPoint);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ConfidentialVmSetupLoginScreenKey) && this.entryPoint == ((ConfidentialVmSetupLoginScreenKey) obj).entryPoint);
    }

    public /* synthetic */ ConfidentialVmSetupLoginScreenKey(RegisterPinEntryPoint registerPinEntryPoint, int i, C06H c06h) {
        this((i & 1) != 0 ? RegisterPinEntryPoint.CVM_ENROLLMENT : registerPinEntryPoint);
    }

    public static /* synthetic */ ConfidentialVmSetupLoginScreenKey copy$default(ConfidentialVmSetupLoginScreenKey confidentialVmSetupLoginScreenKey, RegisterPinEntryPoint registerPinEntryPoint, int i, Object obj) {
        if ((i & 1) != 0) {
            registerPinEntryPoint = confidentialVmSetupLoginScreenKey.entryPoint;
        }
        C7384Etj.A0Y(registerPinEntryPoint, 0);
        return new ConfidentialVmSetupLoginScreenKey(registerPinEntryPoint);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_navigation_key_key(ConfidentialVmSetupLoginScreenKey confidentialVmSetupLoginScreenKey, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        if (c9j5.AfR() || confidentialVmSetupLoginScreenKey.entryPoint != RegisterPinEntryPoint.CVM_ENROLLMENT) {
            c9j5.AAQ(confidentialVmSetupLoginScreenKey.entryPoint, C06G.A0e(f0cArr, 0), c9iZ, 0);
        }
    }

    public final RegisterPinEntryPoint component1() {
        return this.entryPoint;
    }

    public final RegisterPinEntryPoint getEntryPoint() {
        return this.entryPoint;
    }

    public int hashCode() {
        return this.entryPoint.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public ConfidentialVmSetupLoginScreenKey(RegisterPinEntryPoint registerPinEntryPoint) {
        C7384Etj.A0Y(registerPinEntryPoint, 0);
        this.entryPoint = registerPinEntryPoint;
    }

    public /* synthetic */ ConfidentialVmSetupLoginScreenKey(int i, RegisterPinEntryPoint registerPinEntryPoint, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.entryPoint = RegisterPinEntryPoint.CVM_ENROLLMENT;
        } else {
            this.entryPoint = registerPinEntryPoint;
        }
    }

    public ConfidentialVmSetupLoginScreenKey() {
        this(RegisterPinEntryPoint.CVM_ENROLLMENT);
    }
}
