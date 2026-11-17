package com.facebook.aura.gateway;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
import X.C2hx;
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
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class HatchStatusVideoPathsJson$$serializer implements C9cd<HatchStatusVideoPathsJson> {
    public static final int $stable = 0;
    public static final HatchStatusVideoPathsJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final HatchStatusVideoPathsJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        HatchStatusVideoPathsJson hatchStatusVideoPathsJson = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new HatchStatusVideoPathsJson(i, str, str2, str3, str4, str5, hatchStatusVideoPathsJson, (C2hx) null);
                case 0:
                    str = (String) c9j4A55.A8Z(C07779iq.A01, c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) c9j4A55.A8Z(C07779iq.A01, c9iZ, 1);
                    i |= 2;
                    break;
                case 2:
                    str3 = (String) c9j4A55.A8Z(C07779iq.A01, c9iZ, 2);
                    i |= 4;
                    break;
                case 3:
                    str4 = (String) c9j4A55.A8Z(C07779iq.A01, c9iZ, 3);
                    i |= 8;
                    break;
                case 4:
                    str5 = (String) c9j4A55.A8Z(C07779iq.A01, c9iZ, 4);
                    i |= 16;
                    break;
                case 5:
                    hatchStatusVideoPathsJson = (HatchStatusVideoPathsJson) c9j4A55.A8Z(INSTANCE, c9iZ, 5);
                    i |= 32;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        HatchStatusVideoPathsJson$$serializer hatchStatusVideoPathsJson$$serializer = new HatchStatusVideoPathsJson$$serializer();
        INSTANCE = hatchStatusVideoPathsJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.gateway.HatchStatusVideoPathsJson", hatchStatusVideoPathsJson$$serializer, 6);
        c9iKA1C.A08("idle", true);
        c9iKA1C.A08("working", true);
        c9iKA1C.A08("making_something", true);
        c9iKA1C.A08("connecting", true);
        c9iKA1C.A08("waking", true);
        c9iKA1C.A08("dark", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(INSTANCE)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, HatchStatusVideoPathsJson hatchStatusVideoPathsJson) {
        AnonymousClass003.A0u(interfaceC07789is, hatchStatusVideoPathsJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        HatchStatusVideoPathsJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(hatchStatusVideoPathsJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
