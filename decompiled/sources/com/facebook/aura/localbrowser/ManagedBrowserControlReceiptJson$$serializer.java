package com.facebook.aura.localbrowser;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
import X.C07839ix;
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
/* loaded from: classes3.dex */
public final /* synthetic */ class ManagedBrowserControlReceiptJson$$serializer implements C9cd<ManagedBrowserControlReceiptJson> {
    public static final int $stable = 0;
    public static final ManagedBrowserControlReceiptJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final ManagedBrowserControlReceiptJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA8f = null;
        String strA0w = null;
        String strA8f2 = null;
        long jA8X = 0;
        boolean zA8G = false;
        boolean zA8G2 = false;
        boolean zA8G3 = false;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new ManagedBrowserControlReceiptJson(i, strA8f2, jA8X, strA8f, strA0w, zA8G3, zA8G2, zA8G, (C2hx) null);
                case 0:
                    strA8f2 = c9j4A55.A8f(c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    jA8X = c9j4A55.A8X(c9iZ, 1);
                    i |= 2;
                    break;
                case 2:
                    strA8f = c9j4A55.A8f(c9iZ, 2);
                    i |= 4;
                    break;
                case 3:
                    strA0w = C3cI.A0w(c9iZ, c9j4A55, 3);
                    i |= 8;
                    break;
                case 4:
                    zA8G3 = c9j4A55.A8G(c9iZ, 4);
                    i |= 16;
                    break;
                case 5:
                    zA8G2 = c9j4A55.A8G(c9iZ, 5);
                    i |= 32;
                    break;
                case 6:
                    zA8G = c9j4A55.A8G(c9iZ, 6);
                    i |= 64;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        ManagedBrowserControlReceiptJson$$serializer managedBrowserControlReceiptJson$$serializer = new ManagedBrowserControlReceiptJson$$serializer();
        INSTANCE = managedBrowserControlReceiptJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.localbrowser.ManagedBrowserControlReceiptJson", managedBrowserControlReceiptJson$$serializer, 7);
        c9iKA1C.A08(LocalBrowserNodeHandler.CONTROL, false);
        c9iKA1C.A08("state_revision", false);
        c9iKA1C.A08("input_owner", false);
        c9iKA1C.A08("target_id", true);
        c9iKA1C.A08("presented", false);
        c9iKA1C.A08("target_alive", false);
        c9iKA1C.A08("binding_alive", false);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        C9j1 c9j1 = C9j1.A00;
        C9hr c9hrA00 = AbstractC07749im.A00(c07779iq);
        C07839ix c07839ix = C07839ix.A00;
        return new C9hr[]{c07779iq, c9j1, c07779iq, c9hrA00, c07839ix, c07839ix, c07839ix};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, ManagedBrowserControlReceiptJson managedBrowserControlReceiptJson) {
        AnonymousClass003.A0u(interfaceC07789is, managedBrowserControlReceiptJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        ManagedBrowserControlReceiptJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_localbrowser_localbrowser(managedBrowserControlReceiptJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
