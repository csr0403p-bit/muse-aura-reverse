package com.google.common.util.concurrent;

import X.CNV;
import X.CNW;
import X.EnumC3451CNw;
import X.InterfaceExecutorServiceC3065Bwn;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes5.dex */
public final class MoreExecutors {
    public static InterfaceExecutorServiceC3065Bwn A00(ExecutorService delegate) {
        return delegate instanceof InterfaceExecutorServiceC3065Bwn ? (InterfaceExecutorServiceC3065Bwn) delegate : delegate instanceof ScheduledExecutorService ? new CNW((ScheduledExecutorService) delegate) : new CNV(delegate);
    }

    public static Executor directExecutor() {
        return EnumC3451CNw.A01;
    }
}
