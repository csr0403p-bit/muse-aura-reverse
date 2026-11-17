package X;

import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.facebook.aura.network.acs.AcsKeyConfig;

/* renamed from: X.A5x, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0851A5x implements Comparable<C0851A5x> {
    public static final long A01 = (AcsKeyConfig.UNLIMITED_TOKEN_TTL_MILLIS << 1) + 1;
    public static final long A02 = ((-4611686018427387903L) << 1) + 1;
    public final long A00;

    public static final long A02(long j) {
        return ((((int) j) & 1) != 1 || j == A01 || j == A02) ? A04(F24.A04, j) : j >> 1;
    }

    public static final long A03(long j, long j2) {
        char c;
        long j3;
        long j4;
        long jA00;
        long j5;
        int i = ((int) j) & 1;
        if (i != (((int) j2) & 1)) {
            c = 1;
            if (i == 1) {
                j3 = j >> 1;
                j4 = j2 >> 1;
            } else {
                j3 = j2 >> 1;
                j4 = j >> 1;
            }
            long j6 = j4 / 1000000;
            jA00 = AbstractC0852A5y.A00(j3, j6);
            if (-4611686018426L <= jA00 && jA00 < 4611686018427L) {
                j5 = (jA00 * 1000000) + (j4 - (j6 * 1000000));
                return j5 << c;
            }
            return (jA00 << c) + 1;
        }
        c = 1;
        long j7 = j >> 1;
        long j8 = j2 >> 1;
        if (i == 0) {
            j5 = j7 + j8;
            if (-4611686018426999999L > j5 || j5 >= 4611686018427000000L) {
                jA00 = j5 / 1000000;
                return (jA00 << c) + 1;
            }
            return j5 << c;
        }
        jA00 = AbstractC0852A5y.A00(j7, j8);
        if (jA00 == 9223372036854759646L) {
            throw C60O.A0i("Summing infinite durations of different signs yields an undefined result.");
        }
        if (jA00 != AcsKeyConfig.UNLIMITED_TOKEN_TTL_MILLIS && jA00 != -4611686018427387903L) {
            if (-4611686018426L <= jA00 && jA00 < 4611686018427L) {
                j5 = jA00 * 1000000;
                return j5 << c;
            }
            jA00 = ATD.A07(jA00, -4611686018427387903L, AcsKeyConfig.UNLIMITED_TOKEN_TTL_MILLIS);
        }
        return (jA00 << c) + 1;
    }

    public static final int A00(long j) {
        if (j == A01 || j == A02) {
            return 0;
        }
        boolean z = (((int) j) & 1) == 1;
        long j2 = j >> 1;
        return (int) (z ? (j2 % 1000) * 1000000 : j2 % 1000000000);
    }

    public static int A01(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return C7384Etj.A01(j, j2);
        }
        int i = (((int) j) & 1) - (((int) j2) & 1);
        return j < 0 ? -i : i;
    }

    public static final long A04(F24 f24, long j) {
        if (j == A01) {
            return LinkEncryptedPairingKt.LINK_COUNTER_MAX;
        }
        if (j == A02) {
            return Long.MIN_VALUE;
        }
        return f24.timeUnit.convert(j >> 1, ((((int) j) & 1) == 0 ? F24.A06 : F24.A04).timeUnit);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0089, code lost:
    
        if (r5 == false) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b5 A[PHI: r0
  0x00b5: PHI (r0v19 int) = (r0v18 int), (r0v16 int) binds: [B:53:0x00b3, B:48:0x00a1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String A05(long r17) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0851A5x.A05(long):java.lang.String");
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(C0851A5x c0851A5x) {
        return A01(this.A00, c0851A5x.A00);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0851A5x) && this.A00 == ((C0851A5x) obj).A00;
    }

    public final int hashCode() {
        return AnonymousClass002.A0A(this.A00);
    }

    public final String toString() {
        return A05(this.A00);
    }

    public static final void A06(String str, StringBuilder sb, int i, int i2, int i3, boolean z) {
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String strA0P = C7BY.A0P(String.valueOf(i2), i3);
            int i4 = -1;
            int length = strA0P.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (strA0P.charAt(length) == '0') {
                        if (i5 < 0) {
                            break;
                        } else {
                            length = i5;
                        }
                    } else {
                        i4 = length;
                        break;
                    }
                }
            }
            int i6 = i4 + 1;
            if (z || i6 >= 3) {
                i6 = ((i4 + 3) / 3) * 3;
            }
            sb.append((CharSequence) strA0P, 0, i6);
        }
        sb.append(str);
    }
}
