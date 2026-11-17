package X;

import com.facebook.aura.opengraph.HatchWebPageParserKt;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes5.dex */
public abstract class CCU {
    public static final String A00(CCV ccv) throws NoSuchAlgorithmException {
        String strAMJ = ccv.AMJ();
        C7384Etj.A0U(strAMJ);
        byte[] bytes = strAMJ.getBytes(C7384Etj.A0M(HatchWebPageParserKt.UTF_8));
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(bytes, 0, bytes.length);
            String strA0q = BV6.A0q(messageDigest.digest());
            C7384Etj.A0U(strA0q);
            return strA0q;
        } catch (NoSuchAlgorithmException e) {
            throw BV4.A0e(e);
        }
    }
}
