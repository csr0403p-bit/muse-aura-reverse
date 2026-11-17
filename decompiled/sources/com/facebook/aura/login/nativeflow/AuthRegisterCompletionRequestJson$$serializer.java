package com.facebook.aura.login.nativeflow;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
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
import com.facebook.aura.analytics.hatch.caa.HatchCaaEnumsKt;
import com.facebook.aura.devices.link.ordering.HatchLinkOrderSheetKt;
import com.facebook.aura.perf.HatchConnectorQplLogger;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class AuthRegisterCompletionRequestJson$$serializer implements C9cd<AuthRegisterCompletionRequestJson> {
    public static final AuthRegisterCompletionRequestJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final AuthRegisterCompletionRequestJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA8f = null;
        AuthRegistrationAttestationJson authRegistrationAttestationJson = null;
        String strA0v = null;
        String str = null;
        String strA0g = null;
        String strA0o = null;
        String strA0m = null;
        String strA0l = null;
        String strA0j = null;
        String strA0h = null;
        String strA8f2 = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new AuthRegisterCompletionRequestJson(i, strA8f, strA0h, strA0j, strA8f2, strA0l, strA0m, strA0g, strA0o, str, strA0v, authRegistrationAttestationJson, (C2hx) null);
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
                    strA8f2 = c9j4A55.A8f(c9iZ, 3);
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
                    strA0g = C3cH.A0g(C07779iq.A01, c9iZ, c9j4A55, 6);
                    i |= 64;
                    break;
                case 7:
                    strA0o = C3cI.A0o(c9iZ, c9j4A55);
                    i |= 128;
                    break;
                case 8:
                    str = (String) C3cI.A0U(c9iZ, c9j4A55);
                    i |= 256;
                    break;
                case 9:
                    strA0v = C3cI.A0v(c9iZ, c9j4A55, 9);
                    i |= 512;
                    break;
                case 10:
                    authRegistrationAttestationJson = (AuthRegistrationAttestationJson) c9j4A55.A8Z(AuthRegistrationAttestationJson$$serializer.INSTANCE, c9iZ, 10);
                    i |= 1024;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        AuthRegisterCompletionRequestJson$$serializer authRegisterCompletionRequestJson$$serializer = new AuthRegisterCompletionRequestJson$$serializer();
        INSTANCE = authRegisterCompletionRequestJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.login.nativeflow.AuthRegisterCompletionRequestJson", authRegisterCompletionRequestJson$$serializer, 11);
        c9iKA1C.A08("completion_handle", false);
        c9iKA1C.A08("contact_point", false);
        c9iKA1C.A08("region", false);
        c9iKA1C.A08("date_of_birth", false);
        c9iKA1C.A08(HatchLinkOrderSheetKt.FIRST_NAME, true);
        c9iKA1C.A08(HatchLinkOrderSheetKt.LAST_NAME, true);
        c9iKA1C.A08(HatchConnectorQplLogger.AuthType.PASSWORD, true);
        C3cH.A1D(HatchCaaEnumsKt.TOS_CONTENT_VERSION_KEY, c9iKA1C);
        c9iKA1C.A08("attestation", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c07779iq, c07779iq, AbstractC07749im.A00(c07779iq), c07779iq, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(AuthRegistrationAttestationJson$$serializer.INSTANCE)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, AuthRegisterCompletionRequestJson authRegisterCompletionRequestJson) {
        AnonymousClass003.A0u(interfaceC07789is, authRegisterCompletionRequestJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        AuthRegisterCompletionRequestJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_api_api(authRegisterCompletionRequestJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
