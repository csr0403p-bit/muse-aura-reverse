package com.facebook.aura.localbrowser;

import X.AbstractC07749im;
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
public final /* synthetic */ class ManagedBrowserOperationJson$$serializer implements C9cd<ManagedBrowserOperationJson> {
    public static final int $stable = 0;
    public static final ManagedBrowserOperationJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final ManagedBrowserOperationJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA8f = null;
        ManagedBrowserActionJson managedBrowserActionJson = null;
        String strA0w = null;
        Long lA0Q = null;
        String strA0m = null;
        String strA0l = null;
        ManagedBrowserCapabilitiesJson managedBrowserCapabilitiesJson = null;
        ManagedBrowserSensitiveSitePolicyJson managedBrowserSensitiveSitePolicyJson = null;
        ManagedBrowserBindingJson managedBrowserBindingJson = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new ManagedBrowserOperationJson(i, strA8f, managedBrowserCapabilitiesJson, managedBrowserSensitiveSitePolicyJson, managedBrowserBindingJson, strA0l, strA0m, lA0Q, managedBrowserActionJson, strA0w, (C2hx) null);
                case 0:
                    strA8f = c9j4A55.A8f(c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    managedBrowserCapabilitiesJson = (ManagedBrowserCapabilitiesJson) c9j4A55.A8Z(ManagedBrowserCapabilitiesJson$$serializer.INSTANCE, c9iZ, 1);
                    i |= 2;
                    break;
                case 2:
                    managedBrowserSensitiveSitePolicyJson = (ManagedBrowserSensitiveSitePolicyJson) c9j4A55.A8Z(ManagedBrowserSensitiveSitePolicyJson$$serializer.INSTANCE, c9iZ, 2);
                    i |= 4;
                    break;
                case 3:
                    managedBrowserBindingJson = (ManagedBrowserBindingJson) c9j4A55.A8Z(ManagedBrowserBindingJson$$serializer.INSTANCE, c9iZ, 3);
                    i |= 8;
                    break;
                case 4:
                    strA0l = C3cI.A0l(c9iZ, c9j4A55);
                    i |= 16;
                    break;
                case 5:
                    strA0m = C3cI.A0m(c9iZ, c9j4A55);
                    i |= 32;
                    break;
                case 6:
                    lA0Q = C3cI.A0Q(c9iZ, c9j4A55, 6);
                    i |= 64;
                    break;
                case 7:
                    managedBrowserActionJson = (ManagedBrowserActionJson) c9j4A55.A8Z(ManagedBrowserActionJson$$serializer.INSTANCE, c9iZ, 7);
                    i |= 128;
                    break;
                case 8:
                    strA0w = C3cI.A0w(c9iZ, c9j4A55, 8);
                    i |= 256;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        ManagedBrowserOperationJson$$serializer managedBrowserOperationJson$$serializer = new ManagedBrowserOperationJson$$serializer();
        INSTANCE = managedBrowserOperationJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.localbrowser.ManagedBrowserOperationJson", managedBrowserOperationJson$$serializer, 9);
        c9iKA1C.A08("kind", false);
        c9iKA1C.A08("capabilities", true);
        c9iKA1C.A08("sensitive_site_policy", true);
        c9iKA1C.A08("previous_binding", true);
        c9iKA1C.A08("unresolved_operation", true);
        c9iKA1C.A08(LocalBrowserNodeHandler.CONTROL, true);
        c9iKA1C.A08("next_state_revision", true);
        c9iKA1C.A08("action", true);
        c9iKA1C.A08("operation_id", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c07779iq, AbstractC07749im.A00(ManagedBrowserCapabilitiesJson$$serializer.INSTANCE), AbstractC07749im.A00(ManagedBrowserSensitiveSitePolicyJson$$serializer.INSTANCE), AbstractC07749im.A00(ManagedBrowserBindingJson$$serializer.INSTANCE), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(C9j1.A00), AbstractC07749im.A00(ManagedBrowserActionJson$$serializer.INSTANCE), AbstractC07749im.A00(c07779iq)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, ManagedBrowserOperationJson managedBrowserOperationJson) {
        AnonymousClass003.A0u(interfaceC07789is, managedBrowserOperationJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        ManagedBrowserOperationJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_localbrowser_localbrowser(managedBrowserOperationJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
