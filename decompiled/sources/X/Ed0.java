package X;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;

/* loaded from: classes5.dex */
public final class Ed0 implements InterfaceC6968EdQ {
    public static final EnumC7335ElD A04 = EnumC7335ElD.A02;
    public final String A00;
    public final Key A01;
    public final int A02;
    public final ThreadLocal<Mac> A03;

    @Override // X.InterfaceC6968EdQ
    public final byte[] A6i(byte[] data, int outputLength) throws IllegalStateException, InvalidAlgorithmParameterException {
        if (outputLength > this.A02) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        ThreadLocal<Mac> threadLocal = this.A03;
        threadLocal.get().update(data);
        return Arrays.copyOf(threadLocal.get().doFinal(), outputLength);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public Ed0(String algorithm, Key key) throws GeneralSecurityException {
        int i;
        Ed1 ed1 = new Ed1(this);
        this.A03 = ed1;
        if (!A04.A00()) {
            throw BV6.A0u("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.A00 = algorithm;
        this.A01 = key;
        if (key.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        switch (algorithm.hashCode()) {
            case -1823053428:
                if (algorithm.equals("HMACSHA1")) {
                    i = 20;
                    break;
                }
                throw new NoSuchAlgorithmException(FGI.A0M("unknown Hmac algorithm: ", algorithm));
            case 392315023:
                if (algorithm.equals("HMACSHA224")) {
                    i = 28;
                    break;
                }
                throw new NoSuchAlgorithmException(FGI.A0M("unknown Hmac algorithm: ", algorithm));
            case 392315118:
                if (algorithm.equals("HMACSHA256")) {
                    i = 32;
                    break;
                }
                throw new NoSuchAlgorithmException(FGI.A0M("unknown Hmac algorithm: ", algorithm));
            case 392316170:
                if (algorithm.equals("HMACSHA384")) {
                    i = 48;
                    break;
                }
                throw new NoSuchAlgorithmException(FGI.A0M("unknown Hmac algorithm: ", algorithm));
            case 392317873:
                if (algorithm.equals("HMACSHA512")) {
                    i = 64;
                    break;
                }
                throw new NoSuchAlgorithmException(FGI.A0M("unknown Hmac algorithm: ", algorithm));
            default:
                throw new NoSuchAlgorithmException(FGI.A0M("unknown Hmac algorithm: ", algorithm));
        }
        this.A02 = i;
        ed1.get();
    }
}
