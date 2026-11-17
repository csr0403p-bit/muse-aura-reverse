package X;

import android.os.Build;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;

/* renamed from: X.Ed7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6951Ed7 {
    public static final ThreadLocal<Cipher> A00 = new C6949Ed5();

    public static AlgorithmParameterSpec A00(final byte[] buf, int offset, int len) {
        return (!C6xC.A00(System.getProperty("java.vendor"), "The Android Project") || BV6.A02(Build.VERSION.SDK_INT) > 19) ? new GCMParameterSpec(128, buf, offset, len) : new IvParameterSpec(buf, offset, len);
    }
}
