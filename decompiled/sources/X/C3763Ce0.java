package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Ce0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3763Ce0 implements Iterator {
    public Collection A00;
    public final Iterator A01;
    public final /* synthetic */ C3761Cdy A02;

    public C3763Ce0(C3761Cdy c3761Cdy) {
        this.A02 = c3761Cdy;
        this.A01 = AnonymousClass002.A0n(c3761Cdy.A02);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.A01.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entryA0l = C3cH.A0l(this.A01);
        this.A00 = (Collection) entryA0l.getValue();
        C3761Cdy c3761Cdy = this.A02;
        Object key = entryA0l.getKey();
        return new C3071Bwt(key, c3761Cdy.A03.A00(key, (Collection) entryA0l.getValue()));
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
