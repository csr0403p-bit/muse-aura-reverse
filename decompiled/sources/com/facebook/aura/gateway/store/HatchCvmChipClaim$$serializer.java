package com.facebook.aura.gateway.store;

import X.AnonymousClass003;
import X.C07779iq;
import X.C07839ix;
import X.C2hx;
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
import java.util.List;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes4.dex */
public final /* synthetic */ class HatchCvmChipClaim$$serializer implements C9cd<HatchCvmChipClaim> {
    public static final HatchCvmChipClaim$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final HatchCvmChipClaim deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = HatchCvmChipClaim.$childSerializers;
        String strA8f = null;
        HatchCvmChipClaimDisposition hatchCvmChipClaimDisposition = null;
        List listA0P = null;
        String strA8f2 = null;
        String strA0h = null;
        boolean zA8G = false;
        boolean zA8G2 = false;
        boolean zA8G3 = false;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new HatchCvmChipClaim(i, strA8f2, strA0h, listA0P, strA8f, hatchCvmChipClaimDisposition, zA8G3, zA8G2, zA8G, (C2hx) null);
                case 0:
                    strA8f2 = c9j4A55.A8f(c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    strA0h = C3cH.A0h(c9iZ, c9j4A55);
                    i |= 2;
                    break;
                case 2:
                    listA0P = C3cJ.A0P(c9iZ, c9j4A55, f0cArr, 2);
                    i |= 4;
                    break;
                case 3:
                    strA8f = c9j4A55.A8f(c9iZ, 3);
                    i |= 8;
                    break;
                case 4:
                    hatchCvmChipClaimDisposition = (HatchCvmChipClaimDisposition) C3cJ.A0F(c9iZ, c9j4A55, f0cArr, 4);
                    i |= 16;
                    break;
                case 5:
                    zA8G3 = c9j4A55.A8G(c9iZ, 5);
                    i |= 32;
                    break;
                case 6:
                    zA8G2 = c9j4A55.A8G(c9iZ, 6);
                    i |= 64;
                    break;
                case 7:
                    zA8G = c9j4A55.A8G(c9iZ, 7);
                    i |= 128;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        HatchCvmChipClaim$$serializer hatchCvmChipClaim$$serializer = new HatchCvmChipClaim$$serializer();
        INSTANCE = hatchCvmChipClaim$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.gateway.store.HatchCvmChipClaim", hatchCvmChipClaim$$serializer, 8);
        c9iKA1C.A08("attemptId", false);
        c9iKA1C.A08("nonce", false);
        c9iKA1C.A08("chipIds", false);
        c9iKA1C.A08("allowlistVersion", false);
        c9iKA1C.A08("disposition", false);
        c9iKA1C.A08("isReplacementChipPinned", true);
        c9iKA1C.A08("bidsWithHostData", true);
        c9iKA1C.A08("enrollmentPinned", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = HatchCvmChipClaim.$childSerializers;
        C07779iq c07779iq = C07779iq.A01;
        C9hr c9hrA11 = C3cH.A11(f0cArr);
        C9hr c9hrA13 = C3cH.A13(f0cArr);
        C07839ix c07839ix = C07839ix.A00;
        return new C9hr[]{c07779iq, c07779iq, c9hrA11, c07779iq, c9hrA13, c07839ix, c07839ix, c07839ix};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, HatchCvmChipClaim hatchCvmChipClaim) {
        AnonymousClass003.A0u(interfaceC07789is, hatchCvmChipClaim);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        HatchCvmChipClaim.write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_store_store(hatchCvmChipClaim, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
