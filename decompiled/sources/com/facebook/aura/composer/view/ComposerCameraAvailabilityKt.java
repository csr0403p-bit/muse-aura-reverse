package com.facebook.aura.composer.view;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.C78N;
import android.content.Context;
import android.content.Intent;
import com.facebook.aura.composer.camera.HatchInAppCameraKt;

/* loaded from: classes.dex */
public abstract class ComposerCameraAvailabilityKt {
    public static final boolean rememberIsCameraCaptureAvailable(BFM bfm, int i) {
        boolean zA1X;
        bfm.AgE(-2053371352);
        Boolean bool = (Boolean) bfm.A6v(HatchInAppCameraKt.LocalHatchInAppCameraAvailable);
        if (bool != null) {
            zA1X = bool.booleanValue();
        } else {
            Context contextA0H = AnonymousClass002.A0H(bfm);
            boolean zA65 = bfm.A65(contextA0H);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                boolean z = false;
                try {
                    if (new Intent("android.media.action.IMAGE_CAPTURE").resolveActivity(contextA0H.getPackageManager()) != null) {
                        z = true;
                    }
                } catch (RuntimeException unused) {
                }
                objAaT = AnonymousClass001.A0j(bfm, z);
            }
            zA1X = AnonymousClass001.A1X(objAaT);
        }
        AnonymousClass002.A19(bfm);
        return zA1X;
    }
}
