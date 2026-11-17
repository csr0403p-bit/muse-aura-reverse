package com.facebook.aura.ccv.nativeflow;

import X.AnonymousClass003;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C3cJ;
import X.C5hV;
import X.C60Q;
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
/* loaded from: classes3.dex */
public final /* synthetic */ class HatchCheckoutComponentJson$$serializer implements C9cd<HatchCheckoutComponentJson> {
    public static final HatchCheckoutComponentJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final HatchCheckoutComponentJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = HatchCheckoutComponentJson.$childSerializers;
        String strA0v = null;
        List listA0Q = null;
        HatchAddressFormFieldsConfigJson hatchAddressFormFieldsConfigJson = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new HatchCheckoutComponentJson(i, strA0v, listA0Q, hatchAddressFormFieldsConfigJson, (C2hx) null);
            }
            if (iA8N == 0) {
                strA0v = C3cI.A0v(c9iZ, c9j4A55, 0);
                i |= 1;
            } else if (iA8N == 1) {
                listA0Q = C3cJ.A0Q(c9iZ, c9j4A55, f0cArr, 1);
                i |= 2;
            } else {
                if (iA8N != 2) {
                    throw C3cG.A17(iA8N);
                }
                hatchAddressFormFieldsConfigJson = (HatchAddressFormFieldsConfigJson) c9j4A55.A8Z(HatchAddressFormFieldsConfigJson$$serializer.INSTANCE, c9iZ, 2);
                i |= 4;
            }
        }
    }

    static {
        HatchCheckoutComponentJson$$serializer hatchCheckoutComponentJson$$serializer = new HatchCheckoutComponentJson$$serializer();
        INSTANCE = hatchCheckoutComponentJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.ccv.nativeflow.HatchCheckoutComponentJson", hatchCheckoutComponentJson$$serializer, 3);
        boolean zA1X = C60Q.A1X(c9iKA1C);
        c9iKA1C.A08("supported_cc_types", zA1X);
        c9iKA1C.A08("address_form_fields_config", zA1X);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = HatchCheckoutComponentJson.$childSerializers;
        return C3cG.A1b(HatchAddressFormFieldsConfigJson$$serializer.INSTANCE, C3cG.A15(), C3cH.A10(f0cArr));
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
    public final void serialize(InterfaceC07789is interfaceC07789is, HatchCheckoutComponentJson hatchCheckoutComponentJson) {
        AnonymousClass003.A0u(interfaceC07789is, hatchCheckoutComponentJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        HatchCheckoutComponentJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_ccv_nativeflow_nativeflow(hatchCheckoutComponentJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
