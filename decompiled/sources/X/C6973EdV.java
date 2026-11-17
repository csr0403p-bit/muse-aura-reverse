package X;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Provider;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.EdV, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6973EdV implements FWR {
    public static final byte[] A04 = {0};
    public final int A00;
    public final InterfaceC6968EdQ A01;
    public final byte[] A02;
    public final byte[] A03;

    public C6973EdV(Htd key) throws GeneralSecurityException {
        Provider providerA00;
        GLV glv = key.A00;
        int i = glv.A00;
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit are supported", BV5.A1Y(i * 8)));
        }
        Hp7 hp7 = key.A02;
        C6966EdO c6966EdO = hp7.A00;
        if (i != c6966EdO.A00.length) {
            throw BV6.A0u("Key size mismatch");
        }
        EnumC7335ElD enumC7335ElD = Ed2.A03;
        InterfaceC6968EdQ ed2 = new Ed2(c6966EdO.A01());
        try {
            EnumC7335ElD enumC7335ElD2 = EdN.A02;
            providerA00 = AF8.A00();
        } catch (GeneralSecurityException unused) {
        }
        if (providerA00 == null) {
            throw BV6.A0u("Conscrypt not available");
        }
        ed2 = C6967EdP.A00(ed2, hp7, providerA00);
        this.A01 = ed2;
        this.A00 = glv.A01;
        this.A02 = key.A01.A01();
        this.A03 = glv.A02.equals(GLZ.A02) ? Arrays.copyOf(A04, 1) : new byte[0];
    }

    public C6973EdV(InterfaceC6968EdQ wrappedPrf, int tagSize) throws InvalidAlgorithmParameterException {
        this.A01 = wrappedPrf;
        this.A00 = tagSize;
        this.A02 = new byte[0];
        this.A03 = new byte[0];
        if (tagSize >= 10) {
            wrappedPrf.A6i(new byte[0], tagSize);
            return;
        }
        throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
    }

    public C6973EdV(Ho4 key) {
        byte[] bArrCopyOf;
        EnumC7335ElD enumC7335ElD = Ed0.A04;
        StringBuilder sbA0x = C60O.A0x("HMAC");
        GLO glo = key.A00;
        this.A01 = new Ed0(C8j3.A14(glo.A02, sbA0x), new SecretKeySpec(key.A02.A00.A01(), "HMAC"));
        this.A00 = glo.A01;
        this.A02 = key.A01.A01();
        if (glo.A03.equals(C9484GLa.A02)) {
            bArrCopyOf = Arrays.copyOf(A04, 1);
        } else {
            bArrCopyOf = new byte[0];
        }
        this.A03 = bArrCopyOf;
    }
}
