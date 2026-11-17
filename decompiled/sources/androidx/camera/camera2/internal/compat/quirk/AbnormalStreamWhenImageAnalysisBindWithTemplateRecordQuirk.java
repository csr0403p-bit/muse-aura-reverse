package androidx.camera.camera2.internal.compat.quirk;

import X.BV6;
import android.os.Build;
import java.util.Locale;

/* loaded from: classes5.dex */
public class AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk implements CaptureIntentPreviewQuirk {
    @Override // androidx.camera.camera2.internal.compat.quirk.CaptureIntentPreviewQuirk
    public final boolean AiW() {
        return BV6.A1a("samsung") && Build.MODEL.toLowerCase(Locale.US).startsWith("sm-m556");
    }
}
