package X;

import com.facebook.aura.notifications.push.AuraCvmPushReplayStore;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes5.dex */
public abstract class Db1<T> implements InterfaceC5172Db5 {
    public final int A00;
    public final List<T> A01 = new C5170Db3(this);
    public volatile AtomicReferenceArray<T> entries;
    public volatile InterfaceC5173Db6 index;
    public static final AtomicReferenceFieldUpdater<Db1<?>, InterfaceC5173Db6> A03 = AtomicReferenceFieldUpdater.newUpdater(Db1.class, InterfaceC5173Db6.class, "index");
    public static final AtomicReferenceFieldUpdater<Db1<?>, AtomicReferenceArray<?>> A02 = AtomicReferenceFieldUpdater.newUpdater(Db1.class, AtomicReferenceArray.class, AuraCvmPushReplayStore.ENTRIES_KEY);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a A[PHI: r2
  0x001a: PHI (r2v1 java.util.concurrent.atomic.AtomicReferenceArray<T>) = 
  (r2v0 java.util.concurrent.atomic.AtomicReferenceArray<T>)
  (r2v15 java.util.concurrent.atomic.AtomicReferenceArray<T>)
  (r2v15 java.util.concurrent.atomic.AtomicReferenceArray<T>)
 binds: [B:3:0x0004, B:5:0x0014, B:7:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [X.AGi] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v2, types: [X.AGi] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(X.Db1 r16, int r17) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Db1.A00(X.Db1, int):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001c A[PHI: r1
  0x001c: PHI (r1v1 X.Db6) = (r1v0 X.Db6), (r1v3 X.Db6), (r1v3 X.Db6) binds: [B:3:0x0002, B:5:0x0016, B:7:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final T A01(int r6) {
        /*
            r5 = this;
            X.Db6 r1 = r5.index
            if (r1 != 0) goto L1c
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<X.DaE, X.DaU> r0 = X.C5130DaE.A07
            r2 = 0
            int[] r0 = r5.AcT()
            X.Db4 r1 = new X.Db4
            r1.<init>(r0)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<X.Db1<?>, X.Db6> r0 = X.Db1.A03
            boolean r0 = X.AbstractC5217DdT.A00(r5, r2, r1, r0)
            if (r0 != 0) goto L1c
            X.Db6 r4 = r5.index
            if (r4 != 0) goto L1d
        L1c:
            r4 = r1
        L1d:
            X.Db4 r4 = (X.C5171Db4) r4
            r0 = -1640531527(0xffffffff9e3779b9, float:-9.713111E-21)
            int r3 = r6 * r0
            int r0 = r3 >>> 16
            r3 = r3 ^ r0
            int r2 = r4.A00
        L29:
            r3 = r3 & r2
            int[] r0 = r4.A02
            r1 = r0[r3]
            if (r1 == 0) goto L42
            int[] r0 = r4.A01
            r0 = r0[r3]
            if (r0 != r6) goto L3f
            int r0 = r1 + (-1)
            if (r0 < 0) goto L42
            java.lang.Object r0 = A00(r5, r0)
            return r0
        L3f:
            int r3 = r3 + 1
            goto L29
        L42:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Db1.A01(int):java.lang.Object");
    }

    public Db1(int i) {
        this.A00 = i;
    }
}
