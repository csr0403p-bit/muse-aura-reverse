package com.facebook.aura.gateway;

import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.BLG;
import X.C1BN;
import X.C3Pi;
import X.C9286GCn;

/* loaded from: classes3.dex */
public final class NodeForegroundServiceState {
    public static final int $stable = 0;
    public static final NodeForegroundServiceState INSTANCE = new NodeForegroundServiceState();
    public static final BLG<Boolean> _isForeground;
    public static final C1BN<Boolean> isForegroundFlow;

    static {
        C9286GCn c9286GCnA0v = AnonymousClass002.A0v(false);
        _isForeground = c9286GCnA0v;
        isForegroundFlow = C3Pi.A00(c9286GCnA0v);
    }

    public final boolean isForeground() {
        return AnonymousClass003.A1Z(_isForeground);
    }

    public final C1BN<Boolean> isForegroundFlow() {
        return isForegroundFlow;
    }

    public final void setForeground(boolean z) {
        AnonymousClass004.A1D(z, _isForeground);
    }
}
