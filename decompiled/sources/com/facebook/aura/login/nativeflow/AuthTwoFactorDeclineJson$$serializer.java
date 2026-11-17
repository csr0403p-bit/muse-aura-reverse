package com.facebook.aura.login.nativeflow;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
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
import com.facebook.aura.user.provider.AuraViewerDataProviderKt;
import java.util.List;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class AuthTwoFactorDeclineJson$$serializer implements C9cd<AuthTwoFactorDeclineJson> {
    public static final AuthTwoFactorDeclineJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final AuthTwoFactorDeclineJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = AuthTwoFactorDeclineJson.$childSerializers;
        AuthTosConsentScreenJson authTosConsentScreenJson = null;
        String strA8f = null;
        AuthTosJson authTosJson = null;
        String strA8f2 = null;
        List listA0P = null;
        int i = 0;
        boolean zA8G = false;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new AuthTwoFactorDeclineJson(i, strA8f, zA8G, authTosJson, strA8f2, listA0P, authTosConsentScreenJson, (C2hx) null);
                case 0:
                    strA8f = c9j4A55.A8f(c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    zA8G = c9j4A55.A8G(c9iZ, 1);
                    i |= 2;
                    break;
                case 2:
                    authTosJson = (AuthTosJson) c9j4A55.A8Z(AuthTosJson$$serializer.INSTANCE, c9iZ, 2);
                    i |= 4;
                    break;
                case 3:
                    strA8f2 = c9j4A55.A8f(c9iZ, 3);
                    i |= 8;
                    break;
                case 4:
                    listA0P = C3cJ.A0P(c9iZ, c9j4A55, f0cArr, 4);
                    i |= 16;
                    break;
                case 5:
                    authTosConsentScreenJson = (AuthTosConsentScreenJson) c9j4A55.A8Z(AuthTosConsentScreenJson$$serializer.INSTANCE, c9iZ, 5);
                    i |= 32;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        AuthTwoFactorDeclineJson$$serializer authTwoFactorDeclineJson$$serializer = new AuthTwoFactorDeclineJson$$serializer();
        INSTANCE = authTwoFactorDeclineJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.login.nativeflow.AuthTwoFactorDeclineJson", authTwoFactorDeclineJson$$serializer, 6);
        c9iKA1C.A08("completion_handle", true);
        c9iKA1C.A08(AuraViewerDataProviderKt.KEY_REQUIRES_NAME, true);
        c9iKA1C.A08("tos", true);
        c9iKA1C.A08("disclosure_presentation", true);
        c9iKA1C.A08("tos_consent_items", true);
        c9iKA1C.A08("tos_consent_screen", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = AuthTwoFactorDeclineJson.$childSerializers;
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c07779iq, C07839ix.A00, AbstractC07749im.A00(AuthTosJson$$serializer.INSTANCE), c07779iq, C3cH.A13(f0cArr), AbstractC07749im.A00(AuthTosConsentScreenJson$$serializer.INSTANCE)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, AuthTwoFactorDeclineJson authTwoFactorDeclineJson) {
        AnonymousClass003.A0u(interfaceC07789is, authTwoFactorDeclineJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        AuthTwoFactorDeclineJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_api_api(authTwoFactorDeclineJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
