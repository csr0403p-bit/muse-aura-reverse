package X;

import com.facebook.aura.confidentialvm.repository.ConfidentialVmPinVerifierCrypto;
import com.facebook.secure.hatchcvm.HatchCVMException;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;

/* renamed from: X.9zv, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9zv {
    public static final byte[] A00 = C3cG.A1S("hatch:cvm-host-data:v1");

    public static final byte[] A00(byte[] bArr) throws IllegalStateException, NoSuchAlgorithmException {
        if (bArr.length != 32) {
            throw C60O.A0i("K_rv must be 32 bytes");
        }
        try {
            Mac mac = Mac.getInstance(ConfidentialVmPinVerifierCrypto.HMAC_SHA256);
            C8j4.A1P(ConfidentialVmPinVerifierCrypto.HMAC_SHA256, mac, bArr);
            byte[] bArrDoFinal = mac.doFinal(A00);
            C7384Etj.A0U(bArrDoFinal);
            return bArrDoFinal;
        } catch (GeneralSecurityException e) {
            throw new HatchCVMException("CVM host_data derivation failed", e);
        }
    }

    public static final byte[] A01(byte[] bArr, byte[] bArr2) throws Throwable {
        C7384Etj.A0Y(bArr2, 2);
        int i = 1;
        byte[] bArrDoFinal = new byte[0];
        byte[] bArrDoFinal2 = null;
        try {
            try {
                Mac mac = Mac.getInstance(ConfidentialVmPinVerifierCrypto.HMAC_SHA256);
                C8j4.A1P(ConfidentialVmPinVerifierCrypto.HMAC_SHA256, mac, new byte[32]);
                bArrDoFinal2 = mac.doFinal(bArr);
                C8j4.A1P(ConfidentialVmPinVerifierCrypto.HMAC_SHA256, mac, bArrDoFinal2);
                byte[] bArr3 = new byte[32];
                int i2 = 0;
                while (true) {
                    byte[] bArr4 = bArrDoFinal;
                    if (i2 >= 32) {
                        break;
                    }
                    try {
                        mac.update(bArrDoFinal);
                        mac.update(bArr2);
                        mac.update((byte) i);
                        bArrDoFinal = mac.doFinal();
                        C8j3.A1L(bArr4);
                        C7384Etj.A0X(bArrDoFinal);
                        int iA0F = C8j3.A0F(32, i2, bArrDoFinal.length);
                        System.arraycopy(bArrDoFinal, 0, bArr3, i2, iA0F);
                        i2 += iA0F;
                        i++;
                    } catch (GeneralSecurityException e) {
                        e = e;
                        bArrDoFinal = bArr4;
                        throw new HatchCVMException("HKDF-SHA256 derivation failed", e);
                    } catch (Throwable th) {
                        th = th;
                        bArrDoFinal = bArr4;
                        if (bArrDoFinal2 != null) {
                            C8j3.A1L(bArrDoFinal2);
                        }
                        C8j3.A1L(bArrDoFinal);
                        throw th;
                    }
                }
                if (bArrDoFinal2 != null) {
                    C8j3.A1L(bArrDoFinal2);
                }
                C8j3.A1L(bArrDoFinal);
                return bArr3;
            } catch (GeneralSecurityException e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
