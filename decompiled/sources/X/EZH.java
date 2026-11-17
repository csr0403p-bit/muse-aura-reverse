package X;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public final class EZH {
    public BigInteger A00;
    public BigInteger A01;
    public BigInteger A02;
    public EZO A03;

    public final boolean equals(Object obj) {
        if (obj instanceof EZH) {
            EZH ezh = (EZH) obj;
            BigInteger bigInteger = this.A02;
            BigInteger bigInteger2 = ezh.A02;
            if (bigInteger != null) {
                if (bigInteger.equals(bigInteger2)) {
                }
            } else if (bigInteger2 != null) {
                return false;
            }
            if (ezh.A01.equals(this.A01)) {
                return BV7.A1X(ezh.A00, this.A00, false);
            }
        }
        return false;
    }

    public final int hashCode() {
        return BV6.A09(this.A00, this.A01.hashCode()) ^ C60R.A01(this.A02);
    }
}
