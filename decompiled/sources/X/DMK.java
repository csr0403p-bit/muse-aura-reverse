package X;

/* loaded from: classes5.dex */
public final class DMK extends AbstractC3582CVd<DMK> {
    public double childSystemTimeS;
    public double childUserTimeS;
    public double systemTimeS;
    public double userTimeS;

    public final void A03(DMK dmk) {
        C7384Etj.A0Y(dmk, 0);
        this.userTimeS = dmk.userTimeS;
        this.systemTimeS = dmk.systemTimeS;
        this.childUserTimeS = dmk.childUserTimeS;
        this.childSystemTimeS = dmk.childSystemTimeS;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && BV5.A1T(this, obj)) {
                DMK dmk = (DMK) obj;
                if (Double.compare(dmk.systemTimeS, this.systemTimeS) != 0 || Double.compare(dmk.userTimeS, this.userTimeS) != 0 || Double.compare(dmk.childSystemTimeS, this.childSystemTimeS) != 0 || Double.compare(dmk.childUserTimeS, this.childUserTimeS) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.systemTimeS);
        return C8j4.A0B(Double.doubleToLongBits(this.childUserTimeS), C8j4.A0B(Double.doubleToLongBits(this.childSystemTimeS), C8j4.A0B(Double.doubleToLongBits(this.userTimeS), ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31) * 31) * 31);
    }

    public final String toString() {
        double d = this.userTimeS;
        double d2 = this.systemTimeS;
        double d3 = this.childUserTimeS;
        double d4 = this.childSystemTimeS;
        StringBuilder sbA0x = C60O.A0x("CpuMetrics{userTimeS=");
        sbA0x.append(d);
        sbA0x.append(", systemTimeS=");
        sbA0x.append(d2);
        sbA0x.append(", childUserTimeS=");
        sbA0x.append(d3);
        sbA0x.append(", childSystemTimeS=");
        sbA0x.append(d4);
        return BV7.A11(sbA0x);
    }
}
