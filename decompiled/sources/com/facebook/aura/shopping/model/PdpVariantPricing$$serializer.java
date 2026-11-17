package com.facebook.aura.shopping.model;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07729ii;
import X.C07779iq;
import X.C3cG;
import X.C3cH;
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
public final /* synthetic */ class PdpVariantPricing$$serializer implements C9cd<PdpVariantPricing> {
    public static final int $stable = 0;
    public static final PdpVariantPricing$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final PdpVariantPricing deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA8f = null;
        PdpPrice pdpPrice = null;
        PdpPrice pdpPrice2 = null;
        Integer numA0N = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new PdpVariantPricing(i, strA8f, pdpPrice, pdpPrice2, numA0N, null);
            }
            if (iA8N == 0) {
                strA8f = c9j4A55.A8f(c9iZ, 0);
                i |= 1;
            } else if (iA8N == 1) {
                pdpPrice = (PdpPrice) c9j4A55.A8Z(PdpPrice$$serializer.INSTANCE, c9iZ, 1);
                i |= 2;
            } else if (iA8N == 2) {
                pdpPrice2 = (PdpPrice) c9j4A55.A8Z(PdpPrice$$serializer.INSTANCE, c9iZ, 2);
                i |= 4;
            } else {
                if (iA8N != 3) {
                    throw C3cG.A17(iA8N);
                }
                numA0N = C3cI.A0N(c9iZ, c9j4A55, 3);
                i |= 8;
            }
        }
    }

    static {
        PdpVariantPricing$$serializer pdpVariantPricing$$serializer = new PdpVariantPricing$$serializer();
        INSTANCE = pdpVariantPricing$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.shopping.model.PdpVariantPricing", pdpVariantPricing$$serializer, 4);
        c9iKA1C.A08("productId", false);
        c9iKA1C.A08("currentPrice", false);
        c9iKA1C.A08("originalPrice", false);
        c9iKA1C.A08("pricePercentOff", false);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        PdpPrice$$serializer pdpPrice$$serializer = PdpPrice$$serializer.INSTANCE;
        return C3cH.A1a(C07729ii.A00, c07779iq, AbstractC07749im.A00(pdpPrice$$serializer), AbstractC07749im.A00(pdpPrice$$serializer));
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
    public final void serialize(InterfaceC07789is interfaceC07789is, PdpVariantPricing pdpVariantPricing) {
        AnonymousClass003.A0u(interfaceC07789is, pdpVariantPricing);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        PdpVariantPricing.write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_model_model(pdpVariantPricing, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
