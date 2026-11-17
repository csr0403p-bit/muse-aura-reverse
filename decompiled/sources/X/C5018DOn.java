package X;

import com.google.common.base.Preconditions;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* renamed from: X.DOn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5018DOn<K, V> implements Iterator<Map.Entry<K, Collection<V>>> {
    public Collection<V> A00;
    public final Iterator<Map.Entry<K, Collection<V>>> A01;
    public final /* synthetic */ C5016DOk A02;

    public C5018DOn(final C5016DOk this$1) {
        this.A02 = this$1;
        this.A01 = AnonymousClass002.A0n(this$1.A00);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.A01.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry<K, Collection<V>> entryA0l = C3cH.A0l(this.A01);
        this.A00 = entryA0l.getValue();
        return this.A02.A01(entryA0l);
    }

    @Override // java.util.Iterator
    public final void remove() {
        Preconditions.checkState(AnonymousClass002.A1X(this.A00), "no calls to next() since the last call to remove()");
        this.A01.remove();
        this.A02.A01.A00 -= this.A00.size();
        this.A00.clear();
        this.A00 = null;
    }
}
