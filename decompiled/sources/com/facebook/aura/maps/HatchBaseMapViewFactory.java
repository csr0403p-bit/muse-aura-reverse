package com.facebook.aura.maps;

import X.AFU;
import X.AL9;
import X.C7384Etj;
import X.C9n2;
import android.content.Context;

/* loaded from: classes4.dex */
public final class HatchBaseMapViewFactory implements C9n2 {
    public static final int $stable = 0;
    public static final HatchBaseMapViewFactory INSTANCE = new HatchBaseMapViewFactory();
    public static final AFU providerBackedFactory = new AFU(HatchBaseMapViewFactory$providerBackedFactory$1.INSTANCE);

    @Override // X.C9n2
    public AL9 createView(Context context) {
        C7384Etj.A0Y(context, 0);
        return providerBackedFactory.createView(context);
    }
}
