package X;

import android.text.TextUtils;
import java.nio.CharBuffer;

/* renamed from: X.Ecn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6937Ecn {
    public final String A00;
    public final String A01;
    public final String A02;

    public C6937Ecn(String str, String str2) {
        this.A02 = str;
        this.A00 = str2;
        this.A01 = null;
    }

    public static void A00(CharBuffer charBuffer) throws NumberFormatException {
        int iLimit = charBuffer.limit() - charBuffer.position();
        if (iLimit >= 4 || iLimit <= 0) {
            throw C60O.A0i("IPV4 octet must contain between 1 and 3 digits");
        }
        try {
            int i = Integer.parseInt(charBuffer.toString(), 10);
            if (i < 0 || i > 255) {
                throw BV5.A0Q("IPV4 octet value must be between 0 and 255, got ", i);
            }
        } catch (NumberFormatException e) {
            throw BV4.A0Q(AnonymousClass007.A0a("Unable to parse decimal octet ", charBuffer), e);
        }
    }

    public final String toString() {
        StringBuilder sbA0w = C60O.A0w();
        if (!TextUtils.isEmpty(this.A02)) {
            sbA0w.append("<REDACTED>@");
        }
        String str = this.A00;
        if (!TextUtils.isEmpty(str)) {
            sbA0w.append(str);
        }
        String str2 = this.A01;
        if (!TextUtils.isEmpty(str2)) {
            sbA0w.append(":");
            sbA0w.append(str2);
        }
        return sbA0w.toString();
    }

    public C6937Ecn(String str, String str2, String str3) {
        this.A02 = str;
        this.A00 = str2;
        this.A01 = str3;
    }
}
