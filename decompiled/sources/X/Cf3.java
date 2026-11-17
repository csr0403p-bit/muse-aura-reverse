package X;

import java.util.Iterator;

/* loaded from: classes5.dex */
public final class Cf3 extends Cf0 {
    public final transient AbstractC3815Cey A00;
    public final transient C3812Cev A01;

    @Override // X.AbstractC3816Cez, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return AnonymousClass002.A1X(this.A01.get(obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.A00.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.A01.size();
    }

    public Cf3(AbstractC3815Cey abstractC3815Cey, C3812Cev c3812Cev) {
        this.A01 = c3812Cev;
        this.A00 = abstractC3815Cey;
    }
}
