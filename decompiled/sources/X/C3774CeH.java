package X;

import java.util.Iterator;

/* renamed from: X.CeH, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3774CeH extends CPY {
    public final transient AbstractC3777CeK A00;
    public final transient C3772CeF A01;

    @Override // X.COV, java.util.AbstractCollection, java.util.Collection
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

    public C3774CeH(AbstractC3777CeK abstractC3777CeK, C3772CeF c3772CeF) {
        this.A01 = c3772CeF;
        this.A00 = abstractC3777CeK;
    }
}
