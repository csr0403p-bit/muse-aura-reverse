package X;

import android.app.Application;
import android.os.Build;
import java.io.IOException;

/* renamed from: X.CCd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3294CCd {
    public static volatile String A00;
    public static volatile boolean A01;

    public static final String A00() {
        String processName;
        if (!A01) {
            try {
                processName = "robolectric";
                if (!"robolectric".equals(Build.FINGERPRINT)) {
                    processName = Application.getProcessName();
                    C7384Etj.A0U(processName);
                }
            } catch (IOException unused) {
                processName = null;
            }
            A00 = processName;
            A01 = true;
        }
        return A00;
    }
}
