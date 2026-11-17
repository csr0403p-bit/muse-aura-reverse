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
public final /* synthetic */ class AuthRegisterCompletionLinkedRequestJson$$serializer implements C9cd<AuthRegisterCompletionLinkedRequestJson> {
    public static final AuthRegisterCompletionLinkedRequestJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final AuthRegisterCompletionLinkedRequestJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = AuthRegisterCompletionLinkedRequestJson.$childSerializers;
        String str = null;
        List list = null;
        String strA0h = null;
        String strA0n = null;
        String strA0l = null;
        AuthRegistrationAttestationJson authRegistrationAttestationJson = null;
        String strA0k = null;
        String strA0j = null;
        String strA8f = null;
        int i = 0;
        boolean zA8G = false;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new AuthRegisterCompletionLinkedRequestJson(i, strA8f, zA8G, strA0j, strA0k, strA0l, strA0h, strA0n, list, str, authRegistrationAttestationJson, (C2hx) null);
                case 0:
                    strA8f = c9j4A55.A8f(c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    zA8G = c9j4A55.A8G(c9iZ, 1);
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
                    strA0h = C3cI.A0h(c9iZ, c9j4A55);
                    i |= 32;
                    break;
                case 6:
                    strA0n = C3cI.A0n(c9iZ, c9j4A55);
                    i |= 64;
                    break;
                case 7:
                    list = (List) C3cJ.A0G(c9iZ, c9j4A55, f0cArr, 7);
                    i |= 128;
                    break;
                case 8:
                    str = (String) C3cI.A0U(c9iZ, c9j4A55);
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
        AuthRegisterCompletionLinkedRequestJson$$serializer authRegisterCompletionLinkedRequestJson$$serializer = new AuthRegisterCompletionLinkedRequestJson$$serializer();
        INSTANCE = authRegisterCompletionLinkedRequestJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.login.nativeflow.AuthRegisterCompletionLinkedRequestJson", authRegisterCompletionLinkedRequestJson$$serializer, 10);
        c9iKA1C.A08("link_handle", false);
        c9iKA1C.A08("supports_registration_recovery", true);
        c9iKA1C.A08("contact_point", true);
        c9iKA1C.A08("region", false);
        C3cH.A1D(HatchCaaEnumsKt.TOS_CONTENT_VERSION_KEY, c9iKA1C);
        c9iKA1C.A08("supported_disclosure_presentations", true);
        c9iKA1C.A08("linking_disclosure_version", true);
        c9iKA1C.A08("attestation", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = AuthRegisterCompletionLinkedRequestJson.$childSerializers;
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c07779iq, C07839ix.A00, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), C3cH.A14(f0cArr, 7), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(AuthRegistrationAttestationJson$$serializer.INSTANCE)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, AuthRegisterCompletionLinkedRequestJson authRegisterCompletionLinkedRequestJson) {
        AnonymousClass003.A0u(interfaceC07789is, authRegisterCompletionLinkedRequestJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        AuthRegisterCompletionLinkedRequestJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_api_api(authRegisterCompletionLinkedRequestJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
