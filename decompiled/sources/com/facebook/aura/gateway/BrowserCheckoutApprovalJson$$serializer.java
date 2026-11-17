package com.facebook.aura.gateway;

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
import X.C9j1;
import X.C9j4;
import X.C9j5;
import X.F0C;
import X.Hs1;
import X.InterfaceC07789is;
import X.InterfaceC07829iw;
import com.facebook.aura.notifications.push.HatchChatNotificationIds;
import java.util.List;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class BrowserCheckoutApprovalJson$$serializer implements C9cd<BrowserCheckoutApprovalJson> {
    public static final int $stable = 0;
    public static final BrowserCheckoutApprovalJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final BrowserCheckoutApprovalJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = BrowserCheckoutApprovalJson.$childSerializers;
        String strA0g = null;
        Boolean bool = null;
        PaymentSelectionJson paymentSelectionJson = null;
        String strA0g2 = null;
        CheckoutTabJson checkoutTabJson = null;
        Long l = null;
        String strA0g3 = null;
        String strA0g4 = null;
        CheckoutScreenshotJson checkoutScreenshotJson = null;
        String strA0h = null;
        String strA0g5 = null;
        String strA0i = null;
        List list = null;
        int i = 0;
        int iA8U = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new BrowserCheckoutApprovalJson(i, iA8U, strA0i, strA0g, strA0g5, strA0g4, strA0h, strA0g3, l, checkoutTabJson, checkoutScreenshotJson, strA0g2, paymentSelectionJson, list, bool, (C2hx) null);
                case 0:
                    iA8U = c9j4A55.A8U(c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    strA0i = C3cI.A0i(c9iZ, c9j4A55);
                    i |= 2;
                    break;
                case 2:
                    strA0g = C3cI.A0g(c9iZ, c9j4A55);
                    i |= 4;
                    break;
                case 3:
                    strA0g5 = C3cH.A0g(C07779iq.A01, c9iZ, c9j4A55, 3);
                    i |= 8;
                    break;
                case 4:
                    strA0g4 = C3cH.A0g(C07779iq.A01, c9iZ, c9j4A55, 4);
                    i |= 16;
                    break;
                case 5:
                    strA0h = C3cI.A0h(c9iZ, c9j4A55);
                    i |= 32;
                    break;
                case 6:
                    strA0g3 = C3cH.A0g(C07779iq.A01, c9iZ, c9j4A55, 6);
                    i |= 64;
                    break;
                case 7:
                    l = (Long) c9j4A55.A8Z(C9j1.A00, c9iZ, 7);
                    i |= 128;
                    break;
                case 8:
                    checkoutTabJson = (CheckoutTabJson) c9j4A55.A8Z(CheckoutTabJson$$serializer.INSTANCE, c9iZ, 8);
                    i |= 256;
                    break;
                case 9:
                    checkoutScreenshotJson = (CheckoutScreenshotJson) c9j4A55.A8Z(CheckoutScreenshotJson$$serializer.INSTANCE, c9iZ, 9);
                    i |= 512;
                    break;
                case 10:
                    strA0g2 = C3cH.A0g(C07779iq.A01, c9iZ, c9j4A55, 10);
                    i |= 1024;
                    break;
                case 11:
                    paymentSelectionJson = (PaymentSelectionJson) c9j4A55.A8Z(PaymentSelectionJson$$serializer.INSTANCE, c9iZ, 11);
                    i |= 2048;
                    break;
                case 12:
                    list = (List) C3cJ.A0E(c9iZ, c9j4A55, f0cArr, 12);
                    i |= 4096;
                    break;
                case 13:
                    bool = (Boolean) c9j4A55.A8Z(C07839ix.A00, c9iZ, 13);
                    i |= 8192;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        BrowserCheckoutApprovalJson$$serializer browserCheckoutApprovalJson$$serializer = new BrowserCheckoutApprovalJson$$serializer();
        INSTANCE = browserCheckoutApprovalJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.gateway.BrowserCheckoutApprovalJson", browserCheckoutApprovalJson$$serializer, 14);
        c9iKA1C.A08("version", true);
        c9iKA1C.A08("merchant_url", true);
        c9iKA1C.A08("payment_method_label", true);
        c9iKA1C.A08("card_brand", true);
        C3cJ.A0n("card_last4", c9iKA1C);
        c9iKA1C.A08("card_expires_in_ms", true);
        c9iKA1C.A08("tab", true);
        c9iKA1C.A08("screenshot", true);
        c9iKA1C.A08(HatchChatNotificationIds.PARAM_BROWSER_TASK_ID, true);
        c9iKA1C.A08("payment_selection", true);
        c9iKA1C.A08("payment_options", true);
        c9iKA1C.A08("network_token_eligible", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = BrowserCheckoutApprovalJson.$childSerializers;
        C07729ii c07729ii = C07729ii.A00;
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c07729ii, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(C9j1.A00), AbstractC07749im.A00(CheckoutTabJson$$serializer.INSTANCE), AbstractC07749im.A00(CheckoutScreenshotJson$$serializer.INSTANCE), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(PaymentSelectionJson$$serializer.INSTANCE), C3cG.A16(f0cArr, 12), AbstractC07749im.A00(C07839ix.A00)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, BrowserCheckoutApprovalJson browserCheckoutApprovalJson) {
        AnonymousClass003.A0u(interfaceC07789is, browserCheckoutApprovalJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        BrowserCheckoutApprovalJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(browserCheckoutApprovalJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
