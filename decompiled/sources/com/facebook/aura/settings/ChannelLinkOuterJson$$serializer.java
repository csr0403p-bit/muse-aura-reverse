package com.facebook.aura.settings;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
import X.C07839ix;
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
import com.facebook.aura.model.ReplyAttributionSerializer;
import com.facebook.aura.pairs.PairsInviteMailboxKt;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes4.dex */
public final /* synthetic */ class ChannelLinkOuterJson$$serializer implements C9cd<ChannelLinkOuterJson> {
    public static final int $stable = 0;
    public static final ChannelLinkOuterJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final ChannelLinkOuterJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        Long lA0Q = null;
        ChannelLinkPayloadJson channelLinkPayloadJson = null;
        String strA8f = null;
        String strA8f2 = null;
        boolean zA8G = false;
        boolean zA8G2 = false;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new ChannelLinkOuterJson(i, channelLinkPayloadJson, strA8f, zA8G2, zA8G, strA8f2, lA0Q, (C2hx) null);
                case 0:
                    channelLinkPayloadJson = (ChannelLinkPayloadJson) c9j4A55.A8Z(ChannelLinkPayloadJson$$serializer.INSTANCE, c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    strA8f = c9j4A55.A8f(c9iZ, 1);
                    i |= 2;
                    break;
                case 2:
                    zA8G2 = c9j4A55.A8G(c9iZ, 2);
                    i |= 4;
                    break;
                case 3:
                    zA8G = c9j4A55.A8G(c9iZ, 3);
                    i |= 8;
                    break;
                case 4:
                    strA8f2 = c9j4A55.A8f(c9iZ, 4);
                    i |= 16;
                    break;
                case 5:
                    lA0Q = C3cI.A0Q(c9iZ, c9j4A55, 5);
                    i |= 32;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        ChannelLinkOuterJson$$serializer channelLinkOuterJson$$serializer = new ChannelLinkOuterJson$$serializer();
        INSTANCE = channelLinkOuterJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.settings.ChannelLinkOuterJson", channelLinkOuterJson$$serializer, 6);
        c9iKA1C.A08("result", true);
        c9iKA1C.A08("pairing_url", true);
        c9iKA1C.A08("is_paired", true);
        c9iKA1C.A08(PairsInviteMailboxKt.OUTCOME_OK, true);
        c9iKA1C.A08(ReplyAttributionSerializer.TYPE_MESSAGE, true);
        c9iKA1C.A08("agent_id", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C9hr c9hrA00 = AbstractC07749im.A00(ChannelLinkPayloadJson$$serializer.INSTANCE);
        C07779iq c07779iq = C07779iq.A01;
        C07839ix c07839ix = C07839ix.A00;
        return new C9hr[]{c9hrA00, c07779iq, c07839ix, c07839ix, c07779iq, AbstractC07749im.A00(C9j1.A00)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, ChannelLinkOuterJson channelLinkOuterJson) {
        AnonymousClass003.A0u(interfaceC07789is, channelLinkOuterJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        ChannelLinkOuterJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_settings_settings(channelLinkOuterJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
