package com.facebook.aura.partners.voice.api;

import X.AnonymousClass003;
import X.C07729ii;
import X.C07779iq;
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
import com.facebook.aura.bloks.storage.AuraMetaFRLSecureTokenStore;
import com.facebook.aura.localbrowser.core.BrowserOperationCatalogKt;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes4.dex */
public final /* synthetic */ class VoiceCatalogFilterOptionJson$$serializer implements C9cd<VoiceCatalogFilterOptionJson> {
    public static final int $stable = 0;
    public static final VoiceCatalogFilterOptionJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final VoiceCatalogFilterOptionJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA8f = null;
        String strA8f2 = null;
        int iA8U = 0;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new VoiceCatalogFilterOptionJson(i, strA8f, strA8f2, iA8U, null);
            }
            if (iA8N == 0) {
                strA8f = c9j4A55.A8f(c9iZ, 0);
                i |= 1;
            } else if (iA8N == 1) {
                strA8f2 = c9j4A55.A8f(c9iZ, 1);
                i |= 2;
            } else {
                if (iA8N != 2) {
                    throw C3cG.A17(iA8N);
                }
                iA8U = c9j4A55.A8U(c9iZ, 2);
                i |= 4;
            }
        }
    }

    static {
        VoiceCatalogFilterOptionJson$$serializer voiceCatalogFilterOptionJson$$serializer = new VoiceCatalogFilterOptionJson$$serializer();
        INSTANCE = voiceCatalogFilterOptionJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.partners.voice.api.VoiceCatalogFilterOptionJson", voiceCatalogFilterOptionJson$$serializer, 3);
        C3cI.A1P(BrowserOperationCatalogKt.VALUE, c9iKA1C, false);
        c9iKA1C.A08(AuraMetaFRLSecureTokenStore.JSON_KEY_COUNT, false);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c07779iq, c07779iq, C07729ii.A00};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, VoiceCatalogFilterOptionJson voiceCatalogFilterOptionJson) {
        AnonymousClass003.A0u(interfaceC07789is, voiceCatalogFilterOptionJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        VoiceCatalogFilterOptionJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_partners_voice_api_api(voiceCatalogFilterOptionJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
