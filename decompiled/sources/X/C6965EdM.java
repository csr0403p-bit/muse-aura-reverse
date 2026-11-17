package X;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;

/* renamed from: X.EdM, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6965EdM implements EX9 {
    public final int A00;
    public final FWR A01;
    public final C6962EdI A02;
    public final byte[] A03;

    @Override // X.EX9
    public final byte[] A8i(final byte[] ciphertext, final byte[] associatedData) throws GeneralSecurityException {
        int length = ciphertext.length;
        int i = this.A00;
        byte[] bArr = this.A03;
        int length2 = bArr.length;
        if (length < i + length2) {
            throw BV6.A0u("Decryption failed (ciphertext too short).");
        }
        if (!AbstractC10509Hny.A02(bArr, ciphertext)) {
            throw BV6.A0u("Decryption failed (OutputPrefix mismatch).");
        }
        int i2 = length - i;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(ciphertext, length2, i2);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(ciphertext, i2, length);
        if (associatedData == null) {
            associatedData = new byte[0];
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.putLong(associatedData.length * 8);
        byte[] bArrCopyOf = Arrays.copyOf(byteBufferAllocate.array(), 8);
        FWR fwr = this.A01;
        byte[] bArrA02 = Ed3.A02(associatedData, bArrCopyOfRange, bArrCopyOf);
        C6973EdV c6973EdV = (C6973EdV) fwr;
        byte[] bArr2 = c6973EdV.A03;
        if (!MessageDigest.isEqual(Ed3.A00(c6973EdV.A02, bArr2.length > 0 ? c6973EdV.A01.A6i(Ed3.A00(bArrA02, bArr2), c6973EdV.A00) : c6973EdV.A01.A6i(bArrA02, c6973EdV.A00)), bArrCopyOfRange2)) {
            throw BV6.A0u("invalid MAC");
        }
        C6962EdI c6962EdI = this.A02;
        int length3 = bArrCopyOfRange.length;
        int i3 = c6962EdI.A00;
        if (length3 < i3) {
            throw BV6.A0u("ciphertext too short");
        }
        byte[] bArr3 = new byte[i3];
        System.arraycopy(bArrCopyOfRange, 0, bArr3, 0, i3);
        int i4 = length3 - i3;
        byte[] bArr4 = new byte[i4];
        C6962EdI.A00(c6962EdI, bArrCopyOfRange, bArr4, bArr3, i3, i4, 0, false);
        return bArr4;
    }

    @Override // X.EX9
    public final byte[] AAW(final byte[] plaintext, final byte[] associatedData) throws GeneralSecurityException {
        C6962EdI c6962EdI = this.A02;
        int length = plaintext.length;
        int i = c6962EdI.A00;
        int i2 = Integer.MAX_VALUE - i;
        if (length > i2) {
            throw BV6.A0u(FGI.A0H("plaintext length can not exceed ", i2));
        }
        byte[] bArr = new byte[length + i];
        byte[] bArrA00 = EXH.A00(i);
        System.arraycopy(bArrA00, 0, bArr, 0, i);
        C6962EdI.A00(c6962EdI, plaintext, bArr, bArrA00, 0, length, i, true);
        if (associatedData == null) {
            associatedData = new byte[0];
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.putLong(associatedData.length * 8);
        byte[] bArrCopyOf = Arrays.copyOf(byteBufferAllocate.array(), 8);
        FWR fwr = this.A01;
        byte[] bArrA02 = Ed3.A02(associatedData, bArr, bArrCopyOf);
        C6973EdV c6973EdV = (C6973EdV) fwr;
        byte[] bArr2 = c6973EdV.A03;
        return Ed3.A02(this.A03, bArr, Ed3.A00(c6973EdV.A02, bArr2.length > 0 ? c6973EdV.A01.A6i(Ed3.A00(bArrA02, bArr2), c6973EdV.A00) : c6973EdV.A01.A6i(bArrA02, c6973EdV.A00)));
    }

    public C6965EdM(FWR cipher, C6962EdI mac, byte[] macLength, int outputPrefix) {
        this.A02 = mac;
        this.A01 = cipher;
        this.A00 = outputPrefix;
        this.A03 = macLength;
    }
}
