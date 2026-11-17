package X;

import X.AOd;

/* loaded from: classes4.dex */
public final class ATZ<V extends AOd> implements InterfaceC1056ATd<V> {
    public V A00;
    public V A01;
    public V A02;
    public final float A03;
    public final InterfaceC1055ATc A04;

    public final V A00(V v, V v2) {
        V v3 = this.A02;
        if (v3 == null) {
            v3 = (V) v.A03();
            this.A02 = v3;
        }
        if (v3 == null) {
            C7384Etj.A0b("targetVector");
            throw F60.createAndThrow();
        }
        int iA02 = v3.A02();
        for (int i = 0; i < iA02; i++) {
            v3.A05(i, this.A04.ALX(v.A01(i), v2.A01(i)));
        }
        return v3;
    }

    /* JADX WARN: Incorrect types in method signature: (JTV;TV;)TV; */
    @Override // X.InterfaceC1056ATd
    public final AOd AMa(AOd aOd, AOd aOd2, long j) {
        V v = this.A01;
        if (v == null) {
            v = (V) aOd.A03();
            this.A01 = v;
        }
        if (v == null) {
            C7384Etj.A0b("velocityVector");
            throw F60.createAndThrow();
        }
        int iA02 = v.A02();
        int i = 0;
        while (true) {
            V v2 = this.A01;
            if (i >= iA02) {
                if (v2 != null) {
                    return v2;
                }
                C7384Etj.A0b("velocityVector");
                throw F60.createAndThrow();
            }
            if (v2 == null) {
                C7384Etj.A0b("velocityVector");
                throw F60.createAndThrow();
            }
            v2.A05(i, this.A04.AMY(j, aOd2.A01(i)));
            i++;
        }
    }

    public ATZ(InterfaceC1055ATc interfaceC1055ATc) {
        this.A04 = interfaceC1055ATc;
        this.A03 = interfaceC1055ATc.AC9();
    }
}
