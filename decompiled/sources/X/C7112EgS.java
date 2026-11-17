package X;

/* renamed from: X.EgS, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7112EgS<K, V> implements InterfaceC7121Egb<K, V> {
    public final InterfaceC7121Egb<K, V> A00;
    public final Eh3<K> A01;

    /* JADX WARN: Incorrect types in method signature: (TK;LX/EfF<TV;>;)LX/EfF<TV;>; */
    @Override // X.InterfaceC7121Egb
    public final EfF A5e(EfF efF, Object obj) {
        C7384Etj.A0Y(efF, 1);
        return this.A00.A5e(efF, obj);
    }

    @Override // X.InterfaceC7121Egb
    public final int Aaf(InterfaceC7168Ehd<K> interfaceC7168Ehd) {
        C7384Etj.A0Y(interfaceC7168Ehd, 0);
        return this.A00.Aaf(interfaceC7168Ehd);
    }

    @Override // X.ECU
    public final void AhS(ECR ecr) {
        C7384Etj.A0Y(ecr, 0);
        this.A00.AhS(ecr);
    }

    @Override // X.InterfaceC7121Egb
    public final EfF<V> AC3(K k) {
        return this.A00.AC3(k);
    }

    public C7112EgS(InterfaceC7121Egb<K, V> interfaceC7121Egb, Eh3<K> eh3) {
        this.A00 = interfaceC7121Egb;
        this.A01 = eh3;
    }
}
