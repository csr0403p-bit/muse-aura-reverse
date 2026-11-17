package X;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* renamed from: X.Ecu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6942Ecu {
    public int[] A00;
    public final int A01;

    public static void A00(AbstractC6942Ecu abstractC6942Ecu, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i = abstractC6942Ecu instanceof C6944Ecw ? 24 : 12;
        if (length != i) {
            throw BV6.A0u(FGI.A0H("The nonce length (in bytes) must be ", i));
        }
        int iRemaining = byteBuffer2.remaining();
        int i2 = iRemaining / 64;
        int i3 = i2 + 1;
        for (int i4 = 0; i4 < i3; i4++) {
            ByteBuffer byteBufferA01 = abstractC6942Ecu.A01(bArr, abstractC6942Ecu.A01 + i4);
            int i5 = 64;
            if ((i4 == i2 && (i5 = iRemaining % 64) < 0) || byteBuffer2.remaining() < i5 || byteBufferA01.remaining() < i5 || byteBuffer.remaining() < i5) {
                throw C60O.A0i("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
            }
            for (int i6 = 0; i6 < i5; i6++) {
                byteBuffer.put((byte) (byteBuffer2.get() ^ byteBufferA01.get()));
            }
        }
    }

    public AbstractC6942Ecu(final byte[] key, int initialCounter) throws InvalidKeyException {
        if (key.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.A00 = AbstractC6941Ect.A03(key);
        this.A01 = initialCounter;
    }

    public final ByteBuffer A01(final byte[] nonce, int counter) {
        int i;
        int[] iArr;
        int[] iArrA03 = AbstractC6941Ect.A03(nonce);
        if (this instanceof C6944Ecw) {
            int length = iArrA03.length;
            if (length != 6) {
                throw BV5.A0T("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", BV5.A1Y(length * 32));
            }
            i = 16;
            iArr = new int[16];
            AbstractC6941Ect.A02(iArr, AbstractC6941Ect.A04(this.A00, iArrA03));
            iArr[12] = counter;
            iArr[13] = 0;
            iArr[14] = iArrA03[4];
            iArr[15] = iArrA03[5];
        } else {
            int length2 = iArrA03.length;
            if (length2 != 3) {
                throw BV5.A0T("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", BV5.A1Y(length2 * 32));
            }
            i = 16;
            iArr = new int[16];
            AbstractC6941Ect.A02(iArr, this.A00);
            iArr[12] = counter;
            System.arraycopy(iArrA03, 0, iArr, 13, length2);
        }
        int[] iArr2 = (int[]) iArr.clone();
        AbstractC6941Ect.A00(iArr2);
        int i2 = 0;
        do {
            iArr[i2] = iArr[i2] + iArr2[i2];
            i2++;
        } while (i2 < i);
        ByteBuffer byteBufferA0t = BV5.A0t(64);
        byteBufferA0t.asIntBuffer().put(iArr, 0, i);
        return byteBufferA0t;
    }
}
