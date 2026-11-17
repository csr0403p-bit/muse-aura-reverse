package com.facebook.aura.network.transport.tigon.internal;

import X.BV5;
import X.C60O;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes5.dex */
public final class NoisePauseGate {
    public final AtomicBoolean paused = C60O.A1E();
    public final AtomicReference<Thread> writerThread = BV5.A1A();

    public final void captureWriterThread() {
        this.writerThread.set(Thread.currentThread());
    }

    public final boolean isPaused() {
        return this.paused.get();
    }

    public final void setPaused(boolean z) {
        AtomicBoolean atomicBoolean = this.paused;
        if (z) {
            atomicBoolean.set(true);
        } else {
            atomicBoolean.set(false);
            wakeWriter();
        }
    }

    public final void wakeWriter() {
        LockSupport.unpark(this.writerThread.get());
    }
}
