package X;

/* loaded from: classes5.dex */
public final class COP extends COO {
    public final transient COO A00;

    @Override // X.COO, X.COD, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.A00.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        COO coo = this.A00;
        CeX.A01(i, coo.size());
        return coo.get(C8j3.A0K(coo) - i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A00.size();
    }

    public COP(COO coo) {
        this.A00 = coo;
    }
}
