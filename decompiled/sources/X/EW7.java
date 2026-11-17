package X;

import java.security.PrivateKey;
import java.security.Signature;

/* loaded from: classes5.dex */
public final class EW7 implements EWJ {
    public final /* synthetic */ EVc A00;

    public EW7(EVc eVc) {
        this.A00 = eVc;
    }

    @Override // X.EWJ
    public final void Afh(EWA ewa, EWk eWk, byte[] bArr) {
        AnonymousClass003.A0u(ewa, bArr);
        try {
            boolean zEquals = "MFT_TRUSTED_DEVICE".equals(ewa.A02);
            EVc eVc = this.A00;
            String strA0M = ewa.A01;
            C7384Etj.A0U(strA0M);
            boolean z = !zEquals;
            String str = eVc.A01;
            if (z) {
                strA0M = FGI.A0M(str, strA0M);
            }
            PrivateKey privateKey = (PrivateKey) eVc.A00.A01.getKey(strA0M, null);
            privateKey.getClass();
            boolean zEqualsIgnoreCase = "RSA".equalsIgnoreCase(privateKey.getAlgorithm());
            Signature signature = Signature.getInstance(zEqualsIgnoreCase ? "SHA256withRSA" : "SHA256withECDSA");
            signature.initSign(privateKey);
            signature.update(bArr);
            byte[] bArrSign = signature.sign();
            if (!zEqualsIgnoreCase) {
                C7384Etj.A0U(bArrSign);
                bArrSign = EWP.A01(bArrSign);
            }
            String strA0q = BV6.A0q(bArrSign);
            C7384Etj.A0U(strA0q);
            eWk.A00(strA0q, null);
        } catch (Exception e) {
            eWk.A00(null, e);
        } catch (Throwable th) {
            eWk.A00(null, null);
            throw th;
        }
    }
}
