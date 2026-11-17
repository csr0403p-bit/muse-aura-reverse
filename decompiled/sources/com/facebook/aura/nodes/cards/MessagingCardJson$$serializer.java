package com.facebook.aura.nodes.cards;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C3cJ;
import X.C5hV;
import X.C7384Etj;
import X.C9Y;
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
import com.facebook.aura.wearablebroadcast.MetaAiAppBroadcastSender;
import java.util.List;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class MessagingCardJson$$serializer implements C9cd<MessagingCardJson> {
    public static final int $stable = 0;
    public static final MessagingCardJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final MessagingCardJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = MessagingCardJson.$childSerializers;
        List listA0P = null;
        String strA8f = null;
        List listA0P2 = null;
        String strA8f2 = null;
        String strA0w = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new MessagingCardJson(i, listA0P, strA8f, listA0P2, strA8f2, strA0w, (C2hx) null);
            }
            if (iA8N == 0) {
                listA0P = C3cJ.A0P(c9iZ, c9j4A55, f0cArr, 0);
                i |= 1;
            } else if (iA8N == 1) {
                strA8f = c9j4A55.A8f(c9iZ, 1);
                i |= 2;
            } else if (iA8N == 2) {
                listA0P2 = C3cJ.A0P(c9iZ, c9j4A55, f0cArr, 2);
                i |= 4;
            } else if (iA8N == 3) {
                strA8f2 = c9j4A55.A8f(c9iZ, 3);
                i |= 8;
            } else {
                if (iA8N != 4) {
                    throw C3cG.A17(iA8N);
                }
                strA0w = C3cI.A0w(c9iZ, c9j4A55, 4);
                i |= 16;
            }
        }
    }

    static {
        MessagingCardJson$$serializer messagingCardJson$$serializer = new MessagingCardJson$$serializer();
        INSTANCE = messagingCardJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.nodes.cards.MessagingCardJson", messagingCardJson$$serializer, 5);
        c9iKA1C.A08("recipients", true);
        c9iKA1C.A08(MetaAiAppBroadcastSender.EXTRA_BODY, true);
        c9iKA1C.A08(C9Y.BUG_REPORT_ATTACHMENTS_ENDPOINT, true);
        c9iKA1C.A08("address", true);
        c9iKA1C.A08("contact_name", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = MessagingCardJson.$childSerializers;
        C9hr c9hrA0z = C3cH.A0z(f0cArr);
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c9hrA0z, c07779iq, C3cH.A11(f0cArr), c07779iq, AbstractC07749im.A00(c07779iq)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, MessagingCardJson messagingCardJson) {
        AnonymousClass003.A0u(interfaceC07789is, messagingCardJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        MessagingCardJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_nodes_cards_cards(messagingCardJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
