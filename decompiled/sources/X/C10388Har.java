package X;

import android.net.Uri;
import android.os.Bundle;
import com.google.common.collect.ImmutableList;
import java.util.Arrays;

/* renamed from: X.Har, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10388Har {
    public static final C10388Har A0Y = new C10388Har(new C10389Has());
    public final Uri A00;
    public final Bundle A01;
    public final ImmutableList<String> A02;
    public final Boolean A03;
    public final Boolean A04;
    public final CharSequence A05;
    public final CharSequence A06;
    public final CharSequence A07;
    public final CharSequence A08;
    public final CharSequence A09;
    public final CharSequence A0A;
    public final CharSequence A0B;
    public final CharSequence A0C;
    public final CharSequence A0D;
    public final CharSequence A0E;
    public final CharSequence A0F;
    public final CharSequence A0G;
    public final CharSequence A0H;
    public final Integer A0I;
    public final Integer A0J;

    @Deprecated
    public final Integer A0K;
    public final Integer A0L;
    public final Integer A0M;
    public final Integer A0N;
    public final Integer A0O;
    public final Integer A0P;
    public final Integer A0Q;
    public final Integer A0R;
    public final Integer A0S;
    public final Integer A0T;
    public final Integer A0U;

    @Deprecated
    public final Integer A0V;
    public final Long A0W;
    public final byte[] A0X;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                C10388Har c10388Har = (C10388Har) obj;
                if (!C6xC.A00(this.A0G, c10388Har.A0G) || !C6xC.A00(this.A07, c10388Har.A07) || !C6xC.A00(this.A06, c10388Har.A06) || !C6xC.A00(this.A05, c10388Har.A05) || !C6xC.A00(this.A0C, c10388Har.A0C) || !C6xC.A00(this.A0F, c10388Har.A0F) || !C6xC.A00(this.A0B, c10388Har.A0B) || !C6xC.A00(this.A0W, c10388Har.A0W) || !Arrays.equals(this.A0X, c10388Har.A0X) || !C6xC.A00(this.A0I, c10388Har.A0I) || !C6xC.A00(this.A00, c10388Har.A00) || !C6xC.A00(this.A0U, c10388Har.A0U) || !C6xC.A00(this.A0T, c10388Har.A0T) || !C6xC.A00(this.A0K, c10388Har.A0K) || !C6xC.A00(this.A03, c10388Har.A03) || !C6xC.A00(this.A04, c10388Har.A04) || !C6xC.A00(this.A0O, c10388Har.A0O) || !C6xC.A00(this.A0N, c10388Har.A0N) || !C6xC.A00(this.A0M, c10388Har.A0M) || !C6xC.A00(this.A0R, c10388Har.A0R) || !C6xC.A00(this.A0Q, c10388Har.A0Q) || !C6xC.A00(this.A0P, c10388Har.A0P) || !C6xC.A00(this.A0H, c10388Har.A0H) || !C6xC.A00(this.A09, c10388Har.A09) || !C6xC.A00(this.A0A, c10388Har.A0A) || !C6xC.A00(this.A0J, c10388Har.A0J) || !C6xC.A00(this.A0S, c10388Har.A0S) || !C6xC.A00(this.A0D, c10388Har.A0D) || !C6xC.A00(this.A08, c10388Har.A08) || !C6xC.A00(this.A0E, c10388Har.A0E) || !C6xC.A00(this.A0L, c10388Har.A0L) || !C6xC.A00(this.A02, c10388Har.A02) || AnonymousClass002.A1Y(this.A01) != AnonymousClass002.A1Y(c10388Har.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        CharSequence charSequence = this.A0G;
        CharSequence charSequence2 = this.A07;
        CharSequence charSequence3 = this.A06;
        CharSequence charSequence4 = this.A05;
        CharSequence charSequence5 = this.A0C;
        CharSequence charSequence6 = this.A0F;
        CharSequence charSequence7 = this.A0B;
        Long l = this.A0W;
        Integer numValueOf = Integer.valueOf(Arrays.hashCode(this.A0X));
        Integer num = this.A0I;
        Uri uri = this.A00;
        Integer num2 = this.A0U;
        Integer num3 = this.A0T;
        Integer num4 = this.A0K;
        Boolean bool = this.A03;
        Boolean bool2 = this.A04;
        Integer num5 = this.A0O;
        Integer num6 = this.A0N;
        Integer num7 = this.A0M;
        Integer num8 = this.A0R;
        Integer num9 = this.A0Q;
        Integer num10 = this.A0P;
        CharSequence charSequence8 = this.A0H;
        CharSequence charSequence9 = this.A09;
        CharSequence charSequence10 = this.A0A;
        Object[] objArr = new Object[35];
        System.arraycopy(new Object[]{this.A0J, this.A0S, this.A0D, this.A08, this.A0E, this.A0L, Boolean.valueOf(AnonymousClass002.A1Y(this.A01)), this.A02}, BV5.A1U(new Object[]{charSequence, charSequence2, charSequence3, charSequence4, charSequence5, charSequence6, charSequence7, l, null, null, numValueOf, num, uri, num2, num3, num4, bool, bool2, num5, num6, num7, num8, num9, num10, charSequence8, charSequence9, charSequence10}, objArr) ? 1 : 0, objArr, 27, 8);
        return Arrays.hashCode(objArr);
    }

    public C10388Har(C10389Has c10389Has) {
        int i;
        Boolean boolValueOf = c10389Has.A03;
        Integer numValueOf = c10389Has.A0K;
        Integer numValueOf2 = c10389Has.A0L;
        i = 0;
        int i2 = 0;
        if (boolValueOf != null) {
            if (!boolValueOf.booleanValue()) {
                numValueOf = -1;
            } else if (numValueOf == null || numValueOf.intValue() == -1) {
                if (numValueOf2 != null) {
                    switch (numValueOf2.intValue()) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                            i2 = 1;
                            break;
                        case 21:
                            i2 = 2;
                            break;
                        case 22:
                            i2 = 3;
                            break;
                        case 23:
                            i2 = 4;
                            break;
                        case 24:
                            i2 = 5;
                            break;
                        case 25:
                            i2 = 6;
                            break;
                    }
                }
                numValueOf = Integer.valueOf(i2);
            }
        } else if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            boolean z = iIntValue != -1;
            boolValueOf = Boolean.valueOf(z);
            if (z && numValueOf2 == null) {
                switch (iIntValue) {
                    case 1:
                        i = 0;
                        break;
                    case 2:
                        i = 21;
                        break;
                    case 3:
                        i = 22;
                        break;
                    case 4:
                        i = 23;
                        break;
                    case 5:
                        i = 24;
                        break;
                    case 6:
                        i = 25;
                        break;
                    default:
                        i = 20;
                        break;
                }
                numValueOf2 = Integer.valueOf(i);
            }
        }
        this.A0G = c10389Has.A0G;
        this.A07 = c10389Has.A07;
        this.A06 = c10389Has.A06;
        this.A05 = c10389Has.A05;
        this.A0C = c10389Has.A0C;
        this.A0F = c10389Has.A0F;
        this.A0B = c10389Has.A0B;
        this.A0W = c10389Has.A0V;
        this.A0X = c10389Has.A0W;
        this.A0I = c10389Has.A0I;
        this.A00 = c10389Has.A00;
        this.A0U = c10389Has.A0U;
        this.A0T = c10389Has.A0T;
        this.A0K = numValueOf;
        this.A03 = boolValueOf;
        this.A04 = c10389Has.A04;
        Integer num = c10389Has.A0O;
        this.A0V = num;
        this.A0O = num;
        this.A0N = c10389Has.A0N;
        this.A0M = c10389Has.A0M;
        this.A0R = c10389Has.A0R;
        this.A0Q = c10389Has.A0Q;
        this.A0P = c10389Has.A0P;
        this.A0H = c10389Has.A0H;
        this.A09 = c10389Has.A09;
        this.A0A = c10389Has.A0A;
        this.A0J = c10389Has.A0J;
        this.A0S = c10389Has.A0S;
        this.A0D = c10389Has.A0D;
        this.A08 = c10389Has.A08;
        this.A0E = c10389Has.A0E;
        this.A0L = numValueOf2;
        this.A02 = c10389Has.A02;
        this.A01 = c10389Has.A01;
    }
}
