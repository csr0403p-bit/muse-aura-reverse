package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.EwT, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7451EwT implements Iterator {
    public final Iterator A00;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.A00.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return ((Map.Entry) this.A00.next()).getValue();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.A00.remove();
    }

    public C7451EwT(Iterator it) {
        it.getClass();
        this.A00 = it;
    }
}
