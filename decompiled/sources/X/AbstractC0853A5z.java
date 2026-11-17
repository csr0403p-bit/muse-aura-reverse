package X;

import com.facebook.aura.network.acs.AcsKeyConfig;

/* renamed from: X.A5z, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC0853A5z extends A62 {
    public static final long A00(F24 f24, long j) {
        long j2;
        int iOrdinal = f24.ordinal();
        if (iOrdinal == 6) {
            j2 = 86400000;
        } else if (iOrdinal == 5) {
            j2 = 3600000;
        } else if (iOrdinal == 4) {
            j2 = 60000;
        } else if (iOrdinal == 3) {
            j2 = 1000;
        } else {
            if (iOrdinal != 2) {
                throw C3cG.A0Q(AnonymousClass007.A0a("Wrong unit for millisMultiplier: ", f24));
            }
            j2 = 1;
        }
        if (j == 0) {
            return 0L;
        }
        if (j == 1) {
            return j2 <= AcsKeyConfig.UNLIMITED_TOKEN_TTL_MILLIS ? j2 : AcsKeyConfig.UNLIMITED_TOKEN_TTL_MILLIS;
        }
        if (j2 != 1) {
            int iNumberOfLeadingZeros = (128 - Long.numberOfLeadingZeros(j)) - Long.numberOfLeadingZeros(j2);
            if (iNumberOfLeadingZeros < 63) {
                return j * j2;
            }
            if (iNumberOfLeadingZeros > 63) {
                return AcsKeyConfig.UNLIMITED_TOKEN_TTL_MILLIS;
            }
            j *= j2;
        }
        return j > AcsKeyConfig.UNLIMITED_TOKEN_TTL_MILLIS ? AcsKeyConfig.UNLIMITED_TOKEN_TTL_MILLIS : j;
    }
}
