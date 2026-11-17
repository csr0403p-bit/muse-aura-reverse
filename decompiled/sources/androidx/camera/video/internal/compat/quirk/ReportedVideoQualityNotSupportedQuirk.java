package androidx.camera.video.internal.compat.quirk;

import X.BV6;
import android.os.Build;
import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes5.dex */
public class ReportedVideoQualityNotSupportedQuirk implements SurfaceProcessingQuirk, VideoQualityQuirk {
    public static boolean A00() {
        return "Huawei".equalsIgnoreCase(Build.MANUFACTURER) && Arrays.asList("JNY-L21A", "JNY-L01A", "JNY-L21B", "JNY-L22A", "JNY-L02A", "JNY-L22B", "JNY-LX1").contains(Build.MODEL.toUpperCase(Locale.US));
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0065, code lost:
    
        if (r4.AH3() == 1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0011  */
    @Override // androidx.camera.video.internal.compat.quirk.VideoQualityQuirk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean AOv(X.InterfaceC2544BdV r4, X.C2421Bax r5) {
        /*
            r3 = this;
            java.lang.String r3 = "Huawei"
            boolean r0 = X.BV6.A1a(r3)
            if (r0 == 0) goto L11
            java.lang.String r0 = "HMA-L29"
            boolean r1 = X.BV6.A1Z(r0)
            r0 = 1
            if (r1 != 0) goto L12
        L11:
            r0 = 0
        L12:
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L67
            boolean r0 = X.BV6.A1a(r3)
            if (r0 == 0) goto L24
            java.lang.String r0 = "LYA-AL00"
            boolean r0 = X.BV6.A1Z(r0)
            if (r0 != 0) goto L67
        L24:
            java.lang.String r0 = "Vivo"
            boolean r0 = X.BV6.A1a(r0)
            if (r0 == 0) goto L3e
            java.lang.String r0 = "vivo 1820"
            boolean r0 = X.BV6.A1Z(r0)
            if (r0 == 0) goto L3e
            X.Bax r0 = X.C2421Bax.A01
            if (r5 == r0) goto L3d
            X.Bax r0 = X.C2421Bax.A00
        L3b:
            if (r5 != r0) goto L6a
        L3d:
            return r1
        L3e:
            boolean r0 = A00()
            if (r0 == 0) goto L51
            int r0 = r4.AH3()
            if (r0 != 0) goto L6a
            X.Bax r0 = X.C2421Bax.A00
            if (r5 == r0) goto L3d
            X.Bax r0 = X.C2421Bax.A01
            goto L3b
        L51:
            java.lang.String r0 = "OPPO"
            boolean r0 = X.BV6.A1a(r0)
            if (r0 == 0) goto L6a
            java.lang.String r0 = "PHT110"
            boolean r0 = X.BV6.A1Z(r0)
            if (r0 == 0) goto L6a
            int r0 = r4.AH3()
            if (r0 != r1) goto L6a
        L67:
            X.Bax r0 = X.C2421Bax.A06
            goto L3b
        L6a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.video.internal.compat.quirk.ReportedVideoQualityNotSupportedQuirk.AOv(X.BdV, X.Bax):boolean");
    }

    @Override // androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk
    public final boolean AiX() {
        if (BV6.A1a("Huawei") && BV6.A1Z("HMA-L29")) {
            return true;
        }
        if ((BV6.A1a("Huawei") && BV6.A1Z("LYA-AL00")) || A00()) {
            return true;
        }
        return BV6.A1a("OPPO") && BV6.A1Z("PHT110");
    }
}
