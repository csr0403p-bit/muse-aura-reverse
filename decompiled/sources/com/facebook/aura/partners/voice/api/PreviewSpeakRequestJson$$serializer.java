package com.facebook.aura.partners.voice.api;

import X.AnonymousClass003;
import X.C07779iq;
import X.C07839ix;
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
public final /* synthetic */ class PreviewSpeakRequestJson$$serializer implements C9cd<PreviewSpeakRequestJson> {
    public static final int $stable = 0;
    public static final PreviewSpeakRequestJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final PreviewSpeakRequestJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA8f = null;
        String strA8f2 = null;
        String strA8f3 = null;
        boolean zA8G = false;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new PreviewSpeakRequestJson(i, strA8f, strA8f3, strA8f2, zA8G, null);
            }
            if (iA8N == 0) {
                strA8f = c9j4A55.A8f(c9iZ, 0);
                i |= 1;
            } else if (iA8N == 1) {
                strA8f3 = c9j4A55.A8f(c9iZ, 1);
                i |= 2;
            } else if (iA8N == 2) {
                strA8f2 = c9j4A55.A8f(c9iZ, 2);
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
        PreviewSpeakRequestJson$$serializer previewSpeakRequestJson$$serializer = new PreviewSpeakRequestJson$$serializer();
        INSTANCE = previewSpeakRequestJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.partners.voice.api.PreviewSpeakRequestJson", previewSpeakRequestJson$$serializer, 4);
        C3cI.A1O("voice_id", c9iKA1C, false);
        c9iKA1C.A08("format", false);
        c9iKA1C.A08("stream", false);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c07779iq, c07779iq, c07779iq, C07839ix.A00};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, PreviewSpeakRequestJson previewSpeakRequestJson) {
        AnonymousClass003.A0u(interfaceC07789is, previewSpeakRequestJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        PreviewSpeakRequestJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_partners_voice_api_api(previewSpeakRequestJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
