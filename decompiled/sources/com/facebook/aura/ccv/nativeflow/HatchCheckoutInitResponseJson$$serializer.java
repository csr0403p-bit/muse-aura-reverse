package com.facebook.aura.ccv.nativeflow;

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

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes4.dex */
public final /* synthetic */ class HatchCheckoutInitResponseJson$$serializer implements C9cd<HatchCheckoutInitResponseJson> {
    public static final HatchCheckoutInitResponseJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final HatchCheckoutInitResponseJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = HatchCheckoutInitResponseJson.$childSerializers;
        String strA0w = null;
        String strA0w2 = null;
        String strA0w3 = null;
        List listA0P = null;
        HatchCcvScreenContentJson hatchCcvScreenContentJson = null;
        HatchCheckoutCurrencyAmountJson hatchCheckoutCurrencyAmountJson = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new HatchCheckoutInitResponseJson(i, strA0w, strA0w2, strA0w3, listA0P, hatchCcvScreenContentJson, hatchCheckoutCurrencyAmountJson, (C2hx) null);
                case 0:
                    strA0w = C3cI.A0w(c9iZ, c9j4A55, 0);
                    i |= 1;
                    break;
                case 1:
                    strA0w2 = C3cI.A0w(c9iZ, c9j4A55, 1);
                    i |= 2;
                    break;
                case 2:
                    strA0w3 = C3cI.A0w(c9iZ, c9j4A55, 2);
                    i |= 4;
                    break;
                case 3:
                    listA0P = C3cJ.A0P(c9iZ, c9j4A55, f0cArr, 3);
                    i |= 8;
                    break;
                case 4:
                    hatchCcvScreenContentJson = (HatchCcvScreenContentJson) c9j4A55.A8Z(HatchCcvScreenContentJson$$serializer.INSTANCE, c9iZ, 4);
                    i |= 16;
                    break;
                case 5:
                    hatchCheckoutCurrencyAmountJson = (HatchCheckoutCurrencyAmountJson) c9j4A55.A8Z(HatchCheckoutCurrencyAmountJson$$serializer.INSTANCE, c9iZ, 5);
                    i |= 32;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        HatchCheckoutInitResponseJson$$serializer hatchCheckoutInitResponseJson$$serializer = new HatchCheckoutInitResponseJson$$serializer();
        INSTANCE = hatchCheckoutInitResponseJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.ccv.nativeflow.HatchCheckoutInitResponseJson", hatchCheckoutInitResponseJson$$serializer, 6);
        c9iKA1C.A08("order_id", true);
        c9iKA1C.A08("ecp_checkout_session_id", true);
        c9iKA1C.A08("payment_container_mode", true);
        c9iKA1C.A08("components", true);
        c9iKA1C.A08("ccv_screen_content", true);
        c9iKA1C.A08("currency_amount", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = HatchCheckoutInitResponseJson.$childSerializers;
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), C3cH.A12(f0cArr), AbstractC07749im.A00(HatchCcvScreenContentJson$$serializer.INSTANCE), AbstractC07749im.A00(HatchCheckoutCurrencyAmountJson$$serializer.INSTANCE)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, HatchCheckoutInitResponseJson hatchCheckoutInitResponseJson) {
        AnonymousClass003.A0u(interfaceC07789is, hatchCheckoutInitResponseJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        HatchCheckoutInitResponseJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_ccv_nativeflow_nativeflow(hatchCheckoutInitResponseJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
