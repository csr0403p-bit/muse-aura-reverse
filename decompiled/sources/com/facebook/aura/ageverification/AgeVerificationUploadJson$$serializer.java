package com.facebook.aura.ageverification;

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
import X.C9j1;
import X.C9j4;
import X.C9j5;
import X.Hs1;
import X.InterfaceC07789is;
import X.InterfaceC07829iw;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class AgeVerificationUploadJson$$serializer implements C9cd<AgeVerificationUploadJson> {
    public static final int $stable = 0;
    public static final AgeVerificationUploadJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final AgeVerificationUploadJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA8f = null;
        Long lA0P = null;
        boolean zA8G = false;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new AgeVerificationUploadJson(i, strA8f, zA8G, lA0P, (C2hx) null);
            }
            if (iA8N == 0) {
                strA8f = c9j4A55.A8f(c9iZ, 0);
                i |= 1;
            } else if (iA8N == 1) {
                zA8G = c9j4A55.A8G(c9iZ, 1);
                i |= 2;
            } else {
                if (iA8N != 2) {
                    throw C3cG.A17(iA8N);
                }
                lA0P = C3cI.A0P(c9iZ, c9j4A55, 2);
                i |= 4;
            }
        }
    }

    static {
        AgeVerificationUploadJson$$serializer ageVerificationUploadJson$$serializer = new AgeVerificationUploadJson$$serializer();
        INSTANCE = ageVerificationUploadJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.ageverification.AgeVerificationUploadJson", ageVerificationUploadJson$$serializer, 3);
        boolean zA1X = C3cI.A1X(c9iKA1C);
        c9iKA1C.A08("required", zA1X);
        c9iKA1C.A08("max_bytes", zA1X);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        return C3cG.A1b(C9j1.A00, C07779iq.A01, C07839ix.A00);
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
    public final void serialize(InterfaceC07789is interfaceC07789is, AgeVerificationUploadJson ageVerificationUploadJson) {
        AnonymousClass003.A0u(interfaceC07789is, ageVerificationUploadJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        AgeVerificationUploadJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_ageverification_impl_impl(ageVerificationUploadJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
