package X;

/* renamed from: X.DUu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C5079DUu<K, V> extends DUe<K, V, C5079DUu<K, V>> implements DUb<K, V, C5079DUu<K, V>> {
    public volatile DUc<K, V, C5079DUu<K, V>> A00;

    @Override // X.DUb
    public final DUc<K, V, C5079DUu<K, V>> AMV() {
        return this.A00;
    }

    @Override // X.DUZ
    public final V getValue() {
        return this.A00.get();
    }
}
