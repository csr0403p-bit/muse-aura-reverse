package com.facebook.aura.model;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07729ii;
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
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class BrowserTaskPresentation$$serializer implements C9cd<BrowserTaskPresentation> {
    public static final int $stable = 0;
    public static final BrowserTaskPresentation$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final BrowserTaskPresentation deserialize(InterfaceC07829iw interfaceC07829iw) {
        int i;
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        int i2 = 0;
        BrowserTaskExecution browserTaskExecution = null;
        Integer num = null;
        String strA0g = null;
        String strA0u = null;
        String strA0f = null;
        BrowserTaskScreenshot browserTaskScreenshot = null;
        Long l = null;
        Long l2 = null;
        String strA8f = null;
        String strA0f2 = null;
        String strA8f2 = null;
        String strA8f3 = null;
        String strA8f4 = null;
        String strA8f5 = null;
        int iA8U = 0;
        boolean zA8G = false;
        int iA8U2 = 0;
        boolean zA8G2 = false;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new BrowserTaskPresentation(i2, strA8f, strA0f2, strA0g, strA8f2, strA8f3, iA8U2, num, zA8G, iA8U, l, l2, strA8f4, browserTaskScreenshot, zA8G2, strA0f, strA0u, strA8f5, browserTaskExecution, (C2hx) null);
                case 0:
                    strA8f = c9j4A55.A8f(c9iZ, 0);
                    i2 |= 1;
                    continue;
                case 1:
                    strA0f2 = C3cI.A0f(c9iZ, c9j4A55);
                    i2 |= 2;
                    continue;
                case 2:
                    strA0g = C3cI.A0g(c9iZ, c9j4A55);
                    i2 |= 4;
                    continue;
                case 3:
                    strA8f2 = c9j4A55.A8f(c9iZ, 3);
                    i2 |= 8;
                    continue;
                case 4:
                    strA8f3 = c9j4A55.A8f(c9iZ, 4);
                    i2 |= 16;
                    continue;
                case 5:
                    iA8U2 = c9j4A55.A8U(c9iZ, 5);
                    i2 |= 32;
                    continue;
                case 6:
                    num = (Integer) c9j4A55.A8Z(C07729ii.A00, c9iZ, 6);
                    i2 |= 64;
                    continue;
                case 7:
                    zA8G = c9j4A55.A8G(c9iZ, 7);
                    i2 |= 128;
                    continue;
                case 8:
                    iA8U = c9j4A55.A8U(c9iZ, 8);
                    i2 |= 256;
                    continue;
                case 9:
                    l = (Long) c9j4A55.A8Z(C9j1.A00, c9iZ, 9);
                    i2 |= 512;
                    continue;
                case 10:
                    l2 = (Long) c9j4A55.A8Z(C9j1.A00, c9iZ, 10);
                    i2 |= 1024;
                    continue;
                case 11:
                    strA8f4 = c9j4A55.A8f(c9iZ, 11);
                    i2 |= 2048;
                    continue;
                case 12:
                    browserTaskScreenshot = (BrowserTaskScreenshot) c9j4A55.A8Z(BrowserTaskScreenshot$$serializer.INSTANCE, c9iZ, 12);
                    i2 |= 4096;
                    continue;
                case 13:
                    zA8G2 = c9j4A55.A8G(c9iZ, 13);
                    i2 |= 8192;
                    continue;
                case 14:
                    strA0f = C3cH.A0f(C07779iq.A01, c9iZ, c9j4A55, 14);
                    i2 |= 16384;
                    continue;
                case 15:
                    strA0u = C3cI.A0u(c9iZ, c9j4A55);
                    i2 |= 32768;
                    continue;
                case 16:
                    strA8f5 = c9j4A55.A8f(c9iZ, 16);
                    i = 65536;
                    break;
                case 17:
                    browserTaskExecution = (BrowserTaskExecution) c9j4A55.A8a(BrowserTaskExecution$$serializer.INSTANCE, c9iZ, 17);
                    i = 131072;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
            i2 |= i;
        }
    }

    static {
        BrowserTaskPresentation$$serializer browserTaskPresentation$$serializer = new BrowserTaskPresentation$$serializer();
        INSTANCE = browserTaskPresentation$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.model.BrowserTaskPresentation", browserTaskPresentation$$serializer, 18);
        c9iKA1C.A08("browserTaskId", false);
        boolean zA1R = C3cG.A1R(c9iKA1C);
        C3cH.A1H("activityTitle", c9iKA1C, zA1R);
        c9iKA1C.A08("displayStatus", zA1R);
        c9iKA1C.A08("version", zA1R);
        c9iKA1C.A08("queuePosition", zA1R);
        c9iKA1C.A08("capacityBlocked", zA1R);
        c9iKA1C.A08("occupiedSlots", zA1R);
        c9iKA1C.A08("parkedExpiresAtMs", zA1R);
        c9iKA1C.A08("nextParkedExpiresAtMs", zA1R);
        c9iKA1C.A08("terminalReason", zA1R);
        c9iKA1C.A08("latestScreenshot", zA1R);
        c9iKA1C.A08("previewAvailable", zA1R);
        c9iKA1C.A08("siteDomain", zA1R);
        c9iKA1C.A08("pageUrl", zA1R);
        c9iKA1C.A08("controlOwner", zA1R);
        c9iKA1C.A08("execution", zA1R);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        C9hr c9hrA00 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA002 = AbstractC07749im.A00(c07779iq);
        C07729ii c07729ii = C07729ii.A00;
        C9hr c9hrA003 = AbstractC07749im.A00(c07729ii);
        C07839ix c07839ix = C07839ix.A00;
        C9j1 c9j1 = C9j1.A00;
        return new C9hr[]{c07779iq, c9hrA00, c9hrA002, c07779iq, c07779iq, c07729ii, c9hrA003, c07839ix, c07729ii, AbstractC07749im.A00(c9j1), AbstractC07749im.A00(c9j1), c07779iq, AbstractC07749im.A00(BrowserTaskScreenshot$$serializer.INSTANCE), c07839ix, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), c07779iq, BrowserTaskExecution$$serializer.INSTANCE};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, BrowserTaskPresentation browserTaskPresentation) {
        AnonymousClass003.A0u(interfaceC07789is, browserTaskPresentation);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        BrowserTaskPresentation.write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(browserTaskPresentation, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
