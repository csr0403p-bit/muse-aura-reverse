package com.facebook.aura.nodes.transport;

import X.AnonymousClass002;
import X.AnonymousClass004;
import X.BLG;
import X.C1BN;
import X.C3Pi;
import X.C9286GCn;

/* loaded from: classes2.dex */
public final class HatchNodeServiceState {
    public static final HatchNodeServiceState INSTANCE = new HatchNodeServiceState();
    public static final C1BN<Boolean> isForeground;
    public static final BLG<Boolean> mutableForeground;

    static {
        C9286GCn c9286GCnA0v = AnonymousClass002.A0v(false);
        mutableForeground = c9286GCnA0v;
        isForeground = C3Pi.A00(c9286GCnA0v);
    }

    public final C1BN<Boolean> isForeground() {
        return isForeground;
    }

    public final void running() {
        AnonymousClass004.A1D(true, mutableForeground);
    }

    public final void stopped() {
        AnonymousClass004.A1D(false, mutableForeground);
    }
}
