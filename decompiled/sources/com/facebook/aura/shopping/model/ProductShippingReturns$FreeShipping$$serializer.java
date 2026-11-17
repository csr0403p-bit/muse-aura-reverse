package com.facebook.aura.shopping.model;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07729ii;
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
import com.facebook.aura.shopping.model.ProductShippingReturns;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes4.dex */
public final /* synthetic */ class ProductShippingReturns$FreeShipping$$serializer implements C9cd<ProductShippingReturns.FreeShipping> {
    public static final int $stable = 0;
    public static final ProductShippingReturns$FreeShipping$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final ProductShippingReturns.FreeShipping deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        PdpPrice pdpPrice = null;
        Integer numA0N = null;
        Integer numA0N2 = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new ProductShippingReturns.FreeShipping(i, pdpPrice, numA0N, numA0N2, (C2hx) null);
            }
            if (iA8N == 0) {
                pdpPrice = (PdpPrice) c9j4A55.A8Z(PdpPrice$$serializer.INSTANCE, c9iZ, 0);
                i |= 1;
            } else if (iA8N == 1) {
                numA0N = C3cI.A0N(c9iZ, c9j4A55, 1);
                i |= 2;
            } else {
                if (iA8N != 2) {
                    throw C3cG.A17(iA8N);
                }
                numA0N2 = C3cI.A0N(c9iZ, c9j4A55, 2);
                i |= 4;
            }
        }
    }

    static {
        ProductShippingReturns$FreeShipping$$serializer productShippingReturns$FreeShipping$$serializer = new ProductShippingReturns$FreeShipping$$serializer();
        INSTANCE = productShippingReturns$FreeShipping$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.shopping.model.ProductShippingReturns.FreeShipping", productShippingReturns$FreeShipping$$serializer, 3);
        c9iKA1C.A08("orderMinimum", true);
        c9iKA1C.A08("minDaysToArrival", true);
        c9iKA1C.A08("maxDaysToArrival", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C9hr c9hrA00 = AbstractC07749im.A00(PdpPrice$$serializer.INSTANCE);
        C07729ii c07729ii = C07729ii.A00;
        return C3cG.A1b(c07729ii, c9hrA00, AbstractC07749im.A00(c07729ii));
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
    public final void serialize(InterfaceC07789is interfaceC07789is, ProductShippingReturns.FreeShipping freeShipping) {
        AnonymousClass003.A0u(interfaceC07789is, freeShipping);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        ProductShippingReturns.FreeShipping.write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_model_model(freeShipping, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
