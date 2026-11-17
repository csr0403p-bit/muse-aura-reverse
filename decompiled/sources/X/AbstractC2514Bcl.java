package X;

import android.media.EncoderProfiles;
import android.os.Build;

/* renamed from: X.Bcl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2514Bcl {
    public static C2525Bcw A00(EncoderProfiles encoderProfiles) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            return AbstractC2575Be7.A00(encoderProfiles);
        }
        if (i >= 31) {
            return AbstractC2574Be6.A00(encoderProfiles);
        }
        throw BV4.A0c(FGI.A0I("Unable to call from(EncoderProfiles) on API ", i, ". Version 31 or higher required."));
    }
}
