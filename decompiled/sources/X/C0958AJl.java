package X;

import java.util.Map;

/* renamed from: X.AJl, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C0958AJl<K, V> extends AbstractC0970AJx<K, V> implements AK3<K, V> {
    public int A00;
    public C0957AJk<K, V> A01;
    public C0902AHe A02 = new C0902AHe();
    public V A03;
    public int A04;
    public C0959AJm<K, V> A05;

    @Override // X.AbstractC0970AJx, java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        this.A03 = null;
        this.A01 = this.A01.A0I(this, k, v, k != null ? k.hashCode() : 0, 0);
        return this.A03;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        this.A03 = null;
        C0957AJk<K, V> c0957AJkA0H = this.A01.A0H(this, obj, C60R.A01(obj), 0);
        if (c0957AJkA0H == null) {
            c0957AJkA0H = C0957AJk.A04;
        }
        this.A01 = c0957AJkA0H;
        return this.A03;
    }

    @Override // X.AbstractC0970AJx
    public final int A01() {
        return this.A04;
    }

    @Override // X.AK3
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public C0959AJm<K, V> A5O() {
        C0957AJk<K, V> c0957AJk = this.A01;
        C0959AJm<K, V> c0959AJm = this.A05;
        if (c0957AJk != c0959AJm.A00) {
            this.A02 = new C0902AHe();
            c0959AJm = new C0959AJm<>(c0957AJk, size());
        }
        this.A05 = c0959AJm;
        return c0959AJm;
    }

    public final void A03(int i) {
        this.A04 = i;
        this.A00++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.A01 = C0957AJk.A04;
        A03(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.A01.A0M(obj, C60R.A01(obj), 0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        return (V) this.A01.A0L(obj, C60R.A01(obj), 0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        C0958AJl c0958AJl;
        C0959AJm<K, V> c0959AJmA5O;
        if ((!(map instanceof C0959AJm) || (c0959AJmA5O = (C0959AJm) map) == null) && (!(map instanceof C0958AJl) || (c0958AJl = (C0958AJl) map) == null || (c0959AJmA5O = c0958AJl.A5O()) == null)) {
            super.putAll(map);
            return;
        }
        AKA aka = new AKA();
        aka.A00 = 0;
        int size = size();
        C0957AJk<K, V> c0957AJk = this.A01;
        C0957AJk<K, V> c0957AJk2 = c0959AJmA5O.A00;
        C7384Etj.A0Z(c0957AJk2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.A01 = c0957AJk.A0G(this, c0957AJk2, aka, 0);
        int size2 = (c0959AJmA5O.size() + size) - aka.A00;
        if (size != size2) {
            A03(size2);
        }
    }

    public C0958AJl(C0959AJm<K, V> c0959AJm) {
        this.A05 = c0959AJm;
        this.A01 = c0959AJm.A00;
        this.A04 = c0959AJm.size();
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int size = size();
        C0957AJk<K, V> c0957AJkA0J = this.A01.A0J(this, obj, obj2, C60R.A01(obj), 0);
        if (c0957AJkA0J == null) {
            c0957AJkA0J = C0957AJk.A04;
        }
        this.A01 = c0957AJkA0J;
        if (size == size()) {
            return false;
        }
        return true;
    }
}
