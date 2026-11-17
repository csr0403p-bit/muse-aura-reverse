package X;

import com.facebook.aura.network.acs.AcsKeyConfig;

/* renamed from: X.A5y, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC0852A5y {
    public static final long A00(long j, long j2) {
        if (j != AcsKeyConfig.UNLIMITED_TOKEN_TTL_MILLIS && j != -4611686018427387903L) {
            return (j2 == AcsKeyConfig.UNLIMITED_TOKEN_TTL_MILLIS || j2 == -4611686018427387903L) ? j2 : ATD.A07(j + j2, -4611686018427387903L, AcsKeyConfig.UNLIMITED_TOKEN_TTL_MILLIS);
        }
        if ((-4611686018427387903L >= j2 || j2 >= AcsKeyConfig.UNLIMITED_TOKEN_TTL_MILLIS) && (j2 ^ j) < 0) {
            return 9223372036854759646L;
        }
        return j;
    }

    public static final long A01(F24 f24, int i) {
        long j = i;
        return f24.compareTo(F24.A07) <= 0 ? F24.A06.timeUnit.convert(j, f24.timeUnit) << 1 : A02(f24, j);
    }

    public static final long A02(F24 f24, long j) {
        long jA07;
        F24 f242 = F24.A06;
        long jConvert = f24.timeUnit.convert(4611686018426999999L, f242.timeUnit);
        if ((-jConvert) <= j && j <= jConvert) {
            return f242.timeUnit.convert(j, f24.timeUnit) << 1;
        }
        F24 f243 = F24.A04;
        if (f24.compareTo(f243) >= 0) {
            long jSignum = Long.signum(j);
            if (j < -9223372036854775807L) {
                j = -9223372036854775807L;
            }
            jA07 = jSignum * AbstractC0853A5z.A00(f24, Math.abs(j));
        } else {
            jA07 = ATD.A07(f243.timeUnit.convert(j, f24.timeUnit), -4611686018427387903L, AcsKeyConfig.UNLIMITED_TOKEN_TTL_MILLIS);
        }
        return (jA07 << 1) + 1;
    }
}
