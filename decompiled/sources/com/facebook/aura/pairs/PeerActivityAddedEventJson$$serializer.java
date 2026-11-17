package com.facebook.aura.pairs;

import X.AbstractC07749im;
import X.AnonymousClass003;
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
import com.facebook.aura.ageverification.intf.AgeCheckFunnelLogging;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes3.dex */
public final /* synthetic */ class PeerActivityAddedEventJson$$serializer implements C9cd<PeerActivityAddedEventJson> {
    public static final int $stable = 0;
    public static final PeerActivityAddedEventJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final PeerActivityAddedEventJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        PeerActivityAddedPayloadJson peerActivityAddedPayloadJson = null;
        Long lA0P = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new PeerActivityAddedEventJson(i, peerActivityAddedPayloadJson, lA0P, (C2hx) null);
            }
            if (iA8N == 0) {
                peerActivityAddedPayloadJson = (PeerActivityAddedPayloadJson) c9j4A55.A8Z(PeerActivityAddedPayloadJson$$serializer.INSTANCE, c9iZ, 0);
                i |= 1;
            } else {
                if (iA8N != 1) {
                    throw C3cG.A17(iA8N);
                }
                lA0P = C3cI.A0P(c9iZ, c9j4A55, 1);
                i |= 2;
            }
        }
    }

    static {
        PeerActivityAddedEventJson$$serializer peerActivityAddedEventJson$$serializer = new PeerActivityAddedEventJson$$serializer();
        INSTANCE = peerActivityAddedEventJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.pairs.PeerActivityAddedEventJson", peerActivityAddedEventJson$$serializer, 2);
        c9iKA1C.A08("payload", true);
        c9iKA1C.A08(AgeCheckFunnelLogging.KEY_SEQ, true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        return C3cH.A1Z(C9j1.A00, AbstractC07749im.A00(PeerActivityAddedPayloadJson$$serializer.INSTANCE));
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
    public final void serialize(InterfaceC07789is interfaceC07789is, PeerActivityAddedEventJson peerActivityAddedEventJson) {
        AnonymousClass003.A0u(interfaceC07789is, peerActivityAddedEventJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        PeerActivityAddedEventJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(peerActivityAddedEventJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
