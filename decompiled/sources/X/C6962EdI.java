package X;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.EdI, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6962EdI {
    public static final EnumC7335ElD A03 = EnumC7335ElD.A02;
    public static final ThreadLocal<Cipher> A04 = new C6952Ed8();
    public final int A00;
    public final int A01;
    public final SecretKeySpec A02;

    public static void A00(C6962EdI c6962EdI, byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2, int i3, boolean z) throws GeneralSecurityException {
        Cipher cipher = A04.get();
        byte[] bArr4 = new byte[c6962EdI.A01];
        System.arraycopy(bArr3, 0, bArr4, 0, c6962EdI.A00);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        cipher.init(BV5.A01(z ? 1 : 0), c6962EdI.A02, ivParameterSpec);
        if (cipher.doFinal(bArr, i, i2, bArr2, i3) != i2) {
            throw BV6.A0u("stored output's length does not match input's length");
        }
    }

    public C6962EdI(final byte[] key, int ivSize) throws GeneralSecurityException {
        if (!A03.A00()) {
            throw BV6.A0u("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        EX6.A00(key.length);
        this.A02 = BV4.A17(key);
        int blockSize = A04.get().getBlockSize();
        this.A01 = blockSize;
        if (ivSize < 12 || ivSize > blockSize) {
            throw BV6.A0u("invalid IV size");
        }
        this.A00 = ivSize;
    }
}
