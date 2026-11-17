package X;

import java.util.List;

/* loaded from: classes6.dex */
public final class HpK {
    public final double A00;
    public final List<C8679Fif> A01;
    public final char A02;
    public final String A03;
    public final String A04;

    public final int hashCode() {
        char c = this.A02;
        return AnonymousClass001.A0H(this.A04, AnonymousClass005.A0I(this.A03, c * 31));
    }

    public HpK(String str, String str2, List list, char c, double d) {
        this.A01 = list;
        this.A02 = c;
        this.A00 = d;
        this.A04 = str;
        this.A03 = str2;
    }
}
