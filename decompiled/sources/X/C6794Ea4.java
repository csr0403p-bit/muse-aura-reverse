package X;

import java.io.IOException;

/* renamed from: X.Ea4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6794Ea4 implements F95 {
    public long A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public Integer A04 = C79.A0c;
    public String A05;

    public static final void A00(C6794Ea4 c6794Ea4, Integer num, String str) {
        c6794Ea4.A04 = num;
        c6794Ea4.A05 = str;
        c6794Ea4.A03 = false;
        c6794Ea4.A02 = false;
    }

    @Override // X.F95
    public final boolean A5I() throws IOException {
        Integer num = this.A04;
        if (num == C79.A0Z) {
            return this.A01;
        }
        throw BV5.A0M("No boolean at ", HqV.A00(num));
    }

    @Override // X.F95
    public final int ANp() {
        if (!this.A03) {
            return Integer.parseInt(AgW());
        }
        long j = this.A00;
        int i = (int) j;
        if (i != j) {
            throw BV6.A0k(FGI.A0B(j, "Out of int range: "));
        }
        return i;
    }

    @Override // X.F95
    public final boolean AOn() {
        return AnonymousClass002.A1Z(this.A04, C79.A0c);
    }

    @Override // X.F95
    public final long APz() {
        return this.A03 ? this.A00 : Long.parseLong(AgW());
    }

    @Override // X.F95
    public final Number ARX() throws IOException {
        Number numberValueOf;
        if (this.A03) {
            numberValueOf = Long.valueOf(this.A00);
        } else {
            String strAgW = AgW();
            Long lA0s = C9tI.A0s(strAgW);
            if (lA0s != null) {
                return lA0s;
            }
            numberValueOf = Double.valueOf(Double.parseDouble(strAgW));
        }
        return numberValueOf;
    }

    @Override // X.F95
    public final String AgW() throws IOException {
        if (this.A03) {
            return String.valueOf(this.A00);
        }
        String str = this.A05;
        if (str == null) {
            throw BV4.A0K(this.A02 ? "An embedded stream has no text" : FGI.A0M("No text at ", HqV.A00(this.A04)));
        }
        return str;
    }
}
