package X;

import androidx.media3.common.DrmInitData;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.Dwx, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6154Dwx {
    public static final C6154Dwx A0g = BV6.A0U(C6162Dx5.A00());
    public int A00;
    public final float A01;
    public final float A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final int A0F;
    public final int A0G;
    public final int A0H;
    public final int A0I;
    public final int A0J;
    public final int A0K;
    public final int A0L;
    public final int A0M;
    public final int A0N;
    public final int A0O;
    public final int A0P;
    public final int A0Q;
    public final long A0R;
    public final C6180DxO A0S;
    public final DrmInitData A0T;
    public final C5402Dhv A0U;
    public final Object A0V;
    public final String A0W;
    public final String A0X;
    public final String A0Y;
    public final String A0Z;
    public final String A0a;
    public final String A0b;
    public final List<byte[]> A0c;
    public final List<C6219DyA> A0d;
    public final boolean A0e;
    public final byte[] A0f;

    public final boolean equals(Object obj) {
        int i;
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                C6154Dwx c6154Dwx = (C6154Dwx) obj;
                int i2 = this.A00;
                if ((i2 == 0 || (i = c6154Dwx.A00) == 0 || i2 == i) && this.A0M == c6154Dwx.A0M && this.A0J == c6154Dwx.A0J && this.A04 == c6154Dwx.A04 && this.A0I == c6154Dwx.A0I && this.A0E == c6154Dwx.A0E && this.A0R == c6154Dwx.A0R && this.A0Q == c6154Dwx.A0Q && this.A0D == c6154Dwx.A0D && this.A0A == c6154Dwx.A0A && this.A09 == c6154Dwx.A09 && this.A0K == c6154Dwx.A0K && this.A0N == c6154Dwx.A0N && this.A0G == c6154Dwx.A0G && this.A06 == c6154Dwx.A06 && this.A0L == c6154Dwx.A0L && this.A0H == c6154Dwx.A0H && this.A0B == c6154Dwx.A0B && this.A0C == c6154Dwx.A0C && this.A03 == c6154Dwx.A03 && this.A0O == c6154Dwx.A0O && this.A0P == c6154Dwx.A0P && this.A07 == c6154Dwx.A07 && Float.compare(this.A01, c6154Dwx.A01) == 0 && Float.compare(this.A02, c6154Dwx.A02) == 0 && C6xC.A00(this.A0Y, c6154Dwx.A0Y) && C6xC.A00(this.A0Z, c6154Dwx.A0Z) && this.A0d.equals(c6154Dwx.A0d) && C6xC.A00(this.A0W, c6154Dwx.A0W) && C6xC.A00(this.A0X, c6154Dwx.A0X) && C6xC.A00(this.A0b, c6154Dwx.A0b) && C6xC.A00(this.A0a, c6154Dwx.A0a) && Arrays.equals(this.A0f, c6154Dwx.A0f) && C6xC.A00(this.A0U, c6154Dwx.A0U) && C6xC.A00(this.A0S, c6154Dwx.A0S) && C6xC.A00(this.A0T, c6154Dwx.A0T) && A01(c6154Dwx) && C6xC.A00(this.A0V, c6154Dwx.A0V)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x0151  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String A00(X.C6154Dwx r15) {
        /*
            Method dump skipped, instructions count: 779
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6154Dwx.A00(X.Dwx):java.lang.String");
    }

    public final boolean A01(C6154Dwx c6154Dwx) {
        List<byte[]> list = this.A0c;
        int size = list.size();
        List<byte[]> list2 = c6154Dwx.A0c;
        if (size != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = this.A00;
        if (i != 0) {
            return i;
        }
        int iA02 = ((((((((((((((((((((AnonymousClass005.A02((AnonymousClass005.A02((((((((((((((((((((((((((((((((((((((527 + AnonymousClass006.A0G(this.A0Y)) * 31) + AnonymousClass006.A0G(this.A0Z)) * 31) + this.A0d.hashCode()) * 31) + AnonymousClass006.A0G(this.A0a)) * 31) + this.A0M) * 31) + this.A0J) * 31 * 31) + this.A04) * 31) + this.A0I) * 31) + AnonymousClass006.A0G(this.A0W)) * 31) + AnonymousClass006.A0D(this.A0U)) * 31) + AnonymousClass006.A0D(this.A0V)) * 31) + AnonymousClass006.A0G(this.A0X)) * 31) + AnonymousClass005.A0H(this.A0b)) * 31) + this.A0E) * 31) + ((int) this.A0R)) * 31) + this.A0Q) * 31) + this.A0D) * 31) + this.A0A) * 31) + this.A09) * 31, this.A01) + this.A0K) * 31, this.A02) + this.A0N) * 31) + this.A0G) * 31) + this.A06) * 31) + this.A0L) * 31) + this.A0H) * 31) + this.A0B) * 31) + this.A0C) * 31) + this.A03) * 31) + this.A0O) * 31) + this.A0P) * 31) + this.A07;
        this.A00 = iA02;
        return iA02;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("Format(");
        sbA0x.append(this.A0Y);
        sbA0x.append(", ");
        sbA0x.append(this.A0Z);
        sbA0x.append(", ");
        sbA0x.append(this.A0X);
        sbA0x.append(", ");
        sbA0x.append(this.A0b);
        sbA0x.append(", ");
        sbA0x.append(this.A0W);
        sbA0x.append(", ");
        sbA0x.append(this.A05);
        sbA0x.append(", ");
        sbA0x.append(this.A0a);
        sbA0x.append(", [");
        sbA0x.append(this.A0Q);
        sbA0x.append(", ");
        sbA0x.append(this.A0D);
        sbA0x.append(", ");
        sbA0x.append(this.A01);
        sbA0x.append(", ");
        sbA0x.append(this.A0S);
        sbA0x.append("], [");
        sbA0x.append(this.A06);
        sbA0x.append(", ");
        sbA0x.append(this.A0L);
        return AnonymousClass001.A0v("])", sbA0x);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d7 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C6154Dwx(X.C6162Dx5 r8) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6154Dwx.<init>(X.Dx5):void");
    }
}
