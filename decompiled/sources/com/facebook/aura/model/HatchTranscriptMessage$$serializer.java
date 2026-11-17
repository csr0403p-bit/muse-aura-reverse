package com.facebook.aura.model;

import X.AnonymousClass003;
import X.C07779iq;
import X.C3cG;
import X.C3cH;
import X.C5hV;
import X.C60O;
import X.C7384Etj;
import X.C9cd;
import X.C9hr;
import X.C9iK;
import X.C9iZ;
import X.C9j1;
import X.C9j4;
import X.C9j5;
import X.F0C;
import X.Hs1;
import X.InterfaceC07789is;
import X.InterfaceC07829iw;
import java.util.List;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes3.dex */
public final /* synthetic */ class HatchTranscriptMessage$$serializer implements C9cd<HatchTranscriptMessage> {
    public static final int $stable = 0;
    public static final HatchTranscriptMessage$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final HatchTranscriptMessage deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = HatchTranscriptMessage.$childSerializers;
        String strA8f = null;
        long jA8X = 0;
        String strA8f2 = null;
        List list = null;
        String strA8f3 = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new HatchTranscriptMessage(i, strA8f, strA8f2, list, strA8f3, jA8X, null);
            }
            if (iA8N == 0) {
                strA8f = c9j4A55.A8f(c9iZ, 0);
                i |= 1;
            } else if (iA8N == 1) {
                strA8f2 = c9j4A55.A8f(c9iZ, 1);
                i |= 2;
            } else if (iA8N == 2) {
                list = (List) c9j4A55.A8a(f0cArr[2].getValue(), c9iZ, 2);
                i |= 4;
            } else if (iA8N == 3) {
                strA8f3 = c9j4A55.A8f(c9iZ, 3);
                i |= 8;
            } else {
                if (iA8N != 4) {
                    throw C3cG.A17(iA8N);
                }
                jA8X = c9j4A55.A8X(c9iZ, 4);
                i |= 16;
            }
        }
    }

    static {
        HatchTranscriptMessage$$serializer hatchTranscriptMessage$$serializer = new HatchTranscriptMessage$$serializer();
        INSTANCE = hatchTranscriptMessage$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.model.HatchTranscriptMessage", hatchTranscriptMessage$$serializer, 5);
        boolean zA1Y = C60O.A1Y(c9iKA1C);
        c9iKA1C.A08("role", zA1Y);
        C3cH.A1H("content", c9iKA1C, zA1Y);
        c9iKA1C.A08("createdAtMs", zA1Y);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = HatchTranscriptMessage.$childSerializers;
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c07779iq, c07779iq, C3cH.A11(f0cArr), c07779iq, C9j1.A00};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, HatchTranscriptMessage hatchTranscriptMessage) {
        AnonymousClass003.A0u(interfaceC07789is, hatchTranscriptMessage);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        HatchTranscriptMessage.write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(hatchTranscriptMessage, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
