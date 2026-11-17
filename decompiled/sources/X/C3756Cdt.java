package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Cdt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3756Cdt implements Iterator {
    public Collection A00;
    public final Iterator A01;
    public final /* synthetic */ C3754Cdr A02;

    public C3756Cdt(C3754Cdr c3754Cdr) {
        this.A02 = c3754Cdr;
        this.A01 = AnonymousClass002.A0n(c3754Cdr.A02);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.A01.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entryA0l = C3cH.A0l(this.A01);
        this.A00 = (Collection) entryA0l.getValue();
        C3754Cdr c3754Cdr = this.A02;
        Object key = entryA0l.getKey();
        return new C3070Bws(key, c3754Cdr.A03.A00(key, (Collection) entryA0l.getValue()));
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!AnonymousClass002.A1X(this.A00)) {
            throw C3cG.A0Q("no calls to next() since the last call to remove()");
        }
        this.A01.remove();
        this.A02.A03.A00 -= this.A00.size();
        this.A00.clear();
        this.A00 = null;
    }
}
