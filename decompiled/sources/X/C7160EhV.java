package X;

/* JADX INFO: Add missing generic type declarations: [V] */
/* renamed from: X.EhV, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7160EhV<V> implements InterfaceC3587CVm<V> {
    public final /* synthetic */ C7161EhW<K, V> A00;
    public final /* synthetic */ C7158EhT<K, V> A01;

    /* JADX WARN: Incorrect types in method signature: (LX/EhT<TK;TV;>;LX/EhW<TK;TV;>;)V */
    public C7160EhV(C7161EhW c7161EhW, C7158EhT c7158EhT) {
        this.A01 = c7158EhT;
        this.A00 = c7161EhW;
    }

    @Override // X.InterfaceC3587CVm
    public final void Aa9(V v) {
        boolean z;
        EfF efFA02;
        C7166Ehb c7166Ehb;
        C7158EhT<K, V> c7158EhT = this.A01;
        C7161EhW<K, V> c7161EhW = this.A00;
        synchronized (c7158EhT) {
            int i = c7161EhW.A00;
            if (i <= 0) {
                throw BV4.A0S();
            }
            int i2 = i - 1;
            c7161EhW.A00 = i2;
            if (c7161EhW.A01 || i2 != 0) {
                z = false;
            } else {
                c7158EhT.A03.A04(c7161EhW.A04, c7161EhW);
                z = true;
            }
            efFA02 = C7158EhT.A02(c7161EhW, c7158EhT);
        }
        if (efFA02 != null) {
            efFA02.close();
        }
        if (z && (c7166Ehb = c7161EhW.A03) != null) {
            K k = c7161EhW.A04;
            C7164EhZ c7164EhZ = c7166Ehb.A00;
            synchronized (c7164EhZ) {
                c7164EhZ.A03.add(k);
            }
        }
        C7158EhT.A07(c7158EhT);
        C7158EhT.A06(c7158EhT);
    }
}
