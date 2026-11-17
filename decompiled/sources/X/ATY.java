package X;

import X.AOd;

/* loaded from: classes4.dex */
public final class ATY<T, V extends AOd> implements ATV<T, V> {
    public final long A00;
    public final V A01;
    public final V A02;
    public final V A03;
    public final C31w<T, V> A04;
    public final InterfaceC1056ATd<V> A05;
    public final T A06;
    public final T A07;

    /* JADX WARN: Incorrect types in method signature: (LX/1YC<TT;>;LX/31w<TT;TV;>;TT;TV;)V */
    /* JADX WARN: Multi-variable type inference failed */
    public ATY(AOd aOd, C1YC c1yc, C31w c31w, Object obj) {
        ATZ atz = new ATZ(((C1054ATb) c1yc).A00);
        this.A05 = atz;
        this.A04 = c31w;
        this.A06 = obj;
        V v = (V) AOl.A00(c31w, obj);
        this.A02 = v;
        this.A03 = (V) AOg.A00(aOd);
        this.A07 = (T) ((AOl) this.A04).A00.invoke(atz.A00(v, aOd));
        V v2 = atz.A01;
        if (v2 == null) {
            v2 = (V) v.A03();
            atz.A01 = v2;
            if (v2 == null) {
                C7384Etj.A0b("velocityVector");
                throw F60.createAndThrow();
            }
        }
        int iA02 = v2.A02();
        long jMax = 0;
        for (int i = 0; i < iA02; i++) {
            jMax = Math.max(jMax, atz.A04.AEw(aOd.A01(i)));
        }
        this.A00 = jMax;
        V v3 = (V) AOg.A00(atz.AMa(v, aOd, jMax));
        this.A01 = v3;
        int iA022 = v3.A02();
        for (int i2 = 0; i2 < iA022; i2++) {
            V v4 = this.A01;
            float fA01 = v4.A01(i2);
            float f = ((ATZ) this.A05).A03;
            v4.A05(i2, ATD.A03(fA01, -f, f));
        }
    }

    @Override // X.ATV
    public final long AEu() {
        return this.A00;
    }

    @Override // X.ATV
    public final T ALY() {
        return this.A07;
    }

    @Override // X.ATV
    public final C31w<T, V> AMB() {
        return this.A04;
    }

    @Override // X.ATV
    public final T AMR(long j) {
        if (C8j3.A1Q((j > this.A00 ? 1 : (j == this.A00 ? 0 : -1)))) {
            return this.A07;
        }
        G0U<V, T> g0u = ((AOl) this.A04).A00;
        InterfaceC1056ATd<V> interfaceC1056ATd = this.A05;
        V v = this.A02;
        V v2 = this.A03;
        ATZ atz = (ATZ) interfaceC1056ATd;
        V v3 = atz.A00;
        if (v3 == null) {
            v3 = (V) v.A03();
            atz.A00 = v3;
        }
        if (v3 == null) {
            C7384Etj.A0b("valueVector");
            throw F60.createAndThrow();
        }
        int iA02 = v3.A02();
        int i = 0;
        while (true) {
            V v4 = atz.A00;
            if (i >= iA02) {
                if (v4 != null) {
                    return g0u.invoke(v4);
                }
                C7384Etj.A0b("valueVector");
                throw F60.createAndThrow();
            }
            if (v4 == null) {
                C7384Etj.A0b("valueVector");
                throw F60.createAndThrow();
            }
            v4.A05(i, atz.A04.AMS(v.A01(i), v2.A01(i), j));
            i++;
        }
    }

    @Override // X.ATV
    public final V AMb(long j) {
        return !C8j3.A1Q((j > this.A00 ? 1 : (j == this.A00 ? 0 : -1))) ? (V) this.A05.AMa(this.A02, this.A03, j) : this.A01;
    }

    @Override // X.ATV
    public final /* synthetic */ boolean AOR(long j) {
        return C8j3.A1Q((j > this.A00 ? 1 : (j == this.A00 ? 0 : -1)));
    }

    @Override // X.ATV
    public final boolean isInfinite() {
        return false;
    }
}
