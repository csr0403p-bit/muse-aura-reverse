package X;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.Arrays;
import javax.crypto.Mac;

/* loaded from: classes5.dex */
public final class EdN implements InterfaceC6968EdQ {
    public static final EnumC7335ElD A02 = EnumC7335ElD.A01;
    public final Key A00;
    public final Provider A01;

    @Override // X.InterfaceC6968EdQ
    public final byte[] A6i(byte[] data, int outputLength) throws IllegalStateException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        if (outputLength > 16) {
            throw new InvalidAlgorithmParameterException("outputLength must not be larger than 16");
        }
        Mac mac = Mac.getInstance("AESCMAC", this.A01);
        mac.init(this.A00);
        byte[] bArrDoFinal = mac.doFinal(data);
        return outputLength != bArrDoFinal.length ? Arrays.copyOf(bArrDoFinal, outputLength) : bArrDoFinal;
    }

    public EdN(Provider keyBytes, byte[] conscrypt) throws GeneralSecurityException {
        if (!A02.A00()) {
            throw BV6.A0u("Cannot use AES-CMAC in FIPS-mode, as BoringCrypto module is not available");
        }
        this.A00 = BV4.A17(conscrypt);
        this.A01 = keyBytes;
    }
}
