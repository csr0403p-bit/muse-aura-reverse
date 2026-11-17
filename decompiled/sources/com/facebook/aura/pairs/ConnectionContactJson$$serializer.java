package com.facebook.aura.pairs;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C3cH;
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
import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes3.dex */
public final /* synthetic */ class ConnectionContactJson$$serializer implements C9cd<ConnectionContactJson> {
    public static final int $stable = 0;
    public static final ConnectionContactJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final ConnectionContactJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA8f = null;
        PeerImageJson peerImageJson = null;
        String strA0h = null;
        String strA8f2 = null;
        PeerImageJson peerImageJson2 = null;
        PeerImageJson peerImageJson3 = null;
        PeerImageJson peerImageJson4 = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new ConnectionContactJson(i, strA8f, strA0h, strA8f2, peerImageJson2, peerImageJson3, peerImageJson4, peerImageJson, (C2hx) null);
                case 0:
                    strA8f = c9j4A55.A8f(c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    strA0h = C3cH.A0h(c9iZ, c9j4A55);
                    i |= 2;
                    break;
                case 2:
                    strA8f2 = c9j4A55.A8f(c9iZ, 2);
                    i |= 4;
                    break;
                case 3:
                    peerImageJson2 = (PeerImageJson) c9j4A55.A8Z(PeerImageJson$$serializer.INSTANCE, c9iZ, 3);
                    i |= 8;
                    break;
                case 4:
                    peerImageJson3 = (PeerImageJson) c9j4A55.A8Z(PeerImageJson$$serializer.INSTANCE, c9iZ, 4);
                    i |= 16;
                    break;
                case 5:
                    peerImageJson4 = (PeerImageJson) c9j4A55.A8Z(PeerImageJson$$serializer.INSTANCE, c9iZ, 5);
                    i |= 32;
                    break;
                case 6:
                    peerImageJson = (PeerImageJson) c9j4A55.A8Z(PeerImageJson$$serializer.INSTANCE, c9iZ, 6);
                    i |= 64;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        ConnectionContactJson$$serializer connectionContactJson$$serializer = new ConnectionContactJson$$serializer();
        INSTANCE = connectionContactJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.pairs.ConnectionContactJson", connectionContactJson$$serializer, 7);
        C3cH.A1I(AuraDeeplinkRouteMapper.STATUS_ROUTE, c9iKA1C, true);
        c9iKA1C.A08("agent_name", true);
        c9iKA1C.A08("profile_photo", true);
        c9iKA1C.A08("muse_avatar", true);
        c9iKA1C.A08("profile_photo_ref", true);
        c9iKA1C.A08("muse_avatar_ref", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        PeerImageJson$$serializer peerImageJson$$serializer = PeerImageJson$$serializer.INSTANCE;
        return new C9hr[]{c07779iq, c07779iq, c07779iq, AbstractC07749im.A00(peerImageJson$$serializer), AbstractC07749im.A00(peerImageJson$$serializer), AbstractC07749im.A00(peerImageJson$$serializer), AbstractC07749im.A00(peerImageJson$$serializer)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, ConnectionContactJson connectionContactJson) {
        AnonymousClass003.A0u(interfaceC07789is, connectionContactJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        ConnectionContactJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(connectionContactJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
