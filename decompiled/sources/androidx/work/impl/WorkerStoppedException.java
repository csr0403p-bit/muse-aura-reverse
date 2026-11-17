package androidx.work.impl;

import java.util.concurrent.CancellationException;

/* loaded from: classes5.dex */
public final class WorkerStoppedException extends CancellationException {
    public final int reason;

    public WorkerStoppedException(int i) {
        this.reason = i;
    }
}
