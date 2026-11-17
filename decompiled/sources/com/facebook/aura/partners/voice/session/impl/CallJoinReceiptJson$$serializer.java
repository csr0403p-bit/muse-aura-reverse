package com.facebook.aura.partners.voice.session.impl;

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
/* loaded from: classes4.dex */
public final /* synthetic */ class CallJoinReceiptJson$$serializer implements C9cd<CallJoinReceiptJson> {
    public static final CallJoinReceiptJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final CallJoinReceiptJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA0w = null;
        String strA0w2 = null;
        String strA0n = null;
        String strA0o = null;
        CallPortraitJson callPortraitJson = null;
        String strA0k = null;
        String strA0j = null;
        String strA0i = null;
        boolean zA8G = false;
        boolean zA8G2 = false;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new CallJoinReceiptJson(i, zA8G, strA0i, strA0j, strA0k, callPortraitJson, zA8G2, strA0n, strA0o, strA0w2, strA0w, (C2hx) null);
                case 0:
                    zA8G = c9j4A55.A8G(c9iZ, 0);
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
                    callPortraitJson = (CallPortraitJson) c9j4A55.A8Z(CallPortraitJson$$serializer.INSTANCE, c9iZ, 4);
                    i |= 16;
                    break;
                case 5:
                    zA8G2 = c9j4A55.A8G(c9iZ, 5);
                    i |= 32;
                    break;
                case 6:
                    strA0n = C3cI.A0n(c9iZ, c9j4A55);
                    i |= 64;
                    break;
                case 7:
                    strA0o = C3cI.A0o(c9iZ, c9j4A55);
                    i |= 128;
                    break;
                case 8:
                    strA0w2 = C3cI.A0w(c9iZ, c9j4A55, 8);
                    i |= 256;
                    break;
                case 9:
                    strA0w = C3cI.A0w(c9iZ, c9j4A55, 9);
                    i |= 512;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        CallJoinReceiptJson$$serializer callJoinReceiptJson$$serializer = new CallJoinReceiptJson$$serializer();
        INSTANCE = callJoinReceiptJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.partners.voice.session.impl.CallJoinReceiptJson", callJoinReceiptJson$$serializer, 10);
        c9iKA1C.A08(PairsInviteMailboxKt.OUTCOME_OK, true);
        c9iKA1C.A08(VoiceCallStateHolderKt.CALL_ID_PARAM, true);
        c9iKA1C.A08("call_media_type", true);
        c9iKA1C.A08("audio_only_reason", true);
        c9iKA1C.A08("call_portrait", true);
        c9iKA1C.A08("avatar_updating", true);
        c9iKA1C.A08("avatar_updating_presentation", true);
        c9iKA1C.A08("avatar_updating_stem", true);
        c9iKA1C.A08("previous_avatar_stem", true);
        c9iKA1C.A08("previous_avatar_image_path", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07839ix c07839ix = C07839ix.A00;
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c07839ix, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(CallPortraitJson$$serializer.INSTANCE), c07839ix, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, CallJoinReceiptJson callJoinReceiptJson) {
        AnonymousClass003.A0u(interfaceC07789is, callJoinReceiptJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        CallJoinReceiptJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_partners_voice_session_impl_impl(callJoinReceiptJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
