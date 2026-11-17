package com.facebook.aura.globaleffects.api;

import X.C0981AMm;
import X.C60O;
import X.HxE;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes4.dex */
public final class FloatingWindowRegistry {
    public final AtomicLong nextId = new AtomicLong();
    public final C0981AMm<Long, FloatingWindow> windows = new C0981AMm<>();
    public final List<HxE<Integer, AppFloatingLayer>> layers = C60O.A11(0);

    public final List<HxE<Integer, AppFloatingLayer>> getLayers() {
        return this.layers;
    }

    public final AtomicLong getNextId() {
        return this.nextId;
    }

    public final C0981AMm<Long, FloatingWindow> getWindows() {
        return this.windows;
    }
}
