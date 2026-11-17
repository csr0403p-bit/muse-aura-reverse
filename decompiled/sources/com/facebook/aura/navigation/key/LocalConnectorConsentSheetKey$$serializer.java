package com.facebook.aura.navigation.key;

import X.AnonymousClass003;
import X.C3cG;
import X.C3cH;
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
/* loaded from: classes3.dex */
public final /* synthetic */ class LocalConnectorConsentSheetKey$$serializer implements C9cd<LocalConnectorConsentSheetKey> {
    public static final LocalConnectorConsentSheetKey$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final LocalConnectorConsentSheetKey deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = LocalConnectorConsentSheetKey.$childSerializers;
        PermissionDestination permissionDestination = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new LocalConnectorConsentSheetKey(i, permissionDestination, null);
            }
            if (iA8N != 0) {
                throw C3cG.A17(iA8N);
            }
            permissionDestination = (PermissionDestination) C3cJ.A0F(c9iZ, c9j4A55, f0cArr, 0);
            i = 1;
        }
    }

    static {
        LocalConnectorConsentSheetKey$$serializer localConnectorConsentSheetKey$$serializer = new LocalConnectorConsentSheetKey$$serializer();
        INSTANCE = localConnectorConsentSheetKey$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.navigation.key.LocalConnectorConsentSheetKey", localConnectorConsentSheetKey$$serializer, 1);
        c9iKA1C.A08("destination", false);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        return C3cJ.A1B(LocalConnectorConsentSheetKey.$childSerializers);
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
    public final void serialize(InterfaceC07789is interfaceC07789is, LocalConnectorConsentSheetKey localConnectorConsentSheetKey) {
        AnonymousClass003.A0u(interfaceC07789is, localConnectorConsentSheetKey);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        c9j5A56.AAQ(localConnectorConsentSheetKey.destination, C3cH.A15(LocalConnectorConsentSheetKey.$childSerializers, 0), c9iZ, 0);
        c9j5A56.AAd(c9iZ);
    }
}
