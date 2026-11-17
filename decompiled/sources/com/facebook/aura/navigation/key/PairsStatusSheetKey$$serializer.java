package com.facebook.aura.navigation.key;

import X.AnonymousClass003;
import X.C07779iq;
import X.C07839ix;
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
/* loaded from: classes3.dex */
public final /* synthetic */ class PairsStatusSheetKey$$serializer implements C9cd<PairsStatusSheetKey> {
    public static final PairsStatusSheetKey$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final PairsStatusSheetKey deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = PairsStatusSheetKey.$childSerializers;
        String strA8f = null;
        PairsRole pairsRole = null;
        boolean zA8G = false;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new PairsStatusSheetKey(i, strA8f, pairsRole, zA8G, null);
            }
            if (iA8N == 0) {
                strA8f = c9j4A55.A8f(c9iZ, 0);
                i |= 1;
            } else if (iA8N == 1) {
                pairsRole = (PairsRole) C3cJ.A0F(c9iZ, c9j4A55, f0cArr, 1);
                i |= 2;
            } else {
                if (iA8N != 2) {
                    throw C3cG.A17(iA8N);
                }
                zA8G = c9j4A55.A8G(c9iZ, 2);
                i |= 4;
            }
        }
    }

    static {
        PairsStatusSheetKey$$serializer pairsStatusSheetKey$$serializer = new PairsStatusSheetKey$$serializer();
        INSTANCE = pairsStatusSheetKey$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.navigation.key.PairsStatusSheetKey", pairsStatusSheetKey$$serializer, 3);
        c9iKA1C.A08("generationId", false);
        c9iKA1C.A08("role", false);
        c9iKA1C.A08("fromHub", false);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        return new C9hr[]{C07779iq.A01, C3cH.A10(PairsStatusSheetKey.$childSerializers), C07839ix.A00};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, PairsStatusSheetKey pairsStatusSheetKey) {
        AnonymousClass003.A0u(interfaceC07789is, pairsStatusSheetKey);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        PairsStatusSheetKey.write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_keys_keys(pairsStatusSheetKey, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
