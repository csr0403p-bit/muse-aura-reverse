package com.facebook.aura.login.nativeflow;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
import X.C07839ix;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
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
import com.facebook.aura.analytics.hatch.caa.HatchCaaEnumsKt;
import com.facebook.aura.devices.link.ordering.HatchLinkOrderSheetKt;
import com.facebook.aura.partners.voice.chrome.VoiceConversationPresentationActionKt;
import java.util.List;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class AuthSsoExchangeRequestJson$$serializer implements C9cd<AuthSsoExchangeRequestJson> {
    public static final AuthSsoExchangeRequestJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final AuthSsoExchangeRequestJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = AuthSsoExchangeRequestJson.$childSerializers;
        String strA8f = null;
        Boolean boolA0L = null;
        String strA0v = null;
        List listA0Q = null;
        String strA0g = null;
        String str = null;
        String strA0g2 = null;
        String strA0k = null;
        String strA0j = null;
        String strA0h = null;
        int i = 0;
        boolean zA8G = false;
        boolean zA8G2 = false;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new AuthSsoExchangeRequestJson(i, strA8f, strA0h, strA0j, strA0k, zA8G2, zA8G, strA0g2, strA0g, str, listA0Q, strA0v, boolA0L, (C2hx) null);
                case 0:
                    strA8f = c9j4A55.A8f(c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    strA0h = C3cH.A0h(c9iZ, c9j4A55);
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
                    zA8G2 = c9j4A55.A8G(c9iZ, 4);
                    i |= 16;
                    break;
                case 5:
                    zA8G = c9j4A55.A8G(c9iZ, 5);
                    i |= 32;
                    break;
                case 6:
                    strA0g2 = C3cH.A0g(C07779iq.A01, c9iZ, c9j4A55, 6);
                    i |= 64;
                    break;
                case 7:
                    strA0g = C3cH.A0g(C07779iq.A01, c9iZ, c9j4A55, 7);
                    i |= 128;
                    break;
                case 8:
                    str = (String) C3cI.A0U(c9iZ, c9j4A55);
                    i |= 256;
                    break;
                case 9:
                    listA0Q = C3cJ.A0Q(c9iZ, c9j4A55, f0cArr, 9);
                    i |= 512;
                    break;
                case 10:
                    strA0v = C3cI.A0v(c9iZ, c9j4A55, 10);
                    i |= 1024;
                    break;
                case 11:
                    boolA0L = C3cI.A0L(c9iZ, c9j4A55, 11);
                    i |= 2048;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        AuthSsoExchangeRequestJson$$serializer authSsoExchangeRequestJson$$serializer = new AuthSsoExchangeRequestJson$$serializer();
        INSTANCE = authSsoExchangeRequestJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.login.nativeflow.AuthSsoExchangeRequestJson", authSsoExchangeRequestJson$$serializer, 12);
        c9iKA1C.A08(VoiceConversationPresentationActionKt.SOURCE_APP_ANNOTATION, false);
        c9iKA1C.A08(NativeLoginCheckpointContinuationKt.ACCESS_TOKEN_PARAM, false);
        c9iKA1C.A08("device_id", true);
        c9iKA1C.A08("waterfall_id", true);
        c9iKA1C.A08("supports_name_completion", true);
        c9iKA1C.A08("supports_login_name_completion", true);
        c9iKA1C.A08(HatchLinkOrderSheetKt.FIRST_NAME, true);
        c9iKA1C.A08(HatchLinkOrderSheetKt.LAST_NAME, true);
        c9iKA1C.A08(HatchCaaEnumsKt.TOS_CONTENT_VERSION_KEY, true);
        c9iKA1C.A08("supported_disclosure_presentations", true);
        c9iKA1C.A08("linking_disclosure_version", true);
        c9iKA1C.A08("supports_direct_ntp_upsell", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = AuthSsoExchangeRequestJson.$childSerializers;
        C07779iq c07779iq = C07779iq.A01;
        C9hr c9hrA00 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA002 = AbstractC07749im.A00(c07779iq);
        C07839ix c07839ix = C07839ix.A00;
        return new C9hr[]{c07779iq, c07779iq, c9hrA00, c9hrA002, c07839ix, c07839ix, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), C3cG.A16(f0cArr, 9), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07839ix)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, AuthSsoExchangeRequestJson authSsoExchangeRequestJson) {
        AnonymousClass003.A0u(interfaceC07789is, authSsoExchangeRequestJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        AuthSsoExchangeRequestJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_api_api(authSsoExchangeRequestJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
