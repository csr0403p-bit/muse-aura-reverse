package com.facebook.aura.localbrowser;

import X.AnonymousClass003;
import X.C07779iq;
import X.C07839ix;
import X.C3cG;
import X.C3cH;
import X.C5hV;
import X.C7384Etj;
import X.C9cd;
import X.C9hr;
import X.C9iK;
import X.C9iZ;
import X.C9j4;
import X.C9j5;
import X.Hs1;
import X.InterfaceC07789is;
import X.InterfaceC07829iw;
import kotlin.Deprecated;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes4.dex */
public final /* synthetic */ class ManagedBrowserObservationJson$$serializer implements C9cd<ManagedBrowserObservationJson> {
    public static final int $stable = 0;
    public static final ManagedBrowserObservationJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final ManagedBrowserObservationJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        int i = 0;
        JsonElement jsonElement = null;
        ManagedBrowserViewportJson managedBrowserViewportJson = null;
        ManagedBrowserDocumentJson managedBrowserDocumentJson = null;
        String strA0h = null;
        String strA0i = null;
        String strA8f = null;
        boolean zA8G = false;
        boolean zA8G2 = false;
        boolean zA8G3 = false;
        boolean zA8G4 = false;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new ManagedBrowserObservationJson(i, managedBrowserDocumentJson, strA0h, strA0i, managedBrowserViewportJson, strA8f, jsonElement, zA8G3, zA8G2, zA8G4, zA8G, null);
                case 0:
                    managedBrowserDocumentJson = (ManagedBrowserDocumentJson) c9j4A55.A8a(ManagedBrowserDocumentJson$$serializer.INSTANCE, c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    strA0h = C3cH.A0h(c9iZ, c9j4A55);
                    i |= 2;
                    break;
                case 2:
                    strA0i = C3cH.A0i(c9iZ, c9j4A55);
                    i |= 4;
                    break;
                case 3:
                    managedBrowserViewportJson = (ManagedBrowserViewportJson) c9j4A55.A8a(ManagedBrowserViewportJson$$serializer.INSTANCE, c9iZ, 3);
                    i |= 8;
                    break;
                case 4:
                    strA8f = c9j4A55.A8f(c9iZ, 4);
                    i |= 16;
                    break;
                case 5:
                    jsonElement = (JsonElement) c9j4A55.A8a(JsonElementSerializer.A00, c9iZ, 5);
                    i |= 32;
                    break;
                case 6:
                    zA8G3 = c9j4A55.A8G(c9iZ, 6);
                    i |= 64;
                    break;
                case 7:
                    zA8G2 = c9j4A55.A8G(c9iZ, 7);
                    i |= 128;
                    break;
                case 8:
                    zA8G4 = c9j4A55.A8G(c9iZ, 8);
                    i |= 256;
                    break;
                case 9:
                    zA8G = c9j4A55.A8G(c9iZ, 9);
                    i |= 512;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        ManagedBrowserObservationJson$$serializer managedBrowserObservationJson$$serializer = new ManagedBrowserObservationJson$$serializer();
        INSTANCE = managedBrowserObservationJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.localbrowser.ManagedBrowserObservationJson", managedBrowserObservationJson$$serializer, 10);
        c9iKA1C.A08("document", false);
        C3cH.A1G("url", c9iKA1C, false);
        c9iKA1C.A08("viewport", false);
        c9iKA1C.A08("readiness", false);
        c9iKA1C.A08("snapshot", false);
        c9iKA1C.A08("frame_coverage_complete", false);
        c9iKA1C.A08("shadow_coverage_complete", false);
        c9iKA1C.A08("checkout_signal", false);
        c9iKA1C.A08("sensitive_output_suppressed", false);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        ManagedBrowserDocumentJson$$serializer managedBrowserDocumentJson$$serializer = ManagedBrowserDocumentJson$$serializer.INSTANCE;
        C07779iq c07779iq = C07779iq.A01;
        ManagedBrowserViewportJson$$serializer managedBrowserViewportJson$$serializer = ManagedBrowserViewportJson$$serializer.INSTANCE;
        JsonElementSerializer jsonElementSerializer = JsonElementSerializer.A00;
        C07839ix c07839ix = C07839ix.A00;
        return new C9hr[]{managedBrowserDocumentJson$$serializer, c07779iq, c07779iq, managedBrowserViewportJson$$serializer, c07779iq, jsonElementSerializer, c07839ix, c07839ix, c07839ix, c07839ix};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, ManagedBrowserObservationJson managedBrowserObservationJson) {
        AnonymousClass003.A0u(interfaceC07789is, managedBrowserObservationJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        ManagedBrowserObservationJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_localbrowser_localbrowser(managedBrowserObservationJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
