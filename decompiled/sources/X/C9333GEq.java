package X;

import java.util.Iterator;

/* renamed from: X.GEq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9333GEq implements Iterator {
    public int A00 = 0;
    public final int A01;
    public final /* synthetic */ AbstractC9334GEr A02;

    public C9333GEq(AbstractC9334GEr abstractC9334GEr) {
        this.A02 = abstractC9334GEr;
        this.A01 = abstractC9334GEr.A01();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return C8j3.A1T(this.A00, this.A01);
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b;
        int i = this.A00;
        if (i >= this.A01) {
            throw C8j3.A1D();
        }
        this.A00 = i + 1;
        AbstractC9334GEr abstractC9334GEr = this.A02;
        if (abstractC9334GEr instanceof C9332GEp) {
            b = ((C9332GEp) abstractC9334GEr).d[i];
        } else {
            C9331GEo c9331GEo = (C9331GEo) abstractC9334GEr;
            b = c9331GEo.d[c9331GEo.e + i];
        }
        return Byte.valueOf(b);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw C8j3.A17();
    }
}
