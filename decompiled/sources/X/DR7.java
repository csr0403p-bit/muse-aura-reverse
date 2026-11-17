package X;

import com.google.common.base.Preconditions;
import com.google.common.collect.MapMakerInternalMap;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes5.dex */
public abstract class DR7<T> implements Iterator<T> {
    public int A00;
    public int A01 = -1;

    /* JADX INFO: Incorrect field signature: TE; */
    public DUZ A02;
    public MapMakerInternalMap.Segment<K, V, E, S> A03;

    /* JADX WARN: Incorrect inner types in field signature: Lcom/google/common/collect/MapMakerInternalMap<TK;TV;TE;TS;>.WriteThroughEntry; */
    public DQi A04;

    /* JADX WARN: Incorrect inner types in field signature: Lcom/google/common/collect/MapMakerInternalMap<TK;TV;TE;TS;>.WriteThroughEntry; */
    public DQi A05;
    public AtomicReferenceArray<E> A06;
    public final /* synthetic */ MapMakerInternalMap A07;

    /* JADX WARN: Code restructure failed: missing block: B:40:0x003a, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.DR7 r3) {
        /*
            r0 = 0
            r3.A05 = r0
            X.DUZ r0 = r3.A02
            if (r0 == 0) goto L3a
        L7:
            X.DUZ r0 = r0.AHz()
            r3.A02 = r0
            if (r0 == 0) goto L3a
            boolean r0 = r3.A01(r0)
            if (r0 != 0) goto L69
            X.DUZ r0 = r3.A02
            goto L7
        L18:
            int r2 = r3.A00
            if (r2 < 0) goto L69
            com.google.common.collect.MapMakerInternalMap r0 = r3.A07
            com.google.common.collect.MapMakerInternalMap$Segment<K, V, E extends X.DUZ<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>>[] r1 = r0.A06
            int r0 = r2 + (-1)
            r3.A00 = r0
            r0 = r1[r2]
            r3.A03 = r0
            int r0 = r0.count
            if (r0 == 0) goto L18
            com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S> r0 = r3.A03
            java.util.concurrent.atomic.AtomicReferenceArray<E extends X.DUZ<K, V, E>> r0 = r0.table
            r3.A06 = r0
            int r0 = r0.length()
            int r0 = r0 + (-1)
            r3.A01 = r0
        L3a:
            int r2 = r3.A01
            if (r2 < 0) goto L18
            java.util.concurrent.atomic.AtomicReferenceArray<E> r1 = r3.A06
            int r0 = r2 + (-1)
            r3.A01 = r0
            java.lang.Object r0 = r1.get(r2)
            X.DUZ r0 = (X.DUZ) r0
            r3.A02 = r0
            if (r0 == 0) goto L3a
            boolean r0 = r3.A01(r0)
            if (r0 != 0) goto L69
            X.DUZ r0 = r3.A02
            if (r0 == 0) goto L3a
        L58:
            X.DUZ r0 = r0.AHz()
            r3.A02 = r0
            if (r0 == 0) goto L3a
            boolean r0 = r3.A01(r0)
            if (r0 != 0) goto L69
            X.DUZ r0 = r3.A02
            goto L58
        L69:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DR7.A00(X.DR7):void");
    }

    public DR7(final MapMakerInternalMap this$0) {
        this.A07 = this$0;
        this.A00 = this$0.A06.length - 1;
        A00(this);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return AnonymousClass002.A1X(this.A05);
    }

    @Override // java.util.Iterator
    public final T next() {
        if (this instanceof DR3) {
            DQi dQi = this.A05;
            if (dQi == null) {
                throw C8j3.A1D();
            }
            this.A04 = dQi;
            A00(this);
            return (T) this.A04.getValue();
        }
        boolean z = this instanceof DR4;
        DQi dQi2 = this.A05;
        if (z) {
            if (dQi2 == null) {
                throw C8j3.A1D();
            }
            this.A04 = dQi2;
            A00(this);
            return (T) this.A04.getKey();
        }
        if (dQi2 == null) {
            throw C8j3.A1D();
        }
        this.A04 = dQi2;
        A00(this);
        return (T) this.A04;
    }

    @Override // java.util.Iterator
    public final void remove() {
        Preconditions.checkState(AnonymousClass002.A1X(this.A04), "no calls to next() since the last call to remove()");
        this.A07.remove(this.A04.getKey());
        this.A04 = null;
    }

    /* JADX WARN: Incorrect types in method signature: (TE;)Z */
    private final boolean A01(DUZ entry) {
        Object value;
        try {
            Object key = entry.getKey();
            MapMakerInternalMap mapMakerInternalMap = this.A07;
            if (entry.getKey() == null || (value = entry.getValue()) == null) {
                this.A03.A06();
                return false;
            }
            this.A05 = new DQi(mapMakerInternalMap, key, value);
            this.A03.A06();
            return true;
        } catch (Throwable th) {
            this.A03.A06();
            throw th;
        }
    }
}
