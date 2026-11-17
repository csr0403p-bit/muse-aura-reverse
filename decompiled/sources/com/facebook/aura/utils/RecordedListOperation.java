package com.facebook.aura.utils;

import X.C7384Etj;

/* loaded from: classes3.dex */
public final class RecordedListOperation<T> {
    public static final int $stable = 0;
    public final int index;
    public final T item;
    public final ListOperation operation;

    public RecordedListOperation(ListOperation listOperation, int i, T t) {
        C7384Etj.A0Y(listOperation, 0);
        this.operation = listOperation;
        this.index = i;
        this.item = t;
    }

    public final int getIndex() {
        return this.index;
    }

    public final T getItem() {
        return this.item;
    }

    public final ListOperation getOperation() {
        return this.operation;
    }
}
