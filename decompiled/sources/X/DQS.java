package X;

import com.google.common.base.Preconditions;
import com.google.common.collect.CompactHashSet;
import com.google.common.collect.CompactLinkedHashSet;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [E] */
/* loaded from: classes5.dex */
public final class DQS<E> implements Iterator<E> {
    public int A00;
    public int A01;
    public int A02;
    public final /* synthetic */ CompactHashSet A03;

    public DQS(final CompactHashSet this$0) {
        int i;
        this.A03 = this$0;
        this.A01 = this$0.A00;
        if (this$0 instanceof CompactLinkedHashSet) {
            i = ((CompactLinkedHashSet) this$0).A00;
        } else {
            i = 0;
            if (this$0.isEmpty()) {
                i = -1;
            }
        }
        this.A00 = i;
        this.A02 = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return C8j3.A1Q(this.A00);
    }

    @Override // java.util.Iterator
    public final E next() {
        CompactHashSet compactHashSet = this.A03;
        if (compactHashSet.A00 != this.A01) {
            throw new ConcurrentModificationException();
        }
        if (!hasNext()) {
            throw C8j3.A1D();
        }
        int i = this.A00;
        this.A02 = i;
        Object[] objArr = compactHashSet.A03;
        objArr.getClass();
        E e = (E) objArr[i];
        this.A00 = compactHashSet.A03(this.A00);
        return e;
    }

    @Override // java.util.Iterator
    public final void remove() {
        CompactHashSet compactHashSet = this.A03;
        if (compactHashSet.A00 != this.A01) {
            throw new ConcurrentModificationException();
        }
        Preconditions.checkState(C8j3.A1Q(this.A02), "no calls to next() since the last call to remove()");
        this.A01 += 32;
        int i = this.A02;
        Object[] objArr = compactHashSet.A03;
        objArr.getClass();
        compactHashSet.remove(objArr[i]);
        int i2 = this.A00;
        int i3 = this.A02;
        if (!(compactHashSet instanceof CompactLinkedHashSet)) {
            i2--;
        } else if (i2 >= compactHashSet.size()) {
            i2 = i3;
        }
        this.A00 = i2;
        this.A02 = -1;
    }
}
