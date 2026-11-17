package X;

import java.security.GeneralSecurityException;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class Esx implements EXA {
    public final Et0 A00;
    public final GMV A01;
    public final GMV A02;
    public final C7334ElC<Et0> A03;

    @Override // X.EXA
    public final byte[] A8j(final byte[] ciphertext, final byte[] associatedData) throws GeneralSecurityException {
        Iterator<Et0> it = this.A03.A00(ciphertext).iterator();
        while (it.hasNext()) {
            try {
                return it.next().A00.A8j(ciphertext, associatedData);
            } catch (GeneralSecurityException unused) {
            }
        }
        throw BV6.A0u("decryption failed");
    }

    @Override // X.EXA
    public final byte[] AAX(final byte[] plaintext, final byte[] associatedData) throws GeneralSecurityException {
        try {
            return this.A00.A00.AAX(plaintext, associatedData);
        } catch (GeneralSecurityException e) {
            throw e;
        }
    }

    public Esx(Et0 primary, GMV allDaeads, GMV encLogger, C7334ElC decLogger) {
        this.A00 = primary;
        this.A03 = decLogger;
        this.A02 = allDaeads;
        this.A01 = encLogger;
    }
}
