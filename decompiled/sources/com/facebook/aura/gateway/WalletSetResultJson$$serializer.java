package com.facebook.aura.gateway;

import X.AbstractC07749im;
import X.AnonymousClass003;
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
/* loaded from: classes2.dex */
public final /* synthetic */ class WalletSetResultJson$$serializer implements C9cd<WalletSetResultJson> {
    public static final int $stable = 0;
    public static final WalletSetResultJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final WalletSetResultJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA0v = null;
        PaymentSelectionJson paymentSelectionJson = null;
        WalletPaymentDetailsJson walletPaymentDetailsJson = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new WalletSetResultJson(i, strA0v, paymentSelectionJson, walletPaymentDetailsJson, (C2hx) null);
            }
            if (iA8N == 0) {
                strA0v = C3cI.A0v(c9iZ, c9j4A55, 0);
                i |= 1;
            } else if (iA8N == 1) {
                paymentSelectionJson = (PaymentSelectionJson) c9j4A55.A8Z(PaymentSelectionJson$$serializer.INSTANCE, c9iZ, 1);
                i |= 2;
            } else {
                if (iA8N != 2) {
                    throw C3cG.A17(iA8N);
                }
                walletPaymentDetailsJson = (WalletPaymentDetailsJson) c9j4A55.A8Z(WalletPaymentDetailsJson$$serializer.INSTANCE, c9iZ, 2);
                i |= 4;
            }
        }
    }

    static {
        WalletSetResultJson$$serializer walletSetResultJson$$serializer = new WalletSetResultJson$$serializer();
        INSTANCE = walletSetResultJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.gateway.WalletSetResultJson", walletSetResultJson$$serializer, 3);
        c9iKA1C.A08("approval_id", true);
        c9iKA1C.A08("payment_selection", true);
        c9iKA1C.A08("payment_details", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return descriptor;
    }

    @Override // X.C9cd
    public /* bridge */ C9hr<?>[] typeParametersSerializers() {
        return C5hV.A00;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        return C3cG.A1b(WalletPaymentDetailsJson$$serializer.INSTANCE, C3cG.A15(), AbstractC07749im.A00(PaymentSelectionJson$$serializer.INSTANCE));
    }

    @Override // X.C9hv
    public final void serialize(InterfaceC07789is interfaceC07789is, WalletSetResultJson walletSetResultJson) {
        AnonymousClass003.A0u(interfaceC07789is, walletSetResultJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        WalletSetResultJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(walletSetResultJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
