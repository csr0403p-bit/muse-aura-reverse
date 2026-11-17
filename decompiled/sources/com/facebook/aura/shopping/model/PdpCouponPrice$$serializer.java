package com.facebook.aura.shopping.model;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07799it;
import X.C2hx;
import X.C3cG;
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
public final /* synthetic */ class PdpCouponPrice$$serializer implements C9cd<PdpCouponPrice> {
    public static final int $stable = 0;
    public static final PdpCouponPrice$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final PdpCouponPrice deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        PdpPrice pdpPrice = null;
        PdpPrice pdpPrice2 = null;
        double dA8M = 0.0d;
        int i = 0;
        PdpPrice pdpPrice3 = null;
        Double d = null;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new PdpCouponPrice(i, pdpPrice, pdpPrice3, dA8M, d, pdpPrice2, (C2hx) null);
            }
            if (iA8N == 0) {
                pdpPrice = (PdpPrice) c9j4A55.A8a(PdpPrice$$serializer.INSTANCE, c9iZ, 0);
                i |= 1;
            } else if (iA8N == 1) {
                pdpPrice3 = (PdpPrice) c9j4A55.A8a(PdpPrice$$serializer.INSTANCE, c9iZ, 1);
                i |= 2;
            } else if (iA8N == 2) {
                dA8M = c9j4A55.A8M(c9iZ, 2);
                i |= 4;
            } else if (iA8N == 3) {
                d = (Double) c9j4A55.A8Z(C07799it.A00, c9iZ, 3);
                i |= 8;
            } else {
                if (iA8N != 4) {
                    throw C3cG.A17(iA8N);
                }
                pdpPrice2 = (PdpPrice) c9j4A55.A8Z(PdpPrice$$serializer.INSTANCE, c9iZ, 4);
                i |= 16;
            }
        }
    }

    static {
        PdpCouponPrice$$serializer pdpCouponPrice$$serializer = new PdpCouponPrice$$serializer();
        INSTANCE = pdpCouponPrice$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.shopping.model.PdpCouponPrice", pdpCouponPrice$$serializer, 5);
        c9iKA1C.A08("price", false);
        c9iKA1C.A08("originalPrice", false);
        c9iKA1C.A08("expiresAt", false);
        c9iKA1C.A08("percentOff", true);
        c9iKA1C.A08("savings", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        PdpPrice$$serializer pdpPrice$$serializer = PdpPrice$$serializer.INSTANCE;
        C07799it c07799it = C07799it.A00;
        return new C9hr[]{pdpPrice$$serializer, pdpPrice$$serializer, c07799it, AbstractC07749im.A00(c07799it), AbstractC07749im.A00(pdpPrice$$serializer)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, PdpCouponPrice pdpCouponPrice) {
        AnonymousClass003.A0u(interfaceC07789is, pdpCouponPrice);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        PdpCouponPrice.write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_model_model(pdpCouponPrice, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
