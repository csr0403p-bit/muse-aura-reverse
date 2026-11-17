package X;

import X.AOd;

/* renamed from: X.Aan, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1122Aan<V extends AOd> implements AOX<V> {
    public V A00;
    public V A01;
    public V A02;
    public final Aay A03;

    @Override // X.InterfaceC0999AOh
    public final V getEndVelocity(V v, V v2, V v3) {
        V v4 = this.A00;
        if (v4 == null) {
            v4 = (V) v3.A03();
            this.A00 = v4;
        }
        if (v4 == null) {
            C7384Etj.A0b("endVelocityVector");
            throw F60.createAndThrow();
        }
        int iA02 = v4.A02();
        int i = 0;
        while (true) {
            V v5 = this.A00;
            if (i >= iA02) {
                if (v5 != null) {
                    return v5;
                }
                C7384Etj.A0b("endVelocityVector");
                throw F60.createAndThrow();
            }
            if (v5 == null) {
                C7384Etj.A0b("endVelocityVector");
                throw F60.createAndThrow();
            }
            v5.A05(i, this.A03.ABu(i).AFD(v.A01(i), v2.A01(i), v3.A01(i)));
            i++;
        }
    }

    @Override // X.InterfaceC0999AOh
    public final V getValueFromNanos(long j, V v, V v2, V v3) {
        V v4 = this.A01;
        if (v4 == null) {
            v4 = (V) v.A03();
            this.A01 = v4;
        }
        if (v4 == null) {
            C7384Etj.A0b("valueVector");
            throw F60.createAndThrow();
        }
        int iA02 = v4.A02();
        int i = 0;
        while (true) {
            V v5 = this.A01;
            if (i >= iA02) {
                if (v5 != null) {
                    return v5;
                }
                C7384Etj.A0b("valueVector");
                throw F60.createAndThrow();
            }
            if (v5 == null) {
                C7384Etj.A0b("valueVector");
                throw F60.createAndThrow();
            }
            v5.A05(i, this.A03.ABu(i).AMT(v.A01(i), v2.A01(i), v3.A01(i), j));
            i++;
        }
    }

    @Override // X.InterfaceC0999AOh
    public final V getVelocityFromNanos(long j, V v, V v2, V v3) {
        V v4 = this.A02;
        if (v4 == null) {
            v4 = (V) v3.A03();
            this.A02 = v4;
        }
        if (v4 == null) {
            C7384Etj.A0b("velocityVector");
            throw F60.createAndThrow();
        }
        int iA02 = v4.A02();
        int i = 0;
        while (true) {
            V v5 = this.A02;
            if (i >= iA02) {
                if (v5 != null) {
                    return v5;
                }
                C7384Etj.A0b("velocityVector");
                throw F60.createAndThrow();
            }
            if (v5 == null) {
                C7384Etj.A0b("velocityVector");
                throw F60.createAndThrow();
            }
            v5.A05(i, this.A03.ABu(i).AMZ(v.A01(i), v2.A01(i), v3.A01(i), j));
            i++;
        }
    }

    @Override // X.InterfaceC0999AOh
    public final /* synthetic */ boolean isInfinite() {
        return false;
    }

    public C1122Aan(Aay aay) {
        this.A03 = aay;
    }

    @Override // X.InterfaceC0999AOh
    public final long getDurationNanos(V v, V v2, V v3) {
        int iA02 = v.A02();
        long jMax = 0;
        for (int i = 0; i < iA02; i++) {
            jMax = Math.max(jMax, this.A03.ABu(i).AEv(v.A01(i), v2.A01(i), v3.A01(i)));
        }
        return jMax;
    }
}
