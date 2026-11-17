package X;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.AJb, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0948AJb extends AbstractC0890AGr implements Collection, BOA {
    public final C0959AJm<K, V> A00;

    @Override // X.AbstractC0890AGr
    public final int A0D() {
        return this.A00.size();
    }

    @Override // X.AbstractC0890AGr, java.util.Collection
    public final boolean contains(Object obj) {
        return this.A00.containsValue(obj);
    }

    @Override // X.AbstractC0890AGr, java.util.Collection, java.lang.Iterable
    public final Iterator<V> iterator() {
        C0957AJk<K, V> c0957AJk = this.A00.A00;
        AJV[] ajvArr = new AJV[8];
        int i = 0;
        do {
            ajvArr[i] = new AJY();
            i++;
        } while (i < 8);
        return new C0951AJe(c0957AJk, ajvArr);
    }

    public C0948AJb(C0959AJm<K, V> c0959AJm) {
        this.A00 = c0959AJm;
    }
}
