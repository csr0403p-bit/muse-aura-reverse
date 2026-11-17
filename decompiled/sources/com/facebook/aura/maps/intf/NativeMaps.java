package com.facebook.aura.maps.intf;

import X.AbstractC0878AGe;
import X.BV5;
import X.C3062Bwg;
import X.C5246DeB;
import X.C7384Etj;
import java.util.Set;

/* loaded from: classes5.dex */
public final class NativeMaps {
    public static final int $stable = 0;
    public static final NativeMaps INSTANCE = new NativeMaps();

    public final NativeMapRenderer getRenderer() {
        boolean z;
        Set set = (Set) BV5.A0Z(0);
        if (set instanceof C3062Bwg) {
            C3062Bwg c3062Bwg = (C3062Bwg) set;
            synchronized (c3062Bwg) {
                z = c3062Bwg.A06;
            }
            if (z) {
                c3062Bwg.A05 = C5246DeB.A03;
                c3062Bwg.A06 = false;
            }
        }
        C7384Etj.A0U(set);
        NativeMapRenderer nativeMapRenderer = (NativeMapRenderer) AbstractC0878AGe.A0C(set);
        if (nativeMapRenderer == null || !nativeMapRenderer.isEnabled()) {
            return null;
        }
        return nativeMapRenderer;
    }
}
