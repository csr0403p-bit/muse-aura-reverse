package X;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: X.EdU, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6972EdU implements EXA {
    public final EXA A00;
    public final GKP A01;
    public final byte[] A02;

    @Override // X.EXA
    public final byte[] A8j(final byte[] ciphertext, final byte[] associatedData) throws GeneralSecurityException {
        EXA exa;
        if (this.A01 == GKP.RAW) {
            exa = this.A00;
        } else {
            if (!AbstractC10509Hny.A02(this.A02, ciphertext)) {
                throw BV6.A0u("wrong prefix");
            }
            exa = this.A00;
            ciphertext = Arrays.copyOfRange(ciphertext, 5, ciphertext.length);
        }
        return exa.A8j(ciphertext, associatedData);
    }

    @Override // X.EXA
    public final byte[] AAX(final byte[] plaintext, final byte[] associatedData) {
        return this.A01 == GKP.RAW ? this.A00.AAX(plaintext, associatedData) : Ed3.A00(this.A02, this.A00.AAX(plaintext, associatedData));
    }

    public C6972EdU(EXA rawDaead, GKP outputPrefixType, byte[] identifier) {
        this.A00 = rawDaead;
        this.A01 = outputPrefixType;
        this.A02 = identifier;
    }
}
