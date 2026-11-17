package X;

import com.google.common.base.Preconditions;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes5.dex */
public abstract class E8U<T> implements Iterator<T> {
    public int A00;
    public int A01 = -1;
    public E8T<K, V> A02;

    /* JADX WARN: Incorrect inner types in field signature: LX/E8S<TK;TV;>.WriteThroughEntry; */
    public DT5 A03;

    /* JADX WARN: Incorrect inner types in field signature: LX/E8S<TK;TV;>.WriteThroughEntry; */
    public DT5 A04;
    public E8b<K, V> A05;
    public AtomicReferenceArray<E8b<K, V>> A06;
    public final /* synthetic */ E8S A07;

    /* JADX WARN: Code restructure failed: missing block: B:40:0x003a, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.E8U r3) {
        /*
            r0 = 0
            r3.A04 = r0
            X.E8b<K, V> r0 = r3.A05
            if (r0 == 0) goto L3a
        L7:
            X.E8b r0 = r0.AHy()
            r3.A05 = r0
            if (r0 == 0) goto L3a
            boolean r0 = r3.A01(r0)
            if (r0 != 0) goto L69
            X.E8b<K, V> r0 = r3.A05
            goto L7
        L18:
            int r2 = r3.A00
            if (r2 < 0) goto L69
            X.E8S r0 = r3.A07
            X.E8T<K, V>[] r1 = r0.A0J
            int r0 = r2 + (-1)
            r3.A00 = r0
            r0 = r1[r2]
            r3.A02 = r0
            int r0 = r0.count
            if (r0 == 0) goto L18
            X.E8T<K, V> r0 = r3.A02
            java.util.concurrent.atomic.AtomicReferenceArray<X.E8b<K, V>> r0 = r0.table
            r3.A06 = r0
            int r0 = r0.length()
            int r0 = r0 + (-1)
            r3.A01 = r0
        L3a:
            int r2 = r3.A01
            if (r2 < 0) goto L18
            java.util.concurrent.atomic.AtomicReferenceArray<X.E8b<K, V>> r1 = r3.A06
            int r0 = r2 + (-1)
            r3.A01 = r0
            java.lang.Object r0 = r1.get(r2)
            X.E8b r0 = (X.E8b) r0
            r3.A05 = r0
            if (r0 == 0) goto L3a
            boolean r0 = r3.A01(r0)
            if (r0 != 0) goto L69
            X.E8b<K, V> r0 = r3.A05
            if (r0 == 0) goto L3a
        L58:
            X.E8b r0 = r0.AHy()
            r3.A05 = r0
            if (r0 == 0) goto L3a
            boolean r0 = r3.A01(r0)
            if (r0 != 0) goto L69
            X.E8b<K, V> r0 = r3.A05
            goto L58
        L69:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E8U.A00(X.E8U):void");
    }

    public E8U(final E8S this$0) {
        this.A07 = this$0;
        this.A00 = this$0.A0J.length - 1;
        A00(this);
    }

    private final boolean A01(E8b<K, V> entry) {
        Object obj;
        try {
            E8S e8s = this.A07;
            long j = e8s.A0B.read();
            Object key = entry.getKey();
            if (entry.getKey() == null || (obj = entry.AMU().get()) == null || e8s.A01(entry, j)) {
                this.A02.A0H();
                return false;
            }
            this.A04 = new DT5(e8s, key, obj);
            this.A02.A0H();
            return true;
        } catch (Throwable th) {
            this.A02.A0H();
            throw th;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return AnonymousClass002.A1X(this.A04);
    }

    @Override // java.util.Iterator
    public final T next() {
        if (this instanceof DT8) {
            DT5 dt5 = this.A04;
            if (dt5 == null) {
                throw C8j3.A1D();
            }
            this.A03 = dt5;
            A00(this);
            return (T) this.A03.getValue();
        }
        boolean z = this instanceof DT9;
        DT5 dt52 = this.A04;
        if (z) {
            if (dt52 == null) {
                throw C8j3.A1D();
            }
            this.A03 = dt52;
            A00(this);
            return (T) this.A03.getKey();
        }
        if (dt52 == null) {
            throw C8j3.A1D();
        }
        this.A03 = dt52;
        A00(this);
        return (T) this.A03;
    }

    @Override // java.util.Iterator
    public final void remove() {
        DT5 dt5 = this.A03;
        Preconditions.checkState(AnonymousClass002.A1X(dt5));
        this.A07.remove(dt5.getKey());
        this.A03 = null;
    }
}
