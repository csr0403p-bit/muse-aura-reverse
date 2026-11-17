package com.facebook.aura.shopping.model;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
import X.C07799it;
import X.C2hx;
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
/* loaded from: classes4.dex */
public final /* synthetic */ class PdpCouponJson$$serializer implements C9cd<PdpCouponJson> {
    public static final int $stable = 0;
    public static final PdpCouponJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final PdpCouponJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA0w = null;
        Double d = null;
        Double d2 = null;
        String strA0w2 = null;
        CouponMoneyJson couponMoneyJson = null;
        CouponMoneyJson couponMoneyJson2 = null;
        CouponMoneyJson couponMoneyJson3 = null;
        Double d3 = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new PdpCouponJson(i, strA0w, couponMoneyJson, couponMoneyJson2, couponMoneyJson3, d3, strA0w2, d2, d, (C2hx) null);
                case 0:
                    strA0w = C3cI.A0w(c9iZ, c9j4A55, 0);
                    i |= 1;
                    break;
                case 1:
                    couponMoneyJson = (CouponMoneyJson) c9j4A55.A8Z(CouponMoneyJson$$serializer.INSTANCE, c9iZ, 1);
                    i |= 2;
                    break;
                case 2:
                    couponMoneyJson2 = (CouponMoneyJson) c9j4A55.A8Z(CouponMoneyJson$$serializer.INSTANCE, c9iZ, 2);
                    i |= 4;
                    break;
                case 3:
                    couponMoneyJson3 = (CouponMoneyJson) c9j4A55.A8Z(CouponMoneyJson$$serializer.INSTANCE, c9iZ, 3);
                    i |= 8;
                    break;
                case 4:
                    d3 = (Double) c9j4A55.A8Z(C07799it.A00, c9iZ, 4);
                    i |= 16;
                    break;
                case 5:
                    strA0w2 = C3cI.A0w(c9iZ, c9j4A55, 5);
                    i |= 32;
                    break;
                case 6:
                    d2 = (Double) c9j4A55.A8Z(C07799it.A00, c9iZ, 6);
                    i |= 64;
                    break;
                case 7:
                    d = (Double) c9j4A55.A8Z(C07799it.A00, c9iZ, 7);
                    i |= 128;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        PdpCouponJson$$serializer pdpCouponJson$$serializer = new PdpCouponJson$$serializer();
        INSTANCE = pdpCouponJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.shopping.model.PdpCouponJson", pdpCouponJson$$serializer, 8);
        C9iK.A03("product_id", c9iKA1C, true);
        c9iKA1C.A08("original_price", true);
        c9iKA1C.A08("savings", true);
        c9iKA1C.A08("percent_off", true);
        c9iKA1C.A08("coupon_code", true);
        c9iKA1C.A08("expires_at", true);
        c9iKA1C.A08("offer_expires_at", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        C9hr c9hrA00 = AbstractC07749im.A00(c07779iq);
        CouponMoneyJson$$serializer couponMoneyJson$$serializer = CouponMoneyJson$$serializer.INSTANCE;
        C9hr c9hrA002 = AbstractC07749im.A00(couponMoneyJson$$serializer);
        C9hr c9hrA003 = AbstractC07749im.A00(couponMoneyJson$$serializer);
        C9hr c9hrA004 = AbstractC07749im.A00(couponMoneyJson$$serializer);
        C07799it c07799it = C07799it.A00;
        return new C9hr[]{c9hrA00, c9hrA002, c9hrA003, c9hrA004, AbstractC07749im.A00(c07799it), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07799it), AbstractC07749im.A00(c07799it)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, PdpCouponJson pdpCouponJson) {
        AnonymousClass003.A0u(interfaceC07789is, pdpCouponJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        PdpCouponJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_model_model(pdpCouponJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
