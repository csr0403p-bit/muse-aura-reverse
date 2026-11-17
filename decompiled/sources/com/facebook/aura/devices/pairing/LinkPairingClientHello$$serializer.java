package com.facebook.aura.devices.pairing;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07729ii;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C3cJ;
import X.C5hV;
import X.C7384Etj;
import X.C9cd;
import X.C9hr;
import X.C9iK;
import X.C9iZ;
import X.C9j4;
import X.C9j5;
import X.F0C;
import X.Hs1;
import X.InterfaceC07789is;
import X.InterfaceC07829iw;
import java.util.List;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes4.dex */
public final /* synthetic */ class LinkPairingClientHello$$serializer implements C9cd<LinkPairingClientHello> {
    public static final int $stable = 0;
    public static final LinkPairingClientHello$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final LinkPairingClientHello deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = LinkPairingClientHello.$childSerializers;
        List list = null;
        String strA0w = null;
        String strA0w2 = null;
        String strA8f = null;
        String strA0i = null;
        String strA8f2 = null;
        int i = 0;
        int iA8U = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new LinkPairingClientHello(i, strA8f, iA8U, strA0i, strA8f2, list, strA0w2, strA0w, (C2hx) null);
                case 0:
                    strA8f = c9j4A55.A8f(c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    iA8U = c9j4A55.A8U(c9iZ, 1);
                    i |= 2;
                    break;
                case 2:
                    strA0i = C3cH.A0i(c9iZ, c9j4A55);
                    i |= 4;
                    break;
                case 3:
                    strA8f2 = c9j4A55.A8f(c9iZ, 3);
                    i |= 8;
                    break;
                case 4:
                    list = (List) C3cJ.A0G(c9iZ, c9j4A55, f0cArr, 4);
                    i |= 16;
                    break;
                case 5:
                    strA0w2 = C3cI.A0w(c9iZ, c9j4A55, 5);
                    i |= 32;
                    break;
                case 6:
                    strA0w = C3cI.A0w(c9iZ, c9j4A55, 6);
                    i |= 64;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        LinkPairingClientHello$$serializer linkPairingClientHello$$serializer = new LinkPairingClientHello$$serializer();
        INSTANCE = linkPairingClientHello$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.devices.pairing.LinkPairingClientHello", linkPairingClientHello$$serializer, 7);
        c9iKA1C.A08("action", true);
        c9iKA1C.A08("version", false);
        c9iKA1C.A08("mobile_pub", false);
        c9iKA1C.A08("mobile_nonce", false);
        c9iKA1C.A08("cipher_suites", false);
        c9iKA1C.A08("pairing_auth", true);
        c9iKA1C.A08("pairing_policy", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = LinkPairingClientHello.$childSerializers;
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c07779iq, C07729ii.A00, c07779iq, c07779iq, C3cH.A14(f0cArr, 4), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, LinkPairingClientHello linkPairingClientHello) {
        AnonymousClass003.A0u(interfaceC07789is, linkPairingClientHello);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        LinkPairingClientHello.write$Self$fbandroid_express_aura_java_com_facebook_aura_devices_pairing_pairing(linkPairingClientHello, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
