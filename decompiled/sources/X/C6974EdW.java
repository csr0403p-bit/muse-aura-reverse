package X;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.EdW, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6974EdW implements Hwz {
    public static final EnumC7335ElD A04 = EnumC7335ElD.A01;
    public final GLV A00;
    public final Provider A01;
    public final SecretKeySpec A02;
    public final byte[] A03;

    public C6974EdW(Htd key, Provider conscrypt) throws GeneralSecurityException {
        if (!A04.A00()) {
            throw BV6.A0u("Cannot use AES-CMAC in FIPS-mode.");
        }
        try {
            Mac.getInstance("AESCMAC", conscrypt);
            this.A01 = conscrypt;
            this.A03 = key.A01.A01();
            this.A00 = key.A00;
            this.A02 = BV4.A17(key.A02.A00.A01());
        } catch (NoSuchAlgorithmException e) {
            throw new GeneralSecurityException("AES-CMAC not available.", e);
        }
    }
}
