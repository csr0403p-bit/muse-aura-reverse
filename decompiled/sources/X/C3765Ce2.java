package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Ce2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3765Ce2 implements Iterator {
    public Map.Entry A00;
    public final /* synthetic */ C3764Ce1 A01;
    public final /* synthetic */ Iterator A02;

    public C3765Ce2(C3764Ce1 c3764Ce1, Iterator it) {
        this.A01 = c3764Ce1;
        this.A02 = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.A02.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entryA0l = C3cH.A0l(this.A02);
        this.A00 = entryA0l;
        return entryA0l.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        Map.Entry entry = this.A00;
        if (!AnonymousClass002.A1X(entry)) {
            throw C3cG.A0Q("no calls to next() since the last call to remove()");
        }
        Collection collection = (Collection) entry.getValue();
        this.A02.remove();
        this.A01.A01.A00 -= collection.size();
        collection.clear();
        this.A00 = null;
    }
}
