package X;

/* renamed from: X.DUv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C5080DUv<K, V> extends DUf<K, V, C5080DUv<K, V>> implements DUb<K, V, C5080DUv<K, V>> {
    public volatile DUc<K, V, C5080DUv<K, V>> A00;

    @Override // X.DUb
    public final DUc<K, V, C5080DUv<K, V>> AMV() {
        return this.A00;
    }

    @Override // X.DUZ
    public final V getValue() {
        return this.A00.get();
    }
}
