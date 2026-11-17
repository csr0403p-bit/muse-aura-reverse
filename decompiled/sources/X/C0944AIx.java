package X;

import java.util.Iterator;
import java.util.Set;

/* renamed from: X.AIx, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0944AIx<E> extends AbstractC0935AIm<E> implements AGL<E> {
    public Object A00;
    public Object A01;
    public C0943AIw<E> A02;
    public final C0955AJi<E, C0945AIy> A03;

    @Override // X.AbstractC0935AIm
    public final int A00() {
        return this.A03.size();
    }

    @Override // X.AGL
    public final AHG<E> A5T() {
        C0943AIw<E> c0943AIw = this.A02;
        if (c0943AIw != null) {
            return c0943AIw;
        }
        C0943AIw<E> c0943AIw2 = new C0943AIw<>(this.A00, this.A01, this.A03.A5S());
        this.A02 = c0943AIw2;
        return c0943AIw2;
    }

    @Override // X.AbstractC0935AIm, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(E e) {
        C0955AJi<E, C0945AIy> c0955AJi = this.A03;
        if (c0955AJi.containsKey(e)) {
            return false;
        }
        this.A02 = null;
        if (isEmpty()) {
            this.A00 = e;
            this.A01 = e;
            c0955AJi.put(e, new C0945AIy());
            return true;
        }
        Object obj = c0955AJi.get(this.A01);
        C7384Etj.A0X(obj);
        c0955AJi.put(this.A01, new C0945AIy(((C0945AIy) obj).A01, e));
        c0955AJi.put(e, new C0945AIy(this.A01, C0946AIz.A00));
        this.A01 = e;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        C0955AJi<E, C0945AIy> c0955AJi = this.A03;
        if (!c0955AJi.isEmpty()) {
            this.A02 = null;
        }
        c0955AJi.clear();
        C0946AIz c0946AIz = C0946AIz.A00;
        this.A00 = c0946AIz;
        this.A01 = c0946AIz;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.A03.containsKey(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        C0956AJj<E, C0945AIy> c0956AJj;
        C0956AJj<E, C0945AIy> c0956AJj2;
        int i;
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() == set.size()) {
                if (set instanceof C0943AIw) {
                    c0956AJj = this.A03.A04;
                    c0956AJj2 = ((C0943AIw) obj).A02.A00;
                    i = 19;
                } else {
                    if (!(set instanceof C0944AIx)) {
                        return super.equals(obj);
                    }
                    c0956AJj = this.A03.A04;
                    c0956AJj2 = ((C0944AIx) obj).A03.A04;
                    i = 20;
                }
                return c0956AJj.A0N(new C2280BSg(i), c0956AJj2);
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        return new C0942AIv(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object obj2;
        C0955AJi<E, C0945AIy> c0955AJi = this.A03;
        C0945AIy c0945AIy = (C0945AIy) c0955AJi.remove(obj);
        if (c0945AIy == null) {
            return false;
        }
        this.A02 = null;
        Object obj3 = c0945AIy.A01;
        C0946AIz c0946AIz = C0946AIz.A00;
        if (obj3 != c0946AIz) {
            Object obj4 = c0955AJi.get(obj3);
            C7384Etj.A0X(obj4);
            obj2 = c0945AIy.A00;
            c0955AJi.put(obj3, new C0945AIy(((C0945AIy) obj4).A01, obj2));
        } else {
            obj2 = c0945AIy.A00;
            this.A00 = obj2;
        }
        if (obj2 == c0946AIz) {
            this.A01 = obj3;
            return true;
        }
        Object obj5 = c0955AJi.get(obj2);
        C7384Etj.A0X(obj5);
        c0955AJi.put(obj2, new C0945AIy(obj3, ((C0945AIy) obj5).A00));
        return true;
    }

    public C0944AIx(C0943AIw<E> c0943AIw) {
        this.A02 = c0943AIw;
        this.A00 = c0943AIw.A00;
        this.A01 = c0943AIw.A01;
        this.A03 = new C0955AJi<>(c0943AIw.A02);
    }
}
