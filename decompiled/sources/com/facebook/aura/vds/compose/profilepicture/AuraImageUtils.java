package com.facebook.aura.vds.compose.profilepicture;

import X.C7195Ei7;
import X.C7196Ei8;
import X.C7197Ei9;
import X.C7384Etj;
import X.InterfaceC8647Fhz;

/* loaded from: classes3.dex */
public final class AuraImageUtils {
    public static final int $stable = 8;
    public final InterfaceC8647Fhz defaultContentScale = InterfaceC8647Fhz.A0B;

    public final C7197Ei9 createProfilePictureImageOptions(InterfaceC8647Fhz interfaceC8647Fhz) {
        C7384Etj.A0Y(interfaceC8647Fhz, 0);
        C7196Ei8 c7196Ei8A00 = C7197Ei9.A00();
        c7196Ei8A00.A0I = true;
        ((C7195Ei7) c7196Ei8A00).A01 = interfaceC8647Fhz;
        return new C7197Ei9(c7196Ei8A00);
    }

    public final InterfaceC8647Fhz getDefaultContentScale() {
        return this.defaultContentScale;
    }
}
