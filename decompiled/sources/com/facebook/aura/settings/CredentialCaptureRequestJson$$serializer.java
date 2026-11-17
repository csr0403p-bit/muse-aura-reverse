package com.facebook.aura.settings;

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
import X.F0C;
import X.Hs1;
import X.InterfaceC07789is;
import X.InterfaceC07829iw;
import com.facebook.aura.deeplink.BrowserCredentialsDeeplink;
import com.facebook.aura.gateway.HatchColdCvmLeaseKt;
import com.facebook.aura.onepassword.OnePasswordCredentialsKt;
import java.util.List;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class CredentialCaptureRequestJson$$serializer implements C9cd<CredentialCaptureRequestJson> {
    public static final int $stable = 0;
    public static final CredentialCaptureRequestJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final CredentialCaptureRequestJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = CredentialCaptureRequestJson.$childSerializers;
        String strA8f = null;
        String strA0w = null;
        String strA0w2 = null;
        String strA0w3 = null;
        List list = null;
        String strA0k = null;
        String strA0h = null;
        String strA0j = null;
        String strA8f2 = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new CredentialCaptureRequestJson(i, strA8f, strA0h, strA0j, strA0k, list, strA8f2, strA0w2, strA0w, strA0w3, (C2hx) null);
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
                    list = (List) c9j4A55.A8Z(f0cArr[4].getValue(), c9iZ, 4);
                    i |= 16;
                    break;
                case 5:
                    strA8f2 = c9j4A55.A8f(c9iZ, 5);
                    i |= 32;
                    break;
                case 6:
                    strA0w2 = C3cI.A0w(c9iZ, c9j4A55, 6);
                    i |= 64;
                    break;
                case 7:
                    strA0w = C3cI.A0w(c9iZ, c9j4A55, 7);
                    i |= 128;
                    break;
                case 8:
                    strA0w3 = C3cI.A0w(c9iZ, c9j4A55, 8);
                    i |= 256;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        CredentialCaptureRequestJson$$serializer credentialCaptureRequestJson$$serializer = new CredentialCaptureRequestJson$$serializer();
        INSTANCE = credentialCaptureRequestJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.settings.CredentialCaptureRequestJson", credentialCaptureRequestJson$$serializer, 9);
        c9iKA1C.A08(BrowserCredentialsDeeplink.PAGE_URL_FRAGMENT_NAME, false);
        c9iKA1C.A08(HatchColdCvmLeaseKt.KEY_IDEMPOTENCY_KEY, false);
        C3cI.A1P(BrowserCredentialsDeeplink.CAPTURE_AUTHORIZATION_FRAGMENT_NAME, c9iKA1C, true);
        c9iKA1C.A08("fields", true);
        c9iKA1C.A08("lifetime", true);
        c9iKA1C.A08("session_id", true);
        c9iKA1C.A08("auth_provider", true);
        c9iKA1C.A08(OnePasswordCredentialsKt.GRANT_FIELD_NAME, true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = CredentialCaptureRequestJson.$childSerializers;
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c07779iq, c07779iq, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), C3cH.A14(f0cArr, 4), c07779iq, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, CredentialCaptureRequestJson credentialCaptureRequestJson) {
        AnonymousClass003.A0u(interfaceC07789is, credentialCaptureRequestJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        CredentialCaptureRequestJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_settings_settings(credentialCaptureRequestJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
