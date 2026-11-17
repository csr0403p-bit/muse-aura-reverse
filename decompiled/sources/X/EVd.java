package X;

import java.math.BigInteger;
import java.util.Calendar;
import javax.security.auth.x500.X500Principal;

/* loaded from: classes5.dex */
public final class EVd {
    public int A00 = 300;
    public String A01;
    public BigInteger A02;
    public X500Principal A03;
    public boolean A04;

    public final F3V A00() {
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.add(1, 20);
        if (this.A02 == null) {
            this.A02 = BigInteger.ONE;
        }
        if (this.A03 == null) {
            this.A03 = new X500Principal(FGI.A0U("CN=", this.A01, " CA Certificate"));
        }
        String str = this.A01;
        str.getClass();
        BigInteger bigInteger = this.A02;
        X500Principal x500Principal = this.A03;
        return new F3V(str, bigInteger, calendar.getTime(), calendar2.getTime(), x500Principal, this.A00, this.A04);
    }
}
