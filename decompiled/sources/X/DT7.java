package X;

import java.util.AbstractSet;

/* loaded from: classes5.dex */
public abstract class DT7<T> extends AbstractSet<T> {
    public final /* synthetic */ E8S A00;

    public DT7(final E8S this$0) {
        this.A00 = this$0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.A00.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.A00.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.A00.size();
    }
}
