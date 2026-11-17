package X;

import org.jsoup.helper.ValidationException;

/* renamed from: X.Gtx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10293Gtx {
    public static void A00(Object obj) {
        if (obj == null) {
            throw new ValidationException("Object must not be null");
        }
    }

    public static void A01(String str) {
        if (str == null || str.length() == 0) {
            throw new ValidationException("String must not be empty");
        }
    }

    public static void A02(String str, String str2) {
        if (str == null || str.length() == 0) {
            throw new ValidationException(str2);
        }
    }

    public static void A03(boolean z, String str) {
        if (!z) {
            throw new ValidationException(str);
        }
    }
}
