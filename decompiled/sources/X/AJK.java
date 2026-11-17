package X;

/* loaded from: classes4.dex */
public final class AJK<K, V> extends AJH<K, V, V> {
    @Override // java.util.Iterator
    public final V next() {
        int i = this.A01 + 2;
        this.A01 = i;
        return (V) this.A02[i - 1];
    }
}
