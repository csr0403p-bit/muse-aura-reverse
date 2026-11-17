package androidx.camera.camera2.internal.compat.quirk;

import X.BV6;
import android.os.Build;
import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;

/* loaded from: classes5.dex */
public class ImageCaptureFailedWhenVideoCaptureIsBoundQuirk implements SurfaceProcessingQuirk, CaptureIntentPreviewQuirk {
    public static boolean A00() {
        if (BV6.A1a("blu") && BV6.A1Z("studio x10")) {
            return true;
        }
        if (BV6.A1a("itel") && BV6.A1Z("itel w6004")) {
            return true;
        }
        if (BV6.A1a("vivo") && BV6.A1Z("vivo 1805")) {
            return true;
        }
        if (BV6.A1a("positivo") && BV6.A1Z("twist 2 pro")) {
            return true;
        }
        String str = Build.MODEL;
        if ("pixel 4 xl".equalsIgnoreCase(str) && Build.VERSION.SDK_INT == 29) {
            return true;
        }
        String str2 = Build.BRAND;
        if ("motorola".equalsIgnoreCase(str2) && "moto e13".equalsIgnoreCase(str)) {
            return true;
        }
        if (!"samsung".equalsIgnoreCase(str2)) {
            return false;
        }
        String str3 = Build.DEVICE;
        return "gta8".equalsIgnoreCase(str3) || "gta8wifi".equalsIgnoreCase(str3);
    }

    @Override // androidx.camera.camera2.internal.compat.quirk.CaptureIntentPreviewQuirk
    public final boolean AiW() {
        if (BV6.A1a("blu") && BV6.A1Z("studio x10")) {
            return true;
        }
        if (BV6.A1a("itel") && BV6.A1Z("itel w6004")) {
            return true;
        }
        if (BV6.A1a("vivo") && BV6.A1Z("vivo 1805")) {
            return true;
        }
        return BV6.A1a("positivo") && BV6.A1Z("twist 2 pro");
    }

    @Override // androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk
    public final boolean AiX() {
        if (BV6.A1a("blu") && BV6.A1Z("studio x10")) {
            return true;
        }
        if (BV6.A1a("itel") && BV6.A1Z("itel w6004")) {
            return true;
        }
        if (BV6.A1a("vivo") && BV6.A1Z("vivo 1805")) {
            return true;
        }
        if (BV6.A1a("positivo") && BV6.A1Z("twist 2 pro")) {
            return true;
        }
        String str = Build.MODEL;
        if ("pixel 4 xl".equalsIgnoreCase(str) && Build.VERSION.SDK_INT == 29) {
            return true;
        }
        String str2 = Build.BRAND;
        if ("motorola".equalsIgnoreCase(str2) && "moto e13".equalsIgnoreCase(str)) {
            return true;
        }
        if (!"samsung".equalsIgnoreCase(str2)) {
            return false;
        }
        String str3 = Build.DEVICE;
        return "gta8".equalsIgnoreCase(str3) || "gta8wifi".equalsIgnoreCase(str3);
    }
}
