package com.facebook.aura.pairs;

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
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes3.dex */
public final /* synthetic */ class PeerContactJson$$serializer implements C9cd<PeerContactJson> {
    public static final int $stable = 0;
    public static final PeerContactJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final PeerContactJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        int i;
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        C2hx c2hx = null;
        String strA0f = null;
        PeerImageJson peerImageJson = null;
        PeerLastActivityJson peerLastActivityJson = null;
        Long l = null;
        Long l2 = null;
        Long lA0Q = null;
        PeerImageJson peerImageJson2 = null;
        PeerImageJson peerImageJson3 = null;
        PeerImageJson peerImageJson4 = null;
        String strA0s = null;
        String strA8f = null;
        String strA8f2 = null;
        String strA8f3 = null;
        String strA8f4 = null;
        long jA8X = 0;
        long jA8X2 = 0;
        boolean zA8G = false;
        boolean zA8G2 = false;
        String strA8f5 = null;
        int i2 = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new PeerContactJson(i2, strA8f5, strA0f, jA8X2, l2, l, strA8f, strA8f2, strA8f3, strA8f4, zA8G2, zA8G, jA8X, strA0s, peerImageJson, peerImageJson4, peerImageJson3, peerImageJson2, peerLastActivityJson, lA0Q, c2hx);
                case 0:
                    strA8f5 = c9j4A55.A8f(c9iZ, 0);
                    i2 |= 1;
                    continue;
                case 1:
                    strA0f = C3cI.A0f(c9iZ, c9j4A55);
                    i2 |= 2;
                    continue;
                case 2:
                    jA8X2 = c9j4A55.A8X(c9iZ, 2);
                    i2 |= 4;
                    continue;
                case 3:
                    l2 = (Long) c9j4A55.A8Z(C9j1.A00, c9iZ, 3);
                    i2 |= 8;
                    continue;
                case 4:
                    l = (Long) c9j4A55.A8Z(C9j1.A00, c9iZ, 4);
                    i2 |= 16;
                    continue;
                case 5:
                    strA8f = c9j4A55.A8f(c9iZ, 5);
                    i2 |= 32;
                    continue;
                case 6:
                    strA8f2 = c9j4A55.A8f(c9iZ, 6);
                    i2 |= 64;
                    continue;
                case 7:
                    strA8f3 = c9j4A55.A8f(c9iZ, 7);
                    i2 |= 128;
                    continue;
                case 8:
                    strA8f4 = c9j4A55.A8f(c9iZ, 8);
                    i2 |= 256;
                    continue;
                case 9:
                    zA8G2 = c9j4A55.A8G(c9iZ, 9);
                    i2 |= 512;
                    continue;
                case 10:
                    zA8G = c9j4A55.A8G(c9iZ, 10);
                    i2 |= 1024;
                    continue;
                case 11:
                    jA8X = c9j4A55.A8X(c9iZ, 11);
                    i2 |= 2048;
                    continue;
                case 12:
                    strA0s = C3cI.A0s(c9iZ, c9j4A55);
                    i2 |= 4096;
                    continue;
                case 13:
                    peerImageJson = (PeerImageJson) c9j4A55.A8Z(PeerImageJson$$serializer.INSTANCE, c9iZ, 13);
                    i2 |= 8192;
                    continue;
                case 14:
                    peerImageJson4 = (PeerImageJson) c9j4A55.A8Z(PeerImageJson$$serializer.INSTANCE, c9iZ, 14);
                    i2 |= 16384;
                    continue;
                case 15:
                    peerImageJson3 = (PeerImageJson) c9j4A55.A8Z(PeerImageJson$$serializer.INSTANCE, c9iZ, 15);
                    i = 32768;
                    break;
                case 16:
                    peerImageJson2 = (PeerImageJson) c9j4A55.A8Z(PeerImageJson$$serializer.INSTANCE, c9iZ, 16);
                    i = 65536;
                    break;
                case 17:
                    peerLastActivityJson = (PeerLastActivityJson) c9j4A55.A8Z(PeerLastActivityJson$$serializer.INSTANCE, c9iZ, 17);
                    i = 131072;
                    break;
                case 18:
                    lA0Q = C3cI.A0Q(c9iZ, c9j4A55, 18);
                    i2 |= 262144;
                    continue;
                default:
                    throw C3cG.A17(iA8N);
            }
            i2 |= i;
        }
    }

    static {
        PeerContactJson$$serializer peerContactJson$$serializer = new PeerContactJson$$serializer();
        INSTANCE = peerContactJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.pairs.PeerContactJson", peerContactJson$$serializer, 19);
        c9iKA1C.A08("muse_id", false);
        c9iKA1C.A08("relationship_generation_id", true);
        c9iKA1C.A08("relationship_revision", true);
        c9iKA1C.A08("relationship_started_at_ms", true);
        C3cH.A1I("request_expires_at_ms", c9iKA1C, true);
        C3cH.A1H("agent_name", c9iKA1C, true);
        c9iKA1C.A08("trust_preset", true);
        c9iKA1C.A08("sas_confirmed_local", true);
        c9iKA1C.A08("attested", true);
        c9iKA1C.A08("created_at_ms", true);
        c9iKA1C.A08("chat_session_id", true);
        c9iKA1C.A08("profile_photo", true);
        c9iKA1C.A08("muse_avatar", true);
        c9iKA1C.A08("profile_photo_ref", true);
        c9iKA1C.A08("muse_avatar_ref", true);
        c9iKA1C.A08("last_activity", true);
        c9iKA1C.A08("paired_at_ms", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        C9hr c9hrA00 = AbstractC07749im.A00(c07779iq);
        C9j1 c9j1 = C9j1.A00;
        C9hr c9hrA002 = AbstractC07749im.A00(c9j1);
        C9hr c9hrA003 = AbstractC07749im.A00(c9j1);
        C07839ix c07839ix = C07839ix.A00;
        C9hr c9hrA004 = AbstractC07749im.A00(c07779iq);
        PeerImageJson$$serializer peerImageJson$$serializer = PeerImageJson$$serializer.INSTANCE;
        return new C9hr[]{c07779iq, c9hrA00, c9j1, c9hrA002, c9hrA003, c07779iq, c07779iq, c07779iq, c07779iq, c07839ix, c07839ix, c9j1, c9hrA004, AbstractC07749im.A00(peerImageJson$$serializer), AbstractC07749im.A00(peerImageJson$$serializer), AbstractC07749im.A00(peerImageJson$$serializer), AbstractC07749im.A00(peerImageJson$$serializer), AbstractC07749im.A00(PeerLastActivityJson$$serializer.INSTANCE), AbstractC07749im.A00(c9j1)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, PeerContactJson peerContactJson) {
        AnonymousClass003.A0u(interfaceC07789is, peerContactJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        PeerContactJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(peerContactJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
