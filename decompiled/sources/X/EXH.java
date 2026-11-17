package X;

import java.security.SecureRandom;

/* loaded from: classes5.dex */
public abstract class EXH {
    public static final ThreadLocal<SecureRandom> A00 = new EXI();

    public static byte[] A00(int size) {
        byte[] bArr = new byte[size];
        A00.get().nextBytes(bArr);
        return bArr;
    }
}
