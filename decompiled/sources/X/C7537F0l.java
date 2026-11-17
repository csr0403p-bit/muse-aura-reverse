package X;

import android.net.Uri;
import android.util.Base64;
import com.bloks.security.BloksFilePathDecryptionException;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

/* renamed from: X.F0l, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7537F0l {
    public static final C7537F0l A01 = new C7537F0l();
    public final SecureRandom A00 = new SecureRandom();

    public static final Uri A00(Uri uri) {
        String scheme = uri.getScheme();
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        C7384Etj.A0U(schemeSpecificPart);
        uri.getPath();
        String str = null;
        if (!(scheme != null && scheme.equalsIgnoreCase("file")) && "bkfileurl".equals(scheme)) {
            try {
                Charset charset = DCl.A05;
                byte[] bArrDecode = Base64.decode(schemeSpecificPart.getBytes(charset), 9);
                C7384Etj.A0X(bArrDecode);
                ADq aDq = new ADq(0, 11);
                byte[] bArrA0l = AbstractC0878AGe.A0l(aDq.isEmpty() ? C0881AGi.A00 : new DFI(AbstractC0903AHf.A06(bArrDecode, aDq.A00, aDq.A01 + 1), 0));
                ADq aDq2 = new ADq(12, bArrDecode.length - 1);
                byte[] bArrA0l2 = AbstractC0878AGe.A0l(aDq2.isEmpty() ? C0881AGi.A00 : new DFI(AbstractC0903AHf.A06(bArrDecode, aDq2.A00, aDq2.A01 + 1), 0));
                IvParameterSpec ivParameterSpec = new IvParameterSpec(bArrA0l);
                Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                SecretKey secretKey = AbstractC7546F1v.A00;
                C7384Etj.A0V(secretKey);
                cipher.init(2, secretKey, ivParameterSpec);
                byte[] bArrDoFinal = cipher.doFinal(bArrA0l2);
                C7384Etj.A0U(bArrDoFinal);
                str = new String(bArrDoFinal, charset);
            } catch (Exception e) {
                throw new BloksFilePathDecryptionException(FGI.A0M("Failed to decrypt encrypted file path URL: ", e.getMessage()), e);
            }
        }
        if (str != null) {
            uri = null;
            try {
                uri = C7Je.A01(str);
            } catch (SecurityException | UnsupportedOperationException unused) {
            }
            if (uri == null) {
                throw C60O.A0i("Required value was null.");
            }
        }
        return uri;
    }
}
