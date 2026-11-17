package X;

import java.security.Signature;
import java.security.SignatureException;

/* loaded from: classes5.dex */
public final class EWO extends AbstractC8390Fd5 {
    public final /* synthetic */ EWk A00;
    public final /* synthetic */ byte[] A01;

    @Override // X.AbstractC8390Fd5
    public final void onAuthenticationError(int i, CharSequence charSequence) {
        C7384Etj.A0Y(charSequence, 1);
        this.A00.A00(null, new Exception(AnonymousClass007.A0a("Biometric authentication error: ", charSequence)));
    }

    @Override // X.AbstractC8390Fd5
    public final void onAuthenticationSucceeded(C8391Fd6 c8391Fd6) throws SignatureException {
        Signature signature;
        C7384Etj.A0Y(c8391Fd6, 0);
        try {
            EX8 ex8 = c8391Fd6.A01;
            if (ex8 == null || (signature = ex8.A00) == null) {
                throw C3cG.A0Q("CryptoObject signature missing");
            }
            signature.update(this.A01);
            byte[] bArrSign = signature.sign();
            C7384Etj.A0X(bArrSign);
            this.A00.A00(BV6.A0q(EWP.A01(bArrSign)), null);
        } catch (Exception e) {
            this.A00.A00(null, e);
        }
    }

    public EWO(EWk eWk, byte[] bArr) {
        this.A01 = bArr;
        this.A00 = eWk;
    }
}
