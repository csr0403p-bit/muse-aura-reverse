package com.facebook.aura.localbrowser;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
import X.C07839ix;
import X.C2hx;
import X.C3cG;
import X.C3cH;
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
import com.facebook.aura.localbrowser.core.BrowserOperationCatalogKt;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes4.dex */
public final /* synthetic */ class ManagedBrowserActionJson$$serializer implements C9cd<ManagedBrowserActionJson> {
    public static final int $stable = 0;
    public static final ManagedBrowserActionJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final ManagedBrowserActionJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        C2hx c2hx = null;
        String strA0f = null;
        String strA0g = null;
        String strA0g2 = null;
        Long l = null;
        Long l2 = null;
        Long l3 = null;
        String str = null;
        String strA0o = null;
        String strA0n = null;
        String strA0l = null;
        String strA0m = null;
        String strA0p = null;
        String strA8f = null;
        Long l4 = null;
        boolean zA8G = false;
        boolean zA8G2 = false;
        boolean zA8G3 = false;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new ManagedBrowserActionJson(i, strA8f, strA0f, strA0g2, strA0g, strA0l, strA0m, strA0n, strA0o, str, strA0p, l3, l2, l, l4, zA8G2, zA8G3, zA8G, c2hx);
                case 0:
                    strA8f = c9j4A55.A8f(c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    strA0f = C3cI.A0f(c9iZ, c9j4A55);
                    i |= 2;
                    break;
                case 2:
                    strA0g2 = C3cI.A0g(c9iZ, c9j4A55);
                    i |= 4;
                    break;
                case 3:
                    strA0g = C3cH.A0g(C07779iq.A01, c9iZ, c9j4A55, 3);
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
                    strA0n = C3cI.A0n(c9iZ, c9j4A55);
                    i |= 64;
                    break;
                case 7:
                    strA0o = C3cI.A0o(c9iZ, c9j4A55);
                    i |= 128;
                    break;
                case 8:
                    str = (String) C3cI.A0U(c9iZ, c9j4A55);
                    i |= 256;
                    break;
                case 9:
                    strA0p = C3cI.A0p(c9iZ, c9j4A55);
                    i |= 512;
                    break;
                case 10:
                    l3 = (Long) c9j4A55.A8Z(C9j1.A00, c9iZ, 10);
                    i |= 1024;
                    break;
                case 11:
                    l2 = (Long) c9j4A55.A8Z(C9j1.A00, c9iZ, 11);
                    i |= 2048;
                    break;
                case 12:
                    l = (Long) c9j4A55.A8Z(C9j1.A00, c9iZ, 12);
                    i |= 4096;
                    break;
                case 13:
                    l4 = (Long) c9j4A55.A8Z(C9j1.A00, c9iZ, 13);
                    i |= 8192;
                    break;
                case 14:
                    zA8G2 = c9j4A55.A8G(c9iZ, 14);
                    i |= 16384;
                    break;
                case 15:
                    zA8G3 = c9j4A55.A8G(c9iZ, 15);
                    i |= 32768;
                    break;
                case 16:
                    zA8G = c9j4A55.A8G(c9iZ, 16);
                    i |= 65536;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        ManagedBrowserActionJson$$serializer managedBrowserActionJson$$serializer = new ManagedBrowserActionJson$$serializer();
        INSTANCE = managedBrowserActionJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.localbrowser.ManagedBrowserActionJson", managedBrowserActionJson$$serializer, 17);
        c9iKA1C.A08("action", false);
        C3cI.A1N("locator", c9iKA1C, true);
        c9iKA1C.A08("text", true);
        c9iKA1C.A08("text_gone", true);
        c9iKA1C.A08(BrowserOperationCatalogKt.VALUE, true);
        c9iKA1C.A08("key", true);
        c9iKA1C.A08(BrowserOperationCatalogKt.ATTRIBUTE, true);
        c9iKA1C.A08("target", true);
        c9iKA1C.A08("direction", true);
        c9iKA1C.A08(BrowserOperationCatalogKt.PIXELS, true);
        c9iKA1C.A08("time_ms", true);
        c9iKA1C.A08("timeout_ms", true);
        c9iKA1C.A08("poll_ms", true);
        c9iKA1C.A08("right", true);
        c9iKA1C.A08(BrowserOperationCatalogKt.DOUBLE, true);
        c9iKA1C.A08(BrowserOperationCatalogKt.SUBMIT, true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        C9hr c9hrA00 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA002 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA003 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA004 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA005 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA006 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA007 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA008 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA009 = AbstractC07749im.A00(c07779iq);
        C9j1 c9j1 = C9j1.A00;
        C9hr c9hrA0010 = AbstractC07749im.A00(c9j1);
        C9hr c9hrA0011 = AbstractC07749im.A00(c9j1);
        C9hr c9hrA0012 = AbstractC07749im.A00(c9j1);
        C9hr c9hrA0013 = AbstractC07749im.A00(c9j1);
        C07839ix c07839ix = C07839ix.A00;
        return new C9hr[]{c07779iq, c9hrA00, c9hrA002, c9hrA003, c9hrA004, c9hrA005, c9hrA006, c9hrA007, c9hrA008, c9hrA009, c9hrA0010, c9hrA0011, c9hrA0012, c9hrA0013, c07839ix, c07839ix, c07839ix};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, ManagedBrowserActionJson managedBrowserActionJson) {
        AnonymousClass003.A0u(interfaceC07789is, managedBrowserActionJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        ManagedBrowserActionJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_localbrowser_localbrowser(managedBrowserActionJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
