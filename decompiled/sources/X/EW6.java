package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.facebook.aura.R;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.concurrent.Executor;
import javax.crypto.NoSuchPaddingException;

/* loaded from: classes5.dex */
public final class EW6 implements EWJ {
    public final /* synthetic */ EW4 A00;
    public final /* synthetic */ EVc A01;

    @Override // X.EWJ
    public final void Afh(EWA ewa, final EWk eWk, final byte[] bArr) throws NoSuchAlgorithmException, UnrecoverableKeyException, SignatureException, IOException, InvalidKeyException, KeyStoreException, CertificateException {
        final FragmentActivity fragmentActivity;
        AnonymousClass003.A0u(ewa, bArr);
        if (!"BIO".equals(ewa.A02)) {
            try {
                EVc eVc = this.A01;
                String str = ewa.A01;
                C7384Etj.A0U(str);
                PrivateKey privateKey = (PrivateKey) eVc.A00.A01.getKey(FGI.A0M(eVc.A01, str), null);
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
                return;
            } catch (Exception e) {
                eWk.A00(null, e);
                return;
            }
        }
        Context context = this.A00.A00;
        if (!(context instanceof FragmentActivity) || (fragmentActivity = (FragmentActivity) context) == null) {
            eWk.A00(null, C3cG.A0Q(C8j2.A00(52)));
            return;
        }
        final Executor mainExecutor = fragmentActivity.getMainExecutor();
        C7384Etj.A0U(mainExecutor);
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        if (!keyStore.containsAlias("FBPayBiometricAuthTicketTag")) {
            eWk.A00(null, C3cG.A0Q("BIO key not found in AndroidKeyStore for alias FBPayBiometricAuthTicketTag"));
            return;
        }
        try {
            Key key = keyStore.getKey("FBPayBiometricAuthTicketTag", null);
            C7384Etj.A0Z(key, "null cannot be cast to non-null type java.security.PrivateKey");
            Signature signature2 = Signature.getInstance("SHA256withECDSA");
            C7384Etj.A0U(signature2);
            signature2.initSign((PrivateKey) key);
            final EX8 ex8 = new EX8(signature2);
            mainExecutor.execute(new Runnable() { // from class: X.42G
                public static final String __redex_internal_original_name = "ModularGeneratePttBioUtils$signWithBiometric$1";

                @Override // java.lang.Runnable
                public final void run() throws NoSuchPaddingException, NoSuchAlgorithmException, UnrecoverableKeyException, IOException, InvalidKeyException, KeyStoreException, CertificateException, NoSuchProviderException, InvalidAlgorithmParameterException {
                    FragmentActivity fragmentActivity2 = fragmentActivity;
                    new FQL(new EWO(eWk, bArr), fragmentActivity2, mainExecutor).A01(ex8, AbstractC10542Hqu.A00(null, fragmentActivity2.getString(R.string._name_removed__res_0x7f120cf9), null, fragmentActivity2.getString(R.string._name_removed__res_0x7f120cfa), 15, true));
                }
            });
        } catch (Exception e2) {
            eWk.A00(null, new IllegalStateException("BIO key initialization failed \u2014 key may be invalidated", e2));
        }
    }

    public EW6(EW4 ew4, EVc eVc) {
        this.A00 = ew4;
        this.A01 = eVc;
    }
}
