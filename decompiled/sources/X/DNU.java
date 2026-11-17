package X;

/* loaded from: classes5.dex */
public abstract class DNU<T> extends AbstractC7489Ext<T> {
    public Integer A00 = C79.A01;
    public T A01;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0060 A[RETURN] */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.DNV] */
    /* JADX WARN: Type inference failed for: r2v3, types: [X.DNU] */
    /* JADX WARN: Type inference failed for: r2v5, types: [X.DNT] */
    @Override // java.util.Iterator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean hasNext() {
        /*
            r5 = this;
            java.lang.Integer r1 = r5.A00
            java.lang.Integer r4 = X.C79.A0K
            r3 = 1
            r2 = 0
            boolean r0 = X.AnonymousClass006.A1Z(r1, r4)
            com.google.common.base.Preconditions.checkState(r0)
            int r1 = r1.intValue()
            if (r1 == 0) goto L41
            r0 = 2
            if (r1 == r0) goto L62
            r5.A00 = r4
            boolean r0 = r5 instanceof X.DNT
            if (r0 == 0) goto L42
            r2 = r5
            X.DNT r2 = (X.DNT) r2
        L1f:
            java.util.Iterator<E> r1 = r2.A00
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L5a
            java.lang.Object r0 = r1.next()
            X.DNS r1 = r2.A01
            java.util.Set r1 = r1.A01
            boolean r1 = r1.contains(r0)
            if (r1 == 0) goto L1f
        L35:
            r5.A01 = r0
            java.lang.Integer r1 = r5.A00
            java.lang.Integer r0 = X.C79.A0C
            if (r1 == r0) goto L60
            java.lang.Integer r0 = X.C79.A00
            r5.A00 = r0
        L41:
            return r3
        L42:
            r2 = r5
            X.DNV r2 = (X.DNV) r2
        L45:
            java.util.Iterator r1 = r2.A01
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L5a
            java.lang.Object r0 = r1.next()
            com.google.common.base.Predicate r1 = r2.A00
            boolean r1 = r1.apply(r0)
            if (r1 == 0) goto L45
            goto L35
        L5a:
            java.lang.Integer r0 = X.C79.A0C
            r2.A00 = r0
            r0 = 0
            goto L35
        L60:
            r3 = 0
            return r3
        L62:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DNU.hasNext():boolean");
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw C8j3.A1D();
        }
        this.A00 = C79.A01;
        T t = this.A01;
        this.A01 = null;
        return t;
    }
}
