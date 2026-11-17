package com.facebook.aura.localbrowser;

import X.AnonymousClass003;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C3cI;
import X.C5hV;
import X.C7384Etj;
import X.C9cd;
import X.C9hr;
import X.C9iK;
import X.C9iZ;
import X.C9j1;
import X.C9j4;
import X.C9j5;
import X.Hs1;
import X.InterfaceC07789is;
import X.InterfaceC07829iw;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes4.dex */
public final /* synthetic */ class ManagedBrowserRecoveryJson$$serializer implements C9cd<ManagedBrowserRecoveryJson> {
    public static final int $stable = 0;
    public static final ManagedBrowserRecoveryJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final ManagedBrowserRecoveryJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        ManagedBrowserBindingJson managedBrowserBindingJson = null;
        String strA0w = null;
        long jA8X = 0;
        int i = 0;
        ManagedBrowserCapabilitiesJson managedBrowserCapabilitiesJson = null;
        ManagedBrowserSensitiveSitePolicyJson managedBrowserSensitiveSitePolicyJson = null;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new ManagedBrowserRecoveryJson(i, managedBrowserBindingJson, managedBrowserCapabilitiesJson, jA8X, managedBrowserSensitiveSitePolicyJson, strA0w, (C2hx) null);
            }
            if (iA8N == 0) {
                managedBrowserBindingJson = (ManagedBrowserBindingJson) c9j4A55.A8a(ManagedBrowserBindingJson$$serializer.INSTANCE, c9iZ, 0);
                i |= 1;
            } else if (iA8N == 1) {
                managedBrowserCapabilitiesJson = (ManagedBrowserCapabilitiesJson) c9j4A55.A8a(ManagedBrowserCapabilitiesJson$$serializer.INSTANCE, c9iZ, 1);
                i |= 2;
            } else if (iA8N == 2) {
                jA8X = c9j4A55.A8X(c9iZ, 2);
                i |= 4;
            } else if (iA8N == 3) {
                managedBrowserSensitiveSitePolicyJson = (ManagedBrowserSensitiveSitePolicyJson) c9j4A55.A8a(ManagedBrowserSensitiveSitePolicyJson$$serializer.INSTANCE, c9iZ, 3);
                i |= 8;
            } else {
                if (iA8N != 4) {
                    throw C3cG.A17(iA8N);
                }
                strA0w = C3cI.A0w(c9iZ, c9j4A55, 4);
                i |= 16;
            }
        }
    }

    static {
        ManagedBrowserRecoveryJson$$serializer managedBrowserRecoveryJson$$serializer = new ManagedBrowserRecoveryJson$$serializer();
        INSTANCE = managedBrowserRecoveryJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.localbrowser.ManagedBrowserRecoveryJson", managedBrowserRecoveryJson$$serializer, 5);
        c9iKA1C.A08("binding", false);
        c9iKA1C.A08("admitted_capabilities", false);
        c9iKA1C.A08("state_revision", false);
        c9iKA1C.A08("sensitive_site_policy", false);
        c9iKA1C.A08("unresolved_operation", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        return C3cI.A1b(C07779iq.A01, ManagedBrowserBindingJson$$serializer.INSTANCE, ManagedBrowserCapabilitiesJson$$serializer.INSTANCE, C9j1.A00, ManagedBrowserSensitiveSitePolicyJson$$serializer.INSTANCE);
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
    public final void serialize(InterfaceC07789is interfaceC07789is, ManagedBrowserRecoveryJson managedBrowserRecoveryJson) {
        AnonymousClass003.A0u(interfaceC07789is, managedBrowserRecoveryJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        ManagedBrowserRecoveryJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_localbrowser_localbrowser(managedBrowserRecoveryJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
