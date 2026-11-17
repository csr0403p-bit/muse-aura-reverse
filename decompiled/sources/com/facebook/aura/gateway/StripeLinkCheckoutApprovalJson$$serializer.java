package com.facebook.aura.gateway;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07729ii;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C3cI;
import X.C3cJ;
import X.C5hV;
import X.C7384Etj;
import X.C9cd;
import X.C9hr;
import X.C9iK;
import X.C9iZ;
import X.C9j1;
import X.C9j4;
import X.C9j5;
import X.F0C;
import X.Hs1;
import X.InterfaceC07789is;
import X.InterfaceC07829iw;
import java.util.List;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class StripeLinkCheckoutApprovalJson$$serializer implements C9cd<StripeLinkCheckoutApprovalJson> {
    public static final int $stable = 0;
    public static final StripeLinkCheckoutApprovalJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final StripeLinkCheckoutApprovalJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = StripeLinkCheckoutApprovalJson.$childSerializers;
        List listA0Q = null;
        PaymentSelectionJson paymentSelectionJson = null;
        Long l = null;
        String strA0h = null;
        String strA0n = null;
        String strA0l = null;
        String strA0k = null;
        String strA0j = null;
        String strA0i = null;
        int iA8U = 0;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new StripeLinkCheckoutApprovalJson(i, iA8U, strA0i, strA0j, strA0k, strA0l, strA0h, strA0n, l, paymentSelectionJson, listA0Q, (C2hx) null);
                case 0:
                    iA8U = c9j4A55.A8U(c9iZ, 0);
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
                    strA0l = C3cI.A0l(c9iZ, c9j4A55);
                    i |= 16;
                    break;
                case 5:
                    strA0h = C3cI.A0h(c9iZ, c9j4A55);
                    i |= 32;
                    break;
                case 6:
                    strA0n = C3cI.A0n(c9iZ, c9j4A55);
                    i |= 64;
                    break;
                case 7:
                    l = (Long) c9j4A55.A8Z(C9j1.A00, c9iZ, 7);
                    i |= 128;
                    break;
                case 8:
                    paymentSelectionJson = (PaymentSelectionJson) c9j4A55.A8Z(PaymentSelectionJson$$serializer.INSTANCE, c9iZ, 8);
                    i |= 256;
                    break;
                case 9:
                    listA0Q = C3cJ.A0Q(c9iZ, c9j4A55, f0cArr, 9);
                    i |= 512;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        StripeLinkCheckoutApprovalJson$$serializer stripeLinkCheckoutApprovalJson$$serializer = new StripeLinkCheckoutApprovalJson$$serializer();
        INSTANCE = stripeLinkCheckoutApprovalJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.gateway.StripeLinkCheckoutApprovalJson", stripeLinkCheckoutApprovalJson$$serializer, 10);
        c9iKA1C.A08("version", true);
        C3cJ.A0n("merchant_url", c9iKA1C);
        c9iKA1C.A08("payment_method_label", true);
        c9iKA1C.A08("card_brand", true);
        c9iKA1C.A08("card_last4", true);
        c9iKA1C.A08("card_expires_in_ms", true);
        c9iKA1C.A08("payment_selection", true);
        c9iKA1C.A08("payment_options", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = StripeLinkCheckoutApprovalJson.$childSerializers;
        C07729ii c07729ii = C07729ii.A00;
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c07729ii, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(C9j1.A00), AbstractC07749im.A00(PaymentSelectionJson$$serializer.INSTANCE), C3cG.A16(f0cArr, 9)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, StripeLinkCheckoutApprovalJson stripeLinkCheckoutApprovalJson) {
        AnonymousClass003.A0u(interfaceC07789is, stripeLinkCheckoutApprovalJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        StripeLinkCheckoutApprovalJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(stripeLinkCheckoutApprovalJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
