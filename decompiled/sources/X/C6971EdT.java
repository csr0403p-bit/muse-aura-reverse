package X;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: X.EdT, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6971EdT implements EX9 {
    public final EX9 A00;
    public final byte[] A01;

    @Override // X.EX9
    public final byte[] A8i(byte[] ciphertext, byte[] associatedData) throws GeneralSecurityException {
        EX9 ex9;
        byte[] bArr = this.A01;
        if (bArr.length == 0) {
            ex9 = this.A00;
        } else {
            if (!AbstractC10509Hny.A02(bArr, ciphertext)) {
                throw BV6.A0u("wrong prefix");
            }
            ex9 = this.A00;
            ciphertext = Arrays.copyOfRange(ciphertext, 5, ciphertext.length);
        }
        return ex9.A8i(ciphertext, associatedData);
    }

    @Override // X.EX9
    public final byte[] AAW(byte[] plaintext, byte[] associatedData) {
        byte[] bArr = this.A01;
        int length = bArr.length;
        byte[] bArrAAW = this.A00.AAW(plaintext, associatedData);
        return length != 0 ? Ed3.A00(bArr, bArrAAW) : bArrAAW;
    }

    public C6971EdT(EX9 rawAead, byte[] identifier) {
        this.A00 = rawAead;
        int length = identifier.length;
        if (length != 0 && length != 5) {
            throw C60O.A0i("identifier has an invalid length");
        }
        this.A01 = identifier;
    }
}
