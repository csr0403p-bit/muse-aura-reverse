package X;

/* renamed from: X.EhW, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7161EhW<K, V> {
    public int A00;
    public boolean A01;
    public final EfF<V> A02;
    public final C7166Ehb A03;
    public final K A04;

    /* JADX WARN: Multi-variable type inference failed */
    public C7161EhW(EfF efF, C7166Ehb c7166Ehb, Object obj) {
        this.A03 = c7166Ehb;
        if (obj == 0) {
            throw C3cG.A0Q("Required value was null.");
        }
        this.A04 = obj;
        EfF<V> efFA03 = efF.A03();
        if (efFA03 == null) {
            throw C3cG.A0Q("Required value was null.");
        }
        this.A02 = efFA03;
    }
}
