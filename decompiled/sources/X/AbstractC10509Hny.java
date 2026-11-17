package X;

import com.facebook.aura.opengraph.HatchWebPageParserKt;
import com.google.crypto.tink.internal.TinkBugException;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* renamed from: X.Hny, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC10509Hny {
    public static final Charset A00 = Charset.forName(HatchWebPageParserKt.UTF_8);

    public static boolean A02(byte[] prefix, byte[] complete) {
        int length = complete.length;
        int length2 = prefix.length;
        if (length < length2) {
            return false;
        }
        for (int i = 0; i < length2; i++) {
            if (complete[i] != prefix[i]) {
                return false;
            }
        }
        return true;
    }

    public static final C6966EdO A00(String s) throws GeneralSecurityException {
        int length = s.length();
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            char cCharAt = s.charAt(i);
            if (cCharAt < '!' || cCharAt > '~') {
                throw BV6.A0u(FGI.A0E("Not a printable ASCII character: ", cCharAt));
            }
            bArr[i] = (byte) cCharAt;
        }
        return C6966EdO.A00(bArr);
    }

    public static final C6966EdO A01(String s) {
        int length = s.length();
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            char cCharAt = s.charAt(i);
            if (cCharAt < '!' || cCharAt > '~') {
                throw new TinkBugException(FGI.A0E("Not a printable ASCII character: ", cCharAt));
            }
            bArr[i] = (byte) cCharAt;
        }
        return C6966EdO.A00(bArr);
    }
}
