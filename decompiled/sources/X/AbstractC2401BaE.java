package X;

import android.util.Pair;
import androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk;
import java.util.Set;

/* renamed from: X.BaE, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2401BaE {
    public int A00;

    public AbstractC2401BaE() {
        int i;
        if (AbstractC2399BaC.A00.A01(CaptureFailedRetryQuirk.class) == null) {
            i = 0;
        } else {
            Set<Pair<String, String>> set = CaptureFailedRetryQuirk.A00;
            i = 1;
        }
        this.A00 = i;
    }
}
