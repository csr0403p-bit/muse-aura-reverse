package X;

import java.security.Provider;
import java.security.Security;

/* loaded from: classes4.dex */
public abstract class AF8 {
    public static final String[] A00 = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};

    public static Provider A00() {
        String[] strArr = A00;
        int i = 0;
        do {
            Provider provider = Security.getProvider(strArr[i]);
            if (provider != null) {
                return provider;
            }
            i++;
        } while (i < 3);
        return null;
    }
}
