package X;

import android.util.Base64;
import com.facebook.cryptopub.CryptoPubNative;
import com.facebook.tigon.iface.TigonRequest;
import java.util.Calendar;
import java.util.concurrent.atomic.AtomicBoolean;
import libraries.passwordencryption.model.PasswordEncryptionException;

/* loaded from: classes5.dex */
public final class Ck7 {
    public static volatile Ck7 A07;
    public C4031CkX A00;
    public CGl A01;
    public Integer A02;
    public boolean A03;
    public static final CGk A06 = new CGk(41, "-----BEGIN PUBLIC KEY-----\nMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAvcu1KMDR1vzuBr9iYKW8\nKWmhT8CVUBRkchiO8861H7zIOYRwkQrkeHA+0mkBo3Ly1PiLXDkbKQZyeqZbspke\n4e7WgFNwT23jHfRMV/cNPxjPEy4kxNEbzLET6GlWepGdXFhzHfnS1PinGQzj0ZOU\nZM3pQjgGRL9fAf8brt1ewhQ5XtpvKFdPyQq5BkeFEDKoInDsC/yKDWRAx2twgPFr\nCYUzAB8/yXuL30ErTHT79bt3yTnv1fRtE19tROIlBuqruwSBk9gGq/LuvSECgsl5\nz4VcpHXhgZt6MhrAj6y9vAAxO2RVrt0Mq4OY4HgyYz9Wlr1vAxXXGAAYIvrhAYLP\n7QIDAQAB\n-----END PUBLIC KEY-----\n", 0);
    public static final CryptoPubNative A04 = new CryptoPubNative();
    public static final AtomicBoolean A05 = C60O.A1E();

    public static C4034Cka A00(String str, String str2, Ck7 ck7) {
        if (ck7.A03) {
            return new C4034Cka(str, new PasswordEncryptionException(new Exception(""), EnumC7395EuY.A03));
        }
        try {
            return new C4034Cka(Base64.encodeToString(A04.encrypt(41, "-----BEGIN PUBLIC KEY-----\nMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAvcu1KMDR1vzuBr9iYKW8\nKWmhT8CVUBRkchiO8861H7zIOYRwkQrkeHA+0mkBo3Ly1PiLXDkbKQZyeqZbspke\n4e7WgFNwT23jHfRMV/cNPxjPEy4kxNEbzLET6GlWepGdXFhzHfnS1PinGQzj0ZOU\nZM3pQjgGRL9fAf8brt1ewhQ5XtpvKFdPyQq5BkeFEDKoInDsC/yKDWRAx2twgPFr\nCYUzAB8/yXuL30ErTHT79bt3yTnv1fRtE19tROIlBuqruwSBk9gGq/LuvSECgsl5\nz4VcpHXhgZt6MhrAj6y9vAAxO2RVrt0Mq4OY4HgyYz9Wlr1vAxXXGAAYIvrhAYLP\n7QIDAQAB\n-----END PUBLIC KEY-----\n", str, str2), 2), new PasswordEncryptionException(new Exception("Default key used."), EnumC7395EuY.A02));
        } catch (Exception e) {
            return new C4034Cka(str, new PasswordEncryptionException(e, EnumC7395EuY.A03));
        }
    }

    public final void A01() {
        String str;
        CGk cGkA00 = this.A01.A00();
        if (cGkA00 != null) {
            if (cGkA00.A02 != C79.A00) {
                return;
            }
            if (cGkA00.A00 >= 0 && (str = cGkA00.A03) != null && str.length() != 0 && Calendar.getInstance().getTimeInMillis() <= cGkA00.A01) {
                return;
            }
        }
        if (C3cI.A1W(A05)) {
            C4031CkX c4031CkX = this.A00;
            C3354CGm c3354CGm = new C3354CGm(this);
            C4023CkC c4023CkCARE = c4031CkX.A00.ARE("pwdKeyFetch", "ar-genai", "pwd_key_fetch", TigonRequest.GET);
            c4023CkCARE.A00("flow", "CONTROLLER_INITIALIZATION");
            c4023CkCARE.A00("device_id", c4031CkX.A01);
            C4018Cjz c4018Cjz = c4023CkCARE.A00;
            C3341CFl.A00(c4018Cjz.A04, 2, "version");
            c4018Cjz.A03.A00.A00 = new CGe(new C3353CGj(c4031CkX, c3354CGm), c4023CkCARE);
            c4018Cjz.A00();
        }
    }
}
