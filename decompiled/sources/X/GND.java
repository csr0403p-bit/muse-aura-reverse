package X;

import java.util.Iterator;

/* loaded from: classes6.dex */
public final class GND extends GNF {
    public final transient Object A00;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.A00.equals(obj);
    }

    @Override // X.GNF, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new G4f(this.A00);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return FGI.A0U("[", this.A00.toString(), "]");
    }

    public GND(Object obj) {
        this.A00 = obj;
    }
}
