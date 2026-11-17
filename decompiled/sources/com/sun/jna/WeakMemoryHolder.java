package com.sun.jna;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.IdentityHashMap;

/* loaded from: classes5.dex */
public class WeakMemoryHolder {
    public ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
    public IdentityHashMap<Reference<Object>, Memory> backingMap = new IdentityHashMap<>();

    public synchronized void clean() {
        while (true) {
            Reference<? extends Object> referencePoll = this.referenceQueue.poll();
            if (referencePoll != null) {
                this.backingMap.remove(referencePoll);
            }
        }
    }

    public synchronized void put(Object obj, Memory memory) {
        clean();
        this.backingMap.put(new WeakReference(obj, this.referenceQueue), memory);
    }
}
