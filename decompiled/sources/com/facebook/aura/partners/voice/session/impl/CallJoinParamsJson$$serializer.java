package com.facebook.aura.partners.voice.session.impl;

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
import X.C9j4;
import X.C9j5;
import X.Hs1;
import X.InterfaceC07789is;
import X.InterfaceC07829iw;
import com.facebook.aura.feed.repo.FeedRepositoryKt;
import com.facebook.aura.partners.voice.intf.VoiceCallStateHolderKt;
import com.facebook.aura.shopping.repo.MarketplaceDetailsNormalizationKt;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes4.dex */
public final /* synthetic */ class CallJoinParamsJson$$serializer implements C9cd<CallJoinParamsJson> {
    public static final CallJoinParamsJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final CallJoinParamsJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA0g = null;
        String strA0k = null;
        String strA0j = null;
        String strA0t = null;
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        CallJoinLocationJson callJoinLocationJson = null;
        String strA0n = null;
        String strA0l = null;
        String strA0q = null;
        String strA0m = null;
        String strA8f = null;
        String strA8f2 = null;
        String str = null;
        String strA0i = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new CallJoinParamsJson(i, strA8f, strA0i, strA0j, strA0k, strA0l, strA0m, strA0n, callJoinLocationJson, strA8f2, bool3, strA0q, bool2, bool, strA0t, str, strA0g, (C2hx) null);
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
                    strA0k = C3cI.A0k(c9iZ, c9j4A55);
                    i |= 8;
                    break;
                case 4:
                    strA0l = C3cI.A0l(c9iZ, c9j4A55);
                    i |= 16;
                    break;
                case 5:
                    strA0m = C3cI.A0m(c9iZ, c9j4A55);
                    i |= 32;
                    break;
                case 6:
                    strA0n = C3cI.A0n(c9iZ, c9j4A55);
                    i |= 64;
                    break;
                case 7:
                    callJoinLocationJson = (CallJoinLocationJson) c9j4A55.A8Z(CallJoinLocationJson$$serializer.INSTANCE, c9iZ, 7);
                    i |= 128;
                    break;
                case 8:
                    strA8f2 = c9j4A55.A8f(c9iZ, 8);
                    i |= 256;
                    break;
                case 9:
                    bool3 = (Boolean) c9j4A55.A8Z(C07839ix.A00, c9iZ, 9);
                    i |= 512;
                    break;
                case 10:
                    strA0q = C3cI.A0q(c9iZ, c9j4A55);
                    i |= 1024;
                    break;
                case 11:
                    bool2 = (Boolean) c9j4A55.A8Z(C07839ix.A00, c9iZ, 11);
                    i |= 2048;
                    break;
                case 12:
                    bool = (Boolean) c9j4A55.A8Z(C07839ix.A00, c9iZ, 12);
                    i |= 4096;
                    break;
                case 13:
                    strA0t = C3cI.A0t(c9iZ, c9j4A55);
                    i |= 8192;
                    break;
                case 14:
                    str = (String) c9j4A55.A8Z(C07779iq.A01, c9iZ, 14);
                    i |= 16384;
                    break;
                case 15:
                    strA0g = C3cH.A0g(C07779iq.A01, c9iZ, c9j4A55, 15);
                    i |= 32768;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        CallJoinParamsJson$$serializer callJoinParamsJson$$serializer = new CallJoinParamsJson$$serializer();
        INSTANCE = callJoinParamsJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.partners.voice.session.impl.CallJoinParamsJson", callJoinParamsJson$$serializer, 16);
        c9iKA1C.A08("payload_b64", true);
        c9iKA1C.A08("rtc_session_id", true);
        c9iKA1C.A08(VoiceCallStateHolderKt.CALL_ID_PARAM, true);
        c9iKA1C.A08("thread_id", true);
        c9iKA1C.A08("device", true);
        c9iKA1C.A08("device_id", true);
        c9iKA1C.A08(FeedRepositoryKt.TIMEZONE_PARAM, true);
        c9iKA1C.A08(MarketplaceDetailsNormalizationKt.LOCATION_VARIANT_LABEL, true);
        c9iKA1C.A08("call_media_type", false);
        c9iKA1C.A08("enable_media_to_cosmos", true);
        c9iKA1C.A08("call_server_info_data", true);
        c9iKA1C.A08("defer_companion_setup", true);
        c9iKA1C.A08("spoken_timing", true);
        c9iKA1C.A08("audio_only_subreason", true);
        c9iKA1C.A08("entry_point", true);
        c9iKA1C.A08("avatar_appearance", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        C9hr c9hrA00 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA002 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA003 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA004 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA005 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA006 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA007 = AbstractC07749im.A00(CallJoinLocationJson$$serializer.INSTANCE);
        C07839ix c07839ix = C07839ix.A00;
        return new C9hr[]{c07779iq, c9hrA00, c9hrA002, c9hrA003, c9hrA004, c9hrA005, c9hrA006, c9hrA007, c07779iq, AbstractC07749im.A00(c07839ix), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07839ix), AbstractC07749im.A00(c07839ix), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, CallJoinParamsJson callJoinParamsJson) {
        AnonymousClass003.A0u(interfaceC07789is, callJoinParamsJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        CallJoinParamsJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_partners_voice_session_impl_impl(callJoinParamsJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
