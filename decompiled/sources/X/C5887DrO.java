package X;

import android.media.AudioAttributes;
import android.os.Build;

/* renamed from: X.DrO, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5887DrO {
    public final AudioAttributes A00;

    public C5887DrO(DrN drN) {
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(drN.A01);
        usage.setAllowedCapturePolicy(1);
        if (Build.VERSION.SDK_INT >= 32) {
            AbstractC5961Dsw.A01(usage);
            AbstractC5961Dsw.A00(usage);
        }
        this.A00 = usage.build();
    }
}
