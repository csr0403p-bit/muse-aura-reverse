package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.AJa, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0947AJa extends AbstractC0891AGs implements Set, Collection, BOA {
    public final C0959AJm<K, V> A00;

    @Override // X.AbstractC0890AGr, java.util.Collection
    public final boolean contains(Object obj) {
        return this.A00.containsKey(obj);
    }

    @Override // X.AbstractC0890AGr, java.util.Collection, java.lang.Iterable
    public final Iterator<K> iterator() {
        C0957AJk<K, V> c0957AJk = this.A00.A00;
        AJV[] ajvArr = new AJV[8];
        int i = 0;
        do {
            ajvArr[i] = new AJX();
            i++;
        } while (i < 8);
        return new C0950AJd(c0957AJk, ajvArr);
    }

    public C0947AJa(C0959AJm<K, V> c0959AJm) {
        this.A00 = c0959AJm;
    }
}
