package X;

/* renamed from: X.GmU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9959GmU extends AbstractC9970Gmj {
    public static final long serialVersionUID = 1;
    public final int _index;
    public final AbstractC10024Gnx _owner;
    public final AbstractC9870GjI _type;

    /* JADX WARN: Removed duplicated region for block: B:8:0x0012  */
    @Override // X.AbstractC10031Go7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r3 = 1
            if (r5 == r4) goto L28
            java.lang.Class r2 = r4.getClass()
            X.GpS[] r0 = X.AbstractC9855Gj3.A01
            if (r5 == 0) goto L12
            java.lang.Class r1 = r5.getClass()
            r0 = 1
            if (r1 == r2) goto L13
        L12:
            r0 = 0
        L13:
            r2 = 0
            if (r0 == 0) goto L29
            X.GmU r5 = (X.C9959GmU) r5
            X.Gnx r1 = r5._owner
            X.Gnx r0 = r4._owner
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L29
            int r1 = r5._index
            int r0 = r4._index
            if (r1 != r0) goto L29
        L28:
            return r3
        L29:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9959GmU.equals(java.lang.Object):boolean");
    }

    @Override // X.AbstractC10031Go7
    public final int hashCode() {
        return this._owner.hashCode() + this._index;
    }

    @Override // X.AbstractC10031Go7
    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("[parameter #");
        sbA0x.append(this._index);
        sbA0x.append(", annotations: ");
        return BV8.A0u(this.A00, sbA0x);
    }

    public C9959GmU(AbstractC9870GjI abstractC9870GjI, AbstractC10024Gnx abstractC10024Gnx, C9971Gmk c9971Gmk, InterfaceC10166Gqb interfaceC10166Gqb, int i) {
        super(c9971Gmk, interfaceC10166Gqb);
        this._owner = abstractC10024Gnx;
        this._type = abstractC9870GjI;
        this._index = i;
    }
}
