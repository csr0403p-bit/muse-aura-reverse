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
import java.util.List;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class AuthSendOtpRequestJson$$serializer implements C9cd<AuthSendOtpRequestJson> {
    public static final AuthSendOtpRequestJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final AuthSendOtpRequestJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = AuthSendOtpRequestJson.$childSerializers;
        int i = 0;
        String strA0v = null;
        List listA0Q = null;
        String strA0v2 = null;
        String strA0k = null;
        String strA0j = null;
        String strA8f = null;
        String strA0f = null;
        boolean zA8G = false;
        boolean zA8G2 = false;
        boolean zA8G3 = false;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new AuthSendOtpRequestJson(i, strA8f, strA0f, strA0j, strA0k, zA8G3, zA8G2, listA0Q, zA8G, strA0v2, strA0v, (C2hx) null);
                case 0:
                    strA8f = c9j4A55.A8f(c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    strA0f = C3cI.A0f(c9iZ, c9j4A55);
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
                    zA8G3 = c9j4A55.A8G(c9iZ, 4);
                    i |= 16;
                    break;
                case 5:
                    zA8G2 = c9j4A55.A8G(c9iZ, 5);
                    i |= 32;
                    break;
                case 6:
                    listA0Q = C3cJ.A0Q(c9iZ, c9j4A55, f0cArr, 6);
                    i |= 64;
                    break;
                case 7:
                    zA8G = c9j4A55.A8G(c9iZ, 7);
                    i |= 128;
                    break;
                case 8:
                    strA0v2 = C3cI.A0v(c9iZ, c9j4A55, 8);
                    i |= 256;
                    break;
                case 9:
                    strA0v = C3cI.A0v(c9iZ, c9j4A55, 9);
                    i |= 512;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        AuthSendOtpRequestJson$$serializer authSendOtpRequestJson$$serializer = new AuthSendOtpRequestJson$$serializer();
        INSTANCE = authSendOtpRequestJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.login.nativeflow.AuthSendOtpRequestJson", authSendOtpRequestJson$$serializer, 10);
        c9iKA1C.A08("contact_point", false);
        c9iKA1C.A08("region", false);
        c9iKA1C.A08("auth_state", true);
        c9iKA1C.A08(HatchCaaEnumsKt.REGISTRATION_SOURCE_KEY, true);
        c9iKA1C.A08("supports_xapp_two_factor_ntp_upsell", true);
        c9iKA1C.A08("supports_ntp_upsell_account_choice", true);
        c9iKA1C.A08("supported_landing_presentations", true);
        C3cH.A1D("supports_meta_two_factor", c9iKA1C);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = AuthSendOtpRequestJson.$childSerializers;
        C07779iq c07779iq = C07779iq.A01;
        C9hr c9hrA00 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA002 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA003 = AbstractC07749im.A00(c07779iq);
        C07839ix c07839ix = C07839ix.A00;
        return new C9hr[]{c07779iq, c9hrA00, c9hrA002, c9hrA003, c07839ix, c07839ix, C3cG.A16(f0cArr, 6), c07839ix, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, AuthSendOtpRequestJson authSendOtpRequestJson) {
        AnonymousClass003.A0u(interfaceC07789is, authSendOtpRequestJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        AuthSendOtpRequestJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_api_api(authSendOtpRequestJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
