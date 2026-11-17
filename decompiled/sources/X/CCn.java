package X;

import com.facebook.aura.ageverification.FaceDetectionModuleKt;
import com.facebook.aura.localbrowser.LocalBrowserEngineModule;
import com.facebook.aura.maps.HatchMapsNativeModule;
import com.facebook.aura.settings.internal.ondemand.InternalSettingsModule;

/* loaded from: classes5.dex */
public abstract class CCn {
    public static final int[] APP_MODULE_RANGES = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public static final int[] APP_MODULE_INDICES = {-1, -1, -1, -1, -1, -1, -1, -1};

    public static String getModuleName(int i) {
        if (i == 0) {
            return "baseline_profiles_12_plus";
        }
        if (i == 1) {
            return "baseline_profiles_9_11";
        }
        if (i == 2) {
            return LocalBrowserEngineModule.MODULE_NAME;
        }
        if (i == 3) {
            return InternalSettingsModule.MODULE_NAME;
        }
        if (i == 4) {
            return HatchMapsNativeModule.MODULE_NAME;
        }
        if (i == 5) {
            return FaceDetectionModuleKt.FACE_DETECTION_MODULE;
        }
        CFK.A07("VoltronModuleMetadata", FGI.A0H("Unexpected module index: ", i));
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:4:0x000e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A00(java.lang.String r8) {
        /*
            int r0 = r8.hashCode()
            r7 = 5
            r6 = 4
            r5 = 3
            r4 = 2
            r3 = 1
            r2 = 0
            r1 = -1
            switch(r0) {
                case -1574297951: goto Lf;
                case -537002305: goto L18;
                case 199323449: goto L21;
                case 796879717: goto L2a;
                case 1378673757: goto L33;
                case 2131629963: goto L3c;
                default: goto Le;
            }
        Le:
            return r1
        Lf:
            java.lang.String r0 = "baseline_profiles_9_11"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto Le
            return r3
        L18:
            java.lang.String r0 = "maps_native"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto Le
            return r6
        L21:
            java.lang.String r0 = "browser_engine"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto Le
            return r4
        L2a:
            java.lang.String r0 = "internal_settings"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto Le
            return r5
        L33:
            java.lang.String r0 = "baseline_profiles_12_plus"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto Le
            return r2
        L3c:
            java.lang.String r0 = "mlkit_face_detection"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto Le
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CCn.A00(java.lang.String):int");
    }

    public static BY3 A01(String str) {
        int iA00 = A00(str);
        if (iA00 == 0 || iA00 == 1 || iA00 == 2 || iA00 == 3 || iA00 == 4 || iA00 == 5) {
            return BY3.A03;
        }
        CFK.A07("VoltronModuleMetadata", FGI.A0M("Unexpected module name: ", str));
        return BY3.A04;
    }

    public static void A02(String str) {
        int iA00 = A00(str);
        if (iA00 == 0 || iA00 == 1 || iA00 == 2 || iA00 == 3 || iA00 == 4 || iA00 == 5) {
            return;
        }
        CFK.A07("VoltronModuleMetadata", FGI.A0M("Unexpected module name: ", str));
    }
}
