package com.facebook.aura.login.nativeflow;

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
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class AuthNtpUpsellJson$$serializer implements C9cd<AuthNtpUpsellJson> {
    public static final AuthNtpUpsellJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final AuthNtpUpsellJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        AuthTosJson authTosJson = null;
        AuthNtpUpsellAccountJson authNtpUpsellAccountJson = null;
        String strA8f = null;
        String strA0i = null;
        String strA8f2 = null;
        boolean zA8G = false;
        boolean zA8G2 = false;
        boolean zA8G3 = false;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new AuthNtpUpsellJson(i, strA8f, strA0i, authNtpUpsellAccountJson, authTosJson, zA8G3, zA8G2, zA8G, strA8f2, (C2hx) null);
                case 0:
                    strA8f = c9j4A55.A8f(c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    strA0i = C3cI.A0i(c9iZ, c9j4A55);
                    i |= 2;
                    break;
                case 2:
                    authNtpUpsellAccountJson = (AuthNtpUpsellAccountJson) c9j4A55.A8Z(AuthNtpUpsellAccountJson$$serializer.INSTANCE, c9iZ, 2);
                    i |= 4;
                    break;
                case 3:
                    authTosJson = (AuthTosJson) c9j4A55.A8Z(AuthTosJson$$serializer.INSTANCE, c9iZ, 3);
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
                    zA8G = c9j4A55.A8G(c9iZ, 6);
                    i |= 64;
                    break;
                case 7:
                    strA8f2 = c9j4A55.A8f(c9iZ, 7);
                    i |= 128;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        AuthNtpUpsellJson$$serializer authNtpUpsellJson$$serializer = new AuthNtpUpsellJson$$serializer();
        INSTANCE = authNtpUpsellJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.login.nativeflow.AuthNtpUpsellJson", authNtpUpsellJson$$serializer, 8);
        c9iKA1C.A08("link_handle", true);
        c9iKA1C.A08("contact_point", true);
        c9iKA1C.A08("account", true);
        c9iKA1C.A08("tos", true);
        c9iKA1C.A08("show_muse_transparency", true);
        c9iKA1C.A08("is_f3", true);
        c9iKA1C.A08("suppress_tos_clause", true);
        c9iKA1C.A08("landing_presentation", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        C9hr c9hrA00 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA002 = AbstractC07749im.A00(AuthNtpUpsellAccountJson$$serializer.INSTANCE);
        C9hr c9hrA003 = AbstractC07749im.A00(AuthTosJson$$serializer.INSTANCE);
        C07839ix c07839ix = C07839ix.A00;
        return new C9hr[]{c07779iq, c9hrA00, c9hrA002, c9hrA003, c07839ix, c07839ix, c07839ix, c07779iq};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, AuthNtpUpsellJson authNtpUpsellJson) {
        AnonymousClass003.A0u(interfaceC07789is, authNtpUpsellJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        AuthNtpUpsellJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_api_api(authNtpUpsellJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
