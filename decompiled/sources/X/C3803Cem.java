package X;

import java.util.Iterator;

/* renamed from: X.Cem, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3803Cem extends AbstractC3805Ceo {
    public final transient AbstractC3804Cen A00;
    public final transient C3802Cel A01;

    @Override // X.AbstractC3806Cep, java.util.AbstractCollection, java.util.Collection, java.util.Set
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

    public C3803Cem(AbstractC3804Cen abstractC3804Cen, C3802Cel c3802Cel) {
        this.A01 = c3802Cel;
        this.A00 = abstractC3804Cen;
    }
}
