package com.facebook.aura.shopping.model;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07729ii;
import X.C07779iq;
import X.C3cG;
import X.C3cI;
import X.C5hV;
import X.C60O;
import X.C60Q;
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
public final /* synthetic */ class PdpSeller$$serializer implements C9cd<PdpSeller> {
    public static final int $stable = 0;
    public static final PdpSeller$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final PdpSeller deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA0w = null;
        String strA0w2 = null;
        String strA0w3 = null;
        String strA0w4 = null;
        Integer numA0X = null;
        PdpRating pdpRating = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new PdpSeller(i, strA0w, strA0w2, strA0w3, strA0w4, numA0X, pdpRating, null);
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
                    strA0w4 = C3cI.A0w(c9iZ, c9j4A55, 3);
                    i |= 8;
                    break;
                case 4:
                    numA0X = C60Q.A0X(c9iZ, c9j4A55, 4);
                    i |= 16;
                    break;
                case 5:
                    pdpRating = (PdpRating) c9j4A55.A8Z(PdpRating$$serializer.INSTANCE, c9iZ, 5);
                    i |= 32;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        PdpSeller$$serializer pdpSeller$$serializer = new PdpSeller$$serializer();
        INSTANCE = pdpSeller$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.shopping.model.PdpSeller", pdpSeller$$serializer, 6);
        C60O.A1T("sellerId", c9iKA1C, false);
        c9iKA1C.A08("profilePicUrl", false);
        c9iKA1C.A08("profileUrl", false);
        c9iKA1C.A08("joinYear", false);
        c9iKA1C.A08("rating", false);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(C07729ii.A00), AbstractC07749im.A00(PdpRating$$serializer.INSTANCE)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, PdpSeller pdpSeller) {
        AnonymousClass003.A0u(interfaceC07789is, pdpSeller);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        PdpSeller.write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_model_model(pdpSeller, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
