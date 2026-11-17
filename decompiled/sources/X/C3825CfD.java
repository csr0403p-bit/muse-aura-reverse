package X;

import java.util.Iterator;

/* renamed from: X.CfD, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3825CfD extends AbstractC3822CfA {
    public final transient AbstractC3820Cf8 A00;
    public final transient C3817Cf5 A01;

    @Override // X.AbstractC3821Cf9, java.util.AbstractCollection, java.util.Collection, java.util.Set
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

    public C3825CfD(AbstractC3820Cf8 abstractC3820Cf8, C3817Cf5 c3817Cf5) {
        this.A01 = c3817Cf5;
        this.A00 = abstractC3820Cf8;
    }
}
