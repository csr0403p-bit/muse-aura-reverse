package com.facebook.aura.gateway;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C5hV;
import X.C60O;
import X.C60Q;
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
public final /* synthetic */ class FsStatResponseJson$$serializer implements C9cd<FsStatResponseJson> {
    public static final int $stable = 0;
    public static final FsStatResponseJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final FsStatResponseJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        FsStatPayloadJson fsStatPayloadJson = null;
        long jA8X = 0;
        String strA8f = null;
        String strA8f2 = null;
        FsErrorJson fsErrorJson = null;
        long jA8X2 = 0;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new FsStatResponseJson(i, fsStatPayloadJson, strA8f, strA8f2, jA8X2, jA8X, fsErrorJson, (C2hx) null);
                case 0:
                    fsStatPayloadJson = (FsStatPayloadJson) c9j4A55.A8Z(FsStatPayloadJson$$serializer.INSTANCE, c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    strA8f = c9j4A55.A8f(c9iZ, 1);
                    i |= 2;
                    break;
                case 2:
                    strA8f2 = c9j4A55.A8f(c9iZ, 2);
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
                    fsErrorJson = (FsErrorJson) c9j4A55.A8Z(FsErrorJson$$serializer.INSTANCE, c9iZ, 5);
                    i |= 32;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        FsStatResponseJson$$serializer fsStatResponseJson$$serializer = new FsStatResponseJson$$serializer();
        INSTANCE = fsStatResponseJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.gateway.FsStatResponseJson", fsStatResponseJson$$serializer, 6);
        c9iKA1C.A08("result", true);
        C60O.A1S("path", c9iKA1C, true);
        c9iKA1C.A08("size", true);
        C60Q.A1N("modified_ms", c9iKA1C, true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C9hr c9hrA00 = AbstractC07749im.A00(FsStatPayloadJson$$serializer.INSTANCE);
        C07779iq c07779iq = C07779iq.A01;
        C9j1 c9j1 = C9j1.A00;
        return new C9hr[]{c9hrA00, c07779iq, c07779iq, c9j1, c9j1, AbstractC07749im.A00(FsErrorJson$$serializer.INSTANCE)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, FsStatResponseJson fsStatResponseJson) {
        AnonymousClass003.A0u(interfaceC07789is, fsStatResponseJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        FsStatResponseJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(fsStatResponseJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
