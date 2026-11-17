package com.facebook.aura.navigation.key;

import X.AnonymousClass003;
import X.C06G;
import X.C3cG;
import X.C3cJ;
import X.C5hV;
import X.C7384Etj;
import X.C9cd;
import X.C9hr;
import X.C9iK;
import X.C9iZ;
import X.C9j4;
import X.C9j5;
import X.F0C;
import X.Hs1;
import X.InterfaceC07789is;
import X.InterfaceC07829iw;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class ConfidentialVmDataTransferProgressScreenKey$$serializer implements C9cd<ConfidentialVmDataTransferProgressScreenKey> {
    public static final ConfidentialVmDataTransferProgressScreenKey$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final ConfidentialVmDataTransferProgressScreenKey deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = ConfidentialVmDataTransferProgressScreenKey.$childSerializers;
        ConfidentialVmSwitchDirection confidentialVmSwitchDirection = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new ConfidentialVmDataTransferProgressScreenKey(i, confidentialVmSwitchDirection, null);
            }
            if (iA8N != 0) {
                throw C3cG.A17(iA8N);
            }
            confidentialVmSwitchDirection = (ConfidentialVmSwitchDirection) C3cJ.A0F(c9iZ, c9j4A55, f0cArr, 0);
            i = 1;
        }
    }

    static {
        ConfidentialVmDataTransferProgressScreenKey$$serializer confidentialVmDataTransferProgressScreenKey$$serializer = new ConfidentialVmDataTransferProgressScreenKey$$serializer();
        INSTANCE = confidentialVmDataTransferProgressScreenKey$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.navigation.key.ConfidentialVmDataTransferProgressScreenKey", confidentialVmDataTransferProgressScreenKey$$serializer, 1);
        c9iKA1C.A08("direction", false);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        return C3cJ.A1B(ConfidentialVmDataTransferProgressScreenKey.$childSerializers);
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return descriptor;
    }

    @Override // X.C9cd
    public /* bridge */ C9hr<?>[] typeParametersSerializers() {
        return C5hV.A00;
    }

    @Override // X.C9hv
    public final void serialize(InterfaceC07789is interfaceC07789is, ConfidentialVmDataTransferProgressScreenKey confidentialVmDataTransferProgressScreenKey) {
        AnonymousClass003.A0u(interfaceC07789is, confidentialVmDataTransferProgressScreenKey);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        c9j5A56.AAQ(confidentialVmDataTransferProgressScreenKey.direction, C06G.A0e(ConfidentialVmDataTransferProgressScreenKey.$childSerializers, 0), c9iZ, 0);
        c9j5A56.AAd(c9iZ);
    }
}
