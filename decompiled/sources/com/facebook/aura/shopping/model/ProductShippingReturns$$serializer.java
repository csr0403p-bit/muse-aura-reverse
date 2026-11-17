package com.facebook.aura.shopping.model;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07729ii;
import X.C07779iq;
import X.C07839ix;
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
import com.facebook.aura.shopping.model.ProductShippingReturns;
import java.util.List;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes4.dex */
public final /* synthetic */ class ProductShippingReturns$$serializer implements C9cd<ProductShippingReturns> {
    public static final int $stable = 0;
    public static final ProductShippingReturns$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final ProductShippingReturns deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = ProductShippingReturns.$childSerializers;
        ProductShippingReturns.FreeShipping freeShipping = null;
        Boolean boolA0L = null;
        String strA0v = null;
        String strA0w = null;
        List listA0P = null;
        Integer num = null;
        Boolean bool = null;
        Integer num2 = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new ProductShippingReturns(i, freeShipping, num, bool, num2, listA0P, strA0w, strA0v, boolA0L, (C2hx) null);
                case 0:
                    freeShipping = (ProductShippingReturns.FreeShipping) c9j4A55.A8Z(ProductShippingReturns$FreeShipping$$serializer.INSTANCE, c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    num = (Integer) c9j4A55.A8Z(C07729ii.A00, c9iZ, 1);
                    i |= 2;
                    break;
                case 2:
                    bool = (Boolean) c9j4A55.A8Z(C07839ix.A00, c9iZ, 2);
                    i |= 4;
                    break;
                case 3:
                    num2 = (Integer) c9j4A55.A8Z(C07729ii.A00, c9iZ, 3);
                    i |= 8;
                    break;
                case 4:
                    listA0P = C3cJ.A0P(c9iZ, c9j4A55, f0cArr, 4);
                    i |= 16;
                    break;
                case 5:
                    strA0w = C3cI.A0w(c9iZ, c9j4A55, 5);
                    i |= 32;
                    break;
                case 6:
                    strA0v = C3cI.A0v(c9iZ, c9j4A55, 6);
                    i |= 64;
                    break;
                case 7:
                    boolA0L = C3cI.A0L(c9iZ, c9j4A55, 7);
                    i |= 128;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        ProductShippingReturns$$serializer productShippingReturns$$serializer = new ProductShippingReturns$$serializer();
        INSTANCE = productShippingReturns$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.shopping.model.ProductShippingReturns", productShippingReturns$$serializer, 8);
        c9iKA1C.A08("freeShipping", true);
        c9iKA1C.A08("fastestShippingDays", true);
        c9iKA1C.A08("freeReturns", true);
        c9iKA1C.A08("returnWindowDays", true);
        c9iKA1C.A08("fulfillmentMethods", true);
        c9iKA1C.A08("membershipFreeShipping", true);
        c9iKA1C.A08("returnPolicyText", true);
        c9iKA1C.A08("notReturnable", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = ProductShippingReturns.$childSerializers;
        C9hr c9hrA00 = AbstractC07749im.A00(ProductShippingReturns$FreeShipping$$serializer.INSTANCE);
        C07729ii c07729ii = C07729ii.A00;
        C9hr c9hrA002 = AbstractC07749im.A00(c07729ii);
        C07839ix c07839ix = C07839ix.A00;
        C9hr c9hrA003 = AbstractC07749im.A00(c07839ix);
        C9hr c9hrA004 = AbstractC07749im.A00(c07729ii);
        C9hr c9hrA13 = C3cH.A13(f0cArr);
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c9hrA00, c9hrA002, c9hrA003, c9hrA004, c9hrA13, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07839ix)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, ProductShippingReturns productShippingReturns) {
        AnonymousClass003.A0u(interfaceC07789is, productShippingReturns);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        ProductShippingReturns.write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_model_model(productShippingReturns, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
