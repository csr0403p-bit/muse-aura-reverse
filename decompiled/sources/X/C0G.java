package X;

import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class C0G {
    public String A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    static {
        TimeUnit.SECONDS.toSeconds(2147483647L);
    }

    public final String toString() {
        String str = this.A00;
        if (str != null) {
            return str;
        }
        StringBuilder sbA0w = C60O.A0w();
        if (this.A09) {
            sbA0w.append("no-cache, ");
        }
        if (this.A0A) {
            sbA0w.append("no-store, ");
        }
        int i = this.A01;
        if (i != -1) {
            BV7.A1G("max-age=", ", ", sbA0w, i);
        }
        int i2 = this.A04;
        if (i2 != -1) {
            BV7.A1G("s-maxage=", ", ", sbA0w, i2);
        }
        if (this.A06) {
            sbA0w.append("private, ");
        }
        if (this.A07) {
            sbA0w.append("public, ");
        }
        if (this.A08) {
            sbA0w.append("must-revalidate, ");
        }
        int i3 = this.A02;
        if (i3 != -1) {
            BV7.A1G("max-stale=", ", ", sbA0w, i3);
        }
        int i4 = this.A03;
        if (i4 != -1) {
            BV7.A1G("min-fresh=", ", ", sbA0w, i4);
        }
        if (this.A0C) {
            sbA0w.append("only-if-cached, ");
        }
        if (this.A0B) {
            sbA0w.append("no-transform, ");
        }
        if (this.A05) {
            sbA0w.append("immutable, ");
        }
        if (sbA0w.length() == 0) {
            return "";
        }
        sbA0w.delete(sbA0w.length() - 2, sbA0w.length());
        String string = sbA0w.toString();
        this.A00 = string;
        return string;
    }

    public C0G(String str, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.A09 = z;
        this.A0A = z2;
        this.A01 = i;
        this.A04 = i2;
        this.A06 = z3;
        this.A07 = z4;
        this.A08 = z5;
        this.A02 = i3;
        this.A03 = i4;
        this.A0C = z6;
        this.A0B = z7;
        this.A05 = z8;
        this.A00 = str;
    }
}
