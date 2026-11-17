package com.facebook.aura.pairs;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
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
/* loaded from: classes3.dex */
public final /* synthetic */ class PeerInviteJson$$serializer implements C9cd<PeerInviteJson> {
    public static final int $stable = 0;
    public static final PeerInviteJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final PeerInviteJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA0w = null;
        Long lA0Q = null;
        String strA0w2 = null;
        String strA0i = null;
        String strA8f = null;
        long jA8X = 0;
        long jA8X2 = 0;
        int i = 0;
        String strA8f2 = null;
        String strA0i2 = null;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new PeerInviteJson(i, strA8f2, strA0i2, strA0i, strA8f, jA8X, jA8X2, strA0w2, lA0Q, strA0w, (C2hx) null);
                case 0:
                    strA8f2 = c9j4A55.A8f(c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    strA0i2 = C3cI.A0i(c9iZ, c9j4A55);
                    i |= 2;
                    break;
                case 2:
                    strA0i = C3cH.A0i(c9iZ, c9j4A55);
                    i |= 4;
                    break;
                case 3:
                    strA8f = c9j4A55.A8f(c9iZ, 3);
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
                    strA0w2 = C3cI.A0w(c9iZ, c9j4A55, 6);
                    i |= 64;
                    break;
                case 7:
                    lA0Q = C3cI.A0Q(c9iZ, c9j4A55, 7);
                    i |= 128;
                    break;
                case 8:
                    strA0w = C3cI.A0w(c9iZ, c9j4A55, 8);
                    i |= 256;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        PeerInviteJson$$serializer peerInviteJson$$serializer = new PeerInviteJson$$serializer();
        INSTANCE = peerInviteJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.pairs.PeerInviteJson", peerInviteJson$$serializer, 9);
        c9iKA1C.A08("invite_id_b64", false);
        C3cI.A1P("create_request_id", c9iKA1C, true);
        c9iKA1C.A08("offered_preset", true);
        c9iKA1C.A08("created_at_ms", true);
        c9iKA1C.A08("expires_at_ms", true);
        c9iKA1C.A08("claimed_by_muse", true);
        c9iKA1C.A08("revoked_at_ms", true);
        c9iKA1C.A08("delivery_id", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        C9hr c9hrA00 = AbstractC07749im.A00(c07779iq);
        C9j1 c9j1 = C9j1.A00;
        return new C9hr[]{c07779iq, c9hrA00, c07779iq, c07779iq, c9j1, c9j1, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c9j1), AbstractC07749im.A00(c07779iq)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, PeerInviteJson peerInviteJson) {
        AnonymousClass003.A0u(interfaceC07789is, peerInviteJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        PeerInviteJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(peerInviteJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
