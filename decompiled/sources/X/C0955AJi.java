package X;

import java.util.Map;

/* renamed from: X.AJi, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0955AJi<K, V> extends AbstractC0970AJx<K, V> implements AGJ<K, V> {
    public int A00;
    public int A01;
    public V A02;
    public C0952AJf<K, V> A03;
    public C0956AJj<K, V> A04;
    public AHS A05 = new AHS();
    public int A06;

    @Override // X.AbstractC0970AJx, java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        this.A02 = null;
        A00(this.A04.A0I(k, v, this, k != null ? k.hashCode() : 0, 0));
        return this.A02;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        C0955AJi c0955AJi;
        C0952AJf<K, V> c0952AJfA5S;
        C7384Etj.A0Y(map, 0);
        if (map.isEmpty()) {
            return;
        }
        if (!(map instanceof C0952AJf) || (c0952AJfA5S = (C0952AJf) map) == null) {
            if (!(map instanceof C0955AJi) || (c0955AJi = (C0955AJi) map) == null) {
                super.putAll(map);
                return;
            }
            c0952AJfA5S = c0955AJi.A5S();
        }
        AKB akb = new AKB();
        akb.A00 = 0;
        int size = size();
        C0956AJj<K, V> c0956AJj = this.A04;
        C0956AJj<K, V> c0956AJj2 = c0952AJfA5S.A00;
        C7384Etj.A0Z(c0956AJj2, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        A00(c0956AJj.A0L(this, c0956AJj2, akb, 0));
        int size2 = (c0952AJfA5S.size() + size) - akb.A00;
        if (size != size2) {
            A03(size2);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        this.A02 = null;
        C0956AJj<K, V> c0956AJjA0K = this.A04.A0K(obj, this, C60R.A01(obj), 0);
        if (c0956AJjA0K == null) {
            c0956AJjA0K = C0956AJj.A04;
        }
        A00(c0956AJjA0K);
        return this.A02;
    }

    private final void A00(C0956AJj<K, V> c0956AJj) {
        if (c0956AJj != this.A04) {
            this.A04 = c0956AJj;
            this.A03 = null;
        }
    }

    @Override // X.AbstractC0970AJx
    public final int A01() {
        return this.A06;
    }

    @Override // X.AGJ
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final C0952AJf<K, V> A5S() {
        C0952AJf<K, V> c0952AJf = this.A03;
        if (c0952AJf != null) {
            return c0952AJf;
        }
        C0952AJf<K, V> c0952AJf2 = new C0952AJf<>(this.A04, size());
        this.A03 = c0952AJf2;
        this.A05 = new AHS();
        return c0952AJf2;
    }

    public final void A03(int i) {
        this.A06 = i;
        this.A00++;
        this.A01++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        A00(C0956AJj.A04);
        A03(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.A04.A0M(obj, C60R.A01(obj), 0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        C0956AJj<K, V> c0956AJj;
        C0956AJj c0956AJj2;
        int i;
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() == map.size()) {
                if (map instanceof C0952AJf) {
                    c0956AJj = this.A04;
                    c0956AJj2 = ((C0952AJf) obj).A00;
                    i = 5;
                } else if (map instanceof C0955AJi) {
                    c0956AJj = this.A04;
                    c0956AJj2 = ((C0955AJi) obj).A04;
                    i = 6;
                } else if (map instanceof C0953AJg) {
                    c0956AJj = this.A04;
                    c0956AJj2 = ((C0953AJg) obj).A02.A00;
                    i = 7;
                } else {
                    if (!(map instanceof C0954AJh)) {
                        return super.equals(obj);
                    }
                    c0956AJj = this.A04;
                    c0956AJj2 = ((C0954AJh) obj).A03.A04;
                    i = 8;
                }
                return c0956AJj.A0N(new C2280BSg(i), c0956AJj2);
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        return (V) this.A04.A0E(obj, obj != null ? obj.hashCode() : 0, 0);
    }

    public C0955AJi(C0952AJf<K, V> c0952AJf) {
        this.A03 = c0952AJf;
        this.A04 = c0952AJf.A00;
        this.A06 = c0952AJf.size();
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int size = size();
        C0956AJj<K, V> c0956AJjA0J = this.A04.A0J(obj, obj2, this, C60R.A01(obj), 0);
        if (c0956AJjA0J == null) {
            c0956AJjA0J = C0956AJj.A04;
        }
        A00(c0956AJjA0J);
        if (size == size()) {
            return false;
        }
        return true;
    }
}
