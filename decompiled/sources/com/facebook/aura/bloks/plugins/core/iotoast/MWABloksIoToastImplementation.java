package com.facebook.aura.bloks.plugins.core.iotoast;

import X.C3cG;
import X.C7384Etj;
import X.F6D;
import X.Hj6;
import android.widget.Toast;

/* loaded from: classes3.dex */
public final class MWABloksIoToastImplementation {
    public static final MWABloksIoToastImplementation INSTANCE = new MWABloksIoToastImplementation();

    public static final Object evaluate(Hj6 hj6, F6D f6d) {
        C7384Etj.A0Y(hj6, 0);
        Toast.makeText(C3cG.A06(), (String) hj6.A01[0], 1).show();
        return C3cG.A0T();
    }
}
