package X;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.AIu, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C0941AIu<E> implements Iterator<E>, BOA {
    public int A00;
    public Object A01;
    public final Map<E, C0945AIy> A02;

    public C0941AIu(Object obj, Map<E, C0945AIy> map) {
        C7384Etj.A0Y(map, 1);
        this.A01 = obj;
        this.A02 = map;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return C8j3.A1T(this.A00, this.A02.size());
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!(this instanceof C0942AIv)) {
            throw C8j4.A10();
        }
        C0942AIv c0942AIv = (C0942AIv) this;
        if (!c0942AIv.A02) {
            throw new IllegalStateException();
        }
        C0944AIx<E> c0944AIx = c0942AIv.A03;
        C0862A6j.A00(c0944AIx).remove(c0942AIv.A01);
        c0942AIv.A01 = null;
        c0942AIv.A02 = false;
        c0942AIv.A00 = c0944AIx.A03.A00;
        ((C0941AIu) c0942AIv).A00--;
    }

    @Override // java.util.Iterator
    public E next() {
        if (!hasNext()) {
            throw C8j3.A1D();
        }
        E e = (E) this.A01;
        this.A00++;
        C0945AIy c0945AIy = this.A02.get(e);
        if (c0945AIy == null) {
            throw new ConcurrentModificationException(AnonymousClass001.A0v(") has changed after it was added to the persistent set.", C3cG.A0f(e, "Hash code of an element (")));
        }
        this.A01 = c0945AIy.A00;
        return e;
    }
}
