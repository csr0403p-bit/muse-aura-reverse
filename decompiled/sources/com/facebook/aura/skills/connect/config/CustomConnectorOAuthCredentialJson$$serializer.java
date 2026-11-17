package com.facebook.aura.skills.connect.config;

import X.AnonymousClass003;
import X.C07779iq;
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
import java.util.List;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes4.dex */
public final /* synthetic */ class CustomConnectorOAuthCredentialJson$$serializer implements C9cd<CustomConnectorOAuthCredentialJson> {
    public static final CustomConnectorOAuthCredentialJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final CustomConnectorOAuthCredentialJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = CustomConnectorOAuthCredentialJson.$childSerializers;
        String strA8f = null;
        List listA0Q = null;
        CustomConnectorOAuthDetailsJson customConnectorOAuthDetailsJson = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new CustomConnectorOAuthCredentialJson(i, strA8f, listA0Q, customConnectorOAuthDetailsJson, (C2hx) null);
            }
            if (iA8N == 0) {
                strA8f = c9j4A55.A8f(c9iZ, 0);
                i |= 1;
            } else if (iA8N == 1) {
                listA0Q = C3cJ.A0Q(c9iZ, c9j4A55, f0cArr, 1);
                i |= 2;
            } else {
                if (iA8N != 2) {
                    throw C3cG.A17(iA8N);
                }
                customConnectorOAuthDetailsJson = (CustomConnectorOAuthDetailsJson) c9j4A55.A8a(CustomConnectorOAuthDetailsJson$$serializer.INSTANCE, c9iZ, 2);
                i |= 4;
            }
        }
    }

    static {
        CustomConnectorOAuthCredentialJson$$serializer customConnectorOAuthCredentialJson$$serializer = new CustomConnectorOAuthCredentialJson$$serializer();
        INSTANCE = customConnectorOAuthCredentialJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.skills.connect.config.CustomConnectorOAuthCredentialJson", customConnectorOAuthCredentialJson$$serializer, 3);
        c9iKA1C.A08("name", true);
        c9iKA1C.A08("domains", true);
        c9iKA1C.A08("oauth", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        return new C9hr[]{C07779iq.A01, C3cH.A10(CustomConnectorOAuthCredentialJson.$childSerializers), CustomConnectorOAuthDetailsJson$$serializer.INSTANCE};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, CustomConnectorOAuthCredentialJson customConnectorOAuthCredentialJson) {
        AnonymousClass003.A0u(interfaceC07789is, customConnectorOAuthCredentialJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        CustomConnectorOAuthCredentialJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_skills_connect_config_config(customConnectorOAuthCredentialJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
