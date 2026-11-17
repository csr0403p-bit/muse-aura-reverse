package X;

import java.util.Iterator;

/* loaded from: classes5.dex */
public final class COK extends CO8 {
    public final transient Object A00 = "FIDO";

    @Override // X.COD, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.A00.equals(obj);
    }

    @Override // X.CO8, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        Object obj = this.A00;
        COL col = new COL();
        col.A00 = obj;
        return col;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return FGI.A0U("[", this.A00.toString(), "]");
    }
}
