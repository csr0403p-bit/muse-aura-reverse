package com.facebook.aura.skills.connect.repository;

import X.AnonymousClass003;
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
import com.facebook.aura.model.InternalLinkActionCardPresentationKt;
import com.facebook.aura.perf.HatchConnectorQplLogger;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes4.dex */
public final /* synthetic */ class CustomConnectorApiKeyRegisterRequestJson$$serializer implements C9cd<CustomConnectorApiKeyRegisterRequestJson> {
    public static final CustomConnectorApiKeyRegisterRequestJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final CustomConnectorApiKeyRegisterRequestJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        CustomConnectoJson customConnectoJson = null;
        CustomConnectorApiKeyCredentialJson customConnectorApiKeyCredentialJson = null;
        String strA0v = null;
        boolean zA8G = false;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new CustomConnectorApiKeyRegisterRequestJson(i, customConnectoJson, customConnectorApiKeyCredentialJson, strA0v, zA8G, (C2hx) null);
            }
            if (iA8N == 0) {
                customConnectoJson = (CustomConnectoJson) c9j4A55.A8a(CustomConnectoJson$$serializer.INSTANCE, c9iZ, 0);
                i |= 1;
            } else if (iA8N == 1) {
                customConnectorApiKeyCredentialJson = (CustomConnectorApiKeyCredentialJson) c9j4A55.A8a(CustomConnectorApiKeyCredentialJson$$serializer.INSTANCE, c9iZ, 1);
                i |= 2;
            } else if (iA8N == 2) {
                strA0v = C3cI.A0v(c9iZ, c9j4A55, 2);
                i |= 4;
            } else {
                if (iA8N != 3) {
                    throw C3cG.A17(iA8N);
                }
                zA8G = c9j4A55.A8G(c9iZ, 3);
                i |= 8;
            }
        }
    }

    static {
        CustomConnectorApiKeyRegisterRequestJson$$serializer customConnectorApiKeyRegisterRequestJson$$serializer = new CustomConnectorApiKeyRegisterRequestJson$$serializer();
        INSTANCE = customConnectorApiKeyRegisterRequestJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.skills.connect.repository.CustomConnectorApiKeyRegisterRequestJson", customConnectorApiKeyRegisterRequestJson$$serializer, 4);
        c9iKA1C.A08(InternalLinkActionCardPresentationKt.INTERNAL_LINK_TYPE_CONNECTOR, false);
        c9iKA1C.A08(HatchConnectorQplLogger.AuthType.API_KEY, false);
        c9iKA1C.A08("session_id", true);
        c9iKA1C.A08("replace_existing", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        return new C9hr[]{CustomConnectoJson$$serializer.INSTANCE, CustomConnectorApiKeyCredentialJson$$serializer.INSTANCE, C3cG.A15(), C07839ix.A00};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, CustomConnectorApiKeyRegisterRequestJson customConnectorApiKeyRegisterRequestJson) {
        AnonymousClass003.A0u(interfaceC07789is, customConnectorApiKeyRegisterRequestJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        CustomConnectorApiKeyRegisterRequestJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_skills_connect_repository_repository(customConnectorApiKeyRegisterRequestJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
