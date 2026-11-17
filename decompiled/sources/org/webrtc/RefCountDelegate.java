package org.webrtc;

import X.BV5;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes5.dex */
public class RefCountDelegate implements RefCounted {
    public final AtomicInteger refCount = BV5.A18();
    public final Runnable releaseCallback;

    @Override // org.webrtc.RefCounted
    public void release() {
        Runnable runnable;
        if (this.refCount.decrementAndGet() != 0 || (runnable = this.releaseCallback) == null) {
            return;
        }
        runnable.run();
    }

    @Override // org.webrtc.RefCounted
    public void retain() {
        this.refCount.incrementAndGet();
    }

    public boolean safeRetain() {
        int i;
        do {
            i = this.refCount.get();
            if (i == 0) {
                return false;
            }
        } while (!this.refCount.weakCompareAndSet(i, i + 1));
        return true;
    }

    public RefCountDelegate(Runnable runnable) {
        this.releaseCallback = runnable;
    }
}
