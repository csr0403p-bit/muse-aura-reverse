package X;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: X.AJm, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C0959AJm<K, V> extends AJ0<K, V> implements AK8<K, V> {
    public static final C0959AJm A02 = new C0959AJm(C0957AJk.A04, 0);
    public final C0957AJk<K, V> A00;
    public final int A01;

    @Override // X.AJ0
    public final /* bridge */ /* synthetic */ Collection A02() {
        return new C0948AJb(this);
    }

    @Override // X.AJ0
    public final Set<Map.Entry<K, V>> A03() {
        return new AJZ(this);
    }

    @Override // X.AJ0
    public final int A05() {
        return this.A01;
    }

    public final C0959AJm<K, V> A06(K k, V v) {
        AK4 ak4A0E = this.A00.A0E(k, v, C60R.A01(k), 0);
        return ak4A0E == null ? this : new C0959AJm<>(ak4A0E.A00, size() + ak4A0E.A01);
    }

    @Override // X.AK8
    /* renamed from: A07, reason: merged with bridge method [inline-methods] */
    public C0958AJl<K, V> A5Z() {
        return new C0958AJl<>(this);
    }

    @Override // X.AJ0, java.util.Map
    public boolean containsKey(Object obj) {
        return this.A00.A0M(obj, C60R.A01(obj), 0);
    }

    @Override // X.AJ0, java.util.Map
    public V get(Object obj) {
        return (V) this.A00.A0L(obj, obj != null ? obj.hashCode() : 0, 0);
    }

    public C0959AJm(C0957AJk<K, V> c0957AJk, int i) {
        this.A00 = c0957AJk;
        this.A01 = i;
    }
}
