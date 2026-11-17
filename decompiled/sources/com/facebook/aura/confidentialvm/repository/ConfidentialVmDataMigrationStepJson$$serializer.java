package com.facebook.aura.confidentialvm.repository;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C5hV;
import X.C60O;
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
public final /* synthetic */ class ConfidentialVmDataMigrationStepJson$$serializer implements C9cd<ConfidentialVmDataMigrationStepJson> {
    public static final ConfidentialVmDataMigrationStepJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final ConfidentialVmDataMigrationStepJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA8f = null;
        String strA8f2 = null;
        ConfidentialVmDataMigrationKeepOptionJson confidentialVmDataMigrationKeepOptionJson = null;
        ConfidentialVmDataMigrationDeleteOptionJson confidentialVmDataMigrationDeleteOptionJson = null;
        String strA8f3 = null;
        String strA8f4 = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new ConfidentialVmDataMigrationStepJson(i, strA8f, strA8f2, confidentialVmDataMigrationKeepOptionJson, confidentialVmDataMigrationDeleteOptionJson, strA8f3, strA8f4, (C2hx) null);
                case 0:
                    strA8f = c9j4A55.A8f(c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    strA8f2 = c9j4A55.A8f(c9iZ, 1);
                    i |= 2;
                    break;
                case 2:
                    confidentialVmDataMigrationKeepOptionJson = (ConfidentialVmDataMigrationKeepOptionJson) c9j4A55.A8Z(ConfidentialVmDataMigrationKeepOptionJson$$serializer.INSTANCE, c9iZ, 2);
                    i |= 4;
                    break;
                case 3:
                    confidentialVmDataMigrationDeleteOptionJson = (ConfidentialVmDataMigrationDeleteOptionJson) c9j4A55.A8Z(ConfidentialVmDataMigrationDeleteOptionJson$$serializer.INSTANCE, c9iZ, 3);
                    i |= 8;
                    break;
                case 4:
                    strA8f3 = c9j4A55.A8f(c9iZ, 4);
                    i |= 16;
                    break;
                case 5:
                    strA8f4 = c9j4A55.A8f(c9iZ, 5);
                    i |= 32;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        ConfidentialVmDataMigrationStepJson$$serializer confidentialVmDataMigrationStepJson$$serializer = new ConfidentialVmDataMigrationStepJson$$serializer();
        INSTANCE = confidentialVmDataMigrationStepJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.confidentialvm.repository.ConfidentialVmDataMigrationStepJson", confidentialVmDataMigrationStepJson$$serializer, 6);
        boolean zA1R = C3cG.A1R(c9iKA1C);
        C60O.A1W(c9iKA1C, zA1R);
        c9iKA1C.A08("keep_option", zA1R);
        c9iKA1C.A08("delete_option", zA1R);
        c9iKA1C.A08("primary_button_text", zA1R);
        c9iKA1C.A08("secondary_button_text", zA1R);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c07779iq, c07779iq, AbstractC07749im.A00(ConfidentialVmDataMigrationKeepOptionJson$$serializer.INSTANCE), AbstractC07749im.A00(ConfidentialVmDataMigrationDeleteOptionJson$$serializer.INSTANCE), c07779iq, c07779iq};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, ConfidentialVmDataMigrationStepJson confidentialVmDataMigrationStepJson) {
        AnonymousClass003.A0u(interfaceC07789is, confidentialVmDataMigrationStepJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        ConfidentialVmDataMigrationStepJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_confidentialvm_repository_repository(confidentialVmDataMigrationStepJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
