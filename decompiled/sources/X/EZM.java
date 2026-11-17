package X;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public final class EZM {
    public BigInteger A00;
    public BigInteger A01;
    public BigInteger A02;
    public EZN A03;

    public final boolean equals(Object obj) {
        if (!(obj instanceof EZM)) {
            return false;
        }
        EZM ezm = (EZM) obj;
        if (ezm.A01.equals(this.A01) && ezm.A02.equals(this.A02)) {
            return BV7.A1X(ezm.A00, this.A00, false);
        }
        return false;
    }

    public final int hashCode() {
        return BV6.A09(this.A00, BV6.A09(this.A02, this.A01.hashCode()));
    }
}
