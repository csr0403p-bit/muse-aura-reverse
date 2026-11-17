package com.facebook.aura.partners.voice.infra;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
import X.C07799it;
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
import com.facebook.aura.conversation.repo.HatchConversationRepositoryKt;
import com.facebook.aura.feed.repo.FeedRepositoryKt;
import com.facebook.aura.partners.voice.intf.VoiceCallStateHolderKt;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes4.dex */
public final /* synthetic */ class StartCallRequestJson$$serializer implements C9cd<StartCallRequestJson> {
    public static final StartCallRequestJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final StartCallRequestJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA8f = null;
        String strA0w = null;
        Long l = null;
        String strA0w2 = null;
        Long l2 = null;
        Double d = null;
        Double d2 = null;
        String strA0i = null;
        String strA0j = null;
        String strA8f2 = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new StartCallRequestJson(i, strA8f, strA0i, strA0j, d2, d, l2, l, strA0w2, strA0w, strA8f2, (C2hx) null);
                case 0:
                    strA8f = c9j4A55.A8f(c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    strA0i = C3cI.A0i(c9iZ, c9j4A55);
                    i |= 2;
                    break;
                case 2:
                    strA0j = C3cI.A0j(c9iZ, c9j4A55);
                    i |= 4;
                    break;
                case 3:
                    d2 = (Double) c9j4A55.A8Z(C07799it.A00, c9iZ, 3);
                    i |= 8;
                    break;
                case 4:
                    d = (Double) c9j4A55.A8Z(C07799it.A00, c9iZ, 4);
                    i |= 16;
                    break;
                case 5:
                    l2 = (Long) c9j4A55.A8Z(C9j1.A00, c9iZ, 5);
                    i |= 32;
                    break;
                case 6:
                    l = (Long) c9j4A55.A8Z(C9j1.A00, c9iZ, 6);
                    i |= 64;
                    break;
                case 7:
                    strA0w2 = C3cI.A0w(c9iZ, c9j4A55, 7);
                    i |= 128;
                    break;
                case 8:
                    strA0w = C3cI.A0w(c9iZ, c9j4A55, 8);
                    i |= 256;
                    break;
                case 9:
                    strA8f2 = c9j4A55.A8f(c9iZ, 9);
                    i |= 512;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        StartCallRequestJson$$serializer startCallRequestJson$$serializer = new StartCallRequestJson$$serializer();
        INSTANCE = startCallRequestJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.partners.voice.infra.StartCallRequestJson", startCallRequestJson$$serializer, 10);
        c9iKA1C.A08(VoiceCallStateHolderKt.CALL_ID_PARAM, false);
        c9iKA1C.A08("thread_id", true);
        c9iKA1C.A08("call_server_info_data", true);
        C9iK.A06(c9iKA1C, true);
        c9iKA1C.A08(HatchConversationRepositoryKt.LOCATION_FIX_TIMESTAMP_MS_KEY, true);
        c9iKA1C.A08(HatchConversationRepositoryKt.LOCATION_UPLOAD_TIMESTAMP_MS_KEY, true);
        c9iKA1C.A08(FeedRepositoryKt.TIMEZONE_PARAM, true);
        c9iKA1C.A08("rtc_session_id", true);
        c9iKA1C.A08("call_media_type", false);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        C9hr c9hrA00 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA002 = AbstractC07749im.A00(c07779iq);
        C07799it c07799it = C07799it.A00;
        C9hr c9hrA003 = AbstractC07749im.A00(c07799it);
        C9hr c9hrA004 = AbstractC07749im.A00(c07799it);
        C9j1 c9j1 = C9j1.A00;
        return new C9hr[]{c07779iq, c9hrA00, c9hrA002, c9hrA003, c9hrA004, AbstractC07749im.A00(c9j1), AbstractC07749im.A00(c9j1), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), c07779iq};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, StartCallRequestJson startCallRequestJson) {
        AnonymousClass003.A0u(interfaceC07789is, startCallRequestJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        StartCallRequestJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_partners_voice_infra_infra(startCallRequestJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
