package X;

import androidx.camera.camera2.internal.compat.quirk.CaptureIntentPreviewQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk;
import java.util.Iterator;

/* renamed from: X.BaI, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2404BaI {
    public final boolean A00;
    public final boolean A01;

    public C2404BaI(C2511Bch c2511Bch) {
        boolean z;
        Iterator it = c2511Bch.A02(CaptureIntentPreviewQuirk.class).iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            } else if (((CaptureIntentPreviewQuirk) it.next()).AiW()) {
                z = true;
                break;
            }
        }
        this.A00 = z;
        this.A01 = c2511Bch.A03(ImageCaptureFailedForVideoSnapshotQuirk.class);
    }
}
