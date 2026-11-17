package X;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* renamed from: X.AJo, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0961AJo implements Iterator, BOA {
    public int A00;
    public Object A01 = C0946AIz.A00;
    public boolean A02;
    public int A03;
    public Object A04;
    public final C0954AJh<K, V> A05;

    @Override // java.util.Iterator
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final AK6<V> next() {
        C0955AJi<K, AK6<V>> c0955AJi = this.A05.A03;
        if (c0955AJi.A01 != this.A00) {
            throw new ConcurrentModificationException();
        }
        if (!hasNext()) {
            throw C8j3.A1D();
        }
        Object obj = this.A04;
        this.A01 = obj;
        this.A02 = true;
        this.A03++;
        Object obj2 = c0955AJi.get(obj);
        if (obj2 != null) {
            AK6<V> ak6 = (AK6) obj2;
            this.A04 = ak6.A00;
            return ak6;
        }
        StringBuilder sbA0x = C60O.A0x("Hash code of a key (");
        sbA0x.append(this.A04);
        throw new ConcurrentModificationException(AnonymousClass001.A0v(") has changed after it was added to the persistent map.", sbA0x));
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return C8j3.A1T(this.A03, this.A05.size());
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.A02) {
            throw new IllegalStateException();
        }
        C0954AJh<K, V> c0954AJh = this.A05;
        C0862A6j.A01(c0954AJh).remove(this.A01);
        this.A01 = null;
        this.A02 = false;
        this.A00 = c0954AJh.A03.A01;
        this.A03--;
    }

    public C0961AJo(Object obj, C0954AJh<K, V> c0954AJh) {
        this.A04 = obj;
        this.A05 = c0954AJh;
        this.A00 = c0954AJh.A03.A01;
    }
}
