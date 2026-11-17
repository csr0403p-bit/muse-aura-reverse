package com.google.common.collect;

import X.DNX;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Queue;

/* JADX WARN: Incorrect class signature: super class is equals to this class */
/* loaded from: classes5.dex */
public final class EvictingQueue<E> extends DNX implements Serializable, Serializable {
    public static final long serialVersionUID = 0;
    public final Queue<E> delegate;
    public final int maxSize;

    public final E element() {
        return this.delegate.element();
    }

    public final E peek() {
        return this.delegate.peek();
    }

    public final E poll() {
        return this.delegate.poll();
    }

    public final E remove() {
        return this.delegate.remove();
    }

    public EvictingQueue(int maxSize) {
        this.delegate = new ArrayDeque(maxSize);
        this.maxSize = maxSize;
    }

    public final boolean offer(E e) {
        return add(e);
    }

    public EvictingQueue() {
    }
}
