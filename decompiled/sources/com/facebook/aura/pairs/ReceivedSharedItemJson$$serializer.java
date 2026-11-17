package com.facebook.aura.pairs;

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
import X.C9j1;
import X.C9j4;
import X.C9j5;
import X.Hs1;
import X.InterfaceC07789is;
import X.InterfaceC07829iw;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes3.dex */
public final /* synthetic */ class ReceivedSharedItemJson$$serializer implements C9cd<ReceivedSharedItemJson> {
    public static final int $stable = 0;
    public static final ReceivedSharedItemJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final ReceivedSharedItemJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA8f = null;
        ReceivedItemJson receivedItemJson = null;
        long jA8X = 0;
        int i = 0;
        String strA8f2 = null;
        String strA8f3 = null;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new ReceivedSharedItemJson(i, strA8f, strA8f2, strA8f3, jA8X, receivedItemJson, (C2hx) null);
            }
            if (iA8N == 0) {
                strA8f = c9j4A55.A8f(c9iZ, 0);
                i |= 1;
            } else if (iA8N == 1) {
                strA8f2 = c9j4A55.A8f(c9iZ, 1);
                i |= 2;
            } else if (iA8N == 2) {
                strA8f3 = c9j4A55.A8f(c9iZ, 2);
                i |= 4;
            } else if (iA8N == 3) {
                jA8X = c9j4A55.A8X(c9iZ, 3);
                i |= 8;
            } else {
                if (iA8N != 4) {
                    throw C3cG.A17(iA8N);
                }
                receivedItemJson = (ReceivedItemJson) c9j4A55.A8Z(ReceivedItemJson$$serializer.INSTANCE, c9iZ, 4);
                i |= 16;
            }
        }
    }

    static {
        ReceivedSharedItemJson$$serializer receivedSharedItemJson$$serializer = new ReceivedSharedItemJson$$serializer();
        INSTANCE = receivedSharedItemJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.pairs.ReceivedSharedItemJson", receivedSharedItemJson$$serializer, 5);
        c9iKA1C.A08("share_id", true);
        c9iKA1C.A08("connection_id", true);
        c9iKA1C.A08("sender_muse", true);
        c9iKA1C.A08("received_at_ms", true);
        c9iKA1C.A08("item", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c07779iq, c07779iq, c07779iq, C9j1.A00, AbstractC07749im.A00(ReceivedItemJson$$serializer.INSTANCE)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, ReceivedSharedItemJson receivedSharedItemJson) {
        AnonymousClass003.A0u(interfaceC07789is, receivedSharedItemJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        ReceivedSharedItemJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(receivedSharedItemJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
