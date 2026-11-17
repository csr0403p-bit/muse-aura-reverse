package X;

import java.util.Date;
import java.util.regex.Pattern;

/* renamed from: X.EYm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6752EYm {
    public final long A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public static final Pattern A0C = Pattern.compile("(\\d{2,4})[^\\d]*");
    public static final Pattern A0A = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    public static final Pattern A09 = Pattern.compile("(\\d{1,2})[^\\d]*");
    public static final Pattern A0B = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    public static final int A00(String str, int i, int i2, boolean z) {
        while (i < i2) {
            int i3 = i + 1;
            char cCharAt = str.charAt(i);
            if ((cCharAt >= ' ' ? cCharAt >= '\u007f' || (cCharAt > '9' ? !(cCharAt > 'z' || ('a' > cCharAt && (cCharAt > 'Z' || ('A' > cCharAt && cCharAt != ':')))) : '0' <= cCharAt) : cCharAt != '\t') == (!z)) {
                return i;
            }
            i = i3;
        }
        return i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6752EYm) {
            C6752EYm c6752EYm = (C6752EYm) obj;
            if (c6752EYm.A02.equals(this.A02) && c6752EYm.A04.equals(this.A04) && c6752EYm.A00 == this.A00 && c6752EYm.A01.equals(this.A01) && C7384Etj.areEqual(c6752EYm.A03, this.A03) && c6752EYm.A08 == this.A08 && c6752EYm.A06 == this.A06 && c6752EYm.A07 == this.A07 && c6752EYm.A05 == this.A05) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C0KA.A00(C0KA.A01(C0KA.A01(C0KA.A01(AnonymousClass005.A0I(this.A03, AnonymousClass005.A0I(this.A01, C60R.A00(this.A00, AnonymousClass005.A0I(this.A04, BV8.A0B(this.A02))))), this.A08), this.A06), this.A07), this.A05);
    }

    public C6752EYm(String str, String str2, String str3, String str4, long j, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A02 = str;
        this.A04 = str2;
        this.A00 = j;
        this.A01 = str3;
        this.A03 = str4;
        this.A08 = z;
        this.A06 = z2;
        this.A07 = z3;
        this.A05 = z4;
    }

    public final String toString() {
        String str;
        StringBuilder sbA0w = C60O.A0w();
        BV7.A1I(sbA0w, this.A02);
        sbA0w.append(this.A04);
        if (this.A07) {
            long j = this.A00;
            if (j == Long.MIN_VALUE) {
                str = "; max-age=0";
            } else {
                sbA0w.append("; expires=");
                str = AbstractC6751EYl.A00.get().format(new Date(j));
                C7384Etj.A0U(str);
            }
            sbA0w.append(str);
        }
        if (!this.A05) {
            sbA0w.append("; domain=");
            sbA0w.append(this.A01);
        }
        sbA0w.append("; path=");
        sbA0w.append(this.A03);
        if (this.A08) {
            sbA0w.append("; secure");
        }
        if (this.A06) {
            sbA0w.append("; httponly");
        }
        return sbA0w.toString();
    }
}
