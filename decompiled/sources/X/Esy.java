package X;

import java.security.GeneralSecurityException;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class Esy implements EX9 {
    public final Esz A00;
    public final GMV A01;
    public final GMV A02;
    public final C7334ElC<Esz> A03;

    @Override // X.EX9
    public final byte[] A8i(final byte[] ciphertext, final byte[] associatedData) throws GeneralSecurityException {
        Iterator<Esz> it = this.A03.A00(ciphertext).iterator();
        while (it.hasNext()) {
            try {
                return it.next().A00.A8i(ciphertext, associatedData);
            } catch (GeneralSecurityException unused) {
            }
        }
        throw BV6.A0u("decryption failed");
    }

    @Override // X.EX9
    public final byte[] AAW(final byte[] plaintext, final byte[] associatedData) throws GeneralSecurityException {
        try {
            return this.A00.A00.AAW(plaintext, associatedData);
        } catch (GeneralSecurityException e) {
            throw e;
        }
    }

    public Esy(Esz primary, GMV allAeads, GMV encLogger, C7334ElC decLogger) {
        this.A00 = primary;
        this.A03 = decLogger;
        this.A02 = allAeads;
        this.A01 = encLogger;
    }
}
