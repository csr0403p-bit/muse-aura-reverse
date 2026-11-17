package com.facebook.aura.gateway;

import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.BLG;
import X.C1BN;
import X.C3Pi;
import X.C9286GCn;

/* loaded from: classes2.dex */
public final class HatchBackgroundSession {
    public static final int $stable = 0;
    public static final HatchBackgroundSession INSTANCE = new HatchBackgroundSession();
    public static final BLG<Boolean> _isActive;
    public static final C1BN<Boolean> isActiveFlow;

    static {
        C9286GCn c9286GCnA0v = AnonymousClass002.A0v(false);
        _isActive = c9286GCnA0v;
        isActiveFlow = C3Pi.A00(c9286GCnA0v);
    }

    public final void end() {
        AnonymousClass004.A1D(false, _isActive);
    }

    public final boolean isActive() {
        return AnonymousClass003.A1Z(_isActive);
    }

    public final C1BN<Boolean> isActiveFlow() {
        return isActiveFlow;
    }

    public final void start() {
        AnonymousClass004.A1D(true, _isActive);
    }
}
