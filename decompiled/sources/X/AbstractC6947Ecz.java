package X;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;

/* renamed from: X.Ecz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6947Ecz {
    public static final EnumC7335ElD A02 = EnumC7335ElD.A01;
    public final AbstractC6942Ecu A00;
    public final AbstractC6942Ecu A01;

    public static void A01(long output, byte[] num, int idx) {
        int i = 0;
        do {
            num[idx + i] = (byte) (255 & output);
            i++;
            output >>= 8;
        } while (i < 4);
    }

    public static byte[] A02(final ByteBuffer aad, byte[] ciphertext) {
        int length = ciphertext.length;
        int i = length % 16;
        int i2 = length;
        if (i != 0) {
            i2 = (length + 16) - i;
        }
        int iRemaining = aad.remaining();
        int i3 = iRemaining % 16;
        int i4 = iRemaining;
        if (i3 != 0) {
            i4 = (iRemaining + 16) - i3;
        }
        int i5 = i4 + i2;
        ByteBuffer byteBufferA0t = BV5.A0t(i5 + 16);
        byteBufferA0t.put(ciphertext);
        byteBufferA0t.position(i2);
        byteBufferA0t.put(aad);
        byteBufferA0t.position(i5);
        byteBufferA0t.putLong(length);
        byteBufferA0t.putLong(iRemaining);
        return byteBufferA0t.array();
    }

    public static long A00(byte[] in, int idx) {
        return BV4.A03(((in[idx + 3] & 255) << 24) | (in[idx] & 255) | BV6.A0D(in, idx + 1) | ((in[idx + 2] & 255) << 16));
    }

    public static byte[] A03(final byte[] key, byte[] data) {
        long jA00 = (A00(key, 0) >> 0) & 67108863 & 67108863;
        long jA002 = (A00(key, 3) >> 2) & 67108863 & 67108611;
        long jA003 = (A00(key, 6) >> 4) & 67108863 & 67092735;
        long jA004 = (A00(key, 9) >> 6) & 67108863 & 66076671;
        long jA005 = (A00(key, 12) >> 8) & 67108863 & 1048575;
        long j = jA002 * 5;
        long j2 = jA003 * 5;
        long j3 = jA004 * 5;
        long j4 = jA005 * 5;
        byte[] bArr = new byte[17];
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        long j8 = 0;
        long j9 = 0;
        int i = 0;
        while (true) {
            int length = data.length;
            if (i >= length) {
                long j10 = j6 + (j5 >> 26);
                long j11 = j10 >> 26;
                long j12 = j10 & 67108863;
                long j13 = j7 + j11;
                long j14 = j13 >> 26;
                long j15 = j13 & 67108863;
                long j16 = j8 + j14;
                long j17 = j16 >> 26;
                long j18 = j16 & 67108863;
                long j19 = j9 + (j17 * 5);
                long j20 = j19 >> 26;
                long j21 = j19 & 67108863;
                long j22 = (j5 & 67108863) + j20;
                long j23 = j21 + 5;
                long j24 = (j23 >> 26) + j22;
                long j25 = j12 + (j24 >> 26);
                long j26 = j15 + (j25 >> 26);
                long j27 = (j18 + (j26 >> 26)) - 67108864;
                long j28 = j27 >> 63;
                long j29 = j21 & j28;
                long j30 = j22 & j28;
                long j31 = j12 & j28;
                long j32 = j15 & j28;
                long j33 = j18 & j28;
                long j34 = j28 ^ (-1);
                long j35 = (j24 & 67108863 & j34) | j30;
                long j36 = (j25 & 67108863 & j34) | j31;
                long j37 = (j26 & 67108863 & j34) | j32;
                long j38 = (j29 | (j23 & 67108863 & j34) | (j35 << 26)) & 4294967295L;
                long jA006 = j38 + A00(key, 16);
                long jA007 = (((j35 >> 6) | (j36 << 20)) & 4294967295L) + A00(key, 20) + (jA006 >> 32);
                long jA008 = (((j36 >> 12) | (j37 << 14)) & 4294967295L) + A00(key, 24) + (jA007 >> 32);
                long jA009 = ((((j37 >> 18) | (((j27 & j34) | j33) << 8)) & 4294967295L) + A00(key, 28) + (jA008 >> 32)) & 4294967295L;
                byte[] bArr2 = new byte[16];
                A01(jA006 & 4294967295L, bArr2, 0);
                A01(jA007 & 4294967295L, bArr2, 4);
                A01(jA008 & 4294967295L, bArr2, 8);
                A01(jA009, bArr2, 12);
                return bArr2;
            }
            int iA0F = C8j3.A0F(length, i, 16);
            System.arraycopy(data, i, bArr, 0, iA0F);
            bArr[iA0F] = 1;
            if (iA0F != 16) {
                Arrays.fill(bArr, iA0F + 1, 17, (byte) 0);
            }
            long jA0010 = j9 + ((A00(bArr, 0) >> 0) & 67108863);
            long jA0011 = j5 + ((A00(bArr, 3) >> 2) & 67108863);
            long jA0012 = j6 + ((A00(bArr, 6) >> 4) & 67108863);
            long jA0013 = j7 + ((A00(bArr, 9) >> 6) & 67108863);
            long jA0014 = j8 + (((A00(bArr, 12) >> 8) & 67108863) | (bArr[16] << 24));
            long j39 = (jA0010 * jA00) + (jA0011 * j4) + (jA0012 * j3) + (jA0013 * j2) + (jA0014 * j);
            long j40 = (jA0010 * jA002) + (jA0011 * jA00) + (jA0012 * j4) + (jA0013 * j3) + (jA0014 * j2);
            long j41 = (jA0010 * jA003) + (jA0011 * jA002) + (jA0012 * jA00) + (jA0013 * j4) + (jA0014 * j3);
            long j42 = (jA0010 * jA004) + (jA0011 * jA003) + (jA0012 * jA002) + (jA0013 * jA00) + (jA0014 * j4);
            long j43 = (jA0010 * jA005) + (jA0011 * jA004) + (jA0012 * jA003) + (jA0013 * jA002) + (jA0014 * jA00);
            long j44 = j40 + (j39 >> 26);
            long j45 = j41 + (j44 >> 26);
            j6 = j45 & 67108863;
            long j46 = j42 + (j45 >> 26);
            j7 = j46 & 67108863;
            long j47 = j43 + (j46 >> 26);
            j8 = j47 & 67108863;
            long j48 = (j39 & 67108863) + ((j47 >> 26) * 5);
            j9 = j48 & 67108863;
            j5 = (j44 & 67108863) + (j48 >> 26);
            i += 16;
        }
    }

    public AbstractC6947Ecz(final byte[] key) throws GeneralSecurityException {
        if (!A02.A00()) {
            throw BV6.A0u("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        boolean z = this instanceof C6946Ecy;
        this.A01 = z ? new C6944Ecw(key, 1) : new C6943Ecv(key, 1);
        this.A00 = z ? new C6944Ecw(key, 0) : new C6943Ecv(key, 0);
    }

    public final void A04(ByteBuffer output, final byte[] nonce, final byte[] plaintext, final byte[] associatedData) throws GeneralSecurityException {
        int iRemaining = output.remaining();
        int length = plaintext.length;
        if (iRemaining < length + 16) {
            throw C60O.A0i("Given ByteBuffer output is too small");
        }
        int iPosition = output.position();
        AbstractC6942Ecu abstractC6942Ecu = this.A01;
        if (output.remaining() < length) {
            throw C60O.A0i("Given ByteBuffer output is too small");
        }
        AbstractC6942Ecu.A00(abstractC6942Ecu, output, ByteBuffer.wrap(plaintext), nonce);
        output.position(iPosition);
        output.limit(output.limit() - 16);
        if (associatedData == null) {
            associatedData = new byte[0];
        }
        byte[] bArr = new byte[32];
        this.A00.A01(nonce, 0).get(bArr);
        byte[] bArrA03 = A03(bArr, A02(output, associatedData));
        output.limit(output.limit() + 16);
        output.put(bArrA03);
    }

    public final byte[] A05(ByteBuffer ciphertext, final byte[] nonce, final byte[] associatedData) throws GeneralSecurityException {
        if (ciphertext.remaining() < 16) {
            throw BV6.A0u("ciphertext too short");
        }
        int iPosition = ciphertext.position();
        byte[] bArr = new byte[16];
        ciphertext.position(ciphertext.limit() - 16);
        ciphertext.get(bArr);
        ciphertext.position(iPosition);
        ciphertext.limit(ciphertext.limit() - 16);
        if (associatedData == null) {
            associatedData = new byte[0];
        }
        try {
            byte[] bArr2 = new byte[32];
            this.A00.A01(nonce, 0).get(bArr2);
            if (!MessageDigest.isEqual(A03(bArr2, A02(ciphertext, associatedData)), bArr)) {
                throw BV6.A0u("invalid MAC");
            }
            ciphertext.position(iPosition);
            AbstractC6942Ecu abstractC6942Ecu = this.A01;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(ciphertext.remaining());
            AbstractC6942Ecu.A00(abstractC6942Ecu, byteBufferAllocate, ciphertext, nonce);
            return byteBufferAllocate.array();
        } catch (GeneralSecurityException e) {
            throw new AEADBadTagException(e.toString());
        }
    }
}
