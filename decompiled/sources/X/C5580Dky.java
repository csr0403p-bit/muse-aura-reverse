package X;

import android.net.Uri;
import android.util.Pair;
import androidx.media3.common.util.Util;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Dky, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5580Dky implements InterfaceC5590DlO<C5580Dky> {
    public long A00;
    public String A01;
    public String A02;
    public final int A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final long A09;
    public final long A0A;
    public final long A0B;
    public final long A0C;
    public final long A0D;
    public final long A0E;
    public final long A0F;
    public final Uri A0G;
    public final DlK A0H;
    public final C5361Dh8 A0I;
    public final C5354Dgx A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final String A0N;
    public final String A0O;
    public final String A0P;
    public final String A0Q;
    public final List<C5585DlC> A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final boolean A0U;
    public final boolean A0V;
    public final boolean A0W;
    public final boolean A0X;
    public final boolean A0Y;

    public static Dl9 A03(C5580Dky c5580Dky) {
        return c5580Dky.A0R.get(0).A03.get(0);
    }

    public static AbstractC5553DkW A04(C5580Dky c5580Dky) {
        return c5580Dky.A0R.get(0).A03.get(0).A0E.get(0);
    }

    public static boolean A06(C5580Dky c5580Dky) {
        return c5580Dky.A0R.get(0).A03.isEmpty();
    }

    public static int A00(C5580Dky c5580Dky) {
        return c5580Dky.A0R.size();
    }

    public static final long A02(C5580Dky c5580Dky, int i) {
        long j;
        List<C5585DlC> list = c5580Dky.A0R;
        if (i == C60O.A00(list)) {
            j = c5580Dky.A07;
            if (j == -9223372036854775807L) {
                return -9223372036854775807L;
            }
        } else {
            j = list.get(i + 1).A00;
        }
        return j - list.get(i).A00;
    }

    public static Iterator A05(C5580Dky c5580Dky, int i) {
        return c5580Dky.A0R.get(i).A03.iterator();
    }

    public final double A07() {
        C5585DlC c5585DlC;
        int iA00;
        List<C5585DlC> list = this.A0R;
        if (list.size() != 0 && (iA00 = (c5585DlC = (C5585DlC) C8j4.A0p(list)).A00(1)) != -1) {
            double d = BV6.A0c(c5585DlC.A03, iA00).A00;
            if (d > 0.0d) {
                return d;
            }
        }
        return 0.0d;
    }

    public final Pair<Integer, Integer> A08() {
        C5585DlC c5585DlC;
        int iA00;
        List<C5585DlC> list = this.A0R;
        if (list.size() == 0 || (iA00 = (c5585DlC = (C5585DlC) C8j4.A0p(list)).A00(1)) == -1) {
            return null;
        }
        Dl9 dl9A0c = BV6.A0c(c5585DlC.A03, iA00);
        return BV5.A0E(Integer.valueOf(dl9A0c.A04), dl9A0c.A03);
    }

    public final Pair<Float, Float> A09() {
        C5585DlC c5585DlC;
        int iA00;
        List<C5585DlC> list = this.A0R;
        if (list.size() == 0 || (iA00 = (c5585DlC = (C5585DlC) C8j4.A0p(list)).A00(1)) == -1) {
            return null;
        }
        Dl9 dl9A0c = BV6.A0c(c5585DlC.A03, iA00);
        return BV4.A0A(Float.valueOf(dl9A0c.A02), Float.valueOf(dl9A0c.A01));
    }

    public final Pair<Integer, Integer> A0A() {
        C5585DlC c5585DlC;
        int iA00;
        List<C5585DlC> list = this.A0R;
        if (list.size() == 0 || (iA00 = (c5585DlC = (C5585DlC) C8j4.A0p(list)).A00(2)) == -1) {
            return null;
        }
        Dl9 dl9A0c = BV6.A0c(c5585DlC.A03, iA00);
        return BV5.A0E(Integer.valueOf(dl9A0c.A04), dl9A0c.A03);
    }

    public final Pair<String, String> A0B() {
        C5585DlC c5585DlC;
        int iA00;
        List<C5585DlC> list = this.A0R;
        if (list.isEmpty() || (iA00 = (c5585DlC = (C5585DlC) C8j4.A0p(list)).A00(2)) == -1) {
            return null;
        }
        Dl9 dl9A0c = BV6.A0c(c5585DlC.A03, iA00);
        return BV4.A0A(dl9A0c.A08, dl9A0c.A07);
    }

    public final Pair<Float, Float> A0C() {
        C5585DlC c5585DlC;
        int iA00;
        List<C5585DlC> list = this.A0R;
        if (list.size() == 0 || (iA00 = (c5585DlC = (C5585DlC) C8j4.A0p(list)).A00(2)) == -1) {
            return null;
        }
        Dl9 dl9A0c = BV6.A0c(c5585DlC.A03, iA00);
        return BV4.A0A(Float.valueOf(dl9A0c.A02), Float.valueOf(dl9A0c.A01));
    }

    public final Pair<String, String> A0D() {
        C5585DlC c5585DlC;
        int iA00;
        List<C5585DlC> list = this.A0R;
        if (list.size() == 0 || (iA00 = (c5585DlC = (C5585DlC) C8j4.A0p(list)).A00(2)) == -1) {
            return null;
        }
        Dl9 dl9A0c = BV6.A0c(c5585DlC.A03, iA00);
        return BV4.A0A(dl9A0c.A0A, dl9A0c.A0B);
    }

    public final String A0E() {
        C5585DlC c5585DlC;
        int iA00;
        String str;
        List<C5585DlC> list = this.A0R;
        if (list.size() == 0 || (iA00 = (c5585DlC = (C5585DlC) C8j4.A0p(list)).A00(2)) == -1 || (str = BV6.A0c(c5585DlC.A03, iA00).A09) == null || str.isEmpty()) {
            return null;
        }
        return str;
    }

    public final boolean A0F() {
        List<C5585DlC> list = this.A0R;
        if (list.size() != 0) {
            Iterator<Dl9> it = list.get(0).A03.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (BV6.A0b(it).A06 == 1) {
                    i++;
                }
            }
            if (i > 1) {
                return true;
            }
        }
        return false;
    }

    public final boolean A0G() {
        C5585DlC c5585DlC;
        int iA00;
        List<C5585DlC> list = this.A0R;
        if (list.size() != 0 && (iA00 = (c5585DlC = list.get(0)).A00(1)) != -1) {
            Dl9 dl9A0c = BV6.A0c(c5585DlC.A03, iA00);
            if (dl9A0c.A0G && dl9A0c.A0H) {
                Iterator itA02 = Dl9.A02(dl9A0c);
                while (itA02.hasNext()) {
                    if (!"mp4a.40.42".equals(BV6.A0d(itA02).A03.A0W)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static long A01(C5580Dky c5580Dky, int i) {
        return Util.A0A(A02(c5580Dky, i));
    }

    /* JADX WARN: Incorrect types in method signature: (JJJZJJJJLX/DlK;LX/Dgx;LX/Dh8;Landroid/net/Uri;Ljava/util/List<LX/DlC;>;JJJJJZZZLjava/lang/String;IZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJ)V */
    public C5580Dky(Uri uri, DlK dlK, C5361Dh8 c5361Dh8, C5354Dgx c5354Dgx, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, int i, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.A05 = j;
        this.A07 = j2;
        this.A0A = j3;
        this.A0S = z;
        this.A0B = j4;
        this.A0F = j5;
        this.A0E = j6;
        this.A0D = j7;
        this.A0H = dlK;
        this.A0J = c5354Dgx;
        this.A0G = uri;
        this.A0I = c5361Dh8;
        this.A0R = list;
        this.A04 = j8;
        this.A08 = j9;
        this.A06 = j10;
        this.A09 = j11;
        this.A0C = j12;
        this.A0V = z2;
        this.A0T = z3;
        this.A0X = z4;
        this.A0W = z5;
        this.A0Y = z6;
        this.A0Q = str;
        this.A03 = i;
        this.A0L = str2;
        this.A0O = str3;
        this.A0K = str4;
        this.A0N = str5;
        this.A0M = str6;
        this.A0P = str7;
        this.A0U = z7;
        this.A00 = j13;
    }
}
