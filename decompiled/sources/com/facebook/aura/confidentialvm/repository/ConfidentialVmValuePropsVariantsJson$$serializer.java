package com.facebook.aura.confidentialvm.repository;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C2hx;
import X.C3cG;
import X.C3cH;
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
/* loaded from: classes4.dex */
public final /* synthetic */ class ConfidentialVmValuePropsVariantsJson$$serializer implements C9cd<ConfidentialVmValuePropsVariantsJson> {
    public static final ConfidentialVmValuePropsVariantsJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final ConfidentialVmValuePropsVariantsJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        ConfidentialVmValuePropsVariantJson confidentialVmValuePropsVariantJson = null;
        ConfidentialVmValuePropsVariantJson confidentialVmValuePropsVariantJson2 = null;
        ConfidentialVmValuePropsVariantJson confidentialVmValuePropsVariantJson3 = null;
        ConfidentialVmValuePropsVariantJson confidentialVmValuePropsVariantJson4 = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new ConfidentialVmValuePropsVariantsJson(i, confidentialVmValuePropsVariantJson, confidentialVmValuePropsVariantJson2, confidentialVmValuePropsVariantJson3, confidentialVmValuePropsVariantJson4, (C2hx) null);
            }
            if (iA8N == 0) {
                confidentialVmValuePropsVariantJson = (ConfidentialVmValuePropsVariantJson) c9j4A55.A8Z(ConfidentialVmValuePropsVariantJson$$serializer.INSTANCE, c9iZ, 0);
                i |= 1;
            } else if (iA8N == 1) {
                confidentialVmValuePropsVariantJson2 = (ConfidentialVmValuePropsVariantJson) c9j4A55.A8Z(ConfidentialVmValuePropsVariantJson$$serializer.INSTANCE, c9iZ, 1);
                i |= 2;
            } else if (iA8N == 2) {
                confidentialVmValuePropsVariantJson3 = (ConfidentialVmValuePropsVariantJson) c9j4A55.A8Z(ConfidentialVmValuePropsVariantJson$$serializer.INSTANCE, c9iZ, 2);
                i |= 4;
            } else {
                if (iA8N != 3) {
                    throw C3cG.A17(iA8N);
                }
                confidentialVmValuePropsVariantJson4 = (ConfidentialVmValuePropsVariantJson) c9j4A55.A8Z(ConfidentialVmValuePropsVariantJson$$serializer.INSTANCE, c9iZ, 3);
                i |= 8;
            }
        }
    }

    static {
        ConfidentialVmValuePropsVariantsJson$$serializer confidentialVmValuePropsVariantsJson$$serializer = new ConfidentialVmValuePropsVariantsJson$$serializer();
        INSTANCE = confidentialVmValuePropsVariantsJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.confidentialvm.repository.ConfidentialVmValuePropsVariantsJson", confidentialVmValuePropsVariantsJson$$serializer, 4);
        c9iKA1C.A08("waitlist", true);
        c9iKA1C.A08("try_it", true);
        c9iKA1C.A08("subscribe", true);
        c9iKA1C.A08("switch", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        ConfidentialVmValuePropsVariantJson$$serializer confidentialVmValuePropsVariantJson$$serializer = ConfidentialVmValuePropsVariantJson$$serializer.INSTANCE;
        return C3cH.A1a(confidentialVmValuePropsVariantJson$$serializer, AbstractC07749im.A00(confidentialVmValuePropsVariantJson$$serializer), AbstractC07749im.A00(confidentialVmValuePropsVariantJson$$serializer), AbstractC07749im.A00(confidentialVmValuePropsVariantJson$$serializer));
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
    public final void serialize(InterfaceC07789is interfaceC07789is, ConfidentialVmValuePropsVariantsJson confidentialVmValuePropsVariantsJson) {
        AnonymousClass003.A0u(interfaceC07789is, confidentialVmValuePropsVariantsJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        ConfidentialVmValuePropsVariantsJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_confidentialvm_repository_repository(confidentialVmValuePropsVariantsJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
