package X;

import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
public abstract class GL3 {
    public static C9483GKz A00(GL4 gl4, C9479GKv c9479GKv, Integer num, Integer num2, Integer num3, Integer num4) throws GeneralSecurityException {
        if (num == null) {
            throw BV6.A0u("AES key size is not set");
        }
        if (num2 == null) {
            throw BV6.A0u("HMAC key size is not set");
        }
        if (num3 == null) {
            throw BV6.A0u("iv size is not set");
        }
        if (num4 == null) {
            throw BV6.A0u("tag size is not set");
        }
        int iIntValue = num4.intValue();
        if (gl4 == GL4.A01) {
            if (iIntValue > 20) {
                throw AbstractC7609F5w.A0v("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", BV5.A1Y(iIntValue));
            }
        } else if (gl4 == GL4.A02) {
            if (iIntValue > 28) {
                throw AbstractC7609F5w.A0v("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", BV5.A1Y(iIntValue));
            }
        } else if (gl4 == GL4.A03) {
            if (iIntValue > 32) {
                throw AbstractC7609F5w.A0v("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", BV5.A1Y(iIntValue));
            }
        } else if (gl4 == GL4.A04) {
            if (iIntValue > 48) {
                throw AbstractC7609F5w.A0v("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", BV5.A1Y(iIntValue));
            }
        } else {
            if (gl4 != GL4.A05) {
                throw BV6.A0u("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
            }
            if (iIntValue > 64) {
                throw AbstractC7609F5w.A0v("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", BV5.A1Y(iIntValue));
            }
        }
        return new C9483GKz(gl4, c9479GKv, num.intValue(), num2.intValue(), num3.intValue(), iIntValue);
    }
}
