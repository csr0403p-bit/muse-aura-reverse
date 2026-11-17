package X;

import java.util.Map;

/* renamed from: X.AJh, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0954AJh<K, V> extends AbstractC0970AJx<K, V> implements AGJ<K, V> {
    public Object A00;
    public C0953AJg<K, V> A01;
    public Object A02;
    public final C0955AJi<K, AK6<V>> A03;

    @Override // X.AbstractC0970AJx
    public final int A01() {
        return this.A03.size();
    }

    @Override // X.AGJ
    public final InterfaceC0962AJp<K, V> A5S() {
        C0953AJg<K, V> c0953AJg = this.A01;
        if (c0953AJg != null) {
            return c0953AJg;
        }
        C0953AJg<K, V> c0953AJg2 = new C0953AJg<>(this.A00, this.A02, this.A03.A5S());
        this.A01 = c0953AJg2;
        return c0953AJg2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        C0955AJi<K, AK6<V>> c0955AJi = this.A03;
        if (!c0955AJi.isEmpty()) {
            this.A01 = null;
        }
        c0955AJi.clear();
        C0946AIz c0946AIz = C0946AIz.A00;
        this.A00 = c0946AIz;
        this.A02 = c0946AIz;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.A03.containsKey(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        C0956AJj<K, AK6<V>> c0956AJj;
        C0956AJj<K, V> c0956AJj2;
        int i;
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() == map.size()) {
                if (map instanceof C0953AJg) {
                    c0956AJj = this.A03.A04;
                    c0956AJj2 = ((C0953AJg) obj).A02.A00;
                    i = 13;
                } else if (map instanceof C0954AJh) {
                    c0956AJj = this.A03.A04;
                    c0956AJj2 = ((C0954AJh) obj).A03.A04;
                    i = 14;
                } else if (map instanceof C0952AJf) {
                    c0956AJj = this.A03.A04;
                    c0956AJj2 = ((C0952AJf) obj).A00;
                    i = 15;
                } else {
                    if (!(map instanceof C0955AJi)) {
                        return super.equals(obj);
                    }
                    c0956AJj = this.A03.A04;
                    c0956AJj2 = ((C0955AJi) obj).A04;
                    i = 16;
                }
                return c0956AJj.A0N(new C2280BSg(i), c0956AJj2);
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        AK6<V> ak6 = this.A03.get(obj);
        if (ak6 != null) {
            return ak6.A02;
        }
        return null;
    }

    @Override // X.AbstractC0970AJx, java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        C0955AJi<K, AK6<V>> c0955AJi = this.A03;
        AK6 ak6 = (AK6) c0955AJi.get(k);
        if (ak6 != null) {
            V v2 = ak6.A02;
            if (v2 == v) {
                return v;
            }
            this.A01 = null;
            c0955AJi.put(k, new AK6(v, ak6.A01, ak6.A00));
            return v2;
        }
        this.A01 = null;
        if (isEmpty()) {
            this.A00 = k;
            this.A02 = k;
            C0946AIz c0946AIz = C0946AIz.A00;
            c0955AJi.put(k, new AK6(v, c0946AIz, c0946AIz));
            return null;
        }
        Object obj = this.A02;
        Object obj2 = c0955AJi.get(obj);
        C7384Etj.A0X(obj2);
        AK6 ak62 = (AK6) obj2;
        c0955AJi.put(obj, new AK6(ak62.A02, ak62.A01, k));
        c0955AJi.put(k, new AK6(v, obj, C0946AIz.A00));
        this.A02 = k;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        Object obj2;
        C0955AJi<K, AK6<V>> c0955AJi = this.A03;
        AK6 ak6 = (AK6) c0955AJi.remove(obj);
        if (ak6 == null) {
            return null;
        }
        this.A01 = null;
        Object obj3 = ak6.A01;
        Object obj4 = C0946AIz.A00;
        if (obj3 != obj4) {
            Object obj5 = c0955AJi.get(obj3);
            C7384Etj.A0X(obj5);
            AK6 ak62 = (AK6) obj5;
            obj2 = ak6.A00;
            c0955AJi.put(obj3, new AK6(ak62.A02, ak62.A01, obj2));
        } else {
            obj2 = ak6.A00;
            this.A00 = obj2;
        }
        if (obj2 != obj4) {
            Object obj6 = c0955AJi.get(obj2);
            C7384Etj.A0X(obj6);
            AK6 ak63 = (AK6) obj6;
            c0955AJi.put(obj2, new AK6(ak63.A02, obj3, ak63.A00));
        } else {
            this.A02 = obj3;
        }
        return ak6.A02;
    }

    public C0954AJh(C0953AJg<K, V> c0953AJg) {
        this.A01 = c0953AJg;
        this.A00 = c0953AJg.A00;
        this.A02 = c0953AJg.A01;
        this.A03 = new C0955AJi<>(c0953AJg.A02);
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        AK6<V> ak6 = this.A03.get(obj);
        if (ak6 == null || !C7384Etj.areEqual(ak6.A02, obj2)) {
            return false;
        }
        remove(obj);
        return true;
    }
}
