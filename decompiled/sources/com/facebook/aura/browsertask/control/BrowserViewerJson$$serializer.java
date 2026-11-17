package com.facebook.aura.browsertask.control;

import X.AnonymousClass003;
import X.C07729ii;
import X.C07799it;
import X.C3cG;
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
import com.facebook.aura.opengraph.HatchWebPageParserKt;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class BrowserViewerJson$$serializer implements C9cd<BrowserViewerJson> {
    public static final int $stable = 0;
    public static final BrowserViewerJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final BrowserViewerJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        double dA8M = 0.0d;
        int iA8U = 0;
        int i = 0;
        int iA8U2 = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new BrowserViewerJson(i, iA8U, iA8U2, dA8M, null);
            }
            if (iA8N == 0) {
                iA8U = c9j4A55.A8U(c9iZ, 0);
                i |= 1;
            } else if (iA8N == 1) {
                iA8U2 = c9j4A55.A8U(c9iZ, 1);
                i |= 2;
            } else {
                if (iA8N != 2) {
                    throw C3cG.A17(iA8N);
                }
                dA8M = c9j4A55.A8M(c9iZ, 2);
                i |= 4;
            }
        }
    }

    static {
        BrowserViewerJson$$serializer browserViewerJson$$serializer = new BrowserViewerJson$$serializer();
        INSTANCE = browserViewerJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.browsertask.control.BrowserViewerJson", browserViewerJson$$serializer, 3);
        c9iKA1C.A08(HatchWebPageParserKt.WIDTH_ATTR, false);
        c9iKA1C.A08(HatchWebPageParserKt.HEIGHT_ATTR, false);
        c9iKA1C.A08("device_pixel_ratio", false);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07729ii c07729ii = C07729ii.A00;
        return new C9hr[]{c07729ii, c07729ii, C07799it.A00};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, BrowserViewerJson browserViewerJson) {
        AnonymousClass003.A0u(interfaceC07789is, browserViewerJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        BrowserViewerJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_browsertask_control_control(browserViewerJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
