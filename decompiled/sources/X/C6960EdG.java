package X;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: X.EdG, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6960EdG implements EX9 {
    public final C6945Ecx A00;
    public final byte[] A01;

    @Override // X.EX9
    public final byte[] AAW(final byte[] plaintext, final byte[] associatedData) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(plaintext.length + 28);
        byte[] bArrA00 = EXH.A00(12);
        byteBufferAllocate.put(bArrA00);
        this.A00.A04(byteBufferAllocate, bArrA00, plaintext, associatedData);
        byte[] bArrArray = byteBufferAllocate.array();
        byte[] bArr = this.A01;
        return bArr.length != 0 ? Ed3.A00(bArr, bArrArray) : bArrArray;
    }

    @Override // X.EX9
    public final byte[] A8i(final byte[] ciphertext, final byte[] associatedData) throws GeneralSecurityException {
        byte[] bArr = this.A01;
        int length = bArr.length;
        if (length != 0) {
            if (!AbstractC10509Hny.A02(bArr, ciphertext)) {
                throw BV6.A0u("Decryption failed (OutputPrefix mismatch).");
            }
            ciphertext = Arrays.copyOfRange(ciphertext, length, ciphertext.length);
        }
        int length2 = ciphertext.length;
        if (length2 < 28) {
            throw BV6.A0u("ciphertext too short");
        }
        byte[] bArrCopyOf = Arrays.copyOf(ciphertext, 12);
        return this.A00.A05(ByteBuffer.wrap(ciphertext, 12, length2 - 12), bArrCopyOf, associatedData);
    }

    public C6960EdG(final byte[] key, final byte[] outputPrefix) {
        this.A00 = new C6945Ecx(key);
        this.A01 = outputPrefix;
    }
}
