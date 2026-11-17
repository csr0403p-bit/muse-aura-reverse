package X;

/* loaded from: classes4.dex */
public final class AJJ<K, V> extends AJH<K, V, K> {
    @Override // java.util.Iterator
    public final K next() {
        int i = this.A01 + 2;
        this.A01 = i;
        return (K) this.A02[i - 2];
    }
}
