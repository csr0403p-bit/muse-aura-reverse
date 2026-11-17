package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.camera.core.impl.CameraValidator$CameraIdListIncorrectException;
import java.util.LinkedHashSet;

/* renamed from: X.Bdv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2567Bdv {
    public static final C2565Bdt A00;

    public static void A00(Context context, C2565Bdt c2565Bdt, C2569Bdy c2569Bdy) throws CameraValidator$CameraIdListIncorrectException {
        Integer numA01;
        int i = 0;
        IllegalArgumentException e = null;
        if (Build.VERSION.SDK_INT >= 34 && AbstractC2568Bdw.A00(context) != 0) {
            LinkedHashSet<InterfaceC2610Bfb> linkedHashSetA00 = c2569Bdy.A00();
            if (!linkedHashSetA00.isEmpty()) {
                AbstractC2875Bni.A01("CameraValidator", FGI.A0Y("Virtual device with ID: ", " has ", " cameras. Skipping validation.", AbstractC2568Bdw.A00(context), linkedHashSetA00.size()));
                return;
            } else {
                CameraValidator$CameraIdListIncorrectException cameraValidator$CameraIdListIncorrectException = new CameraValidator$CameraIdListIncorrectException("No cameras available", null);
                cameraValidator$CameraIdListIncorrectException.mAvailableCameraCount = 0;
                throw cameraValidator$CameraIdListIncorrectException;
            }
        }
        if (c2565Bdt != null) {
            try {
                numA01 = c2565Bdt.A01();
                if (numA01 == null) {
                    AbstractC2875Bni.A03("CameraValidator", "No lens facing info in the availableCamerasSelector, don't verify the camera lens facing.");
                    return;
                }
            } catch (IllegalStateException e2) {
                AbstractC2875Bni.A05("CameraValidator", "Cannot get lens facing from the availableCamerasSelector don't verify the camera lens facing.", e2);
                return;
            }
        } else {
            numA01 = null;
        }
        StringBuilder sbA0x = C60O.A0x("Verifying camera lens facing on ");
        sbA0x.append(Build.DEVICE);
        AbstractC2875Bni.A01("CameraValidator", AnonymousClass006.A0y(numA01, ", lensFacingInteger: ", sbA0x));
        PackageManager packageManager = context.getPackageManager();
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera") && (c2565Bdt == null || numA01.intValue() == 1)) {
                C2565Bdt.A01.A00(c2569Bdy.A00());
                i = 1;
            }
        } catch (IllegalArgumentException e3) {
            e = e3;
            AbstractC2875Bni.A06("CameraValidator", "Camera LENS_FACING_BACK verification failed", e);
        }
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera.front") && (c2565Bdt == null || numA01.intValue() == 0)) {
                C2565Bdt.A02.A00(c2569Bdy.A00());
                i++;
            }
        } catch (IllegalArgumentException e4) {
            e = e4;
            AbstractC2875Bni.A06("CameraValidator", "Camera LENS_FACING_FRONT verification failed", e);
        }
        try {
            A00.A00(c2569Bdy.A00());
            AbstractC2875Bni.A01("CameraValidator", "Found a LENS_FACING_EXTERNAL camera");
            i++;
        } catch (IllegalArgumentException unused) {
        }
        if (e != null) {
            AbstractC2875Bni.A02("CameraValidator", C8j3.A14(c2569Bdy.A00(), C60O.A0x("Camera LensFacing verification failed, existing cameras: ")));
            CameraValidator$CameraIdListIncorrectException cameraValidator$CameraIdListIncorrectException2 = new CameraValidator$CameraIdListIncorrectException("Expected camera missing from device.", e);
            cameraValidator$CameraIdListIncorrectException2.mAvailableCameraCount = i;
            throw cameraValidator$CameraIdListIncorrectException2;
        }
    }

    static {
        LinkedHashSet linkedHashSetA0k = C3cG.A0k();
        linkedHashSetA0k.add(new C2566Bdu(2));
        A00 = new C2565Bdt(linkedHashSetA0k);
    }
}
