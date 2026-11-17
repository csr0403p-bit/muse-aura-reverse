package com.facebook.aura.ccv.nativeflow;

import X.AnonymousClass003;
import X.C07779iq;
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
import com.facebook.aura.settings.SecureStorageLogging;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes4.dex */
public final /* synthetic */ class HatchCheckoutFinalizeRequestJson$$serializer implements C9cd<HatchCheckoutFinalizeRequestJson> {
    public static final HatchCheckoutFinalizeRequestJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final HatchCheckoutFinalizeRequestJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        int i = 0;
        String strA8f = null;
        String strA0h = null;
        String strA8f2 = null;
        String strA8f3 = null;
        String strA8f4 = null;
        String strA8f5 = null;
        String strA8f6 = null;
        String strA8f7 = null;
        String strA8f8 = null;
        String strA8f9 = null;
        String strA8f10 = null;
        String strA8f11 = null;
        String strA8f12 = null;
        String strA8f13 = null;
        String strA8f14 = null;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new HatchCheckoutFinalizeRequestJson(i, strA8f, strA0h, strA8f2, strA8f11, strA8f13, strA8f10, strA8f9, strA8f8, strA8f12, strA8f7, strA8f6, strA8f5, strA8f4, strA8f14, strA8f3, null);
                case 0:
                    strA8f = c9j4A55.A8f(c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    strA0h = C3cH.A0h(c9iZ, c9j4A55);
                    i |= 2;
                    break;
                case 2:
                    strA8f2 = c9j4A55.A8f(c9iZ, 2);
                    i |= 4;
                    break;
                case 3:
                    strA8f11 = c9j4A55.A8f(c9iZ, 3);
                    i |= 8;
                    break;
                case 4:
                    strA8f13 = c9j4A55.A8f(c9iZ, 4);
                    i |= 16;
                    break;
                case 5:
                    strA8f10 = c9j4A55.A8f(c9iZ, 5);
                    i |= 32;
                    break;
                case 6:
                    strA8f9 = c9j4A55.A8f(c9iZ, 6);
                    i |= 64;
                    break;
                case 7:
                    strA8f8 = c9j4A55.A8f(c9iZ, 7);
                    i |= 128;
                    break;
                case 8:
                    strA8f12 = c9j4A55.A8f(c9iZ, 8);
                    i |= 256;
                    break;
                case 9:
                    strA8f7 = c9j4A55.A8f(c9iZ, 9);
                    i |= 512;
                    break;
                case 10:
                    strA8f6 = c9j4A55.A8f(c9iZ, 10);
                    i |= 1024;
                    break;
                case 11:
                    strA8f5 = c9j4A55.A8f(c9iZ, 11);
                    i |= 2048;
                    break;
                case 12:
                    strA8f4 = c9j4A55.A8f(c9iZ, 12);
                    i |= 4096;
                    break;
                case 13:
                    strA8f14 = c9j4A55.A8f(c9iZ, 13);
                    i |= 8192;
                    break;
                case 14:
                    strA8f3 = c9j4A55.A8f(c9iZ, 14);
                    i |= 16384;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        HatchCheckoutFinalizeRequestJson$$serializer hatchCheckoutFinalizeRequestJson$$serializer = new HatchCheckoutFinalizeRequestJson$$serializer();
        INSTANCE = hatchCheckoutFinalizeRequestJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.ccv.nativeflow.HatchCheckoutFinalizeRequestJson", hatchCheckoutFinalizeRequestJson$$serializer, 15);
        c9iKA1C.A08("order_id", false);
        c9iKA1C.A08("upl_session_id", false);
        c9iKA1C.A08(SecureStorageLogging.KEY_CREDENTIAL_ID, false);
        c9iKA1C.A08("credential_type", false);
        c9iKA1C.A08("platform_trust_token", false);
        c9iKA1C.A08("payment_product_id", false);
        c9iKA1C.A08("receiver_id", false);
        c9iKA1C.A08("amount", false);
        c9iKA1C.A08("currency_code", false);
        c9iKA1C.A08("country_code", false);
        c9iKA1C.A08("payment_container_mode", false);
        c9iKA1C.A08("pay_button_click_id", false);
        c9iKA1C.A08("payment_request_id", false);
        c9iKA1C.A08("otc_session_id", false);
        c9iKA1C.A08("otc_type", false);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c07779iq, c07779iq, c07779iq, c07779iq, c07779iq, c07779iq, c07779iq, c07779iq, c07779iq, c07779iq, c07779iq, c07779iq, c07779iq, c07779iq, c07779iq};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, HatchCheckoutFinalizeRequestJson hatchCheckoutFinalizeRequestJson) {
        AnonymousClass003.A0u(interfaceC07789is, hatchCheckoutFinalizeRequestJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        HatchCheckoutFinalizeRequestJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_ccv_nativeflow_nativeflow(hatchCheckoutFinalizeRequestJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
