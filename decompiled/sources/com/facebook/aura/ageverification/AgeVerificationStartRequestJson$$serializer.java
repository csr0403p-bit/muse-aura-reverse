package com.facebook.aura.ageverification;

import X.AnonymousClass003;
import X.C07729ii;
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
import com.facebook.aura.ageverification.intf.AgeCheckFunnelLogging;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes4.dex */
public final /* synthetic */ class AgeVerificationStartRequestJson$$serializer implements C9cd<AgeVerificationStartRequestJson> {
    public static final int $stable = 0;
    public static final AgeVerificationStartRequestJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final AgeVerificationStartRequestJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA8f = null;
        Integer numA0N = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new AgeVerificationStartRequestJson(i, strA8f, numA0N, (C2hx) null);
            }
            if (iA8N == 0) {
                strA8f = c9j4A55.A8f(c9iZ, 0);
                i |= 1;
            } else {
                if (iA8N != 1) {
                    throw C3cG.A17(iA8N);
                }
                numA0N = C3cI.A0N(c9iZ, c9j4A55, 1);
                i |= 2;
            }
        }
    }

    static {
        AgeVerificationStartRequestJson$$serializer ageVerificationStartRequestJson$$serializer = new AgeVerificationStartRequestJson$$serializer();
        INSTANCE = ageVerificationStartRequestJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.ageverification.AgeVerificationStartRequestJson", ageVerificationStartRequestJson$$serializer, 2);
        c9iKA1C.A08(AgeCheckFunnelLogging.KEY_METHOD, false);
        c9iKA1C.A08("id_sides", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        return C3cH.A1Z(C07729ii.A00, C07779iq.A01);
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
    public final void serialize(InterfaceC07789is interfaceC07789is, AgeVerificationStartRequestJson ageVerificationStartRequestJson) {
        AnonymousClass003.A0u(interfaceC07789is, ageVerificationStartRequestJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        AgeVerificationStartRequestJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_ageverification_impl_impl(ageVerificationStartRequestJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
