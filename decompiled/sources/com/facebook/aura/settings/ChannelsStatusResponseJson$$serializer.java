package com.facebook.aura.settings;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07839ix;
import X.C2hx;
import X.C3cG;
import X.C3cH;
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
import com.facebook.aura.pairs.PairsInviteMailboxKt;
import java.util.List;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes4.dex */
public final /* synthetic */ class ChannelsStatusResponseJson$$serializer implements C9cd<ChannelsStatusResponseJson> {
    public static final int $stable = 0;
    public static final ChannelsStatusResponseJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final ChannelsStatusResponseJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = ChannelsStatusResponseJson.$childSerializers;
        ChannelsPayloadJson channelsPayloadJson = null;
        ChannelsPayloadJson channelsPayloadJson2 = null;
        List listA0Q = null;
        boolean zA8G = false;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new ChannelsStatusResponseJson(i, zA8G, channelsPayloadJson, channelsPayloadJson2, listA0Q, (C2hx) null);
            }
            if (iA8N == 0) {
                zA8G = c9j4A55.A8G(c9iZ, 0);
                i |= 1;
            } else if (iA8N == 1) {
                channelsPayloadJson = (ChannelsPayloadJson) c9j4A55.A8Z(ChannelsPayloadJson$$serializer.INSTANCE, c9iZ, 1);
                i |= 2;
            } else if (iA8N == 2) {
                channelsPayloadJson2 = (ChannelsPayloadJson) c9j4A55.A8Z(ChannelsPayloadJson$$serializer.INSTANCE, c9iZ, 2);
                i |= 4;
            } else {
                if (iA8N != 3) {
                    throw C3cG.A17(iA8N);
                }
                listA0Q = C3cJ.A0Q(c9iZ, c9j4A55, f0cArr, 3);
                i |= 8;
            }
        }
    }

    static {
        ChannelsStatusResponseJson$$serializer channelsStatusResponseJson$$serializer = new ChannelsStatusResponseJson$$serializer();
        INSTANCE = channelsStatusResponseJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.settings.ChannelsStatusResponseJson", channelsStatusResponseJson$$serializer, 4);
        c9iKA1C.A08(PairsInviteMailboxKt.OUTCOME_OK, true);
        c9iKA1C.A08("result", true);
        c9iKA1C.A08("payload", true);
        c9iKA1C.A08("channels", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = ChannelsStatusResponseJson.$childSerializers;
        C07839ix c07839ix = C07839ix.A00;
        ChannelsPayloadJson$$serializer channelsPayloadJson$$serializer = ChannelsPayloadJson$$serializer.INSTANCE;
        return new C9hr[]{c07839ix, AbstractC07749im.A00(channelsPayloadJson$$serializer), AbstractC07749im.A00(channelsPayloadJson$$serializer), C3cH.A12(f0cArr)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, ChannelsStatusResponseJson channelsStatusResponseJson) {
        AnonymousClass003.A0u(interfaceC07789is, channelsStatusResponseJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        ChannelsStatusResponseJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_settings_settings(channelsStatusResponseJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
