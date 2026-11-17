package com.facebook.aura.shopping.model;

import X.AnonymousClass003;
import X.C07729ii;
import X.C07799it;
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
import com.facebook.aura.localbrowser.core.BrowserOperationCatalogKt;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes4.dex */
public final /* synthetic */ class PdpRating$$serializer implements C9cd<PdpRating> {
    public static final int $stable = 0;
    public static final PdpRating$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final PdpRating deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        double dA8M = 0.0d;
        int iA8U = 0;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new PdpRating(i, dA8M, iA8U, null);
            }
            if (iA8N == 0) {
                dA8M = c9j4A55.A8M(c9iZ, 0);
                i |= 1;
            } else {
                if (iA8N != 1) {
                    throw C3cG.A17(iA8N);
                }
                iA8U = c9j4A55.A8U(c9iZ, 1);
                i |= 2;
            }
        }
    }

    static {
        PdpRating$$serializer pdpRating$$serializer = new PdpRating$$serializer();
        INSTANCE = pdpRating$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.shopping.model.PdpRating", pdpRating$$serializer, 2);
        c9iKA1C.A08(BrowserOperationCatalogKt.VALUE, false);
        c9iKA1C.A08("reviewCount", false);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        return new C9hr[]{C07799it.A00, C07729ii.A00};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, PdpRating pdpRating) {
        AnonymousClass003.A0u(interfaceC07789is, pdpRating);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        PdpRating.write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_model_model(pdpRating, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
