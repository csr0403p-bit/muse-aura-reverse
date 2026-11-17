package com.facebook.aura.shopping.model;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07729ii;
import X.C07779iq;
import X.C3cG;
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
import com.facebook.aura.opengraph.HatchWebPageParserKt;
import java.util.List;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes4.dex */
public final /* synthetic */ class PdpProductInfo$$serializer implements C9cd<PdpProductInfo> {
    public static final int $stable = 0;
    public static final PdpProductInfo$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final PdpProductInfo deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = PdpProductInfo.$childSerializers;
        String strA8f = null;
        List listA0Q = null;
        Integer numA0X = null;
        PdpPrice pdpPrice = null;
        PdpPrice pdpPrice2 = null;
        String strA0i = null;
        String strA0j = null;
        String strA0k = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new PdpProductInfo(i, strA8f, strA0i, strA0j, strA0k, pdpPrice2, pdpPrice, numA0X, listA0Q, null);
                case 0:
                    strA8f = c9j4A55.A8f(c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    strA0i = C3cI.A0i(c9iZ, c9j4A55);
                    i |= 2;
                    break;
                case 2:
                    strA0j = C3cI.A0j(c9iZ, c9j4A55);
                    i |= 4;
                    break;
                case 3:
                    strA0k = C3cI.A0k(c9iZ, c9j4A55);
                    i |= 8;
                    break;
                case 4:
                    pdpPrice2 = (PdpPrice) c9j4A55.A8Z(PdpPrice$$serializer.INSTANCE, c9iZ, 4);
                    i |= 16;
                    break;
                case 5:
                    pdpPrice = (PdpPrice) c9j4A55.A8Z(PdpPrice$$serializer.INSTANCE, c9iZ, 5);
                    i |= 32;
                    break;
                case 6:
                    numA0X = C60Q.A0X(c9iZ, c9j4A55, 6);
                    i |= 64;
                    break;
                case 7:
                    listA0Q = C3cJ.A0Q(c9iZ, c9j4A55, f0cArr, 7);
                    i |= 128;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        PdpProductInfo$$serializer pdpProductInfo$$serializer = new PdpProductInfo$$serializer();
        INSTANCE = pdpProductInfo$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.shopping.model.PdpProductInfo", pdpProductInfo$$serializer, 8);
        c9iKA1C.A08("name", false);
        C3cI.A1N(HatchWebPageParserKt.DESCRIPTION, c9iKA1C, false);
        c9iKA1C.A08("stockStatus", false);
        c9iKA1C.A08("currentPrice", false);
        c9iKA1C.A08("originalPrice", false);
        c9iKA1C.A08("pricePercentOff", false);
        c9iKA1C.A08("images", false);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = PdpProductInfo.$childSerializers;
        C07779iq c07779iq = C07779iq.A01;
        C9hr c9hrA00 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA002 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA003 = AbstractC07749im.A00(c07779iq);
        PdpPrice$$serializer pdpPrice$$serializer = PdpPrice$$serializer.INSTANCE;
        return new C9hr[]{c07779iq, c9hrA00, c9hrA002, c9hrA003, AbstractC07749im.A00(pdpPrice$$serializer), AbstractC07749im.A00(pdpPrice$$serializer), AbstractC07749im.A00(C07729ii.A00), C3cG.A16(f0cArr, 7)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, PdpProductInfo pdpProductInfo) {
        AnonymousClass003.A0u(interfaceC07789is, pdpProductInfo);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        PdpProductInfo.write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_model_model(pdpProductInfo, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
