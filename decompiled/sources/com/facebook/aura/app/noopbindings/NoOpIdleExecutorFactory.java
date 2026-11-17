package com.facebook.aura.app.noopbindings;

import X.Bwm;
import X.C8j3;
import java.util.concurrent.ExecutorService;

/* loaded from: classes5.dex */
public final class NoOpIdleExecutorFactory {
    public Bwm create(ExecutorService executorService) {
        throw C8j3.A18("IdleExecutor is not used in Aura");
    }
}
