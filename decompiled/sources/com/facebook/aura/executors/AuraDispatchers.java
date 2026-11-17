package com.facebook.aura.executors;

import X.AbstractC7429Evm;
import X.AbstractC9266GBt;
import X.B8t;
import X.C78T;
import X.GB9;
import X.GBK;
import X.Hy1;
import java.util.concurrent.ExecutorService;

/* loaded from: classes5.dex */
public final class AuraDispatchers {
    public static final AuraDispatchers INSTANCE = new AuraDispatchers();
    public static final GB9 main;
    public static final GBK mainImmediate;
    public static final GBK unconfinedUndispatched;

    static {
        GBK gbk = AbstractC9266GBt.A00;
        GB9 gb9 = AbstractC7429Evm.A00;
        main = gb9;
        mainImmediate = ((B8t) gb9).A01;
        unconfinedUndispatched = new UnconfinedUndispatchedDispatcher();
    }

    /* renamed from: default, reason: not valid java name */
    public final C78T m764default() {
        return new Hy1((ExecutorService) AuraExecutors.backgroundThreadExecutor$delegate.getValue());
    }

    public final GB9 getMain() {
        return main;
    }

    public final GBK getMainImmediate() {
        return mainImmediate;
    }

    public final GBK getUnconfinedUndispatched() {
        return unconfinedUndispatched;
    }

    public final C78T io() {
        return new Hy1((ExecutorService) AuraExecutors.ioExecutor$delegate.getValue());
    }
}
