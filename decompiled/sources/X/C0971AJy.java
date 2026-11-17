package X;

import java.util.Iterator;

/* renamed from: X.AJy, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0971AJy implements Iterator, BOA {
    public final C0961AJo<K, V> A00;

    public C0971AJy(C0954AJh<K, V> c0954AJh) {
        C7384Etj.A0Y(c0954AJh, 0);
        this.A00 = new C0961AJo(c0954AJh.A00, c0954AJh);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.A00.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        C0961AJo<K, V> c0961AJo = this.A00;
        return new C0960AJn(c0961AJo.A01, c0961AJo.next(), c0961AJo.A05);
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.A00.remove();
    }
}
