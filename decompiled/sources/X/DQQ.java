package X;

import com.google.common.base.Preconditions;
import com.google.common.collect.CompactHashMap;
import com.google.common.collect.CompactLinkedHashMap;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* loaded from: classes5.dex */
public abstract class DQQ<T> implements Iterator<T> {
    public int A00;
    public int A01;
    public int A02;
    public final /* synthetic */ CompactHashMap A03;

    public DQQ(final CompactHashMap this$0) {
        int i;
        this.A03 = this$0;
        this.A01 = this$0.A00;
        if (this$0 instanceof CompactLinkedHashMap) {
            i = ((CompactLinkedHashMap) this$0).A00;
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
    public final T next() {
        Object[] objArr;
        T t;
        CompactHashMap compactHashMap = this.A03;
        if (compactHashMap.A00 != this.A01) {
            throw new ConcurrentModificationException();
        }
        if (!hasNext()) {
            throw C8j3.A1D();
        }
        int i = this.A00;
        this.A02 = i;
        if (this instanceof DQW) {
            objArr = ((DQW) this).A00.A05;
        } else {
            if (this instanceof DQX) {
                t = (T) new DQT(((DQX) this).A00, i);
                this.A00 = compactHashMap.A04(this.A00);
                return t;
            }
            objArr = ((DQY) this).A00.A04;
        }
        objArr.getClass();
        t = (T) objArr[i];
        this.A00 = compactHashMap.A04(this.A00);
        return t;
    }

    @Override // java.util.Iterator
    public final void remove() {
        CompactHashMap compactHashMap = this.A03;
        if (compactHashMap.A00 != this.A01) {
            throw new ConcurrentModificationException();
        }
        Preconditions.checkState(C8j3.A1Q(this.A02), "no calls to next() since the last call to remove()");
        this.A01 += 32;
        int i = this.A02;
        Object[] objArr = compactHashMap.A04;
        objArr.getClass();
        compactHashMap.remove(objArr[i]);
        int i2 = this.A00;
        int i3 = this.A02;
        if (!(compactHashMap instanceof CompactLinkedHashMap)) {
            i2--;
        } else if (i2 >= compactHashMap.size()) {
            i2 = i3;
        }
        this.A00 = i2;
        this.A02 = -1;
    }
}
