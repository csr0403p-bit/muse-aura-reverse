package com.facebook.aura.devices.pairing;

import X.C3cI;
import X.C7384Etj;
import X.G0U;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class PendingBleCallback<T> {
    public final G0U<T, Unit> callback;
    public final AtomicBoolean hasCompleted;

    /* JADX WARN: Multi-variable type inference failed */
    public PendingBleCallback(G0U<? super T, Unit> g0u) {
        C7384Etj.A0Y(g0u, 0);
        this.callback = g0u;
        this.hasCompleted = new AtomicBoolean(false);
    }

    public final boolean isFor(G0U<? super T, Unit> g0u) {
        C7384Etj.A0Y(g0u, 0);
        return this.callback == g0u;
    }

    public final void cancel() {
        this.hasCompleted.set(true);
    }

    public final void complete(T t) {
        if (C3cI.A1W(this.hasCompleted)) {
            this.callback.invoke(t);
        }
    }
}
