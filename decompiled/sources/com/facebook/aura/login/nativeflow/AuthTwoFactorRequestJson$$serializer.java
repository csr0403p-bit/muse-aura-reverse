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
import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;
import java.util.List;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class AuthTwoFactorRequestJson$$serializer implements C9cd<AuthTwoFactorRequestJson> {
    public static final AuthTwoFactorRequestJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final AuthTwoFactorRequestJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = AuthTwoFactorRequestJson.$childSerializers;
        String strA0w = null;
        String strA0n = null;
        AuthRegistrationAttestationJson authRegistrationAttestationJson = null;
        String strA0w2 = null;
        List listA0P = null;
        List listA0P2 = null;
        String strA8f = null;
        String strA0h = null;
        String strA0i = null;
        boolean zA8G = false;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new AuthTwoFactorRequestJson(i, strA8f, strA0h, strA0i, zA8G, listA0P2, listA0P, strA0n, strA0w, strA0w2, authRegistrationAttestationJson, (C2hx) null);
                case 0:
                    strA8f = c9j4A55.A8f(c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    strA0h = C3cH.A0h(c9iZ, c9j4A55);
                    i |= 2;
                    break;
                case 2:
                    strA0i = C3cH.A0i(c9iZ, c9j4A55);
                    i |= 4;
                    break;
                case 3:
                    zA8G = c9j4A55.A8G(c9iZ, 3);
                    i |= 8;
                    break;
                case 4:
                    listA0P2 = C3cJ.A0P(c9iZ, c9j4A55, f0cArr, 4);
                    i |= 16;
                    break;
                case 5:
                    listA0P = C3cJ.A0P(c9iZ, c9j4A55, f0cArr, 5);
                    i |= 32;
                    break;
                case 6:
                    strA0n = C3cI.A0n(c9iZ, c9j4A55);
                    i |= 64;
                    break;
                case 7:
                    strA0w = C3cI.A0w(c9iZ, c9j4A55, 7);
                    i |= 128;
                    break;
                case 8:
                    strA0w2 = C3cI.A0w(c9iZ, c9j4A55, 8);
                    i |= 256;
                    break;
                case 9:
                    authRegistrationAttestationJson = (AuthRegistrationAttestationJson) c9j4A55.A8Z(AuthRegistrationAttestationJson$$serializer.INSTANCE, c9iZ, 9);
                    i |= 512;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        AuthTwoFactorRequestJson$$serializer authTwoFactorRequestJson$$serializer = new AuthTwoFactorRequestJson$$serializer();
        INSTANCE = authTwoFactorRequestJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.login.nativeflow.AuthTwoFactorRequestJson", authTwoFactorRequestJson$$serializer, 10);
        c9iKA1C.A08("two_factor_state", false);
        c9iKA1C.A08("method_id", false);
        c9iKA1C.A08(AuraDeeplinkRouteMapper.CODE_PARAM, false);
        c9iKA1C.A08("supports_reactivation", true);
        c9iKA1C.A08("supported_disclosure_presentations", true);
        c9iKA1C.A08("supported_ntp_upsell_disclosure_presentations", true);
        C3cH.A1D(HatchCaaEnumsKt.TOS_CONTENT_VERSION_KEY, c9iKA1C);
        c9iKA1C.A08("attestation", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = AuthTwoFactorRequestJson.$childSerializers;
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c07779iq, c07779iq, c07779iq, C07839ix.A00, C3cH.A13(f0cArr), C3cG.A16(f0cArr, 5), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(AuthRegistrationAttestationJson$$serializer.INSTANCE)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, AuthTwoFactorRequestJson authTwoFactorRequestJson) {
        AnonymousClass003.A0u(interfaceC07789is, authTwoFactorRequestJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        AuthTwoFactorRequestJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_api_api(authTwoFactorRequestJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
