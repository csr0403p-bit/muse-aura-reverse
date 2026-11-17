package X;

import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
public abstract class GLM {
    public static GLO A00(GLL gll, C9484GLa c9484GLa, Integer num, Integer num2) throws GeneralSecurityException {
        if (num == null) {
            throw BV6.A0u("key size is not set");
        }
        if (num2 == null) {
            throw BV6.A0u("tag size is not set");
        }
        if (gll == null) {
            throw BV6.A0u("hash type is not set");
        }
        if (c9484GLa == null) {
            throw BV6.A0u("variant is not set");
        }
        int iIntValue = num.intValue();
        if (iIntValue < 16) {
            throw AbstractC7609F5w.A0w("Invalid key size in bytes %d; must be at least 16 bytes", new Object[]{num});
        }
        int iIntValue2 = num2.intValue();
        if (iIntValue2 < 10) {
            throw AbstractC7609F5w.A0v("Invalid tag size in bytes %d; must be at least 10 bytes", BV5.A1Y(iIntValue2));
        }
        if (gll == GLL.A01) {
            if (iIntValue2 > 20) {
                throw AbstractC7609F5w.A0v("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", BV5.A1Y(iIntValue2));
            }
        } else if (gll == GLL.A02) {
            if (iIntValue2 > 28) {
                throw AbstractC7609F5w.A0v("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", BV5.A1Y(iIntValue2));
            }
        } else if (gll == GLL.A03) {
            if (iIntValue2 > 32) {
                throw AbstractC7609F5w.A0v("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", BV5.A1Y(iIntValue2));
            }
        } else if (gll == GLL.A04) {
            if (iIntValue2 > 48) {
                throw AbstractC7609F5w.A0v("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", BV5.A1Y(iIntValue2));
            }
        } else {
            if (gll != GLL.A05) {
                throw BV6.A0u("unknown hash type; must be SHA256, SHA384 or SHA512");
            }
            if (iIntValue2 > 64) {
                throw AbstractC7609F5w.A0v("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", BV5.A1Y(iIntValue2));
            }
        }
        return new GLO(gll, c9484GLa, iIntValue, iIntValue2);
    }
}
