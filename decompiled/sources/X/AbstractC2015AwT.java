package X;

import android.os.Build;
import android.text.BoringLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;

/* renamed from: X.AwT, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2015AwT {
    public static final BoringLayout.Metrics A00(TextDirectionHeuristic textDirectionHeuristic, TextPaint textPaint, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 33) {
            return AbstractC2014AwS.A00(textDirectionHeuristic, textPaint, charSequence);
        }
        if (textDirectionHeuristic.isRtl(charSequence, 0, charSequence.length())) {
            return null;
        }
        return BoringLayout.isBoring(charSequence, textPaint, null);
    }
}
