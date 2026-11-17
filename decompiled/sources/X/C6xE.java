package X;

import android.webkit.WebStorage;
import org.chromium.support_lib_boundary.WebStorageBoundaryInterface;

/* renamed from: X.6xE, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6xE {
    public static void A00(WebStorage webStorage, Runnable runnable) {
        F52 f52 = new F52(3);
        if (!C6xU.A0V.A01()) {
            throw C60Q.A0q();
        }
        ((WebStorageBoundaryInterface) C7510EyX.A00(WebStorageBoundaryInterface.class, C6xF.A00.A00.convertWebStorage(webStorage))).deleteBrowsingData(f52, runnable);
    }
}
