package X;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* renamed from: X.EdB, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6955EdB implements EX9 {
    public static final ThreadLocal<Cipher> A00 = new C6954EdA();

    public static Cipher A00() throws GeneralSecurityException {
        try {
            Cipher cipher = A00.get();
            if (cipher != null) {
                return cipher;
            }
            throw BV6.A0u("AES GCM SIV cipher is invalid.");
        } catch (IllegalStateException e) {
            throw new GeneralSecurityException("AES GCM SIV cipher is not available or is invalid.", e);
        }
    }
}
