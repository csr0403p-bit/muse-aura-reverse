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
public final class ConfidentialVmRegisterPinScreenKey extends C06G implements AuraFullScreenNavKey {
    public final RegisterPinEntryPoint entryPoint;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C06G.A0x(C79.A01, ConfidentialVmRegisterPinScreenKey$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<ConfidentialVmRegisterPinScreenKey> serializer() {
            return ConfidentialVmRegisterPinScreenKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final ConfidentialVmRegisterPinScreenKey copy(RegisterPinEntryPoint registerPinEntryPoint) {
        C7384Etj.A0Y(registerPinEntryPoint, 0);
        return new ConfidentialVmRegisterPinScreenKey(registerPinEntryPoint);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ConfidentialVmRegisterPinScreenKey) && this.entryPoint == ((ConfidentialVmRegisterPinScreenKey) obj).entryPoint);
    }

    public /* synthetic */ ConfidentialVmRegisterPinScreenKey(int i, RegisterPinEntryPoint registerPinEntryPoint, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(ConfidentialVmRegisterPinScreenKey$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.entryPoint = registerPinEntryPoint;
    }

    public static /* synthetic */ ConfidentialVmRegisterPinScreenKey copy$default(ConfidentialVmRegisterPinScreenKey confidentialVmRegisterPinScreenKey, RegisterPinEntryPoint registerPinEntryPoint, int i, Object obj) {
        if ((i & 1) != 0) {
            registerPinEntryPoint = confidentialVmRegisterPinScreenKey.entryPoint;
        }
        C7384Etj.A0Y(registerPinEntryPoint, 0);
        return new ConfidentialVmRegisterPinScreenKey(registerPinEntryPoint);
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

    public ConfidentialVmRegisterPinScreenKey(RegisterPinEntryPoint registerPinEntryPoint) {
        C7384Etj.A0Y(registerPinEntryPoint, 0);
        this.entryPoint = registerPinEntryPoint;
    }
}
