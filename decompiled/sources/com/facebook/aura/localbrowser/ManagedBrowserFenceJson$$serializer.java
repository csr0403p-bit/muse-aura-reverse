package com.facebook.aura.localbrowser;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07729ii;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
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
public final /* synthetic */ class ManagedBrowserFenceJson$$serializer implements C9cd<ManagedBrowserFenceJson> {
    public static final int $stable = 0;
    public static final ManagedBrowserFenceJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final ManagedBrowserFenceJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        ManagedBrowserBindingJson managedBrowserBindingJson = null;
        long jA8X = 0;
        ManagedBrowserDocumentJson managedBrowserDocumentJson = null;
        String strA8f = null;
        long jA8X2 = 0;
        int iA8U = 0;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new ManagedBrowserFenceJson(i, managedBrowserBindingJson, managedBrowserDocumentJson, strA8f, jA8X2, jA8X, iA8U, (C2hx) null);
                case 0:
                    managedBrowserBindingJson = (ManagedBrowserBindingJson) c9j4A55.A8a(ManagedBrowserBindingJson$$serializer.INSTANCE, c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    managedBrowserDocumentJson = (ManagedBrowserDocumentJson) c9j4A55.A8Z(ManagedBrowserDocumentJson$$serializer.INSTANCE, c9iZ, 1);
                    i |= 2;
                    break;
                case 2:
                    strA8f = c9j4A55.A8f(c9iZ, 2);
                    i |= 4;
                    break;
                case 3:
                    jA8X2 = c9j4A55.A8X(c9iZ, 3);
                    i |= 8;
                    break;
                case 4:
                    jA8X = c9j4A55.A8X(c9iZ, 4);
                    i |= 16;
                    break;
                case 5:
                    iA8U = c9j4A55.A8U(c9iZ, 5);
                    i |= 32;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        ManagedBrowserFenceJson$$serializer managedBrowserFenceJson$$serializer = new ManagedBrowserFenceJson$$serializer();
        INSTANCE = managedBrowserFenceJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.localbrowser.ManagedBrowserFenceJson", managedBrowserFenceJson$$serializer, 6);
        c9iKA1C.A08("binding", false);
        c9iKA1C.A08("document", true);
        c9iKA1C.A08("operation_id", false);
        c9iKA1C.A08("state_revision", false);
        c9iKA1C.A08("deadline_at_ms", false);
        c9iKA1C.A08("capability_version", false);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        ManagedBrowserBindingJson$$serializer managedBrowserBindingJson$$serializer = ManagedBrowserBindingJson$$serializer.INSTANCE;
        C9hr c9hrA00 = AbstractC07749im.A00(ManagedBrowserDocumentJson$$serializer.INSTANCE);
        C07779iq c07779iq = C07779iq.A01;
        C9j1 c9j1 = C9j1.A00;
        return new C9hr[]{managedBrowserBindingJson$$serializer, c9hrA00, c07779iq, c9j1, c9j1, C07729ii.A00};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, ManagedBrowserFenceJson managedBrowserFenceJson) {
        AnonymousClass003.A0u(interfaceC07789is, managedBrowserFenceJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        ManagedBrowserFenceJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_localbrowser_localbrowser(managedBrowserFenceJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
