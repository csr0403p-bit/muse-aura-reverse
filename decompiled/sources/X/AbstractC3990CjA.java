package X;

import com.facebook.aura.confidentialvm.repository.ConfidentialVmPinVerifierCrypto;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.CjA, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3990CjA {
    public static final byte[] A00;
    public static final byte[] A01;
    public static final byte[] A02;
    public static final byte[] A03;
    public static final byte[] A04;

    public static final byte[] A00(int i) {
        int i2 = 2;
        if (i < 0) {
            throw new InvalidParameterException("x must be non-negative in I2OSP");
        }
        if (i > BV7.A00(256.0d)) {
            throw new InvalidParameterException("xlen bytes is not enough to represent x");
        }
        byte[] bArr = new byte[2];
        while (true) {
            i2--;
            if (-1 >= i2) {
                return bArr;
            }
            BV5.A1C(i, bArr, i2);
            i >>= 8;
        }
    }

    public static final byte[] A01(SecretKey secretKey, byte[] bArr, byte[] bArr2, byte[] bArr3, int i) throws IllegalStateException, NoSuchAlgorithmException, IOException, InvalidKeyException {
        C7384Etj.A0Y(bArr, 1);
        byte[] bArrA03 = A03(A00(i), A02, bArr3, bArr, bArr2);
        BeS.A04("outLenBytes", i, 0, 8160);
        Mac mac = Mac.getInstance(ConfidentialVmPinVerifierCrypto.HMAC_SHA256);
        mac.init(secretKey);
        byte[] bArrDoFinal = new byte[0];
        int iCeil = (int) Math.ceil(i / 32.0d);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i);
        int i2 = 0;
        while (i2 < iCeil) {
            mac.update(bArrDoFinal);
            mac.update(bArrA03);
            i2++;
            mac.update((byte) i2);
            bArrDoFinal = mac.doFinal();
            C7384Etj.A0U(bArrDoFinal);
            int iMin = (int) Math.min(i, bArrDoFinal.length);
            byteBufferAllocate.put(bArrDoFinal, 0, iMin);
            i -= iMin;
        }
        byte[] bArrArray = byteBufferAllocate.array();
        C7384Etj.A0U(bArrArray);
        return bArrArray;
    }

    public static final byte[] A02(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws IllegalStateException, NoSuchAlgorithmException, IOException, InvalidKeyException {
        C7384Etj.A0Y(bArr2, 1);
        byte[] bArrA03 = A03(A02, bArr4, bArr2, bArr3);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, ConfidentialVmPinVerifierCrypto.HMAC_SHA256);
        Mac mac = Mac.getInstance(ConfidentialVmPinVerifierCrypto.HMAC_SHA256);
        mac.init(secretKeySpec);
        byte[] bArrDoFinal = mac.doFinal(bArrA03);
        C7384Etj.A0U(bArrDoFinal);
        return bArrDoFinal;
    }

    public static final byte[] A03(byte[]... bArr) throws IOException {
        int length = 0;
        for (byte[] bArr2 : bArr) {
            length += bArr2.length;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        for (byte[] bArr3 : bArr) {
            byteArrayOutputStream.write(bArr3);
        }
        return C7384Etj.A0d(byteArrayOutputStream);
    }

    static {
        Charset charset = StandardCharsets.UTF_8;
        C7384Etj.A0V(charset);
        A03 = "KEM".getBytes(charset);
        A01 = "HPKE".getBytes(charset);
        A02 = "HPKE-v1".getBytes(charset);
        A00 = "eae_prk".getBytes(charset);
        A04 = "shared_secret".getBytes(charset);
    }
}
