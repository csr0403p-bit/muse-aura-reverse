package com.facebook.aura.navigation.key;

import X.AnonymousClass003;
import X.C07779iq;
import X.C3cG;
import X.C3cH;
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
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class CheckoutLodgingPolicySheetKey$$serializer implements C9cd<CheckoutLodgingPolicySheetKey> {
    public static final CheckoutLodgingPolicySheetKey$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final CheckoutLodgingPolicySheetKey deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = CheckoutLodgingPolicySheetKey.$childSerializers;
        CheckoutLodgingPolicy checkoutLodgingPolicy = null;
        String strA8f = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new CheckoutLodgingPolicySheetKey(i, strA8f, checkoutLodgingPolicy, null);
            }
            if (iA8N == 0) {
                strA8f = c9j4A55.A8f(c9iZ, 0);
                i |= 1;
            } else {
                if (iA8N != 1) {
                    throw C3cG.A17(iA8N);
                }
                checkoutLodgingPolicy = (CheckoutLodgingPolicy) C3cJ.A0F(c9iZ, c9j4A55, f0cArr, 1);
                i |= 2;
            }
        }
    }

    static {
        CheckoutLodgingPolicySheetKey$$serializer checkoutLodgingPolicySheetKey$$serializer = new CheckoutLodgingPolicySheetKey$$serializer();
        INSTANCE = checkoutLodgingPolicySheetKey$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.navigation.key.CheckoutLodgingPolicySheetKey", checkoutLodgingPolicySheetKey$$serializer, 2);
        c9iKA1C.A08("approvalId", false);
        c9iKA1C.A08("policy", false);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        return C3cH.A1b(C07779iq.A01, CheckoutLodgingPolicySheetKey.$childSerializers);
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
    public final void serialize(InterfaceC07789is interfaceC07789is, CheckoutLodgingPolicySheetKey checkoutLodgingPolicySheetKey) {
        AnonymousClass003.A0u(interfaceC07789is, checkoutLodgingPolicySheetKey);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        CheckoutLodgingPolicySheetKey.write$Self$fbandroid_express_aura_java_com_facebook_aura_navigation_key_key(checkoutLodgingPolicySheetKey, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
