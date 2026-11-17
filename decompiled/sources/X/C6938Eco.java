package X;

import android.text.TextUtils;

/* renamed from: X.Eco, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6938Eco {
    public C6939Ecr A00;
    public final C6939Ecr A01;
    public final C6939Ecr A02;
    public final C6939Ecr A03;
    public final C6937Ecn A04;
    public final String A05;

    public C6938Eco(C6939Ecr c6939Ecr, C6939Ecr c6939Ecr2, C6939Ecr c6939Ecr3, C6939Ecr c6939Ecr4, C6937Ecn c6937Ecn, String str) {
        this.A05 = str;
        this.A04 = c6937Ecn;
        this.A02 = c6939Ecr2;
        this.A03 = c6939Ecr3;
        this.A01 = c6939Ecr;
        this.A00 = c6939Ecr4;
    }

    public static int A00(int[] iArr, int i) {
        int iMin = Integer.MAX_VALUE;
        for (int i2 : iArr) {
            if (i2 >= 0) {
                iMin = Math.min(iMin, i2);
            }
        }
        return iMin == Integer.MAX_VALUE ? i : iMin;
    }

    public final String A01() {
        StringBuilder sbA0w = C60O.A0w();
        String str = this.A05;
        if (!TextUtils.isEmpty(str)) {
            sbA0w.append(str);
            sbA0w.append(":");
        }
        C6937Ecn c6937Ecn = this.A04;
        if (c6937Ecn != null) {
            sbA0w.append("//");
            StringBuilder sbA0w2 = C60O.A0w();
            if (!TextUtils.isEmpty(c6937Ecn.A02)) {
                sbA0w2.append("<REDACTED>@");
            }
            String str2 = c6937Ecn.A00;
            if (!TextUtils.isEmpty(str2)) {
                sbA0w2.append(str2);
            }
            String str3 = c6937Ecn.A01;
            if (!TextUtils.isEmpty(str3)) {
                sbA0w2.append(":");
                sbA0w2.append(str3);
            }
            BV4.A1O(sbA0w, sbA0w2);
        }
        String str4 = this.A02.A00;
        if (!TextUtils.isEmpty(str4)) {
            sbA0w.append(str4);
        }
        C6939Ecr c6939Ecr = this.A03;
        if (c6939Ecr != null && !TextUtils.isEmpty(c6939Ecr.A00)) {
            sbA0w.append('?');
            sbA0w.append("<REDACTED>");
        }
        C6939Ecr c6939Ecr2 = this.A01;
        if (c6939Ecr2 != null && !TextUtils.isEmpty(c6939Ecr2.A00)) {
            sbA0w.append('#');
            sbA0w.append("<REDACTED>");
        }
        return sbA0w.toString();
    }

    public final String toString() {
        return A01();
    }
}
