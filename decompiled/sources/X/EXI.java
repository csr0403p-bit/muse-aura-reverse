package X;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.SecureRandom;

/* loaded from: classes5.dex */
public final class EXI extends ThreadLocal<SecureRandom> {
    @Override // java.lang.ThreadLocal
    public final /* bridge */ /* synthetic */ SecureRandom initialValue() throws NoSuchAlgorithmException {
        SecureRandom secureRandom;
        Provider provider;
        Provider providerA00 = AF8.A00();
        if (providerA00 != null) {
            try {
                secureRandom = SecureRandom.getInstance("SHA1PRNG", providerA00);
            } catch (GeneralSecurityException unused) {
            }
        } else {
            try {
                provider = (Provider) BV5.A0d("newProvider", Class.forName("org.conscrypt.Conscrypt"));
            } catch (Throwable unused2) {
                provider = null;
            }
            if (provider != null) {
                try {
                    secureRandom = SecureRandom.getInstance("SHA1PRNG", provider);
                } catch (GeneralSecurityException unused3) {
                }
            } else {
                secureRandom = new SecureRandom();
            }
        }
        secureRandom.nextLong();
        return secureRandom;
    }
}
