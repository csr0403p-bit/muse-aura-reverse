package com.facebook.aura.pairs;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
import X.C07839ix;
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
/* loaded from: classes3.dex */
public final /* synthetic */ class PeerStatusJson$$serializer implements C9cd<PeerStatusJson> {
    public static final int $stable = 0;
    public static final PeerStatusJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final PeerStatusJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = PeerStatusJson.$childSerializers;
        Boolean boolA0M = null;
        List listA0P = null;
        String strA0h = null;
        List listA0P2 = null;
        PeerFeaturesJson peerFeaturesJson = null;
        List listA0P3 = null;
        boolean zA8G = false;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new PeerStatusJson(i, zA8G, strA0h, listA0P2, peerFeaturesJson, listA0P3, listA0P, boolA0M, (C2hx) null);
                case 0:
                    zA8G = c9j4A55.A8G(c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    strA0h = C3cH.A0h(c9iZ, c9j4A55);
                    i |= 2;
                    break;
                case 2:
                    listA0P2 = C3cJ.A0P(c9iZ, c9j4A55, f0cArr, 2);
                    i |= 4;
                    break;
                case 3:
                    peerFeaturesJson = (PeerFeaturesJson) c9j4A55.A8a(PeerFeaturesJson$$serializer.INSTANCE, c9iZ, 3);
                    i |= 8;
                    break;
                case 4:
                    listA0P3 = C3cJ.A0P(c9iZ, c9j4A55, f0cArr, 4);
                    i |= 16;
                    break;
                case 5:
                    listA0P = C3cJ.A0P(c9iZ, c9j4A55, f0cArr, 5);
                    i |= 32;
                    break;
                case 6:
                    boolA0M = C3cI.A0M(c9iZ, c9j4A55, 6);
                    i |= 64;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        PeerStatusJson$$serializer peerStatusJson$$serializer = new PeerStatusJson$$serializer();
        INSTANCE = peerStatusJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.pairs.PeerStatusJson", peerStatusJson$$serializer, 7);
        c9iKA1C.A08("supported", true);
        c9iKA1C.A08("availability", true);
        c9iKA1C.A08("allowed_operations", true);
        c9iKA1C.A08("features", true);
        c9iKA1C.A08("invite_presets", true);
        c9iKA1C.A08("trust_presets", true);
        c9iKA1C.A08("invite_inbox", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = PeerStatusJson.$childSerializers;
        C07839ix c07839ix = C07839ix.A00;
        return new C9hr[]{c07839ix, C07779iq.A01, C3cH.A11(f0cArr), PeerFeaturesJson$$serializer.INSTANCE, C3cH.A13(f0cArr), C3cG.A16(f0cArr, 5), AbstractC07749im.A00(c07839ix)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, PeerStatusJson peerStatusJson) {
        AnonymousClass003.A0u(interfaceC07789is, peerStatusJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        PeerStatusJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(peerStatusJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
