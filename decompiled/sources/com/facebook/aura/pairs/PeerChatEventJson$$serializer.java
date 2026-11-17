package com.facebook.aura.pairs;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
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
import com.facebook.aura.ageverification.intf.AgeCheckFunnelLogging;
import kotlin.Deprecated;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectSerializer;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes3.dex */
public final /* synthetic */ class PeerChatEventJson$$serializer implements C9cd<PeerChatEventJson> {
    public static final int $stable = 0;
    public static final PeerChatEventJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final PeerChatEventJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA0w = null;
        long jA8X = 0;
        PeerChatAuthorJson peerChatAuthorJson = null;
        String strA0w2 = null;
        String strA0w3 = null;
        JsonObject jsonObject = null;
        long jA8X2 = 0;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new PeerChatEventJson(i, jA8X2, jA8X, strA0w, strA0w2, strA0w3, jsonObject, peerChatAuthorJson, (C2hx) null);
                case 0:
                    jA8X2 = c9j4A55.A8X(c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    jA8X = c9j4A55.A8X(c9iZ, 1);
                    i |= 2;
                    break;
                case 2:
                    strA0w = C3cI.A0w(c9iZ, c9j4A55, 2);
                    i |= 4;
                    break;
                case 3:
                    strA0w2 = C3cI.A0w(c9iZ, c9j4A55, 3);
                    i |= 8;
                    break;
                case 4:
                    strA0w3 = C3cI.A0w(c9iZ, c9j4A55, 4);
                    i |= 16;
                    break;
                case 5:
                    jsonObject = (JsonObject) c9j4A55.A8Z(JsonObjectSerializer.A01, c9iZ, 5);
                    i |= 32;
                    break;
                case 6:
                    peerChatAuthorJson = (PeerChatAuthorJson) c9j4A55.A8Z(PeerChatAuthorJson$$serializer.INSTANCE, c9iZ, 6);
                    i |= 64;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        PeerChatEventJson$$serializer peerChatEventJson$$serializer = new PeerChatEventJson$$serializer();
        INSTANCE = peerChatEventJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.pairs.PeerChatEventJson", peerChatEventJson$$serializer, 7);
        c9iKA1C.A08(AgeCheckFunnelLogging.KEY_SEQ, true);
        c9iKA1C.A08("occurred_at_ms", true);
        c9iKA1C.A08("event_name", true);
        c9iKA1C.A08("message_id", true);
        c9iKA1C.A08("display_text", true);
        c9iKA1C.A08("payload", true);
        c9iKA1C.A08("author", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C9j1 c9j1 = C9j1.A00;
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c9j1, c9j1, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(JsonObjectSerializer.A01), AbstractC07749im.A00(PeerChatAuthorJson$$serializer.INSTANCE)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, PeerChatEventJson peerChatEventJson) {
        AnonymousClass003.A0u(interfaceC07789is, peerChatEventJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        PeerChatEventJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(peerChatEventJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
