package X;

import java.security.SecureRandom;
import java.util.UUID;

/* loaded from: classes5.dex */
public final class C9M {
    public static String A00;

    public static final synchronized String A00() {
        String string;
        string = A00;
        if (string == null) {
            SecureRandom secureRandom = new SecureRandom();
            string = new UUID(secureRandom.nextLong() ^ System.currentTimeMillis(), secureRandom.nextLong()).toString();
            A00 = string;
        }
        return string;
    }
}
