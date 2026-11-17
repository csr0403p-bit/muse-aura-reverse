package X;

import com.facebook.aura.confidentialvm.repository.ConfidentialVmPinVerifierCrypto;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.CjB, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3991CjB {
    public static final byte[] A05;
    public static final byte[] A06;
    public static final byte[] A07;
    public static final byte[] A08;
    public static final byte[] A09;
    public final byte[] A00;
    public final byte[] A01;
    public final byte[] A02;
    public final byte[] A03;
    public final byte[] A04;

    static {
        Charset charset = StandardCharsets.UTF_8;
        C7384Etj.A0V(charset);
        A08 = "psk_id_hash".getBytes(charset);
        A06 = "info_hash".getBytes(charset);
        A09 = "secret".getBytes(charset);
        A07 = "key".getBytes(charset);
        A05 = "base_nonce".getBytes(charset);
    }

    public C3991CjB(EnumC3992CjC enumC3992CjC, EnumC3993CjD enumC3993CjD, Ets ets, byte[] bArr, byte[] bArr2, byte b) throws IllegalStateException, NoSuchAlgorithmException, IOException, InvalidKeyException {
        if (b != 0) {
            throw C8j3.A18("Only mode_base is supported");
        }
        int i = ets.value;
        int i2 = enumC3993CjD.value;
        int i3 = enumC3992CjC.value;
        int i4 = enumC3992CjC.nk;
        int i5 = enumC3992CjC.nn;
        int i6 = enumC3993CjD.nh;
        byte[] bArrA03 = AbstractC3990CjA.A03(AbstractC3990CjA.A01, AbstractC3990CjA.A00(i), AbstractC3990CjA.A00(i2), AbstractC3990CjA.A00(i3));
        byte[] bArrA02 = AbstractC3990CjA.A02(new byte[i6], A08, new byte[0], bArrA03);
        byte[] bArrA022 = AbstractC3990CjA.A02(new byte[i6], A06, bArr2, bArrA03);
        ByteArrayOutputStream byteArrayOutputStreamA0F = BV4.A0F();
        byteArrayOutputStreamA0F.write(b);
        byteArrayOutputStreamA0F.write(bArrA02);
        byteArrayOutputStreamA0F.write(bArrA022);
        byte[] bArrA0d = C7384Etj.A0d(byteArrayOutputStreamA0F);
        this.A02 = bArrA0d;
        byte[] bArrA023 = AbstractC3990CjA.A02(bArr, A09, new byte[0], bArrA03);
        this.A03 = bArrA023;
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArrA023, ConfidentialVmPinVerifierCrypto.HMAC_SHA256);
        this.A01 = AbstractC3990CjA.A01(secretKeySpec, A07, bArrA0d, bArrA03, i4);
        byte[] bArrA01 = AbstractC3990CjA.A01(secretKeySpec, A05, bArrA0d, bArrA03, i5);
        this.A00 = bArrA01;
        this.A04 = new byte[bArrA01.length];
    }
}
