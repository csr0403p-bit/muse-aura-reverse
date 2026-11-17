package com.facebook.aura.partners.voice.infra;

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
import X.C9j4;
import X.C9j5;
import X.Hs1;
import X.InterfaceC07789is;
import X.InterfaceC07829iw;
import com.facebook.aura.pairs.PairsInviteMailboxKt;
import com.facebook.aura.partners.voice.intf.VoiceCallStateHolderKt;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class StartCallResponseJson$$serializer implements C9cd<StartCallResponseJson> {
    public static final StartCallResponseJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final StartCallResponseJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA0v = null;
        String strA0v2 = null;
        boolean zA8G = false;
        boolean zA8G2 = false;
        boolean zA8G3 = false;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new StartCallResponseJson(i, zA8G, strA0v, strA0v2, zA8G2, zA8G3, (C2hx) null);
            }
            if (iA8N == 0) {
                zA8G = c9j4A55.A8G(c9iZ, 0);
                i |= 1;
            } else if (iA8N == 1) {
                strA0v = C3cI.A0v(c9iZ, c9j4A55, 1);
                i |= 2;
            } else if (iA8N == 2) {
                strA0v2 = C3cI.A0v(c9iZ, c9j4A55, 2);
                i |= 4;
            } else if (iA8N == 3) {
                zA8G2 = c9j4A55.A8G(c9iZ, 3);
                i |= 8;
            } else {
                if (iA8N != 4) {
                    throw C3cG.A17(iA8N);
                }
                zA8G3 = c9j4A55.A8G(c9iZ, 4);
                i |= 16;
            }
        }
    }

    static {
        StartCallResponseJson$$serializer startCallResponseJson$$serializer = new StartCallResponseJson$$serializer();
        INSTANCE = startCallResponseJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.partners.voice.infra.StartCallResponseJson", startCallResponseJson$$serializer, 5);
        c9iKA1C.A08(PairsInviteMailboxKt.OUTCOME_OK, true);
        c9iKA1C.A08(VoiceCallStateHolderKt.CALL_ID_PARAM, true);
        c9iKA1C.A08("session_id", true);
        c9iKA1C.A08("preempted", true);
        c9iKA1C.A08("avatar_updating", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07839ix c07839ix = C07839ix.A00;
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c07839ix, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), c07839ix, c07839ix};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, StartCallResponseJson startCallResponseJson) {
        AnonymousClass003.A0u(interfaceC07789is, startCallResponseJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        StartCallResponseJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_partners_voice_infra_infra(startCallResponseJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
