package com.facebook.aura.network.acs;

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
public final /* synthetic */ class KeyConfigDetailsJson$$serializer implements C9cd<KeyConfigDetailsJson> {
    public static final KeyConfigDetailsJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final KeyConfigDetailsJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        int i = 0;
        String strA8f = null;
        long jA8X = 0;
        long jA8X2 = 0;
        int iA8U = 0;
        int iA8U2 = 0;
        int iA8U3 = 0;
        int iA8U4 = 0;
        int iA8U5 = 0;
        int iA8U6 = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new KeyConfigDetailsJson(i, strA8f, iA8U6, iA8U5, iA8U4, jA8X, jA8X2, iA8U2, iA8U, iA8U3, (C2hx) null);
                case 0:
                    strA8f = c9j4A55.A8f(c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    iA8U6 = c9j4A55.A8U(c9iZ, 1);
                    i |= 2;
                    break;
                case 2:
                    iA8U5 = c9j4A55.A8U(c9iZ, 2);
                    i |= 4;
                    break;
                case 3:
                    iA8U4 = c9j4A55.A8U(c9iZ, 3);
                    i |= 8;
                    break;
                case 4:
                    jA8X = c9j4A55.A8X(c9iZ, 4);
                    i |= 16;
                    break;
                case 5:
                    jA8X2 = c9j4A55.A8X(c9iZ, 5);
                    i |= 32;
                    break;
                case 6:
                    iA8U2 = c9j4A55.A8U(c9iZ, 6);
                    i |= 64;
                    break;
                case 7:
                    iA8U = c9j4A55.A8U(c9iZ, 7);
                    i |= 128;
                    break;
                case 8:
                    iA8U3 = c9j4A55.A8U(c9iZ, 8);
                    i |= 256;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        KeyConfigDetailsJson$$serializer keyConfigDetailsJson$$serializer = new KeyConfigDetailsJson$$serializer();
        INSTANCE = keyConfigDetailsJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.network.acs.KeyConfigDetailsJson", keyConfigDetailsJson$$serializer, 9);
        c9iKA1C.A08("publicKeyBase64", false);
        c9iKA1C.A08("cipherSuite", false);
        c9iKA1C.A08("maxEval", false);
        c9iKA1C.A08("redemptionLimit", false);
        c9iKA1C.A08("expireTime", false);
        c9iKA1C.A08("tokenTtl", false);
        c9iKA1C.A08("curve", true);
        C9iK.A04("kdf", c9iKA1C, true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        C07729ii c07729ii = C07729ii.A00;
        C9j1 c9j1 = C9j1.A00;
        return new C9hr[]{c07779iq, c07729ii, c07729ii, c07729ii, c9j1, c9j1, c07729ii, c07729ii, c07729ii};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, KeyConfigDetailsJson keyConfigDetailsJson) {
        AnonymousClass003.A0u(interfaceC07789is, keyConfigDetailsJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        KeyConfigDetailsJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_network_acs_acs(keyConfigDetailsJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
