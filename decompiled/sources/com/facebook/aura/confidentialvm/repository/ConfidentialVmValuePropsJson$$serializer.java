package com.facebook.aura.confidentialvm.repository;

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
import java.util.List;
import kotlin.Deprecated;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes4.dex */
public final /* synthetic */ class ConfidentialVmValuePropsJson$$serializer implements C9cd<ConfidentialVmValuePropsJson> {
    public static final ConfidentialVmValuePropsJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final ConfidentialVmValuePropsJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = ConfidentialVmValuePropsJson.$childSerializers;
        List listA0P = null;
        ConfidentialVmValuePropsVariantsJson confidentialVmValuePropsVariantsJson = null;
        String strA8f = null;
        List listA0P2 = null;
        JsonElement jsonElementA17 = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new ConfidentialVmValuePropsJson(i, listA0P, confidentialVmValuePropsVariantsJson, strA8f, listA0P2, jsonElementA17, (C2hx) null);
            }
            if (iA8N == 0) {
                listA0P = C3cJ.A0P(c9iZ, c9j4A55, f0cArr, 0);
                i |= 1;
            } else if (iA8N == 1) {
                confidentialVmValuePropsVariantsJson = (ConfidentialVmValuePropsVariantsJson) c9j4A55.A8Z(ConfidentialVmValuePropsVariantsJson$$serializer.INSTANCE, c9iZ, 1);
                i |= 2;
            } else if (iA8N == 2) {
                strA8f = c9j4A55.A8f(c9iZ, 2);
                i |= 4;
            } else if (iA8N == 3) {
                listA0P2 = C3cJ.A0P(c9iZ, c9j4A55, f0cArr, 3);
                i |= 8;
            } else {
                if (iA8N != 4) {
                    throw C3cG.A17(iA8N);
                }
                jsonElementA17 = C3cI.A17(c9iZ, c9j4A55, 4);
                i |= 16;
            }
        }
    }

    static {
        ConfidentialVmValuePropsJson$$serializer confidentialVmValuePropsJson$$serializer = new ConfidentialVmValuePropsJson$$serializer();
        INSTANCE = confidentialVmValuePropsJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.confidentialvm.repository.ConfidentialVmValuePropsJson", confidentialVmValuePropsJson$$serializer, 5);
        c9iKA1C.A08("bullets", true);
        c9iKA1C.A08("variants", true);
        c9iKA1C.A08("disclosure_text", true);
        c9iKA1C.A08("disclosure_entities", true);
        c9iKA1C.A08("data_migration", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = ConfidentialVmValuePropsJson.$childSerializers;
        return C3cI.A1b(JsonElementSerializer.A00, C3cH.A0z(f0cArr), AbstractC07749im.A00(ConfidentialVmValuePropsVariantsJson$$serializer.INSTANCE), C07779iq.A01, C3cH.A12(f0cArr));
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
    public final void serialize(InterfaceC07789is interfaceC07789is, ConfidentialVmValuePropsJson confidentialVmValuePropsJson) {
        AnonymousClass003.A0u(interfaceC07789is, confidentialVmValuePropsJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        ConfidentialVmValuePropsJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_confidentialvm_repository_repository(confidentialVmValuePropsJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
