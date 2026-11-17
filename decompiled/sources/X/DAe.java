package X;

import com.facebook.perf.background.BackgroundStartupDetector;

/* loaded from: classes5.dex */
public final class DAe {
    public static volatile DAe A0A = new DAe(null, null, null, null, null, null, -1, -1, 0, false);
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public final int A04;
    public final int A05;
    public final long A06;
    public final Integer A07;
    public final String A08;
    public final boolean A09;

    public static final void A00(String str, Integer num) {
        DAe dAe = A0A;
        A0A = new DAe(num, dAe.A01, dAe.A00, dAe.A03, dAe.A02, str, 0, dAe.A05, dAe.A06, dAe.A09);
    }

    public static final boolean A01() {
        int i = BackgroundStartupDetector._coldStartMode;
        return (i == 3 || i == 4 || BackgroundStartupDetector.backgroundedCount != 0) ? false : true;
    }

    public static final boolean A02() {
        int i = A0A.A04;
        return i == 1 || i == 2 || i == 3 || i == -1;
    }

    public DAe(Integer num, String str, String str2, String str3, String str4, String str5, int i, int i2, long j, boolean z) {
        this.A04 = i;
        this.A05 = i2;
        this.A06 = j;
        this.A09 = z;
        this.A01 = str;
        this.A07 = num;
        this.A00 = str2;
        this.A03 = str3;
        this.A02 = str4;
        this.A08 = str5;
    }
}
