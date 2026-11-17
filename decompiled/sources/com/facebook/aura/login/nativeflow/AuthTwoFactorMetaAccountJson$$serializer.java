package com.facebook.aura.login.nativeflow;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
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
import com.facebook.aura.partners.voice.chrome.VoiceConversationPresentationActionKt;
import java.util.List;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class AuthTwoFactorMetaAccountJson$$serializer implements C9cd<AuthTwoFactorMetaAccountJson> {
    public static final AuthTwoFactorMetaAccountJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final AuthTwoFactorMetaAccountJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = AuthTwoFactorMetaAccountJson.$childSerializers;
        String strA0v = null;
        String strA0v2 = null;
        List listA0Q = null;
        AuthTosJson authTosJson = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new AuthTwoFactorMetaAccountJson(i, strA0v, strA0v2, listA0Q, authTosJson, (C2hx) null);
            }
            if (iA8N == 0) {
                strA0v = C3cI.A0v(c9iZ, c9j4A55, 0);
                i |= 1;
            } else if (iA8N == 1) {
                strA0v2 = C3cI.A0v(c9iZ, c9j4A55, 1);
                i |= 2;
            } else if (iA8N == 2) {
                listA0Q = C3cJ.A0Q(c9iZ, c9j4A55, f0cArr, 2);
                i |= 4;
            } else {
                if (iA8N != 3) {
                    throw C3cG.A17(iA8N);
                }
                authTosJson = (AuthTosJson) c9j4A55.A8Z(AuthTosJson$$serializer.INSTANCE, c9iZ, 3);
                i |= 8;
            }
        }
    }

    static {
        AuthTwoFactorMetaAccountJson$$serializer authTwoFactorMetaAccountJson$$serializer = new AuthTwoFactorMetaAccountJson$$serializer();
        INSTANCE = authTwoFactorMetaAccountJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.login.nativeflow.AuthTwoFactorMetaAccountJson", authTwoFactorMetaAccountJson$$serializer, 4);
        C3cJ.A0o(VoiceConversationPresentationActionKt.SOURCE_APP_ANNOTATION, c9iKA1C);
        c9iKA1C.A08("tos", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = AuthTwoFactorMetaAccountJson.$childSerializers;
        C07779iq c07779iq = C07779iq.A01;
        return C3cH.A1a(AuthTosJson$$serializer.INSTANCE, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), C3cH.A11(f0cArr));
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
    public final void serialize(InterfaceC07789is interfaceC07789is, AuthTwoFactorMetaAccountJson authTwoFactorMetaAccountJson) {
        AnonymousClass003.A0u(interfaceC07789is, authTwoFactorMetaAccountJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        AuthTwoFactorMetaAccountJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_api_api(authTwoFactorMetaAccountJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
